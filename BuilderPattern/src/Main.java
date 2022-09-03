public class Main {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .firstName("Georgi")
                .lastName("Grigorov")
                .age(22)
                .phone("089 999 9999")
                .address("Sofia")
                .build();

        User user2 = new User.UserBuilder()
                .firstName("Georgi")
                .lastName("Grigorov")
                .build();

        User user3 = new User.UserBuilder()
                .phone("089 999 9999")
                .address("Sofia")
                .build();

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
    }
}
