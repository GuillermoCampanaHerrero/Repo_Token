import java.util.Arrays;
public class Concesionario {
    String nombre;
    String direccion;
    static Veh�culo vehiculos [] = new Veh�culo [0];
    int pos = 0;
    
    public Concesionario (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void agregarVeh�culo(Veh�culo v){
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
