/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Grafo.Parada;
/**
 *
 * @author Diego
 */
public class NodoG {
    private Parada nombre;
    private NodoG next;
    private ListaG adyacentes;
    private Integer numeroComponente;

    public NodoG(Parada parada) {
        this.nombre = nombre;
        this.next = null;
        this.adyacentes = new ListaG();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoG getNext() {
        return next;
    }

    public void setNext(NodoG next) {
        this.next = next;
    }

    public ListaG getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ListaG adyacentes) {
        this.adyacentes = adyacentes;
    }

    public Integer getNumeroComponente() {
        return numeroComponente;
    }

    public void setNumeroComponente(Integer numeroComponente) {
        this.numeroComponente = numeroComponente;
    
}
