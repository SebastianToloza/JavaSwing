
package Controlador;

import Modelo.Almacenamiento;
import Modelo.Vehiculo;
import VIsta.FormularioRegistro;
import java.util.ArrayList;


 
public class Controlador {
    private Almacenamiento objAlmacenamiento;
    private Vehiculo ojbVehiculo;
    
    public Controlador(){
        this.ojbVehiculo = new Vehiculo();
        this.objAlmacenamiento = new Almacenamiento();
    }
    
    public void enviarInformacion(int serial,String modelo){     
        Vehiculo carrtio =crearCarro(serial, modelo);
        this.objAlmacenamiento.guardarVehiculo(carrtio);   
    }
    
    public ArrayList<Vehiculo>  impromirInformacion(){
        System.out.println( this.objAlmacenamiento.getObjVehiculos());
        return this.objAlmacenamiento.getObjVehiculos();
    }
    
    public Vehiculo crearCarro(int serial,String modelo){
        this.ojbVehiculo.guardarDatos(serial, modelo);
        return this.ojbVehiculo;
    
    }
}
