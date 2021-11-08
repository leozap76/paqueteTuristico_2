/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteturistico.modelo;

/**
 *
 * @author user
 */
public class Transporte {
    private int idTransporte;
    private Destino destino;
    private float precioViaje;
    private String tipoTransporte; 
    private boolean activo;

    public Transporte() {
    }

    public Transporte(int idTransporte, Destino destino, float precioViaje, String tipoTransporte, boolean activo) {
        this.idTransporte = idTransporte;
        this.destino = destino;
        this.precioViaje = precioViaje;
        this.tipoTransporte = tipoTransporte;
        this.activo = activo;
    }

    public Transporte(Destino destino, float precioViaje, String tipoTransporte, boolean activo) {
        this.destino = destino;
        this.precioViaje = precioViaje;
        this.tipoTransporte = tipoTransporte;
        this.activo = activo;
    }

    

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    
    public float getPrecioViaje() {
        return precioViaje;
    }

    public void setPrecioViaje(float precioViaje) {
        this.precioViaje = precioViaje;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Transporte{" + "destino=" + destino + ", precioViaje=" + precioViaje + ", tipoTransporte=" + tipoTransporte + ", activo=" + activo + '}';
    }

    

   
    
    
    
}