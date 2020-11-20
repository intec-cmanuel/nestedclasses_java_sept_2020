package be.intecbrussel.demo;

public class StaticDemo {
    public static void main(String[] args) {
        Plane.Pilot ludwigVon = new Plane.Pilot("Beethoven", 56, false);
        Plane.Pilot deLaVega = new Plane.Pilot("Tonino", 69, true);

        Plane boeing707 = new Plane(ludwigVon);
        Plane antonyov124 = new Plane(deLaVega);

        System.out.println(deLaVega.toString());
    }
}
