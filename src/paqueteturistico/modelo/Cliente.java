/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteturistico.modelo;

/**
 *
 * @author Leonardo
 */
public class Cliente implements Comparable<Cliente>{
    private int idCliente;
    private String nombreCompleto;
    private String email;
    private long dni;
    private long telefono;
    private boolean activo;

    public Cliente(int idCliente, String nombreCompleto, String email, long dni, long telefono, boolean activo) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Cliente(String nombreCompleto, String email, long dni, long telefono, boolean activo) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
    }
    
   

    public Cliente() {
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  nombreCompleto ;
    }
    
    @Override
    public int compareTo(Cliente t) {
        if(t.dni < dni ){
            return 1;
        } else if ( t.dni == dni ){
            return 0;
        } else return -1;
    }

    
    
    
}
