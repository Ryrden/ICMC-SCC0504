package decoratorpractice;

public class JurosSimples extends Juros {
    private final float taxa;
    private final int meses;

    public JurosSimples(float taxa,int meses) {
        this.taxa = taxa;
        this.meses = meses;
    }

    @Override
    public float calcula(Divida divida) {
        return divida.getCapital() * (taxa/100) * meses;
    }
}
