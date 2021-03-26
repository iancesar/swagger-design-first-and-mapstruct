package com.example.swaggerdesignfirst.service;

import com.example.swaggerdesignfirst.entity.Aluno;
import com.example.swaggerdesignfirst.mapper.AlunoMapper;
import com.example.swaggerdesignfirst.model.AlunoRequest;
import com.example.swaggerdesignfirst.model.AlunoResponse;
import com.example.swaggerdesignfirst.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private AlunoRepository alunoRepository;
    private AlunoMapper alunoMapper;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository, AlunoMapper alunoMapper) {
        this.alunoRepository = alunoRepository;
        this.alunoMapper = alunoMapper;
    }

    public void save(AlunoRequest alunoRequest) {
        Aluno aluno = alunoMapper.toAluno(alunoRequest);
        alunoRepository.save(aluno);
    }

    public void update(AlunoRequest alunoRequest, String id) {
        Aluno aluno = alunoMapper.toAlunoUpdate(alunoRequest, id);
        alunoRepository.update(aluno);
    }

    public List<AlunoResponse> findAll() {
        List<Aluno> alunoList = alunoRepository.findAll();
        return alunoMapper.toAlunoResponseList(alunoList);
    }

}
