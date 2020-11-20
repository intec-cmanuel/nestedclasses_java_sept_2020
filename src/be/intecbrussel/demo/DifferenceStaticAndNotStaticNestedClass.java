package be.intecbrussel.demo;

public class DifferenceStaticAndNotStaticNestedClass {

    public static void main(String[] args) {
        //Static nested class
        Plane.Pilot ifspje = new Plane.Pilot(null,0,false);

        //Non-static nested class
        Boom myBoom = new Boom();
        Boom.Tree efpksepfok = myBoom.new Tree();
    }

}
