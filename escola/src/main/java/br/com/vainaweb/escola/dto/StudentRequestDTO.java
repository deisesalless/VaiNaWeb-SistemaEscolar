package br.com.vainaweb.escola.dto;

import br.com.vainaweb.escola.enums.Subject;
import jakarta.validation.Valid;

public record StudentRequestDTO(String name, String email, String cpf, String cellphone, Subject subject, @Valid AddressRequestDTO addressRequestDTO) {
}
