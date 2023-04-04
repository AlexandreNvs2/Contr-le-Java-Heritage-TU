package Entities.Exo2;

import java.util.ArrayList;

public class Maison
{
    private String nomMaison;
    private ArrayList<Chambre> lesChambres;

    public Maison(String nomMaison)
    {
        this.nomMaison = nomMaison;
        lesChambres = new ArrayList<>();
    }
    // Cette méthode permet d'ajouter une chambre dans une maison
    // Cette méthode n'est pas à tester
    public void AjouterChambre(Chambre uneChambre)
    {
        lesChambres.add(uneChambre);
    }

    public String getNomMaison()
    {
        return nomMaison;
    }

    public ArrayList<Chambre> getLesChambres()
    {
        return lesChambres;
    }
}
