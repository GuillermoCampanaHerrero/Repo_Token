
public class Auto extends Vehículo {

    int numPuertas;

    public Auto(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    protected void calcularImpuesto() {
        impuesto = (anio * 0.05) * 100;
    }
    
    @Override
    public String toString(){
        String inf = "Marca: " + marca + "," + " Modelo: " + modelo + "," + " Año: " + anio + "," + "Numero de puertas: " + numPuertas ;
        return inf;
    }

}
