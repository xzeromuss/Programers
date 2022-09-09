package com.programers.Ciclo03Programers.controller;

import com.programers.Ciclo03Programers.model.Empleado;
import com.programers.Ciclo03Programers.model.Empresa;
import com.programers.Ciclo03Programers.service.EmpleadoService;
import com.programers.Ciclo03Programers.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/enterprise")
    private List<Empleado> consultarTodosEmpleados() {
        return empleadoService.consultarTodosEmpleados();
    }

    @GetMapping("/enterprise/{id}")
    private List<Empleado> consultarUnEmpleado() {
        return empleadoService.consultarUnEmpleado();
    }

    @PostMapping("/enterprise")
    public void crearEmpleado(@RequestBody Empleado empleado) {
        empleadoService.crearEmpleado(empleado);
    }


    @DeleteMapping("/enterprise/{id}")
    private void eliminarEmpleado(@PathVariable("id") String id) {
        empleadoService.eliminarEmpleado(id);
    }

    @PatchMapping("/enterprise/{id}")
    private void editarEmpleado(@RequestBody Empleado empleado){
        empleadoService.editarEmpleado(empleado);
    }

}
