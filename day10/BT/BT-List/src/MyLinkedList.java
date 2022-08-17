import java.util.Collection;
import java.util.LinkedList;

public class MyLinkedList<E> extends LinkedList<E> {
    private  Node head;
    private  int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public MyLinkedList() {
    }

    public MyLinkedList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public void addFirst(E e) {
        super.addFirst(e);
    }

    @Override
    public void addLast(E e) {
        super.addLast(e);
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public void add(int index, E element) {
        super.add(index, element);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public E remove() {
        return super.remove();
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    @Override
    public E getFirst() {
        return super.getFirst();
    }

    @Override
    public E getLast() {
        return super.getLast();
    }

    @Override
    public E get(int index) {
        return super.get(index);
    }
}