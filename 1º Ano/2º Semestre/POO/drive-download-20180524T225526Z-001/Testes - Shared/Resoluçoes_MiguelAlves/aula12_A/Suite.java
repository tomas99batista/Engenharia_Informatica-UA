package aula12_A;

public class Suite extends Cabine
{
    private int quartos;

    public Suite(int numero, int capacidade)
    {
        super(numero, capacidade);
    }

    public void setNumQuartos(int quartos)
    {
        this.quartos = quartos;
    }

    @Override
    public String toString()
    {
        return String.format("Suite c/%d quartos %s", quartos, super.toString());
    }

    public int getQuartos()
    {
        return quartos;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + quartos;
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
        Suite other = (Suite) obj;
        if (quartos != other.quartos)
            return false;
        return true;
    }

}
