package week1;

public class TypeCasting {

    public void implicit (){
        int a = 10;
//        int b = 20;

        int b = a;

        System.out.println(b);

    }

    public void explicit(){
        double a = 23;

        int b = (int)a;
        System.out.println(b);
    }
}
