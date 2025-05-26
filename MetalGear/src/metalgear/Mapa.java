package metalgear;

import java.util.Random;

public class Mapa {

    private final Integer TAMFISICO;
    private Celda matriz[][];
    private Snake snake;
    private Guardia guardia;

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

        this.matriz[0][rd.nextInt(0, TAMFISICO)] = new Celda(new Objeto("H"));
        this.matriz[TAMFISICO-1][rd.nextInt(0,TAMFISICO)] = new Celda(new Snake());
        
        
    }
    
    public void mostrarMapa(){
        
        for(int i = 0; i < TAMFISICO; i++){ 
            
            System.out.print("| ");
            
            for(int j = 0; j < TAMFISICO; j++){
                
                if( j == TAMFISICO -1){
                    
                    System.out.print(this.matriz[i][j].toString());
                    
                    System.out.println(" |");
                    
                } else{
                    
                    System.out.print(this.matriz[i][j].toString()+"  ");
                }
            }
        }
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
