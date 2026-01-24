package LinkedLists;

public class DoubleLL {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;

//        if(tail == null){
//            tail = head;
//        }
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node temp = head;

        if(head == null){
            insertFirst(value);
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverse(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            temp = temp.next;
        }

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }



    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
