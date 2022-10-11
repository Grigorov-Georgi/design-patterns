public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("4 GB", "15000 GB", "4.8 GHz"));
        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
