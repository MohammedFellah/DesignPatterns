package prototype;

public class Main {
    public static void main(String[] args) {

        FabriqueAnimal fabriqueAnimal = new FabriqueAnimal();

        Chat x = new Chat("Orange","Garfield");

        Chat chatCloned = (Chat) fabriqueAnimal.createCopyAnimal(x);

        Chat chatEdited = (Chat) fabriqueAnimal.updateAnimal(x,"Blanche","toto");

        System.out.println("Le chat est : "+x);
        System.out.println("La copy de l'objet : "+chatCloned);
        System.out.println("L'objet modifié : "+chatEdited);

        Chien y = new Chien("Blanche","Coco");
        Chien chienCloned = (Chien) fabriqueAnimal.createCopyAnimal(y);
        Chien chienEdited = (Chien) fabriqueAnimal.updateAnimal(y,"Marron","bibi");

        System.out.println("le chien est : "+y);
        System.out.println("la copy du chien : "+chienCloned);
        System.out.println("le chien modifié : "+chienEdited);



    }

}
