package metodosDePago;

public abstract class ProcesarPago {
    public abstract void solicitarDatos();
    public abstract void cobrar();
    public abstract void validarMetodo();
    public abstract void enviarComprobante();

    public final void procesarPago() {
        cobrar();
        solicitarDatos();
        validarMetodo();
        enviarComprobante();
    }
}
