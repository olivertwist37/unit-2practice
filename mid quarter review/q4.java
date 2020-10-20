import java.util.Scanner;
import java.lang.Math;
public class q4{
    public static void main(String[] args){
        
        for(int a=1;a<1000;a++){
        
           for(int b=1; b<1000;b++){
            
              for(int c=1; c<1000;c++){
                 checkSet(a,b,c);
                  
                }
                
            }
            
        }
    }
    public static void checkSet(int a,int b,int c){
        if (a*a+b*b==c*c&&a+b+c==1000&&a<b&&b<c){
           System.out.println("a="+a+" b="+b+" c="+c);
           
        }else{
           
        }
    }
}