package prototype;

public class FabriqueAnimal {


    public Animal createCopyAnimal(Animal animal){
        return animal.makeCopy();
    }

    public Animal updateAnimal(Animal animal,String couleur, String nom){
        return animal.updateAnimal(couleur,nom);
    }

}
