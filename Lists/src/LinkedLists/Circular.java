package LinkedLists;

public class Circular {
    private Node head;
    private Node tail;
    private int size;

    public Circular(){
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
        DoubleLL.Node temp = head;

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
        size++;
    }

    //Insert at position
    public void insert(int val,int index){
        if(head == null){ //index == 0
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }

        //Node node = new Node(val);
        Node node = new Node(val,temp.next,temp);
        //node.next = temp.next;
        node.next.prev = node;
        temp.next = node;


        size++;

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
        private DoubleLL.Node next;
        private DoubleLL.Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, DoubleLL.Node next, DoubleLL.Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
