package lab4;
import java.util.Scanner ;
public class Task4V2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int i;
        for ( i = 0; i <n; i++) {
            arr[i]=s.nextInt();
            }

        
            for (int j = 0; j <n; j++) {
                
       
            
            if(arr[j]==arr[j+1]&&arr[i]==arr[j+2]){
                System.out.println(arr[j]);
            }

        }
    }
        
    }
    


