import java.lang.reflect.Array;
import java.util.ArrayList;

public class linearSearch {
    boolean recursion(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || recursion(arr,target,index+1);
    }

    int integer_ret(int[] arr,int target,int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return integer_ret(arr, target, index + 1);
        }
    }

    int integer_ret_fromLast(int[] arr,int target,int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return integer_ret_fromLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    void multiple_occurances(int[] arr, int target, int index) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            //return index;
            list.add(index);
        }
        multiple_occurances(arr, target, index + 1);

    }
}
