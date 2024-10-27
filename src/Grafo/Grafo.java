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

    Lista noval;
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
    
   
private Lista paradasNoValidas; // Lista para almacenar las paradas no válidas

public void buscarDFS(String nombreInicio, int t) {
    NodoG nodoInicio = searchByname(nombreInicio);
    if (nodoInicio == null) {
        System.out.println("Nodo no encontrado: " + nombreInicio);
        return;
    }

    nodosVisitados = new Lista(); // Reiniciamos la lista de nodos visitados
    paradasNoValidas = new Lista(); // Inicializamos la lista de paradas no válidas
    int contador = 0; // Contador de paradas visitadas

    // Marcamos el nodo inicial como visitado, pero no lo contamos
    nodoInicio.setVisitado(true);

    // Llamada recursiva para iniciar la búsqueda
    buscarDFSRec(nodoInicio, t, contador);
}

// Método recursivo para búsqueda en profundidad
private void buscarDFSRec(NodoG nodoActual, int t, int contador) {
    // Verificamos si hemos alcanzado el límite t
    if (contador >= t) {
        return;
    }

    // Recorremos los nodos adyacentes
    ListaG adyacentes = nodoActual.getAdyacentes();
    NodoG vecino = adyacentes.getHead();

    while (vecino != null && contador < t) {
        // Verificamos si el vecino ya ha sido visitado
        if (!vecino.isVisitado()) {
            // Verificamos si la parada actual tiene sucursal
            if (vecino.getParada().getSucursal()) {
                paradasNoValidas.insertFinal(vecino.getParada().getNparada()); // Agregamos a la lista de no válidas
            } else {
                nodosVisitados.insertFinal(vecino.getParada().getNparada()); // Marcamos el nodo como visitado
                contador++; // Incrementamos el contador solo si no es una sucursal
            }
            vecino.setVisitado(true); // Marcamos el vecino como visitado
            buscarDFSRec(vecino, t, contador); // Llamada recursiva para el vecino
        }
        vecino = vecino.getNext(); // Avanzamos al siguiente vecino
    }
}

// Método para obtener la lista de paradas no válidas
public Lista getParadasNoValidas() {
    return paradasNoValidas; // Devuelve la lista de paradas no válidas
}

    public void buscarBFS(String nombreInicio, int n) {
    NodoG nodoInicio = searchByname(nombreInicio);
    
    if (nodoInicio == null) {
        System.out.println("Nodo no encontrado: " + nombreInicio);
        return;
    }

    // Usamos una cola para la búsqueda en amplitud
    ListaG cola = new ListaG();
    nodosVisitados = new Lista(); // Reiniciamos la lista de nodos visitados
    cola.insertFinalG(nodoInicio); // Agregamos el nodo inicial a la cola
    nodoInicio.setVisitado(true); // Marcamos como visitado

    int contador = 0; // Contador de paradas visitadas

    while (!cola.isEmpty() && contador < n) {
        NodoG nodoActual = cola.eliminarPrimero();
        cola.deleteBegin(); // Removemos el nodo de la cola

        // Verificamos si la parada actual tiene sucursal
        if (nodoActual.getParada().getSucursal()) {
            JOptionPane.showMessageDialog(null,"Parada no válida: " + nodoActual.getParada().getNparada());
            
            continue; // Si tiene sucursal, no la contamos
        }

        // Marcamos el nodo actual como visitado
        if (!nodoActual.equals(nodoInicio)) {
        nodosVisitados.insertFinal(nodoActual.getParada().getNparada()); // Marcamos el nodo como visitado
        contador++; // Incrementamos el contador
        }
        // Recorremos los nodos adyacentes
        ListaG adyacentes = nodoActual.getAdyacentes();
        NodoG vecino = adyacentes.getHead();

        while (vecino != null && contador < n) {
            if (!vecino.isVisitado()) { // Verificamos si el vecino ya fue visitado
                cola.insertFinalG(vecino); // Agregamos el vecino a la cola
                vecino.setVisitado(true); // Marcamos como visitado
            }
            vecino = vecino.getNext(); // Avanzamos al siguiente vecino
        }
    }

    // Imprimir nodos visitados
    Nodo pointer = nodosVisitados.getHead();
    System.out.println("Nodos visitados:");
    while (pointer != null) {
        System.out.println(pointer.getElement());
        pointer = pointer.getNext();
    }
}
}

    
    
    
    
    

