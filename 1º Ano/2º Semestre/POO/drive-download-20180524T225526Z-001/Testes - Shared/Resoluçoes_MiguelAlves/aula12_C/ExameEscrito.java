package aula12_C;

public class ExameEscrito extends Teste implements LimiteCorrecao
{

    private int     versoes  = 1;
    private boolean consulta = false;
    private int     prazo;

    public ExameEscrito(String nome, String professor, String data, String salas, int versoes)
    {
        super(nome, professor, data, salas);
        this.versoes = versoes;
    }

    public ExameEscrito(String nome, String professor, String data, String salas)
    {
        super(nome, professor, data, salas);
    }

    public int getVersoes()
    {
        return versoes;
    }

    public void setVersoes(int versoes)
    {
        this.versoes = versoes;
    }

    public boolean isConsulta()
    {
        return consulta;
    }

    public void setConsulta(boolean consulta)
    {
        this.consulta = consulta;
    }

    @Override
    public void setPrazo(int prazo)
    {
        this.prazo = prazo;
    }

    @Override
    public int getPrazo()
    {
        return prazo;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (consulta ? 1231 : 1237);
        result = prime * result + prazo;
        result = prime * result + versoes;
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
        ExameEscrito other = (ExameEscrito) obj;
        if (consulta != other.consulta)
            return false;
        if (prazo != other.prazo)
            return false;
        if (versoes != other.versoes)
            return false;
        return true;
    }

}
