package metalgear;

public class MisionIntermedia extends Mision {
    
    private String nombre_mision;
    private Mapa mapa;
    public MisionIntermedia(String nombre_mision, Integer misionesCompletadas) {
        super(misionesCompletadas);
        this.nombre_mision = nombre_mision;
    }
    
   
    @Override
    public Integer getMisionesCompletadas() {
        return misionesCompletadas;
    }

    @Override
    public void setMisionesCompletadas(Integer misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }
    
    
    @Override
    public void Iniciar() {
       this.mapa = new Mapa(7);
       
           this.mapa.crearMapa();
           this.mapa.mostrarMapa();
       
    }

    public MisionIntermedia mision1() {

        return new MisionIntermedia("Hangar de entrada",0);

    }
    
    public MisionIntermedia mision2(){
        
        return new MisionIntermedia("Almacén de Armas",1);
    }
}
