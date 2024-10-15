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
    
    private String nparada;
    private Boolean sucursal;

    public Parada(String nparada, Boolean sucursal) {
        this.nparada = nparada;
        this.sucursal = false;
    }

    /**
     * @return the parada
     */
    public String getNparada() {
        return nparada;
    }

    /**
     * @param nparada the parada to set
     */
    public void setNparada(String nparada) {
        this.nparada = nparada;
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