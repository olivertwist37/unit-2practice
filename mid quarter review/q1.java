import java.util.Scanner;
import java.lang.Math;

public class q1{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int Total=0;
        for(int i=0;i<1000;i++){
            if (i%3==0||i%5==0){
               Total=Total+i; 
            }
        }
        System.out.println("answer"+Total);
    }


}
