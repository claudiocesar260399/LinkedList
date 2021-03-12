package list;

public class Node {
    private int dato;
    private Node Next;
    private Node Previous;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }

    public Node getPrevious() {
        return Previous;
    }

    public void setPrevious(Node previous) {
        Previous = previous;
    }
}
