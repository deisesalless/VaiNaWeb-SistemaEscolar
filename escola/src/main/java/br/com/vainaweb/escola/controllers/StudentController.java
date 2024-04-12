package br.com.vainaweb.escola.controllers;

import br.com.vainaweb.escola.dto.StudentRequestDTO;
import br.com.vainaweb.escola.dto.StudentUpdateRequestDTO;
import br.com.vainaweb.escola.models.Address;
import br.com.vainaweb.escola.models.StudentModel;
import br.com.vainaweb.escola.repositories.StudentRepository;
import br.com.vainaweb.escola.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudante")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private StudentService service;

    @GetMapping
    public List<StudentModel> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> register(@RequestBody StudentRequestDTO data) {
        return service.register(data).map(answer ->
                        ResponseEntity.status(HttpStatus.CREATED).build())
                .orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentModel> findById(@PathVariable Long id) {
        return repository.findById(id).map(answer ->
                        ResponseEntity.status(HttpStatus.OK).body(answer))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody StudentUpdateRequestDTO data) {
        StudentModel student = repository.getReferenceById(id);
        StudentModel newStudent = service.update(student, data);
        repository.save(newStudent);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
