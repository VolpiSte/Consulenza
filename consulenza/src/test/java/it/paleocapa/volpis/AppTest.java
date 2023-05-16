package it.paleocapa.volpis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    @Test
    void testCalcolaCostoComplessivoProgetto() {
        Progetto progetto = new Progetto();
        progetto.setCostoOrarioTecnicoInfoTel(40.0);
        progetto.setCostoOrarioTecnicoEleAuto(50.0);
        progetto.setCostoOrarioFunzionarioJunior(70.0);
        progetto.setCostoOrarioFunzionarioSenior(80.0);
        progetto.setCostoOrarioDirigente(100.0);

        progetto.aggiungiMembroPersonale(new Dirigente("D001", "Rossi", "Mario", 2005));
        progetto.aggiungiMembroPersonale(new Funzionario("F001", "Bianchi", "Luigi", 2010));
        progetto.aggiungiMembroPersonale(new Tecnico("T001", "Verdi", "Giovanni", 2015, "info-tel", true));
        progetto.aggiungiMembroPersonale(new Tecnico("T002", "Neri", "Paolo", 2018, "ele-auto", false));

        double costoComplessivo = progetto.calcolaCostoComplessivoProgetto();
        assertEquals(283.0, costoComplessivo, 0.001); // Utilizzo della precisione con terzo parametro
    }
}

