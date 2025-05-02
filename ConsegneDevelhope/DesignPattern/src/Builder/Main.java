package Builder;

public class Main {
    public static void main(String[] args) {

        Person persona1 = new PersonBuilder()
                .setFirstName("Mario")
                .setLastName("Rossi")
                .setAge(30)
                .setAddress("Via Rinascimento 20")
                .build();
// metodo vecchio, da usare solo se serve un if
//        builder1.setFirstName("Mario");
//        builder1.setLastName("Rossi");
//        builder1.setAge(30);
//        builder1.setAddress("Via Rinascimento 20");
//        Person persona1 = builder1.build();

        PersonBuilder builder2 = new PersonBuilder();
        builder2.setFirstName("Maria");
        builder2.setAge(27);
        Person persona2 = builder2.build();

        System.out.println("Person 1: " + persona1 +
                        "\nPerson 2: " + persona2);

    }
}
