package aula12_D;

public class Lacteo extends Refrigerado
{

    private double gordura;

    public Lacteo(String nome, double preco, int calorias, String data)
    {
        super(nome, preco, calorias, data);
    }

    public Lacteo(String nome, double preco, int calorias, String data, double gordura)
    {
        super(nome, preco, calorias, data);
        this.gordura = gordura;
    }

    public void setGordura(double gordura)
    {
        this.gordura = gordura;
    }

    public double getGordura()
    {
        return gordura;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(gordura);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Lacteo other = (Lacteo) obj;
        if (Double.doubleToLongBits(gordura) != Double.doubleToLongBits(other.gordura))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return String.format("%s %-2.2f", super.toString(), gordura);
    }
}
