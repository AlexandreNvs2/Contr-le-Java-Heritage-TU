package Tests;

import Entities.Exo2.CentreAere;
import Entities.Exo2.Chambre;
import Entities.Exo2.Enfant;
import Entities.Exo2.Maison;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentreAereTest
{
    private Enfant enfant1;
    private Enfant enfant2;
    private Enfant enfant3;
    private Enfant enfant4;
    private Enfant enfant5;

    private Maison maison1;
    private Maison maison2;

    private Chambre chambre1;
    private Chambre chambre2;
    private Chambre chambre3;

    private CentreAere centreAere;

    @BeforeEach
    void setUp()
    {
        // 5 enfants
        enfant1 = new Enfant("Garnier","François");
        enfant2 = new Enfant("Fortin","François");
        enfant3 = new Enfant("Gand","Christophe");
        enfant4 = new Enfant("Cousineau","Sébastien");
        enfant5 = new Enfant("Annonier","Eric");

        // 2 maisons
        maison1 = new Maison("Maison rouge");
        maison2 = new Maison("Maison verte");

        // 3 chambres
        chambre1 = new Chambre("Chambre 1");
        chambre2 = new Chambre("Chambre 2");
        chambre3 = new Chambre("Chambre 3");

        // 1 centre
        centreAere = new CentreAere("Centre Tests");
        // On ajoute les chambres aux maisons
        maison1.AjouterChambre(chambre1);maison1.AjouterChambre(chambre2);
        maison2.AjouterChambre(chambre3);

        // On ajoute les maisons au centre
        centreAere.AjouterMaison(maison1);centreAere.AjouterMaison(maison2);

    }

    @Test
    void ajouterEnfant()
    {

        // On ajoute l'enfant 1 à la maison 1,chambre 1
        boolean ajout1 = Maison.AjouterEnfant(enfant1, chambre1);
        assertTrue(ajout1);
        assertEquals(1, chambre1.getLesEnfants().size());


        // On ajoute l'enfant 2 à la maison 1,chambre 1
        boolean ajout2 = maison1.AjouterEnfant(enfant2, chambre1);
        assertTrue(ajout2);
        assertEquals(2, chambre1.getLesEnfants().size());
        // On ajoute l'enfant 3 à la maison 1,chambre 1
        boolean ajout3 = maison1.AjouterEnfant(enfant3, chambre1);
        assertFalse(ajout3);
        assertEquals(2, chambre1.getLesEnfants().size());

    }

    @Test
    void rechercherEnfant()
    {
        // On trouve l'enfant : on testera avec le nom de la maison


        // On ne trouve pas l'enfant : on testera avec null


    }

    @Test
    void tauxRemplissageMaison()
    {
        // Cas n°1 : aucun enfant parmi toutes les chambres
        double taux1 = maison1.TauxRemplissageMaison();
        assertEquals(0.0, taux1, 0.001);

        // Cas n°2 : 1 seul enfant parmi toutes les chambres
        Enfant enfant1 = new Enfant("Enfant 1", 10);
        chambre1.AjouterEnfant(enfant1);
        maison1.AjouterChambre(chambre1);
        double taux2 = Maison.TauxRemplissageMaison();
        assertEquals(0.25, taux2, 0.001);

        // Cas n°3 : 3 enfants parmi toutes les chambres
        Enfant enfant2 = new Enfant("Enfant 2", 8);
        Enfant enfant3 = new Enfant("Enfant 3", 7);
        chambre2.AjouterEnfant(enfant2);
        chambre3.AjouterEnfant(enfant3);
        maison.AjouterChambre(chambre2);
        maison.AjouterChambre(chambre3);
        double taux3 = Maison.TauxRemplissageMaison();
        assertEquals(0.75, taux3, 0.001);

        // Cas n°4 : toutes les chambres sont complètement occupées
        Enfant enfant4 = new Enfant("Enfant 4", 6);
        chambre1.AjouterEnfant(enfant4);
        chambre2.AjouterEnfant(enfant4);
        Maison.AjouterChambre(chambre1);
        Maison.AjouterChambre(chambre2);
        double taux4 = Maison.TauxRemplissageMaison();
        assertEquals(1.0, taux4, 0.001);


    }

    @Test
    void tauxRemplissageCentreAere()
    {
        // Cas n°1 : aucun enfant parmi toutes les chambres


        // Cas n°2 : 2 enfants parmi toutes les chambres


        // Cas n°3 : 4 enfants parmi toutes les chambres


    }
}