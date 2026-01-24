package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        SingleDeletions s = new SingleDeletions();
        DoubleLL dl = new DoubleLL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);


//        list.insertLast(6);
//        list.insertLast(7);
//        list.insertLast(8);
//        list.insert(6,1);
//        int p = list.get(1);
//        list.display();
//        System.out.println("p = " + p);
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());

//        list.reverse(list.getHead());
//        list.display();

        dl.insertFirst(1);
        dl.insertFirst(2);
        dl.insertFirst(3);
        dl.insertLast(4);
        dl.display();
        dl.reverse();
    }
}
