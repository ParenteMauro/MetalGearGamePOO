package metalgear;

public class Snake extends Personaje {

    private final String nombre;
    private Posicion posicion;

    public Snake(Integer y,Integer x) {

        this.nombre = "S";
        this.posicion = new Posicion(y,x);
    }

    @Override
    public void mover() {

    }

    public Integer getPosicionX() {
        return posicion.getX();
    }

    public Integer getPosicionY() {
        return posicion.getY();
    }

    public void setPosicionX(Integer x) {

        this.posicion.setX(x);
    }

    public void setPosicionY(Integer y) {

        this.posicion.setY(y);
    }

    @Override
    public String toString() {
        
        return this.nombre;
    }

    
    
}
