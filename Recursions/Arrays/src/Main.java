//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        sortedArray s = new sortedArray();
//        int[] nums = {1,2,99,4,5,32,90};
//        System.out.println(s.bruteForce(nums));
//        System.out.println(s.rec(nums,0));

        linearSearch l = new linearSearch();
        int[] nums = {1,2,3,3,4,5,3,6};
        l.multiple_occurances(nums,3,0);
        System.out.println(linearSearch.list);
    }
}