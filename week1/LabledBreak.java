package week1;

public class LabledBreak {
    public void labeledBreak(){
        int i =6;
        outer:
        for (i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==2) break outer;
                System.out.println(i+ " "+j);
            }
        }
    }
}
