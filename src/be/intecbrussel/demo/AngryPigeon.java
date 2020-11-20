package be.intecbrussel.demo;

public class AngryPigeon{

    public Object throwPigeon() {
        int anthonysWeight = 420;
        // anthonysWeight = 10;

        class Pigeon{
            private String name;

            public Pigeon(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Pigeon{" +
                        "name='" + name + '\'' +
                        ", weight=" + anthonysWeight +
                        '}';
            }
        }

        Pigeon myPigeon = new Pigeon("Anthony");
        System.out.println("Throwing " + myPigeon + " at Manu.");
        return myPigeon;
    }

}
