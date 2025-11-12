class PangolinALongueQueue extends Pangolin {
    private int longueurQueue;

    public PangolinALongueQueue(String nom, int nbEcailles, int longueurQueue) {
        super(nom, nbEcailles);
        this.longueurQueue = longueurQueue;
    }

    public int getLongueurQueue() {
        return longueurQueue;
    }

    @Override
    // évite une surcharge par inadvertance
    public String toString() {
        return this.getNom() + " a " +  this.getNbEcailles() +
                " écailles et a une queue de longueur " + this.longueurQueue;
    }

    static public void main (String[] args) {
        PangolinALongueQueue toto = new PangolinALongueQueue("toto", 2, 5);
        System.out.println(toto);
    }
}
