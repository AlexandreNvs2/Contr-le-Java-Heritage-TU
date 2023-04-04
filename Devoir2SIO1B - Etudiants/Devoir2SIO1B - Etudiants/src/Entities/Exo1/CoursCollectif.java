package Entities.Exo1;

public class CoursCollectif extends Cours implements ICalcul
{

public String nomCours;
public int nbPlacesMaxi;
public int ageMini;

    public CoursCollectif(double prixCours, int idCours,  String nomCours, int nbPlacesMaxi, int ageMini) {
        super(prixCours, idCours);
        this.nomCours = nomCours;
        this.nbPlacesMaxi = nbPlacesMaxi;
        this.ageMini = ageMini;
    }

    public String getNomCours() {
        return nomCours;
    }

    public int getNbPlacesMaxi() {
        return nbPlacesMaxi;
    }

    public int getAgeMini() {
        return ageMini;
    }

    public String getInfos(){
        return nomCours;

    }

    @Override
    public double Calcul() {
        return 0;
    }
}
