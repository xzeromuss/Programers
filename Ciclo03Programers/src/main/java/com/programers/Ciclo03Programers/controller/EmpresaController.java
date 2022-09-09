package com.programers.Ciclo03Programers.controller;

import com.programers.Ciclo03Programers.model.Empresa;
import com.programers.Ciclo03Programers.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/enterprise")
    private List<Empresa> consultarTodasEmpresa() {
        return empresaService.consultarTodasEmpresas();
    }

    @GetMapping("/enterprise/{id}")
    private List<Empresa> consultarUnaEmpresa() {
        return empresaService.consultarUnaEmpresa();
    }

    @PostMapping("/enterprise")
    public void crearEmpresa(@RequestBody Empresa empresa) {
        empresaService.crearEmpresa(empresa);
    }


    @DeleteMapping("/enterprise/{id}")
    private void eliminarEmpresa(@PathVariable("id") String id) {
        empresaService.eliminarEmpresa(id);
    }

    @PatchMapping("/enterprise/{id}")
    private void editarEmpresa(@RequestBody Empresa empresa){
        empresaService.editarEmpresa(empresa);
    }

}
