package com.programers.Ciclo03Programers.controller;

import com.programers.Ciclo03Programers.model.Empresa;
import com.programers.Ciclo03Programers.model.MovimientoDinero;
import com.programers.Ciclo03Programers.service.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoDineroController {
        @Autowired
        MovimientoDineroService movimientoDineroService;

        @GetMapping("/enterprise")
        private List<Empresa> consultarTodosMovimientoDinero() {
            return movimientoDineroService.consultarTodosMovimientoDinero();
        }


        @PostMapping("/enterprise")
        public void crearMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero) {
            movimientoDineroService.crearMovimientoDinero(movimientoDinero);
        }


        @PatchMapping("/enterprise/{id}")
        private void editarMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
            movimientoDineroService.editarMovimientoDinero(movimientoDinero);
        }


}
