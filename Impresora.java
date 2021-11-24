public class Impresora{
    private boolean aColor;
    private String marca;

    public Impresora(String modelo, boolean color){
        marca = modelo;
        aColor = color;
    }

    public String getMarca(){
        return marca;
    }
    
    public boolean getSiColor(){
        return aColor;
    }
    
    public void setMarca(String nuevaMarca){
        marca = nuevaMarca;
    }
    
    public void setSiColor(boolean siColor){
        aColor = siColor;
    }
}
