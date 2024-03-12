package metodosDePago;
import validacion.ValidacionAleatoria;
import javax.swing.JOptionPane;
public class EfectivoOxxo extends ProcesarPago{
    private String monto;
    private boolean aceptado;
    private String nombreCliente;

    @Override
    public void cobrar() {
        // Cobrar el monto de la compra
        monto = JOptionPane.showInputDialog(null, "Monto a pagar: ", "Pago", JOptionPane.QUESTION_MESSAGE);
    }
    @Override
    public void solicitarDatos() {
        // Solicitar el nombre del cliente
        nombreCliente = JOptionPane.showInputDialog(null, "Ingrese su nombre completo:", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
    }

    @Override
    public void validarMetodo() {
        aceptado = ValidacionAleatoria.validar(3);
    }

    @Override
    public void enviarComprobante() {
        if (aceptado) {
            // Enviar comprobante de pago
            JOptionPane.showMessageDialog(null, "Estimado " + nombreCliente + "su comprobante de pago por: $" + monto + "MXN enviado a su correo electrónico", "Comprobante de Pago", JOptionPane.INFORMATION_MESSAGE);
            int codigoBarras = (int) (Math.random() * 1000000000);
            JOptionPane.showMessageDialog(null, "Código de barras para pagar en Oxxo: " + codigoBarras, "Codigo de barras", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al procesar el pago", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



}
