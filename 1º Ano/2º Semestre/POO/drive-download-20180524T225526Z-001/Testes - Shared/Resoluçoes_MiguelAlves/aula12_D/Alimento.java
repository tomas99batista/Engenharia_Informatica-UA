package aula12_D;

public abstract class Alimento
{

    private String nome;
    private double preco;
    private int    calorias;
    private String data;

    public Alimento(String nome, double preco, int calorias, String data)
    {
        this.nome = nome;
        this.preco = preco;
        this.calorias = calorias;
        this.data = data;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public int getCalorias()
    {
        return calorias;
    }

    public void setCalorias(int calorias)
    {
        this.calorias = calorias;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + calorias;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        long temp;
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Alimento other = (Alimento) obj;
        if (calorias != other.calorias)
            return false;
        if (data == null)
        {
            if (other.data != null)
                return false;
        }
        else if (!data.equals(other.data))
            return false;
        if (nome == null)
        {
            if (other.nome != null)
                return false;
        }
        else if (!nome.equals(other.nome))
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return String.format("%-30s %-2.2f %-3d %-14s", nome, preco, calorias, data);
    }

}
