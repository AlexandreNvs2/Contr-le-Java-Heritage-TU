package Entities.Exo1;

public class Cours  implements ICalcul //implements compareTo<Cours>
{

    private double prixCours;
    private int idCours;

    public Cours(double prixCours, int idCours) {
        this.prixCours = prixCours;
        this.idCours = idCours;
    }


    @Override
    public double Calcul() {
        return 0;
    }
}




