package br.com.vainaweb.escola.models;

import br.com.vainaweb.escola.dto.AddressRequestDTO;
import br.com.vainaweb.escola.enums.BrazilianStates;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String zipcode;
    private String street;
    private String neighborhood;
    private String city;
    private String complement;
    private Integer number;
    private BrazilianStates uf;

    public Address(AddressRequestDTO data) {
        this.zipcode = data.zipcode();
        this.street = data.street();
        this.neighborhood = data.neighborhood();
        this.city = data.city();
        this.complement = data.complement();
        this.number = data.number();
        this.uf = data.uf();
    }

}
