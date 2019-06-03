package strategy;

import strategy.strategyPackage.CanFly;
import strategy.strategyPackage.CannotFly;

public class Main {

    public static void main(String[] args) {

        Bird twitter = new Bird("twitter","Bleu");
        Dog coco = new Dog("coco","Blanche");

        // tester si les animaux volent
        System.out.println("Bird: "+twitter.tryToFly());
        System.out.println("Dog: "+coco.tryToFly());

        //changer la capacité de vol pour un Dog
        coco.setAbilityToFly(new CanFly());
        System.out.println("Dog after change : "+coco.tryToFly());

        // changer la capacité de vol pour un Bird
        twitter.setAbilityToFly(new CannotFly());
        System.out.println("Birdafter change: "+twitter.tryToFly());

    }
}
