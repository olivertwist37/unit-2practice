import java.util.Scanner;
import java.lang.Math;
public class q3{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int TotalSquareSum=0;
        int TotalSumSquare=0;
        int answer=0;
        for(int i=0;i<=100;i++){
         TotalSumSquare=TotalSumSquare+i*i;
         TotalSquareSum=TotalSquareSum+i;
        }
        TotalSquareSum=TotalSquareSum*TotalSquareSum;
        answer=TotalSquareSum-TotalSumSquare;
        System.out.println("answer; "+answer);
    }
}
