/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bazarsafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class BazarSafe {
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente gerente = new Gerente(1, "gerente");
        
        List<Empleado> listaE = new ArrayList<>();
        listaE.add(new Empleado(2, "12345"));
        listaE.add(new Empleado(3, "contra"));
        Scanner scan = new Scanner(System.in);
        int i=0;
        
        int opc = 0;
         int numE = 0;
        do {
            System.out.println("\n1. Ingresar");
            System.out.println("2. Salir");
             opc = scan.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("\n3. Gerente\n4. Empleado");
                    opc = scan.nextInt();
                    if(opc ==3){
                        System.out.println("\nIngresa id: ");
                        int id = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ingresa password: ");
                        String password = scan.nextLine();
                        if(gerente.ingresar(id, password)==1){
                            System.out.println("\nBienvenido gerente");
                            do{
                            System.out.println("\n1. Monitorear camaras\n2. Activar alarma\n3. Desactivar alarma\n4. Gestionar almacén\n5. Salir");
                                opc = scan.nextInt();
                                switch (opc) {
                                    case 1:
                                        System.out.println("Monitoreando camaras");
                                        break;
                                    case 2:
                                        gerente.getCamara().setDeteccionMovimiento(1);
                                        gerente.getCamara().activarAlarma();
                                        break;
                                    case 3:
                                        gerente.getCamara().setDeteccionMovimiento(0);
                                        gerente.getCamara().desactivarAlarma();
                                        break;
                                    case 4: 
                                        System.out.println("\nGestionar almacen\n1. Agregar\n2. Quitar\n3. Salir");
                                        opc = scan.nextInt();
                                        switch (opc) {
                                            case 1:
                                                scan.nextLine();
                                                System.out.println("Ingresa producto: ");
                                                String pro = scan.nextLine();
                                                gerente.getAlmacen().agregar(pro);
                                                gerente.getAlmacen().setCapacidad(+1);
                                                i++;
                                                System.out.println("Producto agregado");
                                                System.out.println("Producto: "+ gerente.getAlmacen().getProductos().get(i-1));
                                                
                                                break;
                                            case 2:
                                                scan.nextLine();
                                                System.out.println("Ingresa producto a quitar: ");
                                                pro = scan.nextLine();
                                                gerente.getAlmacen().quitar(pro);
                                                break;
                                            case 3:
                                                break;
                                                
                                            default:
                                                break;
                                        }
                                        break;
                                    case 5:
                                        break;
                                    default:
                                        break;
                                }
                                
                            }while (opc != 5);
                        } else {
                            System.out.println("\nContraseña incorrecta ");
                        }
                    } 
                    if(opc == 4){
                       
                        System.out.println("Ingresa id: ");
                        int id = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ingresa password: ");
                        String password = scan.nextLine();
                        boolean entrar = false;
                        for (int j = 0; j < listaE.size(); j++) {
                            if(listaE.get(j).getIdEmpleado()== id && listaE.get(j).getPassword().compareTo(password) ==0 ){
                                numE = j;
                                System.out.println(numE);
                                entrar = true;
                            }
                        }
                        if (entrar){
                            System.out.println("\nBienvenido empleado");
                            do {
                                System.out.println("\n1. Monitorear camaras\n2. Activar alarma\n3. Desactivar alarma\n4. Salir");
                                opc = scan.nextInt();
                                switch (opc) {
                                    case 1:
                                        System.out.println("Monitoreando camaras");
                                        break;
                                    case 2:
                                        listaE.get(numE).getCamara().setDeteccionMovimiento(1);
                                        listaE.get(numE).getCamara().activarAlarma();
                                        break;
                                    case 3:
                                        listaE.get(numE).getCamara().setDeteccionMovimiento(0);
                                        listaE.get(numE).getCamara().desactivarAlarma();
                                        break;
                                    case 4: 
                                        break;
                                    default:
                                        break;
                                }
                                
                            } while (opc != 4);
                            
                        } else {
                             System.out.println("Contraseña incorrecta ");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    break;
            }
        } while(opc != 2);
    }
    
}
