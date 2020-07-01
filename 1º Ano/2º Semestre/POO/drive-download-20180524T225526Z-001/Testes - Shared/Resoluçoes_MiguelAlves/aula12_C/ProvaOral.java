package aula12_C;

public class ProvaOral extends Teste
{

    Lingua lingua = Lingua.UK;

    public ProvaOral(String nome, String professor, String data, String salas, Lingua lingua)
    {
        super(nome, professor, data, salas);
        this.lingua = lingua;
    }

    public ProvaOral(String nome, String professor, String data, String salas)
    {
        super(nome, professor, data, salas);
    }

    public Lingua getLingua()
    {
        return lingua;
    }

    public void setLingua(Lingua lingua)
    {
        this.lingua = lingua;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((lingua == null) ? 0 : lingua.hashCode());
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
        ProvaOral other = (ProvaOral) obj;
        if (lingua != other.lingua)
            return false;
        return true;
    }

}
