package br.com.vainaweb.escola.dto;

import br.com.vainaweb.escola.enums.Department;
import br.com.vainaweb.escola.enums.Profession;

public record EmployeeUpdateRequestDTO(String name, String email, Profession profession, Department department) {
}
