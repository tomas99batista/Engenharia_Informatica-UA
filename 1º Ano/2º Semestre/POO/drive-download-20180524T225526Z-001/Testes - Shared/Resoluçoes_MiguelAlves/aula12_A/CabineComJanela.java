package aula12_A;

public class CabineComJanela extends Cabine implements PacoteExtra
{
    private TipoDeJanela tipo;
    private Extra        extra;

    public CabineComJanela(int numero, int capacidade, TipoDeJanela tipo)
    {
        super(numero, capacidade);
        this.tipo = tipo;
    }

    public CabineComJanela(int numero, int capacidade, TipoDeJanela tipo, String[] ocupantes)
    {
        super(numero, capacidade, ocupantes);
        this.tipo = tipo;
    }

    @Override
    public void pacoteExtra(Extra extra)
    {
        this.extra = extra;
    }

    @Override
    public Extra getExtra()
    {
        return extra;
    }

    public TipoDeJanela getTipo()
    {
        return tipo;
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
        CabineComJanela other = (CabineComJanela) obj;
        if (extra != other.extra)
            return false;
        if (tipo != other.tipo)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return String.format("Cabine com Janela %-8s %s %s",
                             tipo,
                             extra == null ? "" : extra + " Extra",
                             super.toString());
    }
}
