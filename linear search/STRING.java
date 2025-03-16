// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        int p=0;
        for(int i=0;i<s.length();i++){
            if(c==s.charAt(i)){
                System.out.print("true");
                p++;
                break;
            }
            
        }
        if(p==0||s.length()==0){
            System.out.print("FAlse");
        }
        
            
    }
}