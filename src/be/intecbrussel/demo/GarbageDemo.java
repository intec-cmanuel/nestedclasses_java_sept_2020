package be.intecbrussel.demo;

public class GarbageDemo{

    public static void main(String[] args) {
        Example e = new Example(44);
        e.method();

        e = null;
    }

}

class Example{
    private Integer number;

    public Example(Integer number) {
        this.number = number;
    }

    public void method() {
        int s = 4;
        System.out.println(s);
    }
}
