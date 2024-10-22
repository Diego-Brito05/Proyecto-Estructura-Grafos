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
    private Integer numero;
    private Boolean sucursal;

    public Parada(String nparada, Integer numero, Boolean sucursal) {
        this.nparada = nparada;
        this.numero = numero;
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
    
    public void CambiarSucursal(){
        if (getSucursal()){
            setSucursal(false);
        }
        else
            setSucursal(true);
        }        

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
}