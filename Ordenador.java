public class Ordenador
{
    private int numeroCarpetas;
    private boolean apagado;
    private Impresora impresora;
    
    public Ordenador(int carpetas, boolean siApagado, Impresora nuevaImpresora){
        numeroCarpetas = carpetas;
        apagado = siApagado;
        impresora = nuevaImpresora;
    }

}
