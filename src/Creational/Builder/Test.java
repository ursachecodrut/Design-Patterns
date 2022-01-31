package Creational.Builder;

public class Test {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Codrut", "Ursache")
                .age(20)
                .phone("123456")
                .address("Bucharest")
                .build();

        User user2 = new User.UserBuilder("Bogdan", "Silvasan")
                .age(20)
                .phone("654321")
                .build();

        User user3 = new User.UserBuilder("George", "Cioban")
                .build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
