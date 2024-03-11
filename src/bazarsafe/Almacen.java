/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bazarsafe;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.runtime.JSType;
/**
 *
 * @author Andrea
 */
public class Almacen {
    private int capacidad;
    private  List<String> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
        capacidad = 0;
    }
    
    public void agregar(String producto){
        productos.add(producto);
    }
     public void quitar(String producto){
         int p = 0;
         for (int i = 0; i < productos.size(); i++) {
             if(productos.get(i).compareTo(producto)==0){
                 productos.remove(i);
                 System.out.println("Producto removido");
                 p = 1;
             }
         }
         if(p == 0){
             System.out.println("No se encontro el producto");
         }
    }
     
    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }
    
    

 
 
    
}
