

public class CouleurEnumere {
    enum Couleur {
        ROUGE(255, 0, 0), VERT(0, 255, 0), BLEU(0, 0, 255);

        private int rouge, vert, bleu;
        // ajouter final si valeur non modifiable

        Couleur (int rouge, int vert, int bleu) {
            // constructeur uniquement pour les constantes ROUGE VERT BLEU
            this.rouge = rouge;
            this.vert = vert;
            this.bleu = bleu;
        }

        public String getHtmlCode() {
            return "#" + String.format("%02x", this.rouge)
                    + String.format("%02x", this.vert)
                    + String.format("%02x", this.bleu);
        }
    }

    static public void main (String[] args) {
        Couleur couleur = Couleur.ROUGE;
        System.out.println(couleur.getHtmlCode());
        couleur.vert = 100;
        System.out.println(couleur.getHtmlCode());
    }
}