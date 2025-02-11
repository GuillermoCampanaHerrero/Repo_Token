
import java.util.Scanner;
import java.util.Arrays;

public abstract class Vehículo {

    protected String marca;
    protected String modelo;
    protected int anio;
    protected double impuesto;

    protected Vehículo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        String inf = "Marca: " + marca + "," + " Modelo: " + modelo + "," + " Año: " + anio;
        return inf;
    }

    protected abstract void calcularImpuesto();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehículo registro[] = new Vehículo[0];
        int pos = 0;
        int op = 0;
        int opp = 0;

        while (op != 3) {
            System.out.println("Elija una opción: ");
            System.out.println("1.Añadir un nuevo vehículo");
            System.out.println("2.Listar todos los vehículos con sus detalles e impuestos");
            System.out.println("3.Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    if (registro.length < 5) {
                        System.out.println("1.Auto");
                        System.out.println("2.Camión");
                        opp = sc.nextInt();
                        switch (opp) {
                            case 1:
                                sc.nextLine();
                                System.out.print("Marca:");
                                String marca = sc.nextLine();
                                System.out.print("Modelo: ");
                                String modelo = sc.nextLine();
                                System.out.print("Año:");
                                int anio = sc.nextInt();
                                System.out.print("Número de puertas:");
                                int numPuertas = sc.nextInt();
                                Auto a = new Auto(marca, modelo, anio, numPuertas);
                                registro = Arrays.copyOf(registro, registro.length + 1);
                                registro[pos] = a;
                                if (pos < 5) {
                                    pos++;
                                }
                                break;
                            case 2:
                                sc.nextLine();
                                System.out.print("Marca:");
                                marca = sc.nextLine();
                                System.out.print("Modelo: ");
                                String modeloc = sc.nextLine();
                                System.out.print("Año:");
                                int anioc = sc.nextInt();
                                System.out.print("Capacida de carga:");
                                int capacidadCarga = sc.nextInt();
                                Camion b = new Camion(marca, modeloc, anioc, capacidadCarga);
                                registro = Arrays.copyOf(registro, registro.length + 1);
                                registro[pos] = b;
                                if (pos < 5) {
                                    pos++;
                                }
                                break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < registro.length; i++) {
                        System.out.println(registro[i].toString());
                    }
                    break;
            }
        }
    }

}
