/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteturistico.modelo;

/**
 *
 * @author Nicolas
 */
public class Alojamiento implements Comparable<Alojamiento>{
    private int idAlojamiento;
    private Destino destino;
    private String ubicacion;
    private String nombreAlojamiento;
    private String tipoAlojamiento;
    private float precioNoche;
    boolean activo;

    public Alojamiento(int idAlojamiento, Destino destino, String ubicacion, String nombreAlojamiento, String tipoAlojamiento, float precioNoche, boolean activo) {
        this.idAlojamiento = idAlojamiento;
        this.destino = destino;
        this.ubicacion = ubicacion;
        this.nombreAlojamiento = nombreAlojamiento;
        this.tipoAlojamiento = tipoAlojamiento;
        this.precioNoche = precioNoche;
        this.activo = activo;
    }

    public Alojamiento(Destino destino, String ubicacion, String nombreAlojamiento, String tipoAlojamiento, float precioNoche, boolean activo) {
        this.destino = destino;
        this.ubicacion = ubicacion;
        this.nombreAlojamiento = nombreAlojamiento;
        this.tipoAlojamiento = tipoAlojamiento;
        this.precioNoche = precioNoche;
        this.activo = activo;
    }

   

    public Alojamiento() {
    }

   

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    

    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public float getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(float precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  nombreAlojamiento +"  "+   precioNoche + "$ X/N" ;
    }
    
    @Override
    public int compareTo(Alojamiento t) {
        if(t.idAlojamiento < idAlojamiento ){
            return 1;
        } else if ( t.idAlojamiento == idAlojamiento  ){
            return 0;
        } else return -1;
        
    }
    
    
}
