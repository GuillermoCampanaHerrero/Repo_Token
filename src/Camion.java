
public class Camion extends Vehí­culo {

    int capacidadCarga;

    public Camion(String marca, String modelo, int anio, int capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    protected void calcularImpuesto() {
        impuesto = (anio * 0.1) * 200;
    }
    
    @Override
    public String toString(){
        String inf = "Marca: " + marca + "," + " Modelo: " + modelo + "," + " AÃ±o: " + anio + "," + "Capacidad de carga: " + capacidadCarga ;
        return inf;
    }
}
