package Entities.Exo1;

public class Instrument
{
    private String nomInstrument;
    private int idInstrument;

    public Instrument(String nomInstrument, int idInstrument) {
        this.nomInstrument = nomInstrument;
        this.idInstrument = idInstrument;
    }

    public String getNomInstrument() {
        return nomInstrument;
    }

    public int getIdInstrument() {
        return idInstrument;
    }
}
