//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //Add Operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);//O(1)

        list.add(1,8);//O(n)
        System.out.print(list + " ");
        System.out.println();
        System.out.println(list.size());

        //get operation
        int element = list.get(2);
        System.out.println(element + " ");

        //remove operation
        list.remove(2);
        System.out.print(list + " ");

        //set operation
        list.set(2,10);
        System.out.print(list + " ");

        //contains operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


    }
}