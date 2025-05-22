package metalgear;


public class Mapa {
    private Integer tamanio;
    private Celda matriz[][];
    private Snake snake;
    private Guardia guardia;
    
    public Mapa(int tamanio){
        this.tamanio = tamanio;
        this.matriz = new Celda[tamanio][tamanio];
    }
    public void mostrar(){
        for(int i= 0; i<tamanio; i++){
            for (int j=0; j<tamanio; j++){
               System.out.print("- "); 
            }
            System.out.println();
        }
    }
    
}
