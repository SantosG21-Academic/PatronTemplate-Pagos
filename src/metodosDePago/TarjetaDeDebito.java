package metodosDePago;
import validacion.ValidacionAleatoria;
import javax.swing.JOptionPane;
public class TarjetaDeDebito extends ProcesarPago{
    private String monto;
    private boolean aceptado;

    @Override
    public void cobrar() {
        // Cobrar el monto de la compra
        monto = JOptionPane.showInputDialog(null, "Monto a pagar: ", "Pago", JOptionPane.QUESTION_MESSAGE);
    }

    @Override
    public void solicitarDatos() {
        // Solicitar el número de la tarjeta
        String numeroTarjeta = JOptionPane.showInputDialog(null, "Ingrese el número de su tarjeta bancaria:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);

        // Solicitar la fecha de vencimiento
        String fechaVencimiento = JOptionPane.showInputDialog(null, "Ingrese la fecha de vencimiento de su tarjeta (MM/AA):", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);

        // Solicitar el CVV
        String cvv = JOptionPane.showInputDialog(null, "Ingrese el código CVV de su tarjeta:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);

    }

    @Override
    public void validarMetodo() {
        aceptado = ValidacionAleatoria.validar(1);
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
