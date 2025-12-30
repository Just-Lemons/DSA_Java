public class printing {
    public void printDesc(int n){

        if(n==1){
            System.out.print(n);
            return;
        }

        System.out.print(n+ " ");
        printDesc(n-1);
    }

    public void printAsc(int n){

        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        printAsc(n-1);
        System.out.print(n+" ");
    }
}
