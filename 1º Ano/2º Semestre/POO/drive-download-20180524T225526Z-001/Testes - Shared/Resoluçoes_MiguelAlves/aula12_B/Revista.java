package aula12_B;

public class Revista extends Publicacao implements Periodic
{

    private Period periodicidade;
    private String issn;

    public Revista(String titulo, String editora, String issn)
    {
        super(titulo, editora);
        this.issn = issn;
    }

    public String getIssn()
    {
        return issn;
    }

    @Override
    public String toString()
    {
        return String.format("%s %-13s", super.toString(), issn == null ? "n/a" : issn);
    }

    public void setIssn(String issn)
    {
        this.issn = issn;
    }

    @Override
    public void setPeriodicidade(Period periodicidade)
    {
        this.periodicidade = periodicidade;

    }

    @Override
    public Period getPeriodicidade()
    {
        return periodicidade;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((issn == null) ? 0 : issn.hashCode());
        result = prime * result + ((periodicidade == null) ? 0 : periodicidade.hashCode());
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
        Revista other = (Revista) obj;
        if (issn == null)
        {
            if (other.issn != null)
                return false;
        }
        else if (!issn.equals(other.issn))
            return false;
        if (periodicidade != other.periodicidade)
            return false;
        return true;
    }

}
