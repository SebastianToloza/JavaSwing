
package Modelo;

import java.util.ArrayList;

public class Almacenamiento {
    ArrayList<Vehiculo> objVehiculos;
    public Almacenamiento(){    
        this.objVehiculos= new ArrayList<>();

    }
    
    public void guardarVehiculo(Vehiculo objvehicu){   
        objVehiculos.add(objvehicu);
    }

    public ArrayList<Vehiculo> getObjVehiculos() {
        return objVehiculos;
    }

    public void setObjVehiculos(ArrayList<Vehiculo> objVehiculos) {
        this.objVehiculos = objVehiculos;
    }
    
    
}
