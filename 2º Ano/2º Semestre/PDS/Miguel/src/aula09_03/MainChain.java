package aula09_03;

import java.util.Random;

public class MainChain {

    public static void main(String[] args) {
        /* Uma implementação do Chain of responsability pode ser aplicada
         * Ao balanceamento de carga de uma rede
         * Se considerarmos cada nó como um "handler"
         * facilmente vemos  que a capacidade de "processar" é
         * determinada pela quantidade de pedidos na rede (de forma assim, a distribuir a carga)
         *
         * Por questões de simplicidade de implementação, vamos simplesmente ter
         * vários nós de processamento em que sempre que é
         * feito um pedido, vemos se o número desse pedido é menor ao valor máximo (passado no construtor como argumento
         */
        NetworkNode a = new NetworkNode(10);
        NetworkNode b = new NetworkNode(20);
        NetworkNode c = new NetworkNode(30);

        a.register(b);
        b.register(c);

        Random r = new Random();
        // simulamos os pedidos
        for (int i = 0; i < 30; i++) {
            a.processRequest(r.nextInt(40));
        }
        System.out.println("Nota: Os pedidos que não forem válidos serão ignorados");
        System.out.println("Node A : \n" + a);
        System.out.println("Node B : \n" + b);
        System.out.println("Node C : \n" + c);


    }
}
