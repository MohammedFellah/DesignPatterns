package singleton;

public class Main {

    public static void main(String[] args) {
        Computer computer1 = Computer.getInstanceComputer();
        System.out.println(computer1);
    }
}
