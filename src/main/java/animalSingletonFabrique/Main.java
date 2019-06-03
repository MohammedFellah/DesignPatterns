package animalSingletonFabrique;
import animalSingletonFabrique.exception.ExceptionCreation;
public class Main {

    public static void main(String[] args) throws ExceptionCreation {


       Animal animal1 = FabriqueAnimal.getAnimal("chat");
       Animal animal2 = FabriqueAnimal.getAnimal("chien");
       Animal animal3 = FabriqueAnimal.getAnimal("cheval");


       System.out.println(animal1);
       System.out.println(animal2);
       System.out.println(animal3);

    }
}
