package aula12_A;

public class CabineComVaranda extends Cabine implements PacoteExtra
{
    private TipoDeVaranda tipo;
    private Extra         extra;

    public CabineComVaranda(int numero, int capacidade, TipoDeVaranda tipo)
    {
        super(numero, capacidade);
        this.tipo = tipo;
    }

    public void setTipoVaranda(TipoDeVaranda tipo)
    {
        this.tipo = tipo;
    }

    public TipoDeVaranda getTipo()
    {
        return tipo;
    }

    @Override
    public void pacoteExtra(Extra extra)
    {
        this.extra = extra;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((extra == null) ? 0 : extra.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        CabineComVaranda other = (CabineComVaranda) obj;
        if (extra != other.extra)
            return false;
        if (tipo != other.tipo)
            return false;
        return true;
    }

    @Override
    public Extra getExtra()
    {
        return extra;
    }

    @Override
    public String toString()
    {
        return String.format("Cabine com Varanda %-8s %s %s",
                             tipo,
                             extra == null ? "" : extra + " Extra",
                             super.toString());
    }
}
