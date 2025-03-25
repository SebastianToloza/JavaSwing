
package Modelo;

import java.util.ArrayList;

public class Almacenamiento {
    ArrayList<Vehiculo> objVehiculos;
    public Almacenamiento(){    
        this.objVehiculos= new ArrayList<>();

    }
    
    public void guardarVehiculo(Vehiculo objvehicu){   
        this.objVehiculos.add(objvehicu);
    }

    public ArrayList<Vehiculo> getObjVehiculos() {
        return this.objVehiculos;
    }

    public void setObjVehiculos(ArrayList<Vehiculo> objVehiculos) {
        this.objVehiculos = objVehiculos;
    }
    
    
}
