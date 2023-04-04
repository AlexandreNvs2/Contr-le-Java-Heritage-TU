package Entities.Exo1;

public class CoursIndividuel extends Cours implements ICalcul
{
public String instrument;

    public CoursIndividuel( double prixCours, int idCours, String instrument) {
        super(prixCours, idCours);
        this.instrument = instrument;

    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    public double Calcul() {
        return 0;
    }

}
