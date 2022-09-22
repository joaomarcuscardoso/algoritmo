public class ClienteLinkedList {
    private int code;
    private String name;
    private ClienteLinkedList prox = null;

    private ClienteLinkedList ant = null;

    public ClienteLinkedList(int cod, String name) {
        this.code = cod;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}