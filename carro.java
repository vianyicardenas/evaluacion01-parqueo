public class carro extends vehiculo {
    public carro(String placa, int minutos) {
        super(placa, minutos);
    }
@Override
    public double gettarifaporhora() {
        return 20.0;
    }
}
