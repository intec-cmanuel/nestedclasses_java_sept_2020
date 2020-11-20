package be.intecbrussel.demo;

public class Plane {
    private Pilot pilot;

    public Plane(Pilot pilot){
        this.pilot = pilot;
    }

    // Nested Class
    public static class Pilot {
        private String name;
        private int age;
        private boolean hasLicence;

        public Pilot(String name, int age, boolean hasLicence){
            this.name = name;
            this.age = age;
            this.hasLicence = hasLicence;
        }

        @Override
        public String toString() {
            return "Pilot{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", hasLicence=" + hasLicence +
                    '}';
        }
    }

}
