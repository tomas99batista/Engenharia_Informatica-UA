package aula12_D;

public class Refrigerado extends Alimento implements Comparable<Refrigerado>
{
    private double tempMin = 3.0;
    private double tempMax = 5.0;

    public Refrigerado(String nome, double preco, int calorias, String data)
    {
        super(nome, preco, calorias, data);
    }

    public void setTemp(double min, double max)
    {
        this.tempMin = min;
        this.tempMax = max;
    }

    public double getTempMax()
    {
        return tempMax;
    }

    public double getTempMin()
    {
        return tempMin;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(tempMax);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tempMin);
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
        Refrigerado other = (Refrigerado) obj;
        if (Double.doubleToLongBits(tempMax) != Double.doubleToLongBits(other.tempMax))
            return false;
        if (Double.doubleToLongBits(tempMin) != Double.doubleToLongBits(other.tempMin))
            return false;
        return true;
    }

    @Override
    public int compareTo(Refrigerado r)
    {
        return getNome().compareTo(r.getNome());
    }

}
