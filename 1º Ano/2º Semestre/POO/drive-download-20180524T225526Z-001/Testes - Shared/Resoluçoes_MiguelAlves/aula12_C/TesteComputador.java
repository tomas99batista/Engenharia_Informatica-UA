package aula12_C;

public class TesteComputador extends Teste implements LimiteCorrecao
{

    private String link;
    private int    prazo;

    public TesteComputador(String nome, String professor, String data, String salas)
    {
        super(nome, professor, data, salas);
    }

    public String getLink()
    {
        return link;
    }

    public void setLink(String link)
    {
        this.link = link;
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

}
