/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bazarsafe;

import jdk.internal.org.objectweb.asm.Opcodes;
/**
 *
 * @author Andrea
 */
public class Gerente {
    private int id;
    private String password;
    private Almacen almacen;
    private CamaraDeSeguridad camara;
    
    public int ingresar(int id, String password){
        int r = 0;
        if(id == this.id && password.compareTo(this.password)==0){
            r = 1;
        }
        return r;
    }

    public Gerente(int id, String password) {
        this.id = id;
        this.password = password;
        almacen = new Almacen();
        camara = new CamaraDeSeguridad();
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public CamaraDeSeguridad getCamara() {
        return camara;
    }
    
    
    
    
    
    
    
    
   
    
}
