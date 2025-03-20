
package Controlador;

import Modelo.Almacenamiento;
import Modelo.Vehiculo;
import VIsta.FormularioRegistro;
import java.util.ArrayList;


 
public class Controlador {
    private Almacenamiento objAlmacenamiento;
    private Vehiculo ojbVehiculo;
    private FormularioRegistro objFormularioRegistro;
    public Controlador(){
        this.objFormularioRegistro= new FormularioRegistro();
        this.ojbVehiculo = new Vehiculo();
        this.objAlmacenamiento = new Almacenamiento();
    
    
    }
    public void enviarInformacion(int serial,String modelo){
        this.objAlmacenamiento.guardarVehiculo(serial, modelo);   
    }
    public ArrayList<Vehiculo>  impromirInformacion(){
        return this.objAlmacenamiento.getObjVehiculos();
    }
}
