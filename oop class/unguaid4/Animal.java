public class Animal {
    private final String name = "";
    private final String characteristics;

    public Animal(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void print() {
        System.out.println(getName());
    }

    public void showDetail() {
        System.out.println("\n    ==== " + getName() + " ====\n");
        System.out.println("CHARACTERISTICS: \n" + getCharacteristics());
    }
}
