/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Grafo.Arista;
/**
 *
 * @author Diego
 */
public class ListaArista {
     private Arista head;
    private int length;

    public ListaArista() {
        this.head = null;
        this.length = 0;
    }
    
    
    public Arista getHead() {
        return head;
    }

    public void setHead(Arista head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public void insertFinal(Arista arista) {
        if (isEmpty()){
            setHead(arista);
        }
        else{
            Arista pointer=getHead();
            while (pointer.getNext()!=null){
                pointer=pointer.getNext();
            }
            pointer.setNext(arista);
        }
        length++;
    }
    
    public Arista deleteBegin() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            Arista temp=getHead();
            setHead(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;
        }
    }
    
    
    public Arista deleteFinal() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            Arista pointer=getHead();
            while(pointer.getNext().getNext()!=null){
                pointer=pointer.getNext();
            }
            Arista temp=pointer.getNext();
            pointer.setNext(null);
            length--;
            return temp;
        }
    }

    
   
    
    public boolean isEmpty() {
            return getHead()==null;    
    }
}
