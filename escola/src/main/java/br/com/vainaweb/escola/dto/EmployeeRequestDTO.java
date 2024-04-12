package br.com.vainaweb.escola.dto;

import br.com.vainaweb.escola.enums.Profession;
import br.com.vainaweb.escola.enums.Department;
import br.com.vainaweb.escola.models.Address;
import jakarta.validation.Valid;

public record EmployeeRequestDTO(String name, String cpf, String email, Profession profession, Department department, @Valid AddressRequestDTO addressRequestDTO) {
}
