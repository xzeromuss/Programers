package com.programers.Ciclo03Programers.repository;

import com.programers.Ciclo03Programers.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, String> {

}