package be.intecbrussel.demo;

public class NotAnonymouse {
    public static void main(String[] args) {
//        Ice myIceCreamCone = new IceCream();
//        myIceCreamCone.melt();

        Ice myMagnum44 = new Ice() {
            @Override
            public void melt() {
                System.out.println("Why does it have a trigger?");
            }
        };
        myMagnum44.melt();
    }
}
