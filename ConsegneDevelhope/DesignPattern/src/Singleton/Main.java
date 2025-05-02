package Singleton;

public class Main {

    public static void main(String[] args) {

        User user1 = User.getInstance();
        User user2 = User.getInstance();

        System.out.println("Info iniziali: ");
        user1.stampaInfo();
        user2.stampaInfo();

        user2.setNome("Luigi Rossi");
        user2.setEta(30);

        System.out.println("Info cambiate per user2: ");
        user2.stampaInfo();

    }
}