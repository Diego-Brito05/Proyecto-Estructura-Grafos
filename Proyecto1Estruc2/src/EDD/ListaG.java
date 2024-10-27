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
public class ListaG {
     private NodoG head;
    private Integer length;

    public ListaG() {
        this.head = null;
        this.length = 0;
    }

    public NodoG getHead() {
        return head;
    }

    public void setHead(NodoG head) {
        this.head = head;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
    
    public void insertBegin(Parada parada) {
        NodoG nodoG =new NodoG(parada);
        if (isEmpty()){
        setHead(nodoG);
        }
        else{
        nodoG.setNext(getHead());
        setHead(nodoG);
        }
        length++;
    }

    public void insertFinal(Parada parada) {
        NodoG nodoG =new NodoG(parada);
        if (isEmpty()){
            setHead(nodoG);
        }
        else{
            NodoG pointer=getHead();
            while (pointer.getNext()!=null){
                pointer=pointer.getNext();
            }
            pointer.setNext(nodoG);
        }
        length++;
    }

    
    public void insertAtIndex(Parada parada, int index) {
        NodoG nodoG =new NodoG(parada);
        if (isEmpty() || index==0){
        insertBegin(parada);
        }
        else {
            if (index<length){
                NodoG pointer=getHead();
                int cont=0;
                while (cont<index-1){
                    pointer=pointer.getNext();
                    cont++;
                }
                nodoG.setNext(pointer.getNext());
                pointer.setNext(nodoG);
                length++;
            } 
            else if (index==length){
                insertFinal(parada);
            } 
            else {
                System.out.println("Index not valid");
            }
        }
    }

    
    public NodoG deleteBegin() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            NodoG temp=getHead();
            setHead(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;
        }
    }

   
    
    public NodoG deleteFinal() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            NodoG pointer=getHead();
            while(pointer.getNext().getNext()!=null){
                pointer=pointer.getNext();
            }
            NodoG temp=pointer.getNext();
            pointer.setNext(null);
            length--;
            return temp;
        }
    }

    

    public boolean isEmpty() {
            return getHead()==null;    
    }
    
    public void print() {
        NodoG pointer=getHead();
        while (pointer!=null){
            System.out.println(" ["+pointer.getParada().getNparada()+"] " );
            pointer=pointer.getNext();
        }
    }
    
    public void insertFinalG(NodoG nodoG) {
    if (isEmpty()) {
        setHead(nodoG);
    } else {
        NodoG pointer = getHead();
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        pointer.setNext(nodoG);
    }
    length++;
}
    public NodoG eliminarPrimero() {
    if (isEmpty()) {
       
        return null;
    } else {
        NodoG temp = getHead();
        setHead(temp.getNext());
        length--;
        return temp;
    }
}
}
    

