package P09_Linked_List_Traversal;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList implements Iterable<Node> {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void addFirst(int element){

        Node node = new Node(element);

        if (this.isEmpty()){
            this.tail = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
        }
        this.head = node;

        this.size++;
    }

    public void addLast(int element){
        Node node = new Node(element);

        if (this.isEmpty()){
            this.head = node;
        }else {
            node.prev = this.tail;
            this.tail.next = node;
        }
        this.tail = node;

        this.size++;
    }

    public int removeFirst(){
        if (this.isEmpty()){
            throw new InvalidDnDOperationException("Remove called for collection with size 0");
        }
        int deletedElement = this.head.value;
        this.head = this.head.next;

        if (this.head != null){
            this.head.prev = null;
        }else {
            this.tail = null;
        }

        this.size--;
        return deletedElement;
    }

    public int removeLast(){
        if (this.isEmpty()){
            throw new InvalidDnDOperationException("Remove called for collection with size 0");
        }
        int removedElement = this.tail.value;

        if (this.size == 1){
            this.head = null;
            this.tail = null;
        }else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }

        this.size--;
        return removedElement;
    }

//    public void forEach(Consumer<Integer> consumer){
//        Node currentNode = this.head;
//        while (currentNode != null){
//            consumer.accept(currentNode.value);
//            currentNode = currentNode.next;
//        }
//    }

    public int[] toArray(){
        int[] temp = new int[this.size];

        Node currentNode = this.head;
        int index = 0;
        while (currentNode != null){
            temp[index++] = currentNode.value;
            currentNode = currentNode.next;
        }

        return temp;
    }

    public void addAfter(int searchedNum, int newElement){
        if (this.isEmpty()){
            throw new InvalidDnDOperationException("AddAfter method on empty list");
        }
        Node newNum = new Node(newElement);
        Node currentNode = this.head;
        while (currentNode != null){
            if (currentNode.value == searchedNum){
                newNum.next = currentNode.next;
                newNum.prev = currentNode;

                currentNode.next = newNum;
                newNum.next.prev = newNum;

                this.size++;
                return;
            }
            currentNode = currentNode.next;
        }

        throw new InvalidDnDOperationException("Element not found");
    }

    public void remove(int serchedNum){
        if (this.isEmpty()){
            throw new InvalidDnDOperationException("remove method on empty list");
        }
        Node current = this.head;
        while (current != null){
            if (current.value == serchedNum){
                Node forDeletion = current;

                if (forDeletion.next == null){
                    this.removeLast();
                }else if (forDeletion.prev == null){
                    this.removeFirst();
                }else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;

                    forDeletion.next = null;
                    forDeletion.prev = null;
                    this.size--;
                }

            }
            current = current.next;
        }
    }
    public int removeAfter(int searchedNum){
        if (this.isEmpty()){
            throw new InvalidDnDOperationException("removeAfter method on empty list");
        }

        Node current = this.head;
        while (current != null){
            if (current.value == searchedNum){
                Node forDeletion = current.next;

                if (forDeletion == null){
                    throw new InvalidDnDOperationException("no element after searched element");
                }
                current.next = forDeletion.next;

                if (current.next == null){
                    this.tail = current;
                }else {
                    current.next.prev = current;
                }

                forDeletion.next = null;
                forDeletion.prev = null;

                return forDeletion.value;
            }
            current = current.next;
        }

        throw new InvalidDnDOperationException("Element not found");
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Iterator<Node> iterator() {
        return new Iterator<Node>() {
            Node currentNode = head;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public Node next() {
                Node value = currentNode;
                currentNode = currentNode.next;
                return value;
            }
        };
    }

}
