// You are using Java
import java.util.*;
class ElementExistOrNot{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(target==ar[i]){
                count=1;
                System.out.println("Element exists in the array.");
                return;
            }
        }
        if(count==0){
            System.out.println("Element does not exist in the array.");
        }
        
    }
}