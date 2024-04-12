package br.com.vainaweb.escola.enums;

public enum Subject {

    BUSINESS("Negocios"),
    COMPUTER_SCIENSE("Ciencia da Computacao"),
    SCIENSE("Ciencia"),
    ART("Artes"),
    MATHEMATICS("Matematica"),
    DESIGN("Design"),
    ENGLISH("Ingles"),
    PSYCHOLOGY("Psicologia");

    private String name;

    private Subject(String name) {
        this.name = name;
    }

    public String getCapitalLetter() {
        return name.toUpperCase();
    }


}
