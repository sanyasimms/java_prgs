package selection_sort;

import java.util.*;


class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int []arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
           int last=n-1-i;
           int max=0;
           for(int j=1;j<=last;j++){
               if(arr[max]<arr[j]){
                   max=j;
               }
           }
           int temp=arr[last];
           arr[last]=arr[max];
           arr[max]=temp;
           
       }
       System.out.print(Arrays.toString(arr));
    }
}