/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteturistico.modelo;

/**
 *
 * @author user
 */
public class Destino implements Comparable<Destino>{
    private int idDestino;
    private String paisDestino;
    private String ciudadDestino;
    private boolean activo;

    public Destino() {
    }

    public Destino(String paisDestino, String ciudedDestino, boolean activo) {
        this.paisDestino = paisDestino;
        this.ciudadDestino = ciudedDestino;
        this.activo = activo;
    }

    public Destino(int idDestino, String paisDestino, String ciudedDestino, boolean activo) {
        this.idDestino = idDestino;
        this.paisDestino = paisDestino;
        this.ciudadDestino = ciudedDestino;
        this.activo = activo;
    }

    public Destino(String paisDestino, String ciudadDestino) {
        this.paisDestino = paisDestino;
        this.ciudadDestino = ciudadDestino;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }
    
    
    

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getCiudedDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudedDestino) {
        this.ciudadDestino = ciudedDestino;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  ciudadDestino ;
    }
    
    @Override
    public int compareTo(Destino t) {
        
        if(t.idDestino < idDestino ){
            return 1;
        } else if ( t.idDestino == idDestino ){
            return 0;
        } else return -1;
    }
    
    
}
