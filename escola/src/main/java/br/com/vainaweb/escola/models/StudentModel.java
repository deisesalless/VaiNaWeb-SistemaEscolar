package br.com.vainaweb.escola.models;

import br.com.vainaweb.escola.dto.StudentRequestDTO;
import br.com.vainaweb.escola.enums.Subject;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tb_student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @CPF
    @Column(unique = true, nullable = false)
    private String cpf;

    @Pattern(regexp = "[0-9]{11}")
    private String cellphone;

    private Subject subject;

    @Embedded
    private Address address;

    public StudentModel(StudentRequestDTO data) {
        this.name = data.name();
        this.email = data.email();
        this.cpf = data.cpf();
        this.cellphone = data.cellphone();
        this.subject = data.subject();
        this.address = new Address(data.addressRequestDTO().zipcode(), data.addressRequestDTO().street(), data.addressRequestDTO().neighborhood(), data.addressRequestDTO().city(), data.addressRequestDTO().complement(), data.addressRequestDTO().number(), data.addressRequestDTO().uf());
    }

}
