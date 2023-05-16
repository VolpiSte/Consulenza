package it.paleocapa.volpis;
class Funzionario extends Personale {
    public Funzionario(String codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }

    @Override
    public double calcolaCostoOrario() {
        int anniEsperienza = 2023 - getAnnoAssunzione();
        return anniEsperienza >= 10 ? 80.0 : 70.0;
    }
}