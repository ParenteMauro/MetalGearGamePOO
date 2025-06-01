package metalgear;

public class Guardia extends Personaje implements Enemigo {

    private final String nombre;
    private Posicion posicion;

    public Guardia(Integer y, Integer x) {

        this.nombre = "*";
        this.posicion = new Posicion(y, x);
    }

    @Override
    public void mover() {

    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
