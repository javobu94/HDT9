
/**
 * Universidad del Valle de Guatemala
 * Algoritmo y Estructuras de Datos
 * Miembros:
 * - Javier Bucaro
 * - Kuk Ho Chung
 * Referencia:https://code.google.com/p/hoja-8-grafos/source/browse/Hoja8/src/hoja8
 */

package hdt9;

import java.io.*;

public class Arch{
    
    File archivo;
    FileReader fr;
    BufferedReader br;
    InterfazG grafo = new Grafo();

    
    /**
     * Nombre: obtenerArchivo
     * Descripcion: 
     * No hay valor de retorno
     * @param direccion
     * @throws FileNotFoundException
     */
    public void obtenerArchivo(String direccion) throws FileNotFoundException{
       archivo=new File(direccion); 
    }  
    
    /**
     * Nombre: arregloNombres
     * Descripcion: obtiene los nombres de los nodos para el grafo
     * No tiene parametros
     * @return
     * @throws IOException
     */
    public InterfazG arregloNombres() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;
        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.add(tmp[0]);
            grafo.add(tmp[1]);
        }
        return grafo;
    }
    
    /**
     * Nombre: matrizCostos
     * Descripcion: obtiene los pesos de los arcos entre nodos del grafo
     * No tiene parametros
     * @return
     * @throws IOException
     */
    public InterfazG matrizCostos() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;

        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.addEdge(tmp[0], tmp[1], tmp[2]);
        }
        return grafo;
    }
}
