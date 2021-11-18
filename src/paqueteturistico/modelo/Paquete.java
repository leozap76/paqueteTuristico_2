/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteturistico.modelo;

import java.time.LocalDate;

/**
 *
 * @author Leonardo
 */
public class Paquete implements Comparable<Paquete>{
    private int idPaquete;
    private Alojamiento alojamiento;
    private Menu menu;
    private Transporte transporte;
    private Cliente cliente;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private int cantPersonas;
    private float montoFinal;
    private boolean activo;

    public Paquete(int idPaquete, Alojamiento alojamiento, Menu menu, Transporte transporte, Cliente cliente, LocalDate fechaInicial, LocalDate fechaFinal, int cantPersonas, float montoFinal, boolean activo) {
        this.idPaquete = idPaquete;
        this.alojamiento = alojamiento;
        this.menu = menu;
        this.transporte = transporte;
        this.cliente = cliente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.cantPersonas = cantPersonas;
        this.montoFinal = montoFinal;
        this.activo = activo;
    }

    public Paquete(Alojamiento alojamiento, Menu menu, Transporte transporte, Cliente cliente, LocalDate fechaInicial, LocalDate fechaFinal, int cantPersonas, float montoFinal, boolean activo) {
        this.alojamiento = alojamiento;
        this.menu = menu;
        this.transporte = transporte;
        this.cliente = cliente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.cantPersonas = cantPersonas;
        this.montoFinal = montoFinal;
        this.activo = activo;
    }

    
    
    public Paquete() {
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

   

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public float getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(float montoFinal) {
        this.montoFinal = montoFinal;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", alojamiento=" + alojamiento + ", menu=" + menu + ", transporte=" + transporte + ", cliente=" + cliente + ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", cantPersonas=" + cantPersonas + ", montoFinal=" + montoFinal + ", activo=" + activo + '}';
    }

    
    @Override
    public int compareTo(Paquete t) {
        if(t.idPaquete < idPaquete ){
            return 1;
        } else if ( t.idPaquete == idPaquete ){
            return 0;
        } else return -1;
    
    
    
}
}
