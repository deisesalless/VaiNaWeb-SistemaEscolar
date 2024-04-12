package br.com.vainaweb.escola.models;

import br.com.vainaweb.escola.dto.AddressRequestDTO;
import br.com.vainaweb.escola.dto.EmployeeUpdateRequestDTO;
import br.com.vainaweb.escola.enums.Profession;
import br.com.vainaweb.escola.enums.Department;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tb_employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Email
    @Column(unique = true, name = "email")
    private String email;

    @CPF
    @Column(unique = true)
    private String cpf;

    @Embedded
    private Address address;

    private Profession profession;

    private Department department;

    public EmployeeModel(String name, String cpf, String email, Profession profession, Department department, @Valid AddressRequestDTO data) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.profession = profession;
        this.department = department;
        this.address = new Address(data);
    }

    public void update(@Valid EmployeeUpdateRequestDTO data) {
        this.name = data.name() != null ? data.name() : this.name;
        this.email = data.email() != null ? data.email() : this.email;
        this.profession = data.profession() != null ? data.profession() : this.profession;
        this.department = data.department() != null ? data.department() : this.department;
    }
}
