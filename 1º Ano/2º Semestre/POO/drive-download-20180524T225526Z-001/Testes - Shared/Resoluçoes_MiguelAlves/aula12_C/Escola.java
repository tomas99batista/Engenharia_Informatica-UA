package aula12_C;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Escola
{
    private String     nome;
    private String     endereco;
    private Set<Teste> testes;

    public Escola(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.testes = new HashSet<>();
    }

    public Set<Teste> getTestes()
    {
        return testes;
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

    // Nota:
    // Talvez não a melhor solução
    public Set<LimiteCorrecao> sortLimiteCorrecao()
    {
        Set<LimiteCorrecao> testes2 = new TreeSet<>();
        testes.forEach(t ->
        {
            if (t instanceof LimiteCorrecao)
                testes2.add((LimiteCorrecao) t);
        });
        return testes2;
    }

    public void add(Teste t)
    {
        testes.add(t);
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((testes == null) ? 0 : testes.hashCode());
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
        Escola other = (Escola) obj;
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
        if (testes == null)
        {
            if (other.testes != null)
                return false;
        }
        else if (!testes.equals(other.testes))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        testes.forEach(s -> sb.append(s.toString() + "\n"));
        return String.format("%s, %s\n%s", nome, endereco, sb.toString());
    }
}
