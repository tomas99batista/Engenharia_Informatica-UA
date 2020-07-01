package aula09_03;

import java.util.ArrayList;
import java.util.List;

public class NetworkNode {
    // Os nosso pedidos
    private List<Integer> requests;
    private int           maxValue;
    // O próximo nó
    private NetworkNode   nextNode;

    public NetworkNode(int maxValue) {
        this.maxValue = maxValue;
        requests = new ArrayList<>();
    }

    public void register(NetworkNode node) {
        nextNode = node;
    }

    public void processRequest(int requestNumber) {
        // aceitamos sempre o pedido se não tivermos muitos pedidos
        if (canHandleRequest(requestNumber)) {
            requests.add(requestNumber);
        }
        // senão, passamos ao restante nó
        else {
            // ignoramos se for nulo
            if (nextNode != null) {
                nextNode.processRequest(requestNumber);
            }
        }
    }

    private boolean canHandleRequest(int requestNumber) {
        // só aceitamos o pedido se for menor do que o valor máximo
        return requestNumber <= maxValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Requests: ");
        sb.append(requests.toString());
        return sb.toString();
    }
}
