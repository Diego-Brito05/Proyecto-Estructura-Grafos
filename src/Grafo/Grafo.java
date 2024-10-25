/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import EDD.ListaG;
import EDD.Lista;
import EDD.ListaArista;
import EDD.Nodo;
import EDD.NodoG;
import Auxiliar.Auxiliar;
import Grafo.Arista;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego
 */
public class Grafo {
    private static ListaG nodos;
    private static ListaArista aristas;

    public Grafo() {
        ListaG lista=new ListaG();
        ListaArista lista1=new ListaArista();
        this.nodos=lista;
        this.aristas=lista1;
    }

    public static ListaG getNodos() {
        return nodos;
    }

    public void setNodos(ListaG nodos) {
        this.nodos = nodos;
    }

    public static ListaArista getAristas() {
        return aristas;
    }

    public void setAristas(ListaArista aristas) {
        this.aristas = aristas;
    }

    //imprime todos los atributos de los nodos
    public void printNodos() {
        NodoG pointer=nodos.getHead();
        while (pointer!=null){
            pointer.print();
            pointer=pointer.getNext();
        }
    }
    
    //imprime todos los atributos de los nodos
    public void printAristas(){
        Arista pointer=aristas.getHead();
        while (pointer!=null){
            pointer.print();
            pointer=pointer.getNext();
        }
    }
    
    /*
    Crea todos los usuarios a partir de una lista
    @param usuarios
    */
    public void crearParadas(Lista paradas){
        int cont = 1; 
        //contador que le otorga el numero a cada Parada
        Nodo pointer=paradas.getHead();
        while (pointer!= null){
            String nombre=pointer.getElement().toString();
            if (paradas.buscar(nombre)!= null){
                Parada parada=new Parada(nombre,cont,false);
                getNodos().insertFinal(parada);
                cont ++;
                pointer=pointer.getNext();
            }
        }
    
    }
    /*
    Crea todas las relaciones a partir de una lista
    @param paradas
    */
    public void crearRelaciones(Lista paradas){
        
        Nodo pointer = paradas.getHead();    
        Boolean NuevaLinea = false;
        
        while (pointer!=null && pointer.getNext()!= null){
            Object sigO = pointer.getNext().getElement();
            NodoG sig= searchByname(sigO.toString());
            if (pointer.getElement()!= "-"){
                
                Object NombreAct = pointer.getElement();
                NodoG Nodoact = searchByname(NombreAct.toString());
                
                if(NuevaLinea){
                    Object NombreSig = pointer.getNext().getElement();
                    sig = searchByname(NombreSig.toString());
                    NuevaLinea = false;
                }
                        
                
                if  (sig != null){
                    Nodoact.getAdyacentes().insertFinal(sig.getParada());
                    Arista aristasig= new Arista(Nodoact,sig);
                    getAristas().insertFinal(aristasig);
                
                Object NombreSig = pointer.getNext().getElement();
                sig = searchByname(NombreSig.toString());
                
              
                
           
            }else{
                
                sig=null;
                NuevaLinea=true;
            }
                
            
            
            }
        if(pointer.getNext()!= null){
            pointer= pointer.getNext();
        }
        }
    }
    /*busqueda por nombre
    *@param name
    *@return
    */
    public String buscarp(String parade){
        if (nodos.isEmpty()){
            return null;
        }else{
            NodoG pointer=nodos.getHead();
            NodoG temp=null;
            while(pointer!=null){
                if (pointer.getParada().getNparada().equals(parade)){
                    
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
            }
            if(temp!= null){
                return temp.getParada().getNparada();
            } else{
                JOptionPane.showMessageDialog(null, "Parada no encontrada");
                return null;
            }
        }
        
     
}
    public Parada buscarpar(String parade){
       NodoG pointer=nodos.getHead();
       NodoG temp=null;
       while(pointer!=null){
                if (pointer.getParada().getNparada().equals(parade)){
                    
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
            }
            if(temp!= null){
                return temp.getParada();
                
            }else {
               return null;
            }
       }

    public NodoG searchByname(String name){
        if (nodos.isEmpty()){
            return null;
        }else{
            NodoG pointer=nodos.getHead();
            NodoG temp=null;
            while(pointer!=null){
                if ("-".equals(name)){
                    break;
                }
                if (pointer.getParada().getNparada().equals(name) ){ //si la entrada id corresponde al id del usuario
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
            }
            if(temp!= null){
                return temp; // retorna el nodoG correspondiente
                
            } else{
                //System.out.println("El usuario no fue encontrado");
                return null;
            }
        }     
    }
    
    
}
