public class ClienteSimpleyLinkedList {
    private int code;
    private String name;
    private ClienteSimpleyLinkedList prox = null;

    public ClienteSimpleyLinkedList(int cod, String name) {
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