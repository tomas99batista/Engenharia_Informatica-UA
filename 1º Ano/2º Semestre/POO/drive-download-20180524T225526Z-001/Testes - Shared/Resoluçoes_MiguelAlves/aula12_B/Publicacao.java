package aula12_B;

public abstract class Publicacao implements Comparable<Publicacao>
{
    private String titulo;

    private String editora;

    public Publicacao(String titulo)
    {
        this.titulo = titulo;
    }

    public Publicacao(String titulo, String editora)
    {
        this.titulo = titulo;
        this.editora = editora;
    }

    public String getEditora()
    {
        return editora;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setEditora(String editora)
    {
        this.editora = editora;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(Publicacao p)
    {
        return titulo.compareTo(p.titulo);
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((editora == null) ? 0 : editora.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
        Publicacao other = (Publicacao) obj;
        if (editora == null)
        {
            if (other.editora != null)
                return false;
        }
        else if (!editora.equals(other.editora))
            return false;
        if (titulo == null)
        {
            if (other.titulo != null)
                return false;
        }
        else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return String.format("%-20s %-20s", titulo, editora == null ? "" : editora);
    }
}
