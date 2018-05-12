package org.wojcieszko.lesson01;

public class SLL<T> {

    public class Node<T> {

        public T getData() {
            return data;
        }

        T data;
        Node next;


        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    public SLL() {
        this.head = null;
    }

    public int count() {
        int count = 0;
        Node ref = head;
        while (ref != null) {
            ++count;
            ref = ref.next;
        }
        return count;
    }

    public void append(T newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
        } else {
            Node ref = head;
            while (ref.next != null) {
                ref = ref.next;

            }

            ref.next = newNode;

        }
    }

    public Node find(T data) {
        Node ref = head;

        while (ref != null) {

            if (ref.data.equals(data)) {
                return ref;
            }

            ref = ref.next;
        }
        return null;
    }

    public Node findNth(Integer nth) {
        Node ref = head;
        Integer counter = 0;
        while (ref != null) {
            if (counter == nth) {
                return ref;

            }
            counter++;
            ref = ref.next;
        }
        return null;
    }

    public void insert(T newData, Node item) {
        Node newNode = new Node(newData);

        if (item == null) {
            newNode.next = head;
            head = newNode;
        } else {
            newNode.next = item.next;
            item.next = newNode;
        }
    }

    public void deleteNode(Node item){

        if (item.next == null){
            return;
        }

        if (item == null){
            head = head.next;
            return;
        }


        item.next = item.next.next;





    }

}
