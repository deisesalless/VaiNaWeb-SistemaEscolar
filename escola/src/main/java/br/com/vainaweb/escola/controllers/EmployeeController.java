package br.com.vainaweb.escola.controllers;

import br.com.vainaweb.escola.dto.EmployeeRequestDTO;
import br.com.vainaweb.escola.dto.EmployeeUpdateRequestDTO;
import br.com.vainaweb.escola.models.EmployeeModel;
import br.com.vainaweb.escola.repositories.EmployeeRepository;
import br.com.vainaweb.escola.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaborador")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @Autowired
    private EmployeeRepository repository;

    @GetMapping
    public List<EmployeeModel> listAll() {
        return service.listAll();
    }

    @PostMapping
    public ResponseEntity<EmployeeModel> register(@RequestBody @Valid EmployeeRequestDTO data) {
        var employee = new EmployeeModel(data.name(), data.cpf(), data.email(), data.profession(), data.department(), data.addressRequestDTO());
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(employee));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeModel> findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(answer -> ResponseEntity.status(HttpStatus.OK).body(answer))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody @Valid EmployeeUpdateRequestDTO data) {
        var employee = repository.getReferenceById(id);
        employee.update(data);
        repository.save(employee);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
    }

}
