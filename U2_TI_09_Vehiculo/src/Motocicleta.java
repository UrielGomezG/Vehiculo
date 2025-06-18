public class Motocicleta extends Vehiculo {
    public boolean tieneCaja;


    public Motocicleta(String placa, String marca, Boolean tieneCaja) {
        super(placa, marca);
        this.tieneCaja = false;
    }


    public boolean isTieneCaja() {
        return tieneCaja;
    }

    public void setTieneCaja(boolean tieneCaja) {
        this.tieneCaja = tieneCaja;
    }
}
