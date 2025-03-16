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
        int target=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(target==arr[i]){
                System.out.print(i);
                c++;
                break;
            }
        
        }
        if(c==0||n==0){
            System.out.print("false");
        }
        
            
    }
}