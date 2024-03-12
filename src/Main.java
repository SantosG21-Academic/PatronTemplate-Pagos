import metodosDePago.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seleccione su metodo de pago" + System.lineSeparator());
        System.out.println("1. Tarjeta de Debito");
        System.out.println("2. Tarjeta de Credito");
        System.out.println("3. Efectivo en Oxxo");
        System.out.println("4. Bitcoin/Tether");
        System.out.println("0. Salir");

        Scanner scanner = new Scanner(System.in);

        int opcion;
        try {
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();
        }
        catch (Exception e) {
            opcion = -1;
        }
        switch (opcion) {
            case 1:
                TarjetaDeDebito tarjetaDeDebito = new TarjetaDeDebito();
                tarjetaDeDebito.procesarPago();
                break;
            case 2:
                TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito();
                tarjetaDeCredito.procesarPago();
                break;
            case 3:
                EfectivoOxxo efectivoOxxo = new EfectivoOxxo();
                efectivoOxxo.procesarPago();
                break;
            case 4:
                CryptoBasura cryptoBasura = new CryptoBasura();
                cryptoBasura.procesarPago();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
