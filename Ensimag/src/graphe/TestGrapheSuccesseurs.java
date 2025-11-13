package graphe;

public class TestGrapheSuccesseurs {
    public static void main(String[] args) {
        GrapheSuccesseurs gs = new GrapheSuccesseurs(
                new Sommet("a"),
                new Sommet("b"),
                new Sommet("c")
        );
        gs.ajouteArc("a", "b");
        System.out.println(gs);
        System.out.println(gs.existeArc("a", "b"));
        System.out.println(gs.existeArc("b", "a"));
        System.out.println(gs.existeChemin("a", "b"));
        gs.ajouteArc("b", "c");
        System.out.println(gs.existeChemin("a", "c"));
    }
}
