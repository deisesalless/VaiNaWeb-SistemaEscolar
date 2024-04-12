package br.com.vainaweb.escola.enums;

public enum BrazilianStates {

    ACRE("Acre", "AC"),
    ALAGOAS("Alagoas", "AL"),
    AMAPA("Amapa", "AP"),
    AMAZONAS("Amazonas", "AM"),
    BAHIA("Bahia", "BA"),
    CEARA("Ceara", "CE"),
    ESPIRITO_SANTO("Espirito Santo", "ES"),
    GOIAS("Goias", "GO"),
    MARANHAO("Maranhao", "MA"),
    MATO_GROSSO("Mato Grosso", "MT"),
    MATO_GROSSO_SUL("Mato Grosso do Sul", "MS"),
    MINAS_GERAIS("Minas Gerais", "MG"),
    PARA("Para", "PA"),
    PARAIBA("Paraiba", "PB"),
    PARANA("Parana", "PR"),
    PERNAMBUCO("Pernambuco", "PE"),
    PIAUI("Piaui", "PI"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    RIO_GRANDE_NORTE("Rio Grande do Norte", "RN"),
    RIO_GRANDE_SUL("Rio Grande do Sul", "RS"),
    RONDONIA("Rondonia", "RO"),
    RORAIMA("Roraima", "RR"),
    SANTA_CATARINA("Santa Catarina", "SC"),
    SAO_PAULO ("SP", "Sao Paulo"),
    SERGIPE("Sergipe", "SE"),
    TOCANTINS("TOCANTIS", "TO"),
    BRASILIA ("Distrito Federal", "DF");

    private String name;
    private String initial;

    private BrazilianStates(String name, String initial) {
        this.name = name;
        this.initial = initial;
    }

    public String getCapitalLetter() {
        return name.toUpperCase();
    }
}
