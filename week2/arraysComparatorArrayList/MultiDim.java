package week2.arraysComparatorArrayList;

public class MultiDim {

    public void array(){

        int[][] matrix = {{1,2},{3,4}};

        for(int i =0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
