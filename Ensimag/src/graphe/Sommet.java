package graphe;

import java.util.ArrayList;

public class Sommet {
    private String etiquette;
    ArrayList<Sommet> successeur = new ArrayList<Sommet>();
    private boolean parcouru;

    public Sommet(String etiquette) {
        this.etiquette = etiquette;
    }

    public String getEtiquette() {
        return etiquette;
    }

    public ArrayList<Sommet> getSuccesseur() {
        return successeur;
    }

    public boolean isParcouru() {
        return parcouru;
    }

    public void setEtiquette(String etiquette) {
        this.etiquette = etiquette;
    }

    public void addSuccesseur(Sommet sommet) {
        successeur.add(sommet);
    }

    public void setParcouru(boolean parcouru) {
        this.parcouru = parcouru;
    }

    public Sommet getPremierSuccesseur() {
        if (successeur.size() > 0) {
            return successeur.get(0);
        }
        return null;
    }

    @Override
    public String toString() {
        String succ = this.etiquette + ": ";
        for (Sommet sommet : successeur) {
            succ += sommet.getEtiquette() + " ";
        }
        return succ;
    }
}
