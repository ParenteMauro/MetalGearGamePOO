
package metalgear;

public class Snake extends Personaje{
    
    private Character nombre;
    
    public Snake() {
        this.nombre = 'S';
    }

    @Override
    public void mover() {
        
    }

    @Override
    public String toString() {
        
        return this.nombre.toString();
    }
    
    
    
}
