package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false;
        }
        if (!isZooFull()) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName().equals(animals[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1) {
            return false;
        }
        for (int i = indexAnimal; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.getNbrAnimals() > z2.getNbrAnimals()) {
            return z1;
        } else {
            return z2;
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
public static class Aquatic {
    protected String habitat;

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
}

// Classe pour les dauphins
public static class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "habitat='" + habitat + '\'' +
                ", swimmingSpeed=" + swimmingSpeed +
                '}';
    }
}

// Classe pour les pingouins
public static class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "habitat='" + habitat + '\'' +
                ", swimmingDepth=" + swimmingDepth +
                '}';
    }
}

// Classe pour les animaux terrestres
public static class Terrestrial {
    protected int nbrLegs;

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                '}';
    }
}

}