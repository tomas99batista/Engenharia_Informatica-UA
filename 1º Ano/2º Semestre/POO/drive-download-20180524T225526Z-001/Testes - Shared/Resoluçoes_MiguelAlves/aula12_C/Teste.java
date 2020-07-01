package aula12_C;

// import java.util.List;

public abstract class Teste implements Comparable<Teste>
{
    /*
     * razão para ser abstracta é por exclusão de partes.
     * Se estamos a especificar o exame escrito, a prova oral e teste
     * computadores, provavelmetne o único que faltaria (em qualquer disciplina
     * seria o prático, ex: música) ou então estilo pop quiz a meio da aula
     * Daí que não faz sentido termos apenas "teste".
     */

    private String nome;
    private String professor;
    private String data;
    // laziness
    private String salas;

    public Teste(String nome, String professor, String data, String salas)
    {
        this.nome = nome;
        this.professor = professor;
        this.data = data;
        this.salas = salas;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getProfessor()
    {
        return professor;
    }

    public void setProfessor(String responsavel)
    {
        this.professor = responsavel;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public String getSalas()
    {
        return salas;
    }

    public void setSalas(String salas)
    {
        this.salas = salas;
    }

    @Override
    public int compareTo(Teste t)
    {
        return nome.compareTo(t.nome);
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((professor == null) ? 0 : professor.hashCode());
        result = prime * result + ((salas == null) ? 0 : salas.hashCode());
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
        Teste other = (Teste) obj;
        if (data == null)
        {
            if (other.data != null)
                return false;
        }
        else if (!data.equals(other.data))
            return false;
        if (nome == null)
        {
            if (other.nome != null)
                return false;
        }
        else if (!nome.equals(other.nome))
            return false;
        if (professor == null)
        {
            if (other.professor != null)
                return false;
        }
        else if (!professor.equals(other.professor))
            return false;
        if (salas == null)
        {
            if (other.salas != null)
                return false;
        }
        else if (!salas.equals(other.salas))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return String.format("%-20s %-20s %-14s %-6s", nome, professor, data, salas);
    }

}
