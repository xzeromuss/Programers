package com.programers.Ciclo03Programers.service;

import com.programers.Ciclo03Programers.model.Empleado;
import com.programers.Ciclo03Programers.model.Empresa;
import com.programers.Ciclo03Programers.repository.EmpleadoRepository;
import com.programers.Ciclo03Programers.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public void crearEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }

    public void editarEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);

    }

    public void eliminarEmpleado(String id){
        empleadoRepository.deleteAllById(id);

    }

    public List<Empleado> consultarTodosEmpleados(){
        List<Empleado> empleadoList = new ArrayList<Empleado>();
        empleadoList.addAll(empleadoRepository.findAll());
        return empleadoList;
    }

    public List<Empleado> consultarUnEmpleado(){
        List<Empleado> empleadosList = new ArrayList<Empleado>();
        empleadosList.addAll(empleadoRepository.findAll());
        return empleadosList;
    }

}
