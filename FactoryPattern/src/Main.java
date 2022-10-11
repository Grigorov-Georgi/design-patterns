public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("Pc", "12", "13", "14");
        System.out.println("PC config: " + pc.toString());

        Computer server = ComputerFactory.getComputer("Server", "14", "13", "14");
        System.out.println("Server config: " + server.toString());
    }
}
