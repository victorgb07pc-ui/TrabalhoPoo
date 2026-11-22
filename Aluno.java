public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, String matricula, String curso) {
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override public String getTipo() { return "Aluno"; }
    @Override public int getLimiteEmprestimos() { return 3; }

    @Override
    public String paraLinhaTabela() {
        return super.paraLinhaTabela() + String.format(" | %-10s | %-20s", matricula, curso);
    }
}
