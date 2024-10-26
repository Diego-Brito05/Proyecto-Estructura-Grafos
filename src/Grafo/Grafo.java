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
    private Lista nodosVisitados;
    private int contador;

    public Grafo() {
        ListaG lista=new ListaG();
        ListaArista lista1=new ListaArista();
        this.nodos=lista;
        this.aristas=lista1;
        this.nodosVisitados = new Lista();
        this.contador = 0;
    }

    /**
     *
     * @return
     */
    public /*static */ListaG getNodos() {
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
    
   
    public void BP(String nombreInicio, int t) {
        NodoG nodoInicio = searchByname(nombreInicio);
        if (nodoInicio == null) {
            System.out.println("Nodo no encontrado: " + nombreInicio);
            return;
        }

        
        buscarDFS(nodoInicio, t);

        // Imprime la lista de nodos visitados
       
        Nodo pointer = nodosVisitados.getHead();
        while (pointer != null) {
           
            pointer = pointer.getNext();
        }

        // Imprime el contador de nodos visitados
        
    }

    private void buscarDFS(NodoG nodo, int t) {
        if (nodo == null || contador >= t) {
            return; // Detén la búsqueda si el nodo es nulo o se alcanza el límite t
        }

        // Verifica si ya se ha visitado el nodo
        if (!haSidoVisitado(nodo)) {
            if (nodo.getParada().getSucursal()){
                JOptionPane.showMessageDialog(null, "El rango de la sucursal choca con la sucursal "+ nodo.getParada().getNparada());
            }
            
            
            nodosVisitados.insertFinal(nodo.getParada().getNparada()); 
            contador++; // Incrementa el contador

            // Detén la búsqueda si se alcanza el número t de nodos visitados
            if (contador >= t) {
                return;
            }

            // Recorre los nodos adyacentes
            ListaG adyacentes = nodo.getAdyacentes();
            NodoG vecino = adyacentes.getHead(); 

            while (vecino != null) {
                buscarDFS(vecino, t); // Llama recursivamente a DFS
                vecino = vecino.getNext(); // Mueve al siguiente vecino
            }
        }
    }

    private boolean haSidoVisitado(NodoG nodo) {
        // Verifica si el nodo ya está en la lista de nodos visitados
        Nodo pointer = nodosVisitados.getHead();
        while (pointer != null) {
            if (pointer.getElement().equals(nodo.getParada().getNparada())) {
                return true; // El nodo ya ha sido visitado
            }
            pointer = pointer.getNext();
        }
        return false; // El nodo no ha sido visitado
    }

    private int indexOf(NodoG nodo) {
        // Método para encontrar el índice de un nodo en la lista (opcional)
        NodoG pointer = nodos.getHead();
        int index = 0;
        while (pointer != null) {
            if (pointer.equals(nodo)) {
                return index;
            }
            pointer = pointer.getNext();
            index++;
        }
        return -1; // Si no se encuentra el nodo
    }
}
    
    
    
    
    

