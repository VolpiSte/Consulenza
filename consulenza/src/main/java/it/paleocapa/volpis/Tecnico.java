package it.paleocapa.volpis;

class Tecnico extends Personale implements Specializzato {
    private String areaCompetenza;
    private boolean interno;

    public Tecnico(String codice, String cognome, String nome, int annoAssunzione, String areaCompetenza, boolean interno) {
        super(codice, cognome, nome, annoAssunzione);
        this.areaCompetenza = areaCompetenza;
        this.interno = interno;
    }

    public String getAreaCompetenza() {
        return areaCompetenza;
    }

    public void setAreaCompetenza(String areaCompetenza) {
        this.areaCompetenza = areaCompetenza;
    }

    public boolean isInterno() {
        return interno;
    }

    public void setInterno(boolean interno) {
        this.interno = interno;
    }

    @Override
    public double calcolaCostoOrario() {
        int anniLavorati = 2023 - getAnnoAssunzione();
        double costoBase = getAreaCompetenza().equals("info-tel") ? 40.0 : 50.0;
        return costoBase + anniLavorati;
    }

}