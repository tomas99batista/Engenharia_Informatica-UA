package aula12_D;

public class Cereal extends Alimento
{
    private TIPO_CEREAL comp;

    public Cereal(String nome, double preco, int calorias, String data)
    {
        super(nome, preco, calorias, data);
    }

    public void setComp(TIPO_CEREAL comp)
    {
        this.comp = comp;
    }

    public TIPO_CEREAL getComp()
    {
        return comp;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((comp == null) ? 0 : comp.hashCode());
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
        Cereal other = (Cereal) obj;
        if (comp != other.comp)
            return false;
        return true;
    }

}
