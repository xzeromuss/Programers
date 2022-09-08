package com.programers.Ciclo03Programers.repository;

import com.programers.Ciclo03Programers.model.Empresa;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, String>{
}
