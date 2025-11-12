public class TestEquals {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        // Integer est une classe enveloppe
        // int est une classe primitive n'héritant pas d'Object
        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer c = 1;
        Integer d = 1;
        // même espace mémoire pour c et d
        System.out.println(c == d);

    }
}
