/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenseas/license-default.txt to change this license
>>>>>>> 1339633d6ff9053a85f82fd31ba3d664393701e6
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.Lista;
import EDD.NodoG;
import Grafo.Arista;
import Grafo.Grafo;

import static Interfaces.ModGraph.gsucur;
import LectorJson.LectorJson;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.swing_viewer.ViewPanel;


/**
 *
 * @author Diego
 * version 26/10/24
 */
public class Menu extends javax.swing.JFrame {

    static Grafo grafo;
    public static ModificarGrafo v0;
    static File archivo;
    static Graph libro;
    static String mySlylesheet = "node { size: 15px; shape:circle; fill-color:blue; text-size: 20;text-background-color:white; text-background-mode:rounded-box; text-alignment:at-right; shadow-mode: plain; shadow-color: black; shadow-width:5px; shadow-offset: 0px;text-offset: 5px, 5px;}"
            + "edge { size : 10px; fill-color: black;}";


    /**
     * Creates new form Menu
     * @param grafo
     * @param archivo
     */
    public Menu(Grafo grafo, File archivo) {
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
        if (grafo==null){
        this.grafo=null;
        }else{
            this.grafo=grafo;
        }
        if (archivo==null){
        this.archivo=null;
        }else{
            this.archivo=archivo;
        }
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Graph getlibro(){
        return libro;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CargaArchivo = new javax.swing.JButton();
        MostrarGrafo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CargaArchivo.setBackground(new java.awt.Color(255, 153, 102));
        CargaArchivo.setText("CARGAR ARCHIVO");
        CargaArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(CargaArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 280, -1));

        MostrarGrafo.setBackground(new java.awt.Color(255, 153, 102));
        MostrarGrafo.setText("MOSTRAR GRAFO");
        MostrarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarGrafoActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 280, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /*
    Este metodo se encarga de cargar el archivo txt
    
    */
    private void CargaArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaArchivoActionPerformed
        LectorJson LeerJson =new LectorJson();
        
        Grafo grafo=new Grafo();
        Lista parada = new Lista();
        Lista relaciones = new Lista();
        try {
            File archivo = LeerJson.LecturaJson(parada,relaciones);
            setArchivo(archivo);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        grafo.crearParadas(parada);
        grafo.crearRelaciones(relaciones);
        setGrafo(grafo);
    }//GEN-LAST:event_CargaArchivoActionPerformed
    
   
    /*
    Este metodo se encarga de mostrar el grafo
    
    */
    public void displayGraph(Graph graph2) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout()){
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(1600, 960);
            }
        };
        frame.setSize(panel.getWidth(), panel.getHeight());
     
        Viewer viewer = new SwingViewer(graph2, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        viewer.enableAutoLayout();
        ViewPanel viewPanel = (ViewPanel) viewer.addDefaultView(false);
        panel.add(viewPanel);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);      
    }
    
    /*
    Este metodo se encarga de crear el grafo con la libreria graphstream para luego ser mostrado
    
    */
    private void MostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarGrafoActionPerformed
        if (grafo.getNodos().getLength()==0){
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun archivo");
        }
        else{
        
            try{

            
            Graph graphLibrary = new MultiGraph("Tren");
            System.setProperty("org.graphstream.ui", "swing");
             System.setProperty("gs.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
            NodoG auxNodo =getGrafo().getNodos().getHead();      

            graphLibrary.setAttribute("ui.stylesheet", mySlylesheet);
            //Recorre los nodos y los agrega al grafo
            while(auxNodo!=null){
                String numero=Integer.toString(auxNodo.getParada().getNumero());
                String NombreParada=auxNodo.getParada().getNparada();

                graphLibrary.addNode(numero);
                graphLibrary.getNode(numero).setAttribute("ui.label", NombreParada);
                graphLibrary.getNode(numero).setAttribute("ui.frozen");
                auxNodo=auxNodo.getNext();
                libro = graphLibrary;
                libro.nodeAttributeChanged(numero, WIDTH, numero, numero, v0, v0);                
            } 
            
        
        
            //Recorre las aristas y las agrega al grafo
            Arista arista=getGrafo().getAristas().getHead();
            while(arista!=null){
                
                String n1=Integer.toString(arista.getInicio().getParada().getNumero());
                String n2=Integer.toString(arista.getObjetivo().getParada().getNumero());
                String id=n1+n2;
                graphLibrary.addEdge(id,n1,n2, false);
                graphLibrary.getEdge(id).setAttribute("length", 500);
                arista=arista.getNext();
             
            
            }
            this.displayGraph(graphLibrary);

            }
            catch(Exception err){
                    JOptionPane.showMessageDialog(null, err);
            }
            new ModGraph(this.getGrafo(),this.getArchivo()).setVisible(true);
           
    }                                            
    }//GEN-LAST:event_MostrarGrafoActionPerformed
    
    public static void CambiaColorNodo(Graph graph, String nodeId, String color) {
    if (graph.getNode(nodeId) != null) {
        graph.getNode(nodeId).setAttribute("ui.color", color);
    } else {
        JOptionPane.showMessageDialog(null, "Nodo no encontrado: " + nodeId);
    }
    }

    
    
    
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(null,archivo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargaArchivo;
    private javax.swing.JButton MostrarGrafo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
