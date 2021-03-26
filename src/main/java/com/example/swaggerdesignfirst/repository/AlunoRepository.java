package com.example.swaggerdesignfirst.repository;

import com.example.swaggerdesignfirst.entity.Aluno;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AlunoRepository {

    private final List<Aluno> dataSource = Collections.synchronizedList(new ArrayList<>());

    public void save(final Aluno aluno){
        dataSource.add(aluno);
    }

    public void update(Aluno aluno){
        dataSource.set(dataSource.indexOf(aluno), aluno);
    }

    public List<Aluno> findAll(){
        return Collections.unmodifiableList(dataSource);
    }

}
