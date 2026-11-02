import java.util.Scanner;
public class parqueo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int totalmotos = 0;
    int totalcarros = 0;
    int totalcamiones = 0;
    double totalrecaudado = 0.0;
    String placamayorpago = "N/A";
    double mayorcobro = -1.0;
    String continuar;
        do {
            int tipo = 0;
            while (tipo < 1 || tipo > 3) {
                System.out.print("Seleccione tipo de vehículo (1: Moto, 2: Carro, 3: Camión): ");
                if (scanner.hasNextInt()) {
                    tipo = scanner.nextInt();
                } else {
                    scanner.next();
                }
            }
        scanner.nextLine();
    System.out.print("Ingrese la placa: ");
    String placa = scanner.nextLine();
    int minutos = 0;
        while (minutos <= 0) {
            System.out.print("Ingrese los minutos estacionado (debe ser > 0): ");
            if (scanner.hasNextInt()) {
                minutos = scanner.nextInt();
            } else {
                scanner.next();
            }
        }
    vehiculo v = switch (tipo) {
        case 1 -> {
            totalmotos++;
            yield new moto(placa, minutos);
            }
        case 2 -> {
            totalcarros++;
            yield new carro(placa, minutos);
            }
        case 3 -> {
            totalcamiones++;
            yield new camion(placa, minutos);
            }
                default -> null;
        };
    if (v != null) {
        v.imprimirticket();
        double cobro = v.calcularcobro();
        totalrecaudado += cobro;
    if (cobro > mayorcobro) {
        mayorcobro = cobro;
        placamayorpago = v.getplaca();
            }
        }
    System.out.print("¿Desea registrar otro vehículo? (s/n): ");
    continuar = scanner.next().toLowerCase();
        } while (continuar.equals("s"));
    System.out.println("\n================ REPORTE DEL DIA ================");
    System.out.println("Motos que salieron:    " + totalmotos);
    System.out.println("Autos que salieron:    " + totalcarros);
    System.out.println("Camiones que salieron: " + totalcamiones);
    System.out.println("Total recaudado:       C$" + totalrecaudado);
    System.out.println("Vehículo que pagó más: " + placamayorpago + " (C$" + (mayorcobro > 0 ? mayorcobro : 0.0) + ")");
    System.out.println("=================================================");
    scanner.close();
    }
}
