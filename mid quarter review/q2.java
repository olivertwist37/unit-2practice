import java.util.Scanner;
import java.lang.Math;

public class q2{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int Total=2;
        int n1=1;
        int n2=2;
        int nn=n1+n2;
        for(int i=0;i<1;i++){
             if (n1>=400000){
            }else{
                i--;
            }
            for (int t=0;t<3;t++){
                n1=nn;
                nn=n2;
                n2=n1;
                n1=nn;
                nn=n1+n2; 
            }
            if(n1%2==0){
                Total=Total+n1;
            }
            if(n2%2==0){
                Total=Total+n2;
            }
            if(nn%2==0){
                Total=Total+nn;
            }
           
        }
        System.out.println("answer"+Total);
    }

}
