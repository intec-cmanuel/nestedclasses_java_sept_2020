package be.intecbrussel.opdracht3;

public class Musician {
    public void play() {
        Instrument instrument = new Instrument() {
            @Override
            public void makeSound() {
                System.out.println("an instrument plays");
            }
        };
        instrument.makeSound();
    }
}
