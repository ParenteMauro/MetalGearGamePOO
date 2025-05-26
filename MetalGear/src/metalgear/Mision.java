package metalgear;


public abstract class Mision {
    
  protected Integer misionesCompletadas;
  protected Boolean terminada = false;

    public Mision(Integer misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    public Integer getMisionesCompletadas() {
        return misionesCompletadas;
    }
    
    public void setMisionesCompletadas(Integer misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }
    
    public Boolean getEstado(){
        return terminada;
    }
  public abstract void Iniciar();
}
