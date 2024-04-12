package br.com.vainaweb.escola.dto;

import br.com.vainaweb.escola.enums.BrazilianStates;

public record AddressRequestDTO(String zipcode, String street, String neighborhood, String city, String complement, Integer number, BrazilianStates uf) {
}
