package br.com.vainaweb.escola.repositories;

import br.com.vainaweb.escola.models.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
}
