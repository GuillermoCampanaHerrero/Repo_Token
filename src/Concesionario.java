import java.util.Arrays;
public class Concesionario {
    String nombre;
    String direccion;
    static Vehículo vehiculos [] = new Vehículo [0];
    int pos = 0;
    
    public Concesionario (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void agregarVehículo(Vehículo v){
        vehiculos = Arrays.copyOf(vehiculos, vehiculos.length +1);
        vehiculos [pos] = v;
        pos++;
    }
    
    public void listarVehiculos (){
        for (int i = 0; i < vehiculos.length; i++){
            System.out.println(vehiculos [i]);
        }
    }
}
