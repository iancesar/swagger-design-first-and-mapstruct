# Exemplo de Swagger design first e MapStruct

Projeto de crud em memória para demonstrar o uso do plugind de desing first do swagger(OpenAPI 3) e mapeamento através do MapStruct
- Java 11
- Spring Boot
- Swagger-codegen
- MapStruct
- Lombok

## Geração dos arquivos

Ao importar o projeto haverá erros de compilação pois as classes de request, response(DTO) e Contrato da API(interface) são geradas pelo maven, assim como a implementação do mapemanto do MapStruct

Rode o mvn compile para gerar as classes

```sh
mvn clean compile
```

Qualquer alteraçao no AlunoMapper.java ou no swagger.yalm esse processo deve ser executado.

Após os comando dentro target/generate-sources/annotations deverá haver a implementação do mapeamento e dentro de targe/generate-sources/swagger deverá haver o contrato de interface e os DTOs

Importe a collections do postman dentro de src/main/resources/Aluno.postman_collection.json para usar os requests já criados.

Para alterar o swagger.yalm use o [swagger-editor](https://editor.swagger.io/)
Para visualizar [swagger](src/main/resources/swagger.yaml)

Links de Referências:
(https://www.baeldung.com/mapstruct  
https://mapstruct.org/documentation/installation/
https://swagger.io/docs/open-source-tools/swagger-codegen/
https://github.com/swagger-api/swagger-codegen
https://editor.swagger.io/
https://github.com/swagger-api/swagger-codegen/blob/master/modules/swagger-codegen-maven-plugin/README.md
