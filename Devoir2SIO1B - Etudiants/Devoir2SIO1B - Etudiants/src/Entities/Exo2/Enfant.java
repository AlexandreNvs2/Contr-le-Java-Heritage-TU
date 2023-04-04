package Entities.Exo2;

public class Enfant
{
    private String nomEnfant;
    private String prenomEnfant;

    public Enfant(String nomEnfant, String prenomEnfant)
    {
        this.nomEnfant = nomEnfant;
        this.prenomEnfant = prenomEnfant;
    }

    public String getNomEnfant()
    {
        return nomEnfant;
    }

    public String getPrenomEnfant()
    {
        return prenomEnfant;
    }
}
