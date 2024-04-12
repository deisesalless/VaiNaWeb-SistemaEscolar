package br.com.vainaweb.escola.services;

import br.com.vainaweb.escola.dto.EmployeeRequestDTO;
import br.com.vainaweb.escola.models.EmployeeModel;
import br.com.vainaweb.escola.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<EmployeeModel> listAll() {
        return repository.findAll();
    }

    public void register(EmployeeRequestDTO data) {
        var employee = new EmployeeModel(
                data.name(), data.cpf(), data.email(),
                data.profession(), data.department(),
                data.addressRequestDTO()
        );
        repository.save(employee);
    }

}
