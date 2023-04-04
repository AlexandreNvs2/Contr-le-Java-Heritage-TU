package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CentreAere
{
    private String nomCentreAere;
    private static ArrayList<Maison> lesMaisons;

    public CentreAere(String nomCentreAere)
    {
        this.nomCentreAere = nomCentreAere;
        lesMaisons = new ArrayList<>();
    }

    public static ArrayList<Maison> getLesMaisons() {
        return lesMaisons;
    }

    // Cette méthode permet d'ajouter une Maison dans le centre aéré
    // Cette méthode n'est pas à tester
    public void AjouterMaison(Maison uneMaison)
    {
        lesMaisons.add(uneMaison);
    }

    //Cette méthode permet d'ajouter un enfant, dans une maison, dans une chambre
    // Attention, l'ajout ne peut se faire que si la chambre ne possède pas déjà 2 enfants
    // Si l'ajout ne peut se faire, la méthode retourne false sinon elle retourne true.
        public boolean AjouterEnfant(Enfant unEnfant, Maison uneMaison, Chambre uneChambre)
        {

            // A compléter ici

            // Vérifier si la chambre est déjà occupée par 2 enfants
            if (uneChambre.getLesEnfants().size() == 2) {
                return false; // La chambre est déjà pleine
            }

            // Ajouter l'enfant à la chambre
            uneChambre.AjouterEnfant(unEnfant);

            return true;
    }

    // Cette méthode permet de rechercher l'enfant passé en paramètre
    // L'enfant passé en paramètre peut se trouver dans n'importe quelle maison, n'importe quelle chambre du centre aéré
    // Si l'enfant est trouvé, la méthode renvoie l'objet maison dans laquelle il se trouve
    // Si l'enfant n'est pas trouvé, la méthode renvoie null;
    public Maison RechercherEnfant(Enfant unEnfant)
    {

        Maison maisonTrouvee = null;

        // A compléter ici


        // Parcourir toutes les maisons du centre aéré
        for (Maison uneMaison : CentreAere.getLesMaisons()) {

            // Parcourir toutes les chambres de chaque maison
            for (Chambre uneChambre : uneMaison.getLesChambres()) {

                // Vérifier si l'enfant est présent dans la chambre
                if (uneChambre.getLesEnfants().contains(unEnfant)) {
                    maisonTrouvee = uneMaison;
                    break; // Sortir de la boucle interne si l'enfant est trouvé
                }
            }

            // Sortir de la boucle externe si l'enfant est trouvé
            if (maisonTrouvee != null) {
                break;
            }
        }

        return maisonTrouvee;

    }

    // Cette méthode permet de calculer le taux de remplissage de la maison passée en paramètre
    // Le taux se détermine en fonction du nombre d'enfants total de toutes les chambres de la maison par rapport
    // au nombre total de places disponibles (nombre de chambres de la maison * 2)
    // Pour arrondir le taux à 2 chiffres après la virgule, on utilise la méthode Math.round()
    public double TauxRemplissageMaison(Maison uneMaison)
    {
        // A compléter ici

        return 0;
    }

    // Cette méthode permet de calculer le taux de remplissage du centre aéré
    // Le taux se détermine en fonction du nombre d'enfants total de toutes les chambres par rapport
    // au nombre total de chambres (nombre de chambres du centre * 2)
    // Pour arrondir le taux à 2 chiffres après la virgule, on utilise la méthode Math.round()
    public double TauxRemplissageCentreAere(Maison uneMaison)
    {
        // A compléter ici
        int nbEnfants = 0;
        int nbPlaces = uneMaison.getLesChambres().size() * 2; // nombre de chambres * 2 places par chambre

        // Parcourir toutes les chambres de la maison et compter le nombre d'enfants
        for (Chambre uneChambre : uneMaison.getLesChambres()) {
            nbEnfants += uneChambre.getLesEnfants().size();
        }

        // Calculer le taux de remplissage
        double taux = (double) nbEnfants / nbPlaces;
        taux = Math.round(taux * 100.0) / 100.0; // arrondir à 2 chiffres après la virgule

        return taux;

    }
}
