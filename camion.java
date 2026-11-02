public class camion extends vehiculo {
    public camion(String placa, int minutos) {
        super(placa, minutos);
    }
@Override
    public double gettarifaporhora() {
        return 35.0;
    }
@Override
    public double calcularcobro() {
        int horas = calcularhoras();
        if (horas > 0) {
            return super.calcularcobro() + 50.0;
        }
        return 0.0;
    }
}
