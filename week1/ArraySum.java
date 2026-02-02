package week1;

public class ArraySum {

    public void arraySum(){
        int[] arr = {1,2,3};
        int sum =0;

        for (int x : arr){
            sum +=x;
        }

        System.out.println(sum);
    }
}
