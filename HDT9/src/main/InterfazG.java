/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author Javier Bucaro
 */
public interface InterfazG<V,E> {
    
    public void addNodo(V km);
    /*
     * metodo que sirve para agregar nodo
     * recibe como parametro la ciudad
     */
    
    public void addArc(V cd1,V cd2,E km);
    /*
     * metodo que conecta los nodos
     * recibe como parametros dos ciudades
     * y la distancia entre nodos
     */
    
    public V getNodo();
    /*
     * metodo que obtiene el peso del nodo 
     */
    
    public int getArc();
    /*
     * metodo que obtiene la distancia entre las ciudades 
     */
    
    public void delArc (V km);
    /*
     * metodo que elimina la distancia entre nodos 
     */
}
