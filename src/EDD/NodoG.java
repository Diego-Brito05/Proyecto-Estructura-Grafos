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
    private Parada parada;
    private NodoG next;
    private ListaG adyacentes;
    private Integer numeroComponente;
    private boolean visitado;

    public NodoG(Parada parada) {
        this.parada = parada;
        this.next = null;
        this.adyacentes = new ListaG();
        this.visitado=false;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
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

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    
    //imprime los atributos del nodo
    public void print(){
        System.out.println("-----------------------------------");
        System.out.println("Id: "+getParada().getNparada());
        System.out.print("Relaciones: ");
        NodoG pointer = getAdyacentes().getHead();
        while (pointer!=null){
            System.out.print("["+(pointer.getParada().getNparada())+"]");
            pointer=pointer.getNext(); 
        }
        System.out.println(" ");
        System.out.println("-----------------------------------");
    }
  
}
    

