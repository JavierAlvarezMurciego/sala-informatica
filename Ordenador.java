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
    
    public int getNumeroCarpetas(){
        return numeroCarpetas;
    }
    
    public boolean getApagado(){
        return apagado;
    }
    
    public String getDetallesImpresora(){
        return "Marca: "+impresora.getMarca()+", "+"Color: "+impresora.getSiColor();
    }
    
    public void setNumeroCarpetas(int nuevoNumeroCarpetas){
        numeroCarpetas = nuevoNumeroCarpetas;
    }
    
    public void setApagado(boolean siApagado){
        apagado = siApagado;
    }
    
    public void setImpresora(String nuevaMarca, boolean color){
        impresora.setMarca(nuevaMarca);
        impresora.setSiColor(color);
    }
}
