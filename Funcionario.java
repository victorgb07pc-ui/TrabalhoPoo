public class Funcionario extends Pessoa {
    private String cargo;
    private String setor;

    public Funcionario(String nome, String cpf, String cargo, String setor) {
        super(nome, cpf);
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    @Override public String getTipo() { return "Funcionário"; }
    @Override public int getLimiteEmprestimos() { return 5; }

    @Override
    public String paraLinhaTabela() {
        return super.paraLinhaTabela() + String.format(" | %-10s | %-20s", cargo, setor);
    }
}
