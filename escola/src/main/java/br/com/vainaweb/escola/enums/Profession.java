package br.com.vainaweb.escola.enums;

public enum Profession {
    PROFESSOR("Professor(a)"),
    INSPETOR("Inspetor(a)"),
    COORDENADOR("Coordernador(a) Pedagogico"),
    DIRETOR("Diretor(a)"),
    VICE_DIRETOR("Vice Diretor(a)"),
    SECRATARIA("Secretario(a)"),
    LIMPEZA("Auxiliar de Limpeza"),
    MERENDEIRO("Merendeiro(a)"),
    PORTEIRO("Porteiro(a)");

    private String name;

    private Profession(String name) {
        this.name = name;
    }

    public String getCapitalLetter() {
        return name.toUpperCase();
    }
}
