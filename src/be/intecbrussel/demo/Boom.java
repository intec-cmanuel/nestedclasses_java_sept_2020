package be.intecbrussel.demo;

public class Boom {

    private String name;
    private int number;

    public void askAudricWhy(){
    }

    public void useTree() {
        Tree peuplier = new Tree();
        System.out.println(peuplier.hasIdeas());
    }

    public boolean isManonConfused(){
        return true;
    }


    public class Tree {
        private String type;
        public boolean hasIdeas(){
            return true;
        }
    }

}
