public abstract class FigureAbstract {
    private double centreX;
    private double centreY;

    public FigureAbstract(double x, double y) {
        this.centreX = x;
        this.centreY = x;
    }

    /** translate la figure du vecteur (dx, dy) */
    public void translater(double dx, double dy) {
        centreX += dx;
        centreY += dy;
    }
}

