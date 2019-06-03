package singleton;

public class Computer {

    private String RAM;
    private String CPU;


    /**
     * Instance Unique pré-initialisé
     */
    private static Computer computer = new Computer("4GO","i7 - 3.5 Ghz");

    /**
     * Constructeur privé pour interdire l'accès a l'instaciation
     */
    public Computer(String RAM, String CPU) {
        this.RAM = RAM;
        this.CPU = CPU;
    }

    /**
     * Point d'accès unique à l'instance unique du Computer
     * @return
     */
    public static Computer getInstanceComputer(){
        return computer;
    }


    public String getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String toString(){
        return "La RAM du pc est :"+this.getRAM()+" et le processeur du PC est : "+this.getCPU();
    }

}
