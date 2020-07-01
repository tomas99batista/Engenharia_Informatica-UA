package aula12_A;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Cruzeiro
{
    private String       nome;
    private List<String> cidades;
    private String       data;
    private Set<Cabine>  cabines;
    private int          duracao;

    public Cruzeiro(String nome, String[] cidades, String data)
    {
        this.nome = nome;
        // Por conveniencia do .toString()
        this.cidades = Arrays.asList(cidades);
        this.data = data;
        this.cabines = new TreeSet<>();
    }

    public void setDuracao(int duracao)
    {
        this.duracao = duracao;
    }

    public void add(Cabine cabine)
    {
        cabines.add(cabine);
    }

    public String getNome()
    {
        return nome;
    }

    public List<String> getCidades()
    {
        return cidades;
    }

    public int getDuracao()
    {
        return duracao;
    }

    public String getData()
    {
        return data;
    }

    public Set<Cabine> getCabines()
    {
        return cabines;
    }

    public void setCabines(Set<Cabine> cabines)
    {
        this.cabines = cabines;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cabines == null) ? 0 : cabines.hashCode());
        result = prime * result + ((cidades == null) ? 0 : cidades.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + duracao;
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
        Cruzeiro other = (Cruzeiro) obj;
        if (cabines == null)
        {
            if (other.cabines != null)
                return false;
        }
        else if (!cabines.equals(other.cabines))
            return false;
        if (cidades == null)
        {
            if (other.cidades != null)
                return false;
        }
        else if (!cidades.equals(other.cidades))
            return false;
        if (data == null)
        {
            if (other.data != null)
                return false;
        }
        else if (!data.equals(other.data))
            return false;
        if (duracao != other.duracao)
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
        String f_name = String.format("Navio %s, partida em %s", nome, data);
        sb.append(f_name + "\n");
        String f_it = "Itinerário: " + cidades.toString();
        sb.append(f_it + "\n");

        cabines.forEach(s -> sb.append((s.toString()) + "\n"));
        return sb.toString();
    }

}
