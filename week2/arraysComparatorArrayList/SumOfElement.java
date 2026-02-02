package week2.arraysComparatorArrayList;

public class SumOfElement {
    public void sumOfElement(){
        int[] arr = new int[3];
        arr[0]=3;
        arr[1]=4;
        arr[2]=5;

        int sum =0;

        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum of the element:"+sum);
    }
}
