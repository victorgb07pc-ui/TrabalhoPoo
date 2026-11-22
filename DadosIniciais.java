	public class DadosIniciais {

    public static void carregarPessoas(Repositorio<Pessoa> repo) {
        repo.adicionar(new Aluno("Ana Souza", "111.111.111-11", "2024001", "Sistemas"));
        repo.adicionar(new Aluno("Bruno Lima", "222.222.222-22", "2024002", "Direito"));
        repo.adicionar(new Aluno("Carla Dias", "333.333.333-33", "2024003", "Medicina"));
        repo.adicionar(new Aluno("Diego Alves", "444.444.444-44", "2024004", "Engenharia"));
        repo.adicionar(new Aluno("Elisa Rocha", "555.555.555-55", "2024005", "Letras"));
        repo.adicionar(new Aluno("Fabio Costa", "666.666.666-66", "2024006", "Administração"));
        repo.adicionar(new Aluno("Gabi Nunes", "777.777.777-77", "2024007", "Psicologia"));

        repo.adicionar(new Funcionario("Helena Prado", "888.888.888-88", "Bibliotecária", "Acervo"));
        repo.adicionar(new Funcionario("Igor Matos", "999.999.999-99", "Professor", "Exatas"));
        repo.adicionar(new Funcionario("Julia Reis", "101.010.101-01", "Secretária", "Secretaria"));
        repo.adicionar(new Funcionario("Kleber Silva", "202.020.202-02", "Analista", "TI"));
        repo.adicionar(new Funcionario("Lara Pinto", "303.030.303-03", "Coordenadora", "Pedagógico"));
        repo.adicionar(new Funcionario("Marcos Leal", "404.040.404-04", "Professor", "Humanas"));
        repo.adicionar(new Funcionario("Nina Freitas", "505.050.505-05", "Auxiliar", "Limpeza"));
    }

    public static void carregarLivros(Repositorio<Livro> repo) {
        repo.adicionar(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        repo.adicionar(new Livro("O Cortiço", "Aluísio Azevedo", 1890));
        repo.adicionar(new Livro("Capitães da Areia", "Jorge Amado", 1937));
        repo.adicionar(new Livro("Vidas Secas", "Graciliano Ramos", 1938));
        repo.adicionar(new Livro("A Hora da Estrela", "Clarice Lispector", 1977));
        repo.adicionar(new Livro("Grande Sertão: Veredas", "Guimarães Rosa", 1956));
        repo.adicionar(new Livro("Memórias Póstumas", "Machado de Assis", 1881));
    }

    public static void carregarEmprestimos(Repositorio<Emprestimo> repo,
                                           Repositorio<Pessoa> pessoas,
                                           Repositorio<Livro> livros) {
        String[] datas = {"05/11/2026", "06/11/2026", "07/11/2026", "08/11/2026",
                          "09/11/2026", "10/11/2026", "11/11/2026"};

        for (int i = 1; i <= 7; i++) {
            Pessoa p = pessoas.buscarPorId(i);
            Livro l = livros.buscarPorId(i);
            repo.adicionar(new Emprestimo(p, l, datas[i - 1]));
            l.setDisponivel(false);
        }
    }
}
