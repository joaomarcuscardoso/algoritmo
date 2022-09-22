import java.util.Scanner;

public class FilaDoubleLinkedList {
    // HashTable fora da prova
    private static No head = null;

    // enqueue, dequeue, print, main
    public static void enqueue(int value) {
        No aux = new No();

        if(head != null) {
            No last = head;
            while(last.prox != null) {
               last = last.prox;
            }
            // acho ultimo, setar o proximo do ultimo com aux, aux(ant com antigo ultimo, e prox null)
            aux.chave = value;
            aux.prox = null;
            aux.ant = last;
            last.prox = aux;
        } else {
            aux.chave = value;
            aux.prox = null;
            aux.ant = null;
            head = aux;
        }

    }

    public static int dequeue() {
        if(head != null) {
            No aux = head;

            if(head.prox != null) {

            } else {
                head = null;
            }

            return aux.chave;
        }
        return -1;
    }

    public static void print() {
        No aux = head;

        System.out.println("-----------------------");
        if(head != null) {
            System.out.println(head.chave);
            while(aux.prox != null) {
                aux = aux.prox;
                System.out.println(aux.chave);
            }
        }
        System.out.println("-----------------------");
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("**Pilha duplamente encadeada");
        System.out.println("1 - Push, 2- Pop, 3- Imprimir, 4- Sair");

        int opcao = s.nextInt();

        while(opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor da chave");
                    int chave = s.nextInt();
                    enqueue(chave);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcao invalida!!!!");
                    break;
            }

            System.out.println("Pilha duplamente encadeada");
            System.out.println("1 - Push, 2- Pop, 3- Imprimir, 4- Sair");
            opcao = s.nextInt();
        }
    }
}
