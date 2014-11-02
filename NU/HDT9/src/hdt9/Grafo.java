
/**
 * Universidad del Valle de Guatemala
 * Algoritmo y Estructuras de Datos
 * Miembros:
 * - Javier Bucaro
 * - Kuk Ho Chung
 * Referencia:https://code.google.com/p/hoja-8-grafos/source/browse/Hoja8/src/hoja8
 */

package hdt9;

import java.util.Vector;

public class Grafo<V,E> implements InterfazG<V,E>{

    private Vector vertices = new Vector();
    private int[][] arcos= new int [25][25];
    
    /**
     * Nombre: GraphMatrix
     * Descripcion: constructor de la clase
     * Pre: no hay
     * Post: el arreglo de arcos inicializado
     * No hay parametros ni valor de retorno
     */
    public Grafo(){
        
        for(int i=0;i<25;i++){
            for(int j=0;j<25;j++){
                if(i==j){
                    arcos[i][j]=0;
                }
                else{
                    arcos[i][j]=10000;
                }
            }
        }
    }
    /**
     *
     * @param label
     */
    public void add(V label) {
        
        if(!vertices.contains(label)){
            vertices.add(label);
        }
        
        
    }

    /**
     *
     * @param vtx1
     * @param vtx2
     * @param label
     */
    public void addEdge(V vtx1, V vtx2, E label) {
        int i = vertices.indexOf(vtx1);
        int j = vertices.indexOf(vtx2);        
        String tmp = ""+label;
        int peso = Integer.parseInt(tmp);
        arcos[i][j]=peso;
    }
    
    public void show(){
        for(int a=0;a<vertices.size();a++){
            for(int b=0;b<vertices.size();b++){
                System.out.print(""+arcos[a][b]+" ");
            }
            System.out.println("");
        }
    }
    
    /**
     *
     * @return
     */
    public int size(){
        return vertices.size();
    }
    
    /**
     *
     * @param label1
     * @param label2
     * @return
     */
    public int getEdge(V label1, V label2){
        return arcos[vertices.indexOf(label1)][vertices.indexOf(label2)];
    }
    
    /**
     *
     * @param label
     * @return
     */
    public V get(int label){
        
        return (V)vertices.get(label);
        
    }
    
    /**
     *
     * @param label
     * @return
     */
    public int getIndex(V label){
        return vertices.indexOf(label);
    }
    
    /**
     *
     * @param label
     * @return
     */
    public boolean contains(V label){
        return vertices.contains(label);
    }
}