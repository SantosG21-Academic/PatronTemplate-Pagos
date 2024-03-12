package metodosDePago;
import validacion.ValidacionAleatoria;
import javax.swing.JOptionPane;

public class CryptoBasura extends ProcesarPago{

    private String monto;
    private boolean aceptado;


    @Override
    public void cobrar() {
        // Cobrar el monto de la compra
        monto = JOptionPane.showInputDialog(null, "Monto a pagar: ", "Pago", JOptionPane.QUESTION_MESSAGE);
    }
    @Override
    public void solicitarDatos() {
        // Solicitar direccion de la wallet
        String cToken = JOptionPane.showInputDialog(null, "Ingrese su dirección de wallet:", "Wallet", JOptionPane.QUESTION_MESSAGE);
    }

    @Override
    public void validarMetodo() {
        aceptado = ValidacionAleatoria.validar(4);
    }

    @Override
    public void enviarComprobante() {
        if (aceptado) {
            // Enviar comprobante de pago
            JOptionPane.showMessageDialog(null, "Comprobante de pago por: $" + monto + "MXN enviado a su correo electrónico", "Comprobante de Pago", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al procesar el pago", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


}
