/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bazarsafe;

/**
 *
 * @author Andrea
 */
public class CamaraDeSeguridad {
    private String ubicacion;
    private int deteccionMovimiento;
    private SistemaAlarma alarma = new SistemaAlarma();
    
    public void obtenerUbicacion(){
        System.out.println("Ubicacion: " + ubicacion);
        
    }
    
    public int detectarMovimiento(){
        int i = -1;
        if(deteccionMovimiento == 1 && alarma.getEstado()== 0){
            System.out.println("Detección de movimiento...\n");
            deteccionMovimiento = 0;
            i =1;
        }
        if(deteccionMovimiento == 0 && alarma.getEstado() == 1){
            System.out.println("Sin detección de movimiento...\n");
            i = 0;
        }
        return i;
    }
    
    
    public void activarAlarma(){
       if(detectarMovimiento() == 1){
          alarma.activarAlarma();
       }
    }
    
   
    public void desactivarAlarma(){
       if(detectarMovimiento() == 0){
           alarma.desactivarAlarma();
       }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getDeteccionMovimiento() {
        return deteccionMovimiento;
    }

    public void setDeteccionMovimiento(int deteccionMovimiento) {
        this.deteccionMovimiento = deteccionMovimiento;
    }
    
    
}
