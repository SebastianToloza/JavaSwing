
package Controlador;

import Modelo.Almacenamiento;
import Modelo.Vehiculo;
import java.util.ArrayList;


 
public class Controlador {
    private Almacenamiento objAlmacenamiento;
    private Vehiculo ojbVehiculo;
    
    public Controlador(){
        this.objAlmacenamiento = new Almacenamiento();
    }
    
    public void enviarInformacion(int serial,String modelo,boolean confirm1,boolean confirm2){   
        boolean confirms1 =confirm1;
        boolean confirms2 = confirm2;
        
        if(confirms1 && confirms2){    
            System.out.println(serial + modelo);
            Vehiculo carrtio = crearCarro(serial, modelo);
            this.objAlmacenamiento.guardarVehiculo(carrtio);
        }else{
        
        
        }
           
    }
    
    public ArrayList<Vehiculo>  impromirInformacion(){
        return this.objAlmacenamiento.getObjVehiculos();
    }
    
    public Vehiculo crearCarro(int serial,String modelo){
        return new Vehiculo(serial, modelo);
    
    }
    public String obtenerInformacionVehiculos() {
        StringBuilder texto = new StringBuilder("<html>");

        for (Vehiculo v : this.objAlmacenamiento.getObjVehiculos()) {
            texto.append("Modelo: ").append(v.getModelo_vehivulo())
                 .append("<br>Serial: ").append(v.getSerial_vehiculo())
                 .append("<br><br>");
        }

        texto.append("</html>");
        return texto.toString();
    }
    public boolean Confirmador(boolean hola){
        return hola;
    
    }
    
}
