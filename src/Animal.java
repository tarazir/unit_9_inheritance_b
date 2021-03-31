public class Animal {

    private String objName;
    private String animalName;
    private String animalType;

    public Animal(String a, String b, String c) {
        this.objName = a;
        this.animalName = b;
        this.animalType = c;
    }

    @Override
    public String toString() {
        return animalType + " the " + animalName + " is a " + objName;
    }
}
