package com.programers.Ciclo03Programers.service;

import com.programers.Ciclo03Programers.model.Empresa;
import com.programers.Ciclo03Programers.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public void crearEmpresa(Empresa empresa){
        empresaRepository.save(empresa);
    }

    public void editarEmpresa(Empresa empresa){
        empresaRepository.save(empresa);

    }

    public void eliminarEmpresa(String id){
        empresaRepository.deleteAllById(id);

    }

    public List<Empresa> consultarTodasEmpresas(){
        List<Empresa> empresaList = new ArrayList<Empresa>();
        empresaList.addAll(empresaRepository.findAll());
        return empresaList;
    }

    public List<Empresa> consultarUnaEmpresa(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas.addAll(empresaRepository.findAll());
        return empresas;
    }
}
