package aula05_03;

public class E5_03_PessoaMain {
    public static void main(String[] args) {
        Person p = new PersonBuilder().buildCity("Potato City")
                                      .buildIsFemale(true)
                                      .buildFirstName("Pedro")
                                      .buildLastName("Candoso")
                                      .buildIsHomeOwner(false)
                                      .buildStreetAddress("Major Potato Man nº15 3-5-6320-412")
                                      .buildSuffix("Pink")
                                      .createPerson();
        System.out.println(p);
    }
}
