package aula05_03;

public class PersonBuilder {
    private String newLastName;
    private String newFirstName;
    private String newMiddleName;
    private String newSalutation;
    private String newSuffix;
    private String newStreetAddress;
    private String newCity;
    private String newState;
    private boolean newIsFemale;
    private boolean newIsEmployed;
    private boolean newIsHomeOwner;

    public PersonBuilder buildLastName(String newLastName) {
        this.newLastName = newLastName;
        return this;
    }

    public PersonBuilder buildFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
        return this;
    }

    public PersonBuilder buildMiddleName(String newMiddleName) {
        this.newMiddleName = newMiddleName;
        return this;
    }

    public PersonBuilder buildSalutation(String newSalutation) {
        this.newSalutation = newSalutation;
        return this;
    }

    public PersonBuilder buildSuffix(String newSuffix) {
        this.newSuffix = newSuffix;
        return this;
    }

    public PersonBuilder buildStreetAddress(String newStreetAddress) {
        this.newStreetAddress = newStreetAddress;
        return this;
    }

    public PersonBuilder buildCity(String newCity) {
        this.newCity = newCity;
        return this;
    }

    public PersonBuilder buildState(String newState) {
        this.newState = newState;
        return this;
    }

    public PersonBuilder buildIsFemale(boolean newIsFemale) {
        this.newIsFemale = newIsFemale;
        return this;
    }

    public PersonBuilder buildIsEmployed(boolean newIsEmployed) {
        this.newIsEmployed = newIsEmployed;
        return this;
    }

    public PersonBuilder buildIsHomeOwner(boolean newIsHomeOwner) {
        this.newIsHomeOwner = newIsHomeOwner;
        return this;
    }

    public Person createPerson() {
        return new Person(newLastName, newFirstName, newMiddleName, newSalutation, newSuffix, newStreetAddress, newCity,
                          newState, newIsFemale, newIsEmployed, newIsHomeOwner);
    }
}