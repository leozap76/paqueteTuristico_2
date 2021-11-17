/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteturistico.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import paqueteturistico.modelo.Alojamiento;
import paqueteturistico.modelo.Conexion;
import paqueteturistico.modelo.Destino;

/**
 *
 * @author Leonardo
 */
public class AlojamientoData {
     Conexion conexion;
     private Connection con;

    public AlojamientoData(Conexion conexion) {
  try {
            this.conexion = new Conexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlojamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        try {
            con = conexion.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
    
    }
    
    public List<Alojamiento> buscarAlojamientos(){ // todos los alojamientos
        List<Alojamiento> alojamientos=new ArrayList<>();
        String sql="SELECT * FROM alojamiento ";
        
        Alojamiento aloj = null;
          
        try {
            PreparedStatement ps= con.prepareStatement(sql);          
            ResultSet rs =ps.executeQuery();
            Destino des=null;
            
            while (rs.next()){
                aloj=new Alojamiento();
                
                aloj.setIdAlojamiento(rs.getInt("idAlojamiento"));              
                aloj.setUbicacion(rs.getString("ubicacion"));
                aloj.setNombreAlojamiento(rs.getString("nombreAlojamiento"));
                aloj.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
                aloj.setPrecioNoche(rs.getFloat("precioNoche"));
                aloj.setActivo(rs.getBoolean("activo"));
                des=this.buscarDestino(rs.getInt("idDestino"));
                aloj.setDestino(des);
                
                alojamientos.add(aloj);
            }   
         
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar Alojamientos ");
        }    
       return alojamientos; 
        
    }
    
    public List<Alojamiento> buscarAlojamientosXDestino(int idDestino){ // alojamientos segun Destino
        List<Alojamiento> alojamientos=new ArrayList<>();
        String sql="SELECT * FROM paquete_turistico.alojamiento, paquete_turistico.destino WHERE destino.idDestino=alojamiento.idDestino AND destino.idDestino=? ";
        
        Alojamiento aloj = null;
        Destino des= null;
        
            
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idDestino);
            ResultSet rs =ps.executeQuery();
            
            while (rs.next()){
                aloj=new Alojamiento();
                des=this.buscarDestino(rs.getInt("alojamiento.idDestino"));
                aloj.setDestino(des);
                aloj.setIdAlojamiento(rs.getInt("idAlojamiento"));              
                aloj.setUbicacion(rs.getString("ubicacion"));
                aloj.setNombreAlojamiento(rs.getString("nombreAlojamiento"));
                aloj.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
                aloj.setPrecioNoche(rs.getFloat("precioNoche"));
                aloj.setActivo(rs.getBoolean("activo"));
                
                alojamientos.add(aloj);
            }   
         
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar Alojamientos ");
        }    
       return alojamientos; 
        
    }
    
    public Destino buscarDestino(int id){
        DestinoData dd=new DestinoData(conexion);
        return dd.buscarDestino(id);
        
    }
    
    public Alojamiento obtenerAlojamiento(int idAlojamiento){  
    String sql="SELECT * FROM paquete_turistico.alojamiento WHERE idAlojamiento=?";
     
    Alojamiento aloj=new Alojamiento();
    Destino des=new Destino();
    
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento); 
            ResultSet rs =ps.executeQuery();
            
            while (rs.next()){
                aloj = new Alojamiento();
                aloj.setIdAlojamiento(rs.getInt("idAlojamiento"));
                des=this.buscarDestino(rs.getInt("alojamiento.idDestino"));
                aloj.setDestino(des);
                aloj.setUbicacion(rs.getString(3));
                aloj.setNombreAlojamiento(rs.getString(4));
                aloj.setTipoAlojamiento(rs.getString(5));
                aloj.setPrecioNoche(rs.getFloat(6));
                aloj.setActivo(rs.getBoolean(7));
            }
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar el alojamiento" + ex);
        }    
       return aloj;  
   }
    
    public void agregarAlojamiento(Alojamiento alojamiento){
        String sql = "INSERT INTO paquete_turistico.alojamiento (idDestino, ubicacion, nombreAlojamiento, tipoAlojamiento, precioNoche, activo) VALUES (?,?,?,?,?,?)";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alojamiento.getDestino().getIdDestino());
            ps.setString(2, alojamiento.getUbicacion());
            ps.setString(3, alojamiento.getNombreAlojamiento());
            ps.setString(4, alojamiento.getTipoAlojamiento());
            ps.setFloat(5, alojamiento.getPrecioNoche());
            ps.setBoolean(6, alojamiento.isActivo());
                     
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys(); 
            if (rs.next()){
             alojamiento.setIdAlojamiento(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar "+ex);
        }
    }

    public void actualizarAlojamiento(Alojamiento alojamiento){
        String sql = "UPDATE paquete_turistico.alojamiento SET idDestino=?, ubicacion=?, nombreAlojamiento=? ,tipoAlojamiento=?, precioNoche=?, activo=? WHERE idAlojamiento=?";
        
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alojamiento.getDestino().getIdDestino());
            ps.setString(2, alojamiento.getUbicacion());
            ps.setString(3, alojamiento.getNombreAlojamiento());
            ps.setString(4, alojamiento.getTipoAlojamiento());
            ps.setFloat(5, alojamiento.getPrecioNoche());
            ps.setBoolean(6,alojamiento.isActivo() );
            ps.setInt(7, alojamiento.getIdAlojamiento());
            ps.executeUpdate();           
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);
        }
    }
    
    public void eliminarAlojamientoxID(int id){
       String sql = "UPDATE paquete_turistico.alojamiento SET activo=0 WHERE idAlojamiento=?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();           
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);
        }
   }
   
   public void eliminarAlojamiento(Alojamiento alojamiento){
       String sql = "UPDATE paquete_turistico.alojamiento SET activo=0 WHERE idAlojamiento=?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alojamiento.getIdAlojamiento());
            
            ps.executeUpdate();           
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);
        }
   }
}


  
