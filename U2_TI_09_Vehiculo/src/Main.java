public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage(4);

        Vehiculo coche1 = new Coche("ABD562","Honda",4);
        Vehiculo Motocicleta1 = new Motocicleta("BCDC","Mortalika", true);
        Vehiculo coche2 = new Coche("ABD562","Honda",4);
        Vehiculo Motocicleta2 = new Motocicleta("ADC","Mortalika", true);

        garage.estacionar(coche1);
        garage.estacionar(Motocicleta1);
        garage.estacionar(coche2);
        garage.estacionar(Motocicleta2);

        garage.retirar("BCDC");

        System.out.println("Vehiculos en el garage:" + garage.contarVehiculos());
    }
}