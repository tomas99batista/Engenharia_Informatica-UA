package aula12_D;

import java.util.HashSet;
import java.util.Set;

public class LojaAlimentar
{

    private String        nome;
    private String        endereco;
    private Set<Alimento> alimentos;

    public LojaAlimentar(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.alimentos = new HashSet<>();
    }

    public void setAlimentos(Set<Alimento> alimentos)
    {
        this.alimentos = alimentos;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public void add(Alimento a)
    {
        alimentos.add(a);
    }

    public Set<Alimento> getAlimentos()
    {
        return alimentos;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alimentos == null) ? 0 : alimentos.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LojaAlimentar other = (LojaAlimentar) obj;
        if (alimentos == null)
        {
            if (other.alimentos != null)
                return false;
        }
        else if (!alimentos.equals(other.alimentos))
            return false;
        if (endereco == null)
        {
            if (other.endereco != null)
                return false;
        }
        else if (!endereco.equals(other.endereco))
            return false;
        if (nome == null)
        {
            if (other.nome != null)
                return false;
        }
        else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        alimentos.forEach(s -> sb.append(s.toString() + "\n"));
        return String.format("%s, %s\n%s", nome, endereco, sb.toString());
    }
}
