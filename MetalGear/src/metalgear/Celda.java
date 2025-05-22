
package metalgear;

public class Celda {
    private Personaje personaje; 
    private Objeto objeto;
    
    public Personaje getPersonaje(){
        return personaje;
    }
    public void setPersonaje(Personaje p1){
        this.personaje = p1;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }
    
}
