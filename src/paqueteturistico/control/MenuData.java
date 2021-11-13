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
import paqueteturistico.modelo.Menu;

/**
 *
 * @author Leonardo
 */
public class MenuData {
    private Connection con;
    Conexion conexion;

    public MenuData(Conexion conexion) {
  
        try {
            this.conexion = new Conexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuData.class.getName()).log(Level.SEVERE, null, ex);
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
    
   public Menu obtenerMenu(int idMenu){
       String sql="SELECT * FROM menu WHERE idMenu = ?";
       
       Menu menu= new Menu();
       Alojamiento aloj=new Alojamiento();
 
       try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idMenu);
            ResultSet rs =ps.executeQuery();
            
            if (rs.next()){
                menu = new Menu();
                menu.setIdMenu(rs.getInt("idMenu"));
                aloj=this.buscarAlojamiento(rs.getInt("menu.IdAlojamiento"));
                menu.setAlojamiento(aloj);
                menu.setTipoMenu(rs.getString(3));
                menu.setPrecioMenu(rs.getFloat(4));
                menu.setActivo(rs.getBoolean(5));
            }
                     
        } catch (SQLException ex) {
            System.out.println("Error al buscar el menu" + ex);
        }    
       return menu;  
   }
   
   public List<Menu> buscarMenuesXAlojamiento(int idAlojamiento){
        List<Menu> menues=new ArrayList<>();
        String sql="SELECT * FROM menu, alojamiento WHERE menu.idAlojamiento=alojamiento.idAlojamiento AND alojamiento.idAlojamiento=? ";
        
         Menu menu=null;
         Alojamiento aloj=null;
             
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento);
            ResultSet rs =ps.executeQuery();
            
            while (rs.next()){
                menu = new Menu();
                menu.setIdMenu(rs.getInt("idMenu"));
                aloj=this.buscarAlojamiento(rs.getInt("menu.IdAlojamiento"));
                menu.setAlojamiento(aloj);
                menu.setTipoMenu(rs.getString("tipoMenu"));
                menu.setPrecioMenu(rs.getFloat("precioMenu"));
                menu.setActivo(rs.getBoolean("activo"));
                

                menues.add(menu);

            }    
           ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar menus"+ex);
        }    
       return menues; 
        
    }
   
   public void agregarMenu(Menu menu){
       String sql = "INSERT INTO menu ( idAlojamiento, tipoMenu, precioMenu, activo) VALUES (?,?,?,?)";
        
       
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, menu.getAlojamiento().getIdAlojamiento());
            ps.setString(2, menu.getTipoMenu());
            ps.setFloat(3, (float) menu.getPrecioMenu());
            ps.setBoolean(4, menu.isActivo());
                     
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys(); 
            if (rs.next()){
             menu.setIdMenu(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar "+ex);
        }
   }
   
   public void actualizarMenu(Menu menu){
       String sql = "UPDATE menu SET idAlojamiento=?, tipoMenu=?, precioMenu=? ,activo=? WHERE idMenu=?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, menu.getAlojamiento().getIdAlojamiento());
            ps.setString(2, menu.getTipoMenu());
            ps.setFloat(3, (float) menu.getPrecioMenu());
            ps.setBoolean(4, menu.isActivo());
            ps.setInt(5, menu.getIdMenu());
            ps.executeUpdate();           
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);
        }
   }
   
   public void eliminarMenuxID(int id){
       String sql = "UPDATE menu SET activo=0 WHERE idMenu=?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();           
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);
        }
   }
   
   public void eliminarMenu(Menu menu){
       String sql = "UPDATE menu SET activo=0 WHERE idMenu=?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, menu.getIdMenu());
            
            ps.executeUpdate();           
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);
        }
   }


}