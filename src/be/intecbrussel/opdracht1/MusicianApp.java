package be.intecbrussel.opdracht1;

public class MusicianApp {
    public static void main(String[] args) {
        Musician beethoven = new Musician();
        beethoven.play();

        Musician.Instrument violin = beethoven.new Instrument();
        violin.makeSound("\"\"");
    }
}
