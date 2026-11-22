public abstract class Pessoa implements Exportavel {
    private int id;
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override public int getId() { return id; }
    @Override public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public abstract String getTipo();

    public abstract int getLimiteEmprestimos();

    @Override
    public String paraLinhaTabela() {
        return String.format("%-4d | %-12s | %-22s | %-14s", id, getTipo(), nome, cpf);
    }
}
