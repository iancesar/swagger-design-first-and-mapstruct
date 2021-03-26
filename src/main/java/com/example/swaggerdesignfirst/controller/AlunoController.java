package com.example.swaggerdesignfirst.controller;

import com.example.swaggerdesignfirst.api.AlunoApi;
import com.example.swaggerdesignfirst.controller.*;
import com.example.swaggerdesignfirst.mapper.AlunoMapperImpl;
import com.example.swaggerdesignfirst.model.AlunoRequest;
import com.example.swaggerdesignfirst.model.AlunoResponse;
import com.example.swaggerdesignfirst.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@RestController
public class AlunoController implements AlunoApi {

    private AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @Override
    public ResponseEntity<Void> updateAluno(String id, @Valid AlunoRequest body) {
        alunoService.update(body, id);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> addAluno(@Valid AlunoRequest body) {
        alunoService.save(body);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<AlunoResponse>> findAll() {
        return ResponseEntity.ok(alunoService.findAll());
    }
}
