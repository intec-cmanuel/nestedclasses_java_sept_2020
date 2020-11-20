package be.intecbrussel.opdracht1;

public class Musician{

    public class Instrument{
        public void makeSound(String sound){
            System.out.println(sound);
        }

    }

    public void play() {
        Instrument piano = new Instrument();
        piano.makeSound("prrrrrrrrrrrrrrrrt");
    }
}
