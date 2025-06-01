package metalgear;

import java.util.Random;
import java.util.Scanner;

public class Mapa {

    private final Integer TAMFISICO;
    private final Celda matriz[][];

    public Mapa(Integer TAMFISICO) {

        this.TAMFISICO = TAMFISICO;
        this.matriz = new Celda[TAMFISICO][TAMFISICO];

    }

    public void crearMapa() {

        Random rd = new Random();

        for (int i = 0; i < TAMFISICO; i++) {

            for (int j = 0; j < TAMFISICO; j++) {

                this.matriz[i][j] = new Celda();
            }
        }

        this.matriz[0][rd.nextInt(0, 3)].crearObjeto("H");
        this.matriz[rd.nextInt(1, 4)][rd.nextInt(4, 7)].crearObjeto("L");
        colocarPersonaje();

        Integer posY = 0;
        Integer posX = 0;

        for (int i = 0; i < TAMFISICO; i++) {

            for (int j = 0; j < TAMFISICO; j++) {

                if (this.matriz[i][j].toString().equals("S")) {

                    posY = i;
                    posX = j;
                }
            }
        }

        zonaDeExclusion(posY, posX);

        Integer contGuardias = 0;

        
            
        
    }

    public void mostrarMapa() {

        for (int i = 0; i < TAMFISICO; i++) {

            System.out.print("| ");

            for (int j = 0; j < TAMFISICO; j++) {

                if (j == TAMFISICO - 1) {

                    System.out.print(this.matriz[i][j].toString());

                    System.out.println(" |");

                } else {

                    System.out.print(this.matriz[i][j].toString() + "  ");
                }
            }
        }
    }

    public void colocarPersonaje() {

        Scanner sc = new Scanner(System.in);
        Integer x;

        System.out.println("Ingrese una posicion de la fila donde quiere que empiece Snake de 0 a 6");
        System.out.print("--: ");
        x = sc.nextInt();

        this.matriz[TAMFISICO - 1][x].crearSnake(TAMFISICO - 1, x);

    }

    public void zonaDeExclusion(Integer snakeY, Integer snakeX) {

        for (int i = 0; i < TAMFISICO; i++) {

            for (int j = 0; j < TAMFISICO; j++) {

                if (this.matriz[i][j].toString().equals(".") && (i == snakeY - 1 && j == snakeX)
                        || (i == snakeY - 1 && j == snakeX - 1) || (i == snakeY - 1 && j == snakeX + 1)
                        || (i == snakeY && j == snakeX + 1) || (i == snakeY && j == snakeX - 1)) {

                    this.matriz[i][j].esZonaDeExclucion();

                }
            }
        }

    }
 
    public void moverPersonaje() {

    }

    public void actualizarMapa() {

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

}
