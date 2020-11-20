package be.intecbrussel.demo;

public class DemoApp {

    public static void main(String[] args) {
//        Boom isManuAlsoConfused = new Boom();
//        isManuAlsoConfused.useTree();

        Boom myBoom = new Boom();
        Boom.Tree myTree = myBoom.new Tree();
        myTree.hasIdeas();
    }

}
