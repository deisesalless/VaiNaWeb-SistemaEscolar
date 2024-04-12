package br.com.vainaweb.escola.services;

import br.com.vainaweb.escola.dto.StudentRequestDTO;
import br.com.vainaweb.escola.dto.StudentUpdateRequestDTO;
import br.com.vainaweb.escola.models.Address;
import br.com.vainaweb.escola.models.StudentModel;
import br.com.vainaweb.escola.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Optional<StudentModel> register(StudentRequestDTO data) {
        var student = repository.findByCpf(data.cpf());

        if (student.isEmpty()) {
            return Optional.of(repository.save(new StudentModel(data)));
        } else {
            return student;
        }
    }

    public StudentModel update(StudentModel student, StudentUpdateRequestDTO data) {
        student.setName(data.name());
        student.setEmail(data.email());
        student.setCellphone(data.cellphone());
        student.setSubject(data.subject());
        student.setAddress(new Address(data.addressRequestDTO()));
        return student;
    }
}
