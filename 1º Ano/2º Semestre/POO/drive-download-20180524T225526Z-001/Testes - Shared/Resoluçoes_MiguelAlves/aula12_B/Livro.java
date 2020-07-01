package aula12_B;

import java.util.Arrays;
import java.util.List;

public class Livro extends Publicacao
{

    private List<String> autores;
    private String       isbn;

    public List<String> getAutores()
    {
        return autores;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public Livro(String titulo, String editora, String autores)
    {
        super(titulo, editora);
        this.autores = Arrays.asList(autores.split(";"));

    }

    public Livro(String titulo, String editora, String autores, String isbn)
    {
        super(titulo, editora);
        this.autores = Arrays.asList(autores.split(";"));
        this.isbn = isbn;
    }

    @Override
    public String toString()
    {
        String a = autores == null || autores.size() == 0 ? "" : String.join("; ", autores);
        return String.format("%s %-20s %-13s", super.toString(), a, isbn == null ? "n/a" : isbn);
    }

    public void setAutores(List<String> autores)
    {
        this.autores = autores;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((autores == null) ? 0 : autores.hashCode());
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (autores == null)
        {
            if (other.autores != null)
                return false;
        }
        else if (!autores.equals(other.autores))
            return false;
        if (isbn == null)
        {
            if (other.isbn != null)
                return false;
        }
        else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }

}
