package com.example.swaggerdesignfirst.mapper;

import com.example.swaggerdesignfirst.entity.Aluno;
import com.example.swaggerdesignfirst.entity.Situacao;
import com.example.swaggerdesignfirst.model.AlunoRequest;
import com.example.swaggerdesignfirst.model.AlunoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class, LocalDate.class}) //Habilita o autowired
public interface AlunoMapper {

    @Mapping(target = "id", expression = "java(UUID.randomUUID().toString())")
    Aluno toAluno(AlunoRequest alunoRequest);

    AlunoResponse toAlunoResponse(Aluno aluno);

    List<AlunoResponse> toAlunoResponseList(List<Aluno> alunoList);

    /**
     * Exemplo com metodo default, caso de uma conversão mais complexa
     *
     * @param alunoRequest
     * @param id
     * @return
     */
    public default Aluno toAlunoUpdate(AlunoRequest alunoRequest, String id) {
        return Aluno.builder()
                .id(id)
                .email(alunoRequest.getEmail())
                .nascimento(alunoRequest.getNascimento())
                .nome(alunoRequest.getNome())
                .situacao(Situacao.valueOf(alunoRequest.getSituacao().name()))
                .build();
    }

}
