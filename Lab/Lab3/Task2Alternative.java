import java.util.Scanner ;
public class Task2Alternative {
    public static void main(String[] args) {
        /*Scanner input = new Scanner (System.in) ;
        System.out.println("Enter a number: ");
        int n = input.nextInt();*/
        for (int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
