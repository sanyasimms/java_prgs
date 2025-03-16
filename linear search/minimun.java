// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int min=0;
        for(int i=1;i<5;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        
        }
        
            System.out.print(arr[min]);
        
        
            
    }
}