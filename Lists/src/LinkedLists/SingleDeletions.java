package LinkedLists;

public class SingleDeletions {
    private SNode head;
    private SNode tail;
    private int size;

    public SingleDeletions() {
        this.size = 0;
    }

    public int deleteFirst(SNode head){
        int val = head.value;
        if(head == null){
//            return;
            tail = null;
        }
//        SNode temp = head;
        head = head.next;
        return val;
    }




    public void display(){
        SNode temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class SNode{
        //Values required
        private int value;
        private SNode next;

        //Constructors
        public SNode(int value) {
            this.value = value;
        }

        public SNode(int value, SNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
