package aula12_A;

import java.util.Arrays;
import java.util.List;

public abstract class Cabine implements Comparable<Cabine>
{
    private int          numero;
    private int          capacidade;
    private List<String> ocupantes;

    public Cabine(int numero, int capacidade)
    {

        this.numero = numero;
        this.capacidade = capacidade;
    }

    public Cabine(int numero, int capacidade, String[] ocupantes)
    {

        this.numero = numero;
        this.capacidade = capacidade;
        this.ocupantes = Arrays.asList(ocupantes);
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void setCapacidade(int capacidade)
    {
        this.capacidade = capacidade;
    }

    public void setPassageiros(String[] ocupantes)
    {
        if (ocupantes.length > capacidade)
            throw new IllegalArgumentException();
        else
            this.ocupantes = Arrays.asList(ocupantes);
    }

    public int getNumero()
    {
        return numero;
    }

    public int getCapacidade()
    {
        return capacidade;
    }

    public void setMaxOcupantes(int i)
    {
        capacidade = i;
    }

    public List<String> getOcupantes()
    {
        return ocupantes;
    }

    @Override
    public int compareTo(Cabine c1)
    {
        if (numero < c1.numero)
            return -1;
        if (numero > c1.numero)
            return 1;
        return 0;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + capacidade;
        result = prime * result + numero;
        result = prime * result + ((ocupantes == null) ? 0 : ocupantes.hashCode());
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
        Cabine other = (Cabine) obj;
        if (capacidade != other.capacidade)
            return false;
        if (numero != other.numero)
            return false;
        if (ocupantes == null)
        {
            if (other.ocupantes != null)
                return false;
        }
        else if (!ocupantes.equals(other.ocupantes))
            return false;
        return true;
    }

    @Override
    public String toString()
    {

        return String.format("[ Nº %-3d ( max %2d pessoas) : %s ]",
                             numero,
                             capacidade,
                             ocupantes == null ? "Disponível para venda!" : ocupantes);
    }

}
