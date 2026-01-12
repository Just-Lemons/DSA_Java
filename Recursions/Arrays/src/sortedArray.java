public class sortedArray {
    //Brue force way of checking if an array is sorted
    boolean bruteForce(int[] arr){
        for(int i=0;i<arr.length - 1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    //Using Recursions
    boolean rec(int[] arr,int index){
        //base condition
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && rec(arr,index+1);
    }
}
