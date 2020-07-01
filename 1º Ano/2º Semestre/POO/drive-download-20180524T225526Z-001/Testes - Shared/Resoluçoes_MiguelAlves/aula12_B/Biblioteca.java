package aula12_B;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Biblioteca
{
    private String nome;
    private String endereco;

    private Set<Publicacao> publicacoes;

    public Biblioteca(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.publicacoes = new HashSet<>();
    }

    public Set<Publicacao> getPublicacoes()
    {
        return publicacoes;
    }

    public void setPublicacoes(Set<Publicacao> sp)
    {
        this.publicacoes = sp;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getNome()
    {
        return nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void add(Publicacao p)
    {
        this.publicacoes.add(p);
    }

    public void sortPublicacoes()
    {
        this.publicacoes = new TreeSet<>(this.publicacoes);
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((publicacoes == null) ? 0 : publicacoes.hashCode());
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
        Biblioteca other = (Biblioteca) obj;
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
        if (publicacoes == null)
        {
            if (other.publicacoes != null)
                return false;
        }
        else if (!publicacoes.equals(other.publicacoes))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        publicacoes.forEach(p -> sb.append(p.toString() + "\n"));
        return sb.toString();
    }

}
