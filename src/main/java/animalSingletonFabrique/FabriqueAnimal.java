package animalSingletonFabrique;

import animalSingletonFabrique.exception.ExceptionCreation;

public class FabriqueAnimal {

    public static Animal getAnimal(String typeAnimal) throws ExceptionCreation {
        if (typeAnimal.equals("chat")) {
            Chat x = Chat.getInstanceChat();
            return x;
        } else if (typeAnimal.equals("chien")) {
            Chien y = Chien.getInstanceChien();
            return y;
        }
        throw new ExceptionCreation("impossible de créer un:" + typeAnimal);

    }
}
