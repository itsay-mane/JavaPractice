class Pangolin {
    private String nom;
    private int nbEcailles;

    public Pangolin(String nom, int nbEcailles) {
        this.nom = nom;
        this.setNbEcailles(nbEcailles);
    }

    public int getNbEcailles() {
        return nbEcailles;
    }

    public String getNom() {
        return nom;
    }

    public void setNbEcailles(int nb) {
        if (nb <= 0) {
            throw new IllegalArgumentException("Le nombre d'écailles doit être strictement positif !");
        }
        this.nbEcailles = nb;
    }

    public void crier() {
        System.out.println("Gwwark Rhââgn Bwwikk"); // Cri du pangolin
    }
}