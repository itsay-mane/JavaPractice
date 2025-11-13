import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class TestPolymorphisme {

    public static void main(String[] args) {
        Animal[] animalArray = new Animal[2];
        animalArray[0] = new Prof ("Simone");
        animalArray[1] = new Animal("Pangolin");
        for  (Animal animal : animalArray) {
            animal.crier();
        }
    }

    public static class Animal {
        String nom;

        public Animal(String nom) {
            this.nom = nom;
        }

        public void crier() {
            System.out.println("Graouuu !");
        }
    }

    public static class Prof extends Animal {
        public Prof(String nom) {
            super(nom);
        }

        @Override
        public void crier() {
            System.out.println("Silence !");
        }
    }
}
