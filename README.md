# Desafio_MovieFlix_02

Concluído a entrega do desafio do capítulo 05, foi utilizado o Spring Data JPA (JPQL) para a elaboração de consultas customizados ao banco de dados. Pré-autorização de métodos por perfil de usuário e a validação de campos obrigatórios.

O desafio solicita a implementação dos seguinte requisitos listados abaixo:

1 - Efetuar login.<br />
1.1 - [IN] O usuário anônimo informa seu email e senha.<br />
1.2 - [OUT] O sistema informa um token válido.

2 - Listar filmes.<br />
2.1 - [OUT] O sistema apresenta uma listagem dos nomes de todos gêneros, bem como uma listagem paginada com título, subtítulo, ano e imagem dos filmes, ordenada alfabeticamente por título.<br />
2.2 - [IN] O usuário visitante ou membro seleciona, opcionalmente, um gênero.<br />
2.3 - [OUT] O sistema apresenta a listagem atualizada, restringindo somente ao gênero selecionado.

3 Visualizar detalhes do filme.<br />
3.1 - [IN] O usuário visitante ou membro seleciona um filme.<br />
3.2 - [OUT] O sistema informa título, subtítulo, ano, imagem e sinopse do filme, e também uma listagem dos textos das avaliações daquele filme juntamente com nome do usuário que fez cada avaliação.<br />
3.3 - [IN] O usuário membro informa, opcionalmente, um texto para avaliação do filme.<br />
3.4 - [OUT] O sistema apresenta os dados atualizados, já aparecendo também a avaliação feita pelo usuário.

4 - Exceção, texto vazio.<br />
4.1 - O sistema apresenta uma mensagem de que não é permitido texto vazio no cadastro da avaliação. 

![image](https://user-images.githubusercontent.com/82981926/140934939-16ba4af8-ad4e-481b-b68d-4db3c827d346.png)

