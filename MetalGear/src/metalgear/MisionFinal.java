package metalgear;

public class MisionFinal extends Mision {

    public MisionFinal(Integer misionesCompletadas) {
        super(misionesCompletadas);
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

    }

}
