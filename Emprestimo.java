public class Emprestimo implements Exportavel {
    private int id;
    private Pessoa pessoa;
    private Livro livro;
    private String dataEmprestimo;
    private boolean devolvido;

    public Emprestimo(Pessoa pessoa, Livro livro, String dataEmprestimo) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.devolvido = false;
    }

    @Override public int getId() { return id; }
    @Override public void setId(int id) { this.id = id; }
    public Pessoa getPessoa() { return pessoa; }
    public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
    public Livro getLivro() { return livro; }
    public void setLivro(Livro livro) { this.livro = livro; }
    public String getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(String dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }
    public boolean isDevolvido() { return devolvido; }
    public void setDevolvido(boolean devolvido) { this.devolvido = devolvido; }

    public void devolver() {
        this.devolvido = true;
        this.livro.setDisponivel(true);
    }

    @Override
    public String paraLinhaTabela() {
        return String.format("%-4d | %-22s | %-30s | %-10s | %-10s",
                id, pessoa.getNome(), livro.getTitulo(), dataEmprestimo,
                devolvido ? "Devolvido" : "Em aberto");
    }
}
