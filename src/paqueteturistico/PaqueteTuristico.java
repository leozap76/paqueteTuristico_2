/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteturistico;

import java.util.logging.Level;
import java.util.logging.Logger;
import paqueteturistico.control.AlojamientoData;
import paqueteturistico.control.ClienteData;
import paqueteturistico.control.DestinoData;
import paqueteturistico.control.MenuData;
import paqueteturistico.control.PaqueteData;
import paqueteturistico.control.TransporteData;
import paqueteturistico.modelo.Cliente;
import paqueteturistico.modelo.Conexion;
import paqueteturistico.modelo.Destino;

/**
 *
 * @author Nicolas
 */
public class PaqueteTuristico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion conexion ;
        
          try {
            conexion = new Conexion();
            ClienteData cd=new ClienteData(conexion);
            DestinoData dd=new DestinoData(conexion);
            AlojamientoData ad=new AlojamientoData(conexion);
            PaqueteData pd=new PaqueteData(conexion);
            MenuData md=new MenuData(conexion);
            TransporteData td=new TransporteData(conexion);
        
            Cliente c1=new Cliente("Castro Jorge", "castroJ@gmail.com",25032406,265723143,true);
            Cliente c2=new Cliente("Prueba Aldo", "aldop@gmail.com",30254141,014467741,true);
            Cliente c3=new Cliente("Petra Carla", "pcarla@gmail.com",164254126,265741312,true);
            Cliente c4=new Cliente("Zenco Roberto", "zerobert@gmail.com",18365449,266235499,true);
       
            Destino d1=new Destino("Argentina","Rio Gallegos");
            Destino d2=new Destino("Chile","Santiago");
            Destino d3=new Destino("Argentina","Formosa");
            Destino d4=new Destino("Mexico","Tulum");
            
             //System.out.println(dd.buscarDestino(2));
             // System.out.println(ad.buscarAlojamientos());
            // System.out.println(ad.buscarAlojamientos());
              //System.out.println(td.obtenerTransporte(2));
              //System.out.println(md.buscarMenus());
              //System.out.println(ad.buscarAlojamientos(1));
              //System.out.println(ad.obtenerAlojamiento(2));
              //System.out.println(dd.buscarDestino(2));
              //System.out.println(pd.obtenerPaquetes());
//             System.out.println(ad.obtenerAlojamiento(3));
//              System.out.println(ad.buscarAlojamientos(2));
              //System.out.println(td.obtenerTransporte(1));
              //System.out.println(dd.buscarDestino(1));
              //System.out.println(md.obtenerMenu(1));
              //System.out.println(td.obtenerTransportesXDestino(2));
//              System.out.println(td.obtenerTransportesXDestino(2));
//              System.out.println(md.buscarMenuesXAlojamiento(3));
//              System.out.println(ad.buscarAlojamientosXDestino(2));
                
                   
              
              
            
        
//            System.out.println(cd.buscarDestino(1));
//              System.out.println(cd.buscarAlojamiento(3));
//              System.out.println(cd.buscarPaquete());
//              cd.guardarCliente(c2);
//              cd.guardarCliente(c1);
//              cd.guardarCliente(c3);
//              cd.guardarCliente(c4);
              
               
             // c1.setDni(25032404);
//              c1.setNombreCompleto("Castro Jorge Luis");
                c1.setTelefono(265722111);
                cd.actualizarCliente(c1);
//              cd.actualizarCliente(c1);
//              System.out.println(c1);
                cd.borrarCliente(2);
               //System.out.println(cd.obtenerClientes());
              //System.out.println(cd.buscarCliente(2));
              
             
        
    } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaqueteTuristico.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
}