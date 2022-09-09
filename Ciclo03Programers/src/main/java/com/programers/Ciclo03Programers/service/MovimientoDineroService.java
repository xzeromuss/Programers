package com.programers.Ciclo03Programers.service;

import com.programers.Ciclo03Programers.model.Empresa;
import com.programers.Ciclo03Programers.model.MovimientoDinero;
import com.programers.Ciclo03Programers.repository.EmpresaRepository;
import com.programers.Ciclo03Programers.repository.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDineroService {

    @Autowired
    MovimientoDineroRepository movimientoDineroRepository;

    public void crearMovimientoDinero(MovimientoDinero movimientoDinero){
        movimientoDineroRepository.save(movimientoDinero);
    }

    public void editarMovimientoDinero(MovimientoDinero movimientoDinero){
        movimientoDineroRepository.save(movimientoDinero);

    }

    public List<Empresa> consultarTodosMovimientoDinero(){
        List<MovimientoDinero> movimientoDineroList = new ArrayList<MovimientoDinero>();
        movimientoDineroList.addAll(movimientoDineroRepository.findAll());
        return movimientoDineroList;
    }

}
