public abstract class vehiculo {
    private String placa;
    private int minutos;
public vehiculo(String placa, int minutos) {
    this.placa = placa;
    this.minutos = minutos;
    }
public String getplaca() {
    return placa;
    }
public int getminutos() {
    return minutos;
    }
public int calcularhoras() {
    if (minutos <= 15) {
        return 0;
        }
    return (int) Math.ceil(minutos / 60.0);
    }
public abstract double gettarifaporhora();
public double calcularcobro() {
        return calcularhoras() * gettarifaporhora();
    }
public void imprimirticket() {
    System.out.println("\n========== TICKET DE PARQUEO ==========");
    System.out.println("Tipo: " + getClass().getSimpleName());
    System.out.println("Placa: " + placa);
    System.out.println("Minutos estacionado: " + minutos);
    System.out.println("Horas cobradas: " + calcularhoras());
    System.out.println("Total a pagar: C$" + calcularcobro());
    System.out.println("=======================================\n");
    }
}
