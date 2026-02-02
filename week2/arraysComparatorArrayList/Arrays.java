package week2.arraysComparatorArrayList;

public class Arrays {

    public void arrayBasic(){
        int[] arr = {10,20,30,40,50};

        System.out.println("First element: "+ arr[0]);
        System.out.println("Second Element: "+arr[2]);

        for (int a : arr){
            System.out.println(a);
        }

        System.out.println("priniting with index values");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" "+i);
        }
    }
}
