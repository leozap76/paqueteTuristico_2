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
public class Menu implements Comparable<Menu>{
    private int idMenu;
    private Alojamiento alojamiento;
    private String tipoMenu;
    private float precioMenu;
    private boolean activo;

    

    public Menu() {
    }

    public Menu(int idMenu, Alojamiento alojamiento, String tipoMenu, float precioMenu, boolean activo) {
        this.idMenu = idMenu;
        this.alojamiento = alojamiento;
        this.tipoMenu = tipoMenu;
        this.precioMenu = precioMenu;
        this.activo = activo;
    }

    public Menu(Alojamiento alojamiento, String tipoMenu, float precioMenu, boolean activo) {
        this.alojamiento = alojamiento;
        this.tipoMenu = tipoMenu;
        this.precioMenu = precioMenu;
        this.activo = activo;
    }

    

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public float getPrecioMenu() {
        return precioMenu;
    }

    public void setPrecioMenu(float precioMenu) {
        this.precioMenu = precioMenu;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return  tipoMenu + "  " + precioMenu + "$";
    }
    
    @Override
    public int compareTo(Menu t) {
      if(t.idMenu < idMenu ){
            return 1;
        } else if ( t.idMenu == idMenu ){
            return 0;
        } else return -1;
    }
    
    
    
    
}

