package metalgear;

public class Celda {

    private Objeto objeto;
    private String vacio;
    private Snake snake;

    public Celda() {

        this.vacio = " ";
    }

    public Celda(Snake snake) {
        this.snake = snake;
    }

    public Celda(Objeto objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {

        if (this.objeto != null) {

            return this.objeto.toString();

        } else if (this.snake != null) {
            
            return this.snake.toString();
            
        } else {

            return this.vacio;
        }

    }

}
