package com.programers.Ciclo03Programers.repository;

import com.programers.Ciclo03Programers.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, String> {

    void deleteById(Long id);
}
