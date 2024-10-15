/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author Diego
 */
public class Parada {
    
    private String parada;
    private Boolean sucursal;

    public Parada(String parada, Boolean sucursal) {
        this.parada = parada;
        this.sucursal = false;
    }

    /**
     * @return the parada
     */
    public String getParada() {
        return parada;
    }

    /**
     * @param parada the parada to set
     */
    public void setParada(String parada) {
        this.parada = parada;
    }

    /**
     * @return the sucursal
     */
    public Boolean getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(Boolean sucursal) {
        this.sucursal = sucursal;
    }
    
}