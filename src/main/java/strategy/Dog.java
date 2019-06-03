package strategy;

import strategy.strategyPackage.CannotFly;

public class Dog extends Animal {

    public Dog(String nom, String couleur) {
        super(nom, couleur);

        //on  ne donne pas la capacité de voler p pour un Dog par défaut
        flyingType = new CannotFly();

    }
}
