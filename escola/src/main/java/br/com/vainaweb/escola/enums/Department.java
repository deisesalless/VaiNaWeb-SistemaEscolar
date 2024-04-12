package br.com.vainaweb.escola.enums;

public enum Department {
    GESTAO_ESCOLAR("Gestao Escolar"),
    COORDENACAO_ADMINISTRATIVA("Coordenacao Administrativo Escolar"),
    COORDERNACAO_PEDAGOGICA("Coordenacao Pedagogico Escolar"),
    ASSESSORIA_PEDAGOGICA("Assessoria Pedagogico"),
    SECRETARIA("Secretaria Escolar"),
    ADMINISTRATIVO("Administracao Escolar");

    private String name;

    private Department(String name) {
        this.name = name;
    }

    public String getCapitalLetter() {
        return name.toUpperCase();
    }
}

