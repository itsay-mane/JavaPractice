package graphe;

import java.util.ArrayList;

public class GrapheSuccesseurs implements Graphe {
    private ArrayList<Sommet> sommets = new ArrayList<Sommet>();

    public GrapheSuccesseurs(Sommet ... sommets) {
        for (Sommet sommet : sommets) {
            this.sommets.add(sommet);
        }
    }

    @Override
    public void ajouteSommet(String label) {
        sommets.add(new Sommet(label));
    }

    @Override
    public void ajouteArc(String labelDepart, String labelArrive) {
        Sommet sommet1= null;
        Sommet sommet2 = null;
        for (Sommet sommet : sommets) {
            if (sommet.getEtiquette().equals(labelDepart)) {
                sommet1 = sommet;
            }
            if (sommet.getEtiquette().equals(labelArrive)) {
                sommet2 = sommet;
            }
        }
        // Si le sommet de départ n’existe pas, on le crée et on l’ajoute
        if (sommet1 == null) {
            sommet1 = new Sommet(labelDepart);
            sommets.add(sommet1);
        }

        // Si le sommet d’arrivée n’existe pas, on le crée et on l’ajoute
        if (sommet2 == null) {
            sommet2 = new Sommet(labelArrive);
            sommets.add(sommet2);
        }

        // Ajout du successeur (arc orienté de départ vers arrivée)
        sommet1.addSuccesseur(sommet2);

    }

    @Override
    public String toString() {
        String s1 = "";
        String s2 = "";
        for (Sommet sommet : sommets){
            s1 += sommet.getEtiquette() + " ; ";
            s2 += sommet.toString()+ " ; ";
        }
        return "sommets: " + s1 + "\n arcs : " + s2;
    }

    public boolean existeArc(String labelDepart, String labelArrive) {
        for (Sommet sommet : sommets) {
            if (sommet.getEtiquette().equals(labelDepart)) {
                for (Sommet sommet2 : sommet.getSuccesseur()) {
                    if (sommet2.getEtiquette().equals(labelArrive)) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public void reInitParcouru(){
        for (Sommet sommet : sommets) {
            sommet.setParcouru(false);
        }
    }


    @Override
    public boolean existeChemin(String labelDepart, String labelArrive) {
        reInitParcouru();
        Sommet sommetDepart = null;
        Sommet sommetArrive = null;

        // Recherche des deux sommets
        for (Sommet sommet : sommets) {
            if (sommet.getEtiquette().equals(labelDepart)) {
                sommetDepart = sommet;
            }
            if (sommet.getEtiquette().equals(labelArrive)) {
                sommetArrive = sommet;
            }
        }

        // Si l'un des deux n'existe pas → pas de chemin
        if (sommetDepart == null || sommetArrive == null) {
            return false;
        }

        // Appel à une méthode récursive de recherche
        return existeCheminRec(sommetDepart, sommetArrive);
    }

    // Recherche récursive en profondeur (DFS)
    private boolean existeCheminRec(Sommet depart, Sommet arrive) {
        if (depart.equals(arrive)) {
            return true;
        }

        depart.setParcouru(true);

        for (Sommet successeur : depart.getSuccesseur()) {
            if (!successeur.isParcouru()) {
                if (existeCheminRec(successeur, arrive)) {
                    return true;
                }
            }
        }

        return false;
    }

}
