
package metalgear;

public class Objeto {
    
    private String tipo;

    public Objeto(String tipo) {
        this.tipo = tipo;
    }
    
    public void recoger(){
        
    } 

    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String toString() {
        return this.tipo;
    }
    
    
}
