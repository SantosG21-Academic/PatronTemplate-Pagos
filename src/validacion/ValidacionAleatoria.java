package validacion;

public class ValidacionAleatoria {
    private static int decidir(int metodoDePago) {
        int multiplicador = 0;
        if (metodoDePago == 1) { // Tarjeta de debito
            multiplicador = (int) (Math.random() * 11);
        } else if (metodoDePago == 2) { //Tarjeta de credito
            multiplicador = (int) (Math.random() * 9);
        } else if (metodoDePago == 3) { //Efectivo
            multiplicador = (int) (Math.random() * 1+1);
        } else if (metodoDePago == 4) { //CryptoTrash
            multiplicador = (int) (Math.random() * 5);
        } else {
        }
        return multiplicador;
    }

    public static boolean validar(int metodoDePago) {
        boolean exito = false;
        int coeficienteDeExito = decidir(metodoDePago);
        if (coeficienteDeExito == 0) {
            System.out.println(coeficienteDeExito);
        } else {
            exito = true;
        }
        return exito;
    }
}
