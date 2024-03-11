/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bazarsafe;

/**
 *
 * @author Andrea
 */
public class Empleado {
    private int idEmpleado;
    private String password;
    private CamaraDeSeguridad camara;

    public Empleado(int idEmpleado, String password) {
        this.idEmpleado = idEmpleado;
        this.password = password;
        camara = new CamaraDeSeguridad();
    }
    
    
    
    public void ingresarEmpleado(int idEmpleado, String password){
      this.idEmpleado = idEmpleado;
      this.password = password;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public CamaraDeSeguridad getCamara() {
        return camara;
    }
    
    
}
