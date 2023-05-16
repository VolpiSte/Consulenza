package it.paleocapa.volpis;
class Personale {
    private String codice;
    private String cognome;
    private String nome;
    private int annoAssunzione;

    public Personale(String codice, String cognome, String nome, int annoAssunzione) {
        this.codice = codice;
        this.cognome = cognome;
        this.nome = nome;
        this.annoAssunzione = annoAssunzione;
    }

    // Getters and setters

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnnoAssunzione() {
        return annoAssunzione;
    }

    public void setAnnoAssunzione(int annoAssunzione) {
        this.annoAssunzione = annoAssunzione;
    }

    public double calcolaCostoOrario() {
        return 0.0;
    }
}