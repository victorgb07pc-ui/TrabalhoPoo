public class Livro implements Exportavel {
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    @Override public int getId() { return id; }
    @Override public void setId(int id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    @Override
    public String paraLinhaTabela() {
        return String.format("%-4d | %-30s | %-22s | %-6d | %-10s",
                id, titulo, autor, anoPublicacao, disponivel ? "Sim" : "Não");
    }
}
