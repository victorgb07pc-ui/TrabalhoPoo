# Biblioteca POO 📚

Este é um trabalho da faculdade que fiz na disciplina de Programação Orientada a Objetos, em Java. A ideia é simular o dia a dia de uma biblioteca: cadastrar alunos e funcionários, guardar os livros do acervo e controlar quem pegou emprestado o quê.

Aqui está a minha parte do projeto: as classes que representam os dados e o jeito de guardá-los na memória.

O que eu pratiquei

Foi um trabalho bom para entender na prática alguns conceitos de POO:

Classe abstrata: Pessoa serve de base para os outros tipos de pessoa.

Herança: Aluno e Funcionario herdam de Pessoa.

Interfaces: Exportavel e Repositorio definem o que cada classe precisa ter.

Composição: um Emprestimo é formado por uma Pessoa e um Livro.

Polimorfismo: cada tipo de pessoa tem o seu próprio limite de empréstimos (3 para alunos e 5 para funcionários).

O que tem aqui

Pessoa, Aluno e Funcionario: quem usa a biblioteca

Livro: os livros do acervo e se estão disponíveis

Emprestimo: liga uma pessoa a um livro

Exportavel: interface para mostrar os dados em formato de tabela

Repositorio e RepositorioEmMemoria: guardam os dados e geram os ids sozinhos

DadosIniciais: dados de exemplo para testar

Feito com

Java, no Eclipse.

Autor: Victor Gabriel Da Silva S. Costa
