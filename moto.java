public class moto extends vehiculo {
    public moto(String placa, int minutos) {
        super(placa, minutos);
    }
@Override
    public double gettarifaporhora() {
        return 10.0;
    }
}
