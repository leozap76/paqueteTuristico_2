/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteturistico.control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import paqueteturistico.modelo.Alojamiento;
import paqueteturistico.modelo.Cliente;
import paqueteturistico.modelo.Conexion;
import paqueteturistico.modelo.Menu;
import paqueteturistico.modelo.Paquete;
import paqueteturistico.modelo.Transporte;

/**
 *
 * @author Leonardo
 */
public class PaqueteData {
    
    private Connection con;
    Conexion conexion;

    public PaqueteData(Conexion conexion) {
       try {
            this.conexion = new Conexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        try {
            con = conexion.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
    
}
    
    public Alojamiento buscarAlojamiento(int id){
        AlojamientoData ad=new AlojamientoData(conexion);
        return ad.obtenerAlojamiento(id);
        
    }
    
    public Menu buscarMenu(int id){
        MenuData md=new MenuData(conexion);
        return md.obtenerMenu(id);
        
    }
    
    public Transporte buscarTransporte(int id){
        TransporteData td=new TransporteData(conexion);
        return td.obtenerTransporte(id);
    }
    
    public Cliente buscarCliente(int id){
        ClienteData cd=new ClienteData(conexion);
        return cd.obtenerCliente(id);
        
    }
    
    public void guardarPaquete(Paquete paq){
        String sql= "INSERT INTO paquete (idAlojamiento,idMenu,idTransporte,idCliente,fechaInicial,fechaFinal,cantidadPersonas,montoFinal,activo) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,paq.getAlojamiento().getIdAlojamiento());
            ps.setInt(2,paq.getMenu().getIdMenu());
            ps.setInt(3,paq.getTransporte().getIdTransporte());
            ps.setInt(4,paq.getCliente().getIdCliente());
            ps.setDate(5,Date.valueOf(paq.getFechaInicial()));
            ps.setDate(6,Date.valueOf(paq.getFechaFinal()));
            ps.setInt(7,paq.getCantPersonas());
            ps.setFloat(8, paq.getMontoFinal());
            ps.setBoolean(9,paq.isActivo());
         
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                paq.setIdPaquete(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar paquetes");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un paquete: " + ex.getMessage());
        
        }
        
    } 
    

 public List<Paquete> obtenerPaquetes(){ // lista de paquetes
        List<Paquete> paquetes=new ArrayList<>();
        
        String sql="SELECT * FROM paquete";
    
        AlojamientoData ad=new AlojamientoData(conexion);
        MenuData md=new MenuData(conexion);
        TransporteData td=new TransporteData(conexion);
        ClienteData cd=new ClienteData(conexion);
      
        try {
            PreparedStatement ps= con.prepareStatement(sql);          
            ResultSet rs =ps.executeQuery();
            
            while (rs.next()){
               Paquete paquete = new Paquete();
               Alojamiento alojamiento = new Alojamiento();
               Menu menu=new Menu();
               Transporte transporte = new Transporte();
               Cliente cliente = new Cliente ();
               paquete.setIdPaquete(rs.getInt("idPaquete"));
               alojamiento=this.buscarAlojamiento(rs.getInt("paquete.idAlojamiento"));
               menu=this.buscarMenu(rs.getInt("paquete.idMenu"));
               transporte=this.buscarTransporte(rs.getInt("paquete.idTransporte"));
               cliente=this.buscarCliente(rs.getInt("paquete.idCliente"));
               paquete.setAlojamiento(alojamiento);
               paquete.setMenu(menu);
               paquete.setTransporte(transporte);
               paquete.setCliente(cliente);
               paquete.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
               paquete.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
               paquete.setCantPersonas(rs.getInt("cantidadPersonas"));
               paquete.setMontoFinal(rs.getFloat("montoFinal"));
               paquete.setActivo(rs.getBoolean("activo"));
               
               paquetes.add(paquete);

            }          
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar Paquetes "+ ex);
        }    
       return paquetes; 
        
    }
 
 public void borrarPaquete(int id){
        String sql = "UPDATE paquete SET activo = 0 WHERE paquete.idPaquete=?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs =ps.executeQuery();
            
    
        } catch (SQLException ex) {
            System.out.println("Error al eliminar paquete" + ex);
        } 
    }
}