package aula07_03;

public class MainBlocos {

    public static void main(String[] args) {
        Bloco principal = new Bloco("Main");
        Bloco top       = new Bloco("Top");
        Bloco bot       = new Bloco("Bottom");
        top.add(new Rectangulo("jogo"));
        principal.add(top);
        principal.add(bot);
        bot.add(new Circulo("rosa"));
        bot.add(new Quadrado("verde"));
        Bloco outraArea =new Bloco("Outra área");
        top.add(outraArea);
        outraArea.add(new Circulo("laranja"));
        principal.draw();
    }
}
