package Creational.Factory;

public class Test {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1000GB", "5 GHz");

        System.out.println(pc);
        System.out.println(server);
    }
}
