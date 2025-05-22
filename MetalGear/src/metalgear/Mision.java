package metalgear;


public abstract class Mision {
    
  protected Integer misionesCompletadas;

    public Mision(Integer misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    public Integer getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(Integer misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }
    
  public abstract void Iniciar();
}
