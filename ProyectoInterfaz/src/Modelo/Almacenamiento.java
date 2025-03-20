
package Modelo;

import java.util.ArrayList;

public class Almacenamiento {
    ArrayList<Vehiculo> objVehiculos;
    public Almacenamiento(){    
        this.objVehiculos= new ArrayList<>();
    }
    public void guardarVehiculo(int sereal,String modelo){
        objVehiculos.add(new Vehiculo());
        boolean control = true;
        while(control){
            for(int i =0 ; i<objVehiculos.size() ; i++){
                if(objVehiculos.get(i).getSerial_vehiculo() != sereal){
                    objVehiculos.get(i).guardarVehiculo(sereal, "modelo");
                    control = false;
                }
            }
        }   
    }

    public ArrayList<Vehiculo> getObjVehiculos() {
        return objVehiculos;
    }

    public void setObjVehiculos(ArrayList<Vehiculo> objVehiculos) {
        this.objVehiculos = objVehiculos;
    }
    
    
}
