package aula12_B;

public class Jornal extends Publicacao implements Periodic
{

    private Period periodicidade;
    private Ver    cor;

    public Jornal(String titulo, Ver cor)
    {
        super(titulo);
        this.cor = cor;
    }

    public Jornal(String titulo)
    {
        super(titulo);
    }

    public Ver getCor()
    {
        return cor;
    }

    public void setCor(Ver cor)
    {
        this.cor = cor;
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
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
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
        Jornal other = (Jornal) obj;
        if (cor != other.cor)
            return false;
        if (periodicidade != other.periodicidade)
            return false;
        return true;
    }

}
