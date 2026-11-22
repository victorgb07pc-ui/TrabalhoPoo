import java.util.ArrayList;
import java.util.List;

public class RepositorioEmMemoria<T extends Exportavel> implements Repositorio<T> {
    private ArrayList<T> itens = new ArrayList<>();
    private int proximoId = 1;

    @Override
    public void adicionar(T item) {
        item.setId(proximoId);
        proximoId++;
        itens.add(item);
    }

    @Override
    public boolean remover(int id) {
        T item = buscarPorId(id);
        if (item == null) return false;
        itens.remove(item);
        return true;
    }

    @Override
    public T buscarPorId(int id) {
        for (T item : itens) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(itens);
    }
}
