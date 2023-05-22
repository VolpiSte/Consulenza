package it.paleocapa.volpis;
import java.util.ArrayList;
import java.util.List;
//import java.util.function.Predicate;

class Progetto {
    private List<Personale> membriPersonale;
    private double costoOrarioTecnicoInfoTel;
    private double costoOrarioTecnicoEleAuto;
    private double costoOrarioFunzionarioJunior;
    private double costoOrarioFunzionarioSenior;
    private double costoOrarioDirigente;

    public Progetto() {
        membriPersonale = new ArrayList<>();
        costoOrarioTecnicoInfoTel = 40.0;
        costoOrarioTecnicoEleAuto = 50.0;
        costoOrarioFunzionarioJunior = 70.0;
        costoOrarioFunzionarioSenior = 80.0;
        costoOrarioDirigente = 100.0;
    }

    public void aggiungiMembroPersonale(Personale membro) {
        membriPersonale.add(membro);
    }

    public double calcolaCostoComplessivoProgetto() {
        return membriPersonale.stream()
                .mapToDouble(Personale::calcolaCostoOrario)
                .sum();
    }

    // Aggiungi metodi per impostare i costi orari

    public void setCostoOrarioTecnicoInfoTel(double costoOrario) {
        costoOrarioTecnicoInfoTel = costoOrario;
    }

    public void setCostoOrarioTecnicoEleAuto(double costoOrario) {
        costoOrarioTecnicoEleAuto = costoOrario;
    }

    public void setCostoOrarioFunzionarioJunior(double costoOrario) {
        costoOrarioFunzionarioJunior = costoOrario;
    }

    public void setCostoOrarioFunzionarioSenior(double costoOrario) {
        costoOrarioFunzionarioSenior = costoOrario;
    }

    public void setCostoOrarioDirigente(double costoOrario) {
        costoOrarioDirigente = costoOrario;
    }
    
}