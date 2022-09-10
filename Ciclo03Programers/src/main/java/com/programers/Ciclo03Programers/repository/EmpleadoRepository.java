package com.programers.Ciclo03Programers.repository;

import com.programers.Ciclo03Programers.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String> {

    void deleteById(Long id);
}
