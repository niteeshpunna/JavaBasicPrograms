package JavaBasicPrograms;

import java.util.Scanner;

public class EvenFactors {
	 public static void main(String[] args) {
	
	 Scanner obj = new Scanner(System.in);
     int n = obj.nextInt();
     boolean exist = false;
     for(int i=2; i<=n; i+=2){
     
         if(n%i == 0){
             if(i==n){
                 System.out.print(i);
             }else{
             System.out.print(i+" ");
             }
             exist = true;
         }
     }
     if(exist == false){
         System.out.print("-1");
     }
}
}
