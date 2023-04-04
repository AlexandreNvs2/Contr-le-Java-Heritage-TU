package Entities.Exo2;

import java.util.ArrayList;

public class Chambre
{
    private String nomChambre;
    private ArrayList<Enfant> lesEnfants;

    public Chambre(String nomChambre)
    {
        this.nomChambre = nomChambre;
        lesEnfants = new ArrayList<>();
    }
    // Cette méthode permet d'ajouter un enfant dans une chambre
    // Cette méthode n'est pas à tester
    public void AjouterEnfant(Enfant unEnfant)
    {
        lesEnfants.add(unEnfant);
    }

    public String getNomChambre()
    {
        return nomChambre;
    }

    public ArrayList<Enfant> getLesEnfants()
    {
        return lesEnfants;
    }
}
