package metalgear;

public class Celda {

    private Objeto objeto;
    private String vacio;
    private Personaje personaje;
    private Boolean exclusion;

    public Celda() {

        this.vacio = ".";
        this.exclusion = false;
    }

    public Personaje crearSnake(Integer y, Integer x) {
        return this.personaje = new Snake(y, x);

    }

    public Personaje crearGuardia(Integer y, Integer x) {
        return this.personaje = new Guardia(y, x);
    }

    public Objeto crearObjeto(String tipo) {

        return this.objeto = new Objeto(tipo);

    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public Boolean esZonaDeExclucion() {

        this.vacio = "-";
        return this.exclusion = true;

    }

    @Override
    public String toString() {

        if (this.objeto != null) {

            return this.objeto.toString();

        } else if (this.personaje != null) {

            return this.personaje.toString();

        } else {

            return this.vacio;
        }

    }

}
