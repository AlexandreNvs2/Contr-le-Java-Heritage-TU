package Vues;

import Entities.Exo1.Cours;
import Entities.Exo1.CoursCollectif;
import Entities.Exo1.CoursIndividuel;
import Entities.Exo1.Instrument;
import Tools.ModelJTable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class FrmMenu extends JFrame
{
    private JPanel pnlRoot;
    private JTable tblDemo;

    ArrayList<Cours> mesCours;
    ModelJTable mdl;

    public FrmMenu()
    {
        this.setTitle("Devoir - Concepts POO");
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);

        mesCours = new ArrayList<>();
        LoadDatas();

        // A compléter ici


    }
    public void LoadDatas()
    {
        /*
        Cours cours1 = new Cours(1,5);
        Cours cours2 = new Cours(2,5);
        CoursCollectif coursCollectif1 = new CoursCollectif(3,5, "Apprendre le solfège",7,15);
        CoursCollectif coursCollectif2 = new CoursCollectif(4,5, "Chorale - Adultes",18,30);
        Instrument instrument1 = new Instrument(1,"Guitare");
        Instrument instrument2 = new Instrument(2,"Piano");
        CoursIndividuel coursIndividuel1 = new CoursIndividuel(5,5,instrument1);
        CoursIndividuel coursIndividuel2 = new CoursIndividuel(6,5,instrument2);

        mesCours.add(cours1);mesCours.add(cours2);
        mesCours.add(coursCollectif1);mesCours.add(coursCollectif2);
        mesCours.add(coursIndividuel1);mesCours.add(coursIndividuel2);
        */
    }
}
