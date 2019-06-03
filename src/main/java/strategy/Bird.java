package strategy;

import strategy.strategyPackage.CanFly;

public class Bird extends Animal {

    public Bird(String nom, String couleur) {
        super(nom, couleur);

        //on donne la capacité de voler par défaut pour un Bird
        flyingType = new CanFly();
    }


}
