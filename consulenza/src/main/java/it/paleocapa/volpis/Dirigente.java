package it.paleocapa.volpis;
class Dirigente extends Personale {
    public Dirigente(String codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }
    @Override
    public double calcolaCostoOrario() {
        return 100.0;
    }
}