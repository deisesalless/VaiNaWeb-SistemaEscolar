package br.com.vainaweb.escola.repositories;

import br.com.vainaweb.escola.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

    Optional<StudentModel> findByCpf(String cpf);
}
