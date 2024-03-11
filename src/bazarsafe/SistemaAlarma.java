/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bazarsafe;

/**
 *
 * @author Andrea
 */
public class SistemaAlarma {
    public int estado; //0 desativado - 1 activado
    
    public void activarAlarma(){
        System.out.println("Alarma activada...\n");
        estado = 1;
    }
    
    public void desactivarAlarma(){
        System.out.println("Alarma desactivada...\n");
        estado = 0;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
