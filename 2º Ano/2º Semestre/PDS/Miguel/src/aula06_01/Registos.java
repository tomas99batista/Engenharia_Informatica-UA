package aula06_01;
import java.util.ArrayList;
import java.util.List;


// Petiscos
class Registos {
    // Data elements
    private ArrayList<Empregado> empregados; // Stores the employees

    public Registos() {
        empregados = new ArrayList<>();
    }

    /**
     * Insere um Empregado na base de dados
     *
     * @param emp o Empregado a adicionar
     */
    public void insere(Empregado emp) {
        if (!empregados.contains(emp)) {
            empregados.add(emp);
        }
    }

    /**
     * Remove um Empregado da base de dados
     *
     * @param codigo o codigo do Empregado a remover
     */
    public void remove(int codigo) {
        Empregado empToRemove = null;
        for (Empregado emp :
                empregados) {
            if (emp.codigo() == codigo) {
                empToRemove = emp;
                break;
            }
        }
        if (empToRemove != null) {
            empregados.remove(empToRemove);
        }
    }

    /**
     * Verifica se um Empregado se encontra na base de dados
     *
     * @param codigo o codigo do Empregado
     * @return True se o empregado estiver na base de dados
     */
    public boolean isEmpregado(int codigo) {
        for (Empregado emp :
                empregados) {
            if (emp.codigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    /**
     * Devolve a lista dos Empregados
     *
     * @return a lista dos Empregados
     */
    public List<Empregado> listaDeEmpregados() {
        return empregados;
    }
}