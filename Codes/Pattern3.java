public class Pattern3 {
    public static void main(String[] args) {
        int i , j ;
        for (i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                if(i==1||i==4||j==1||j==4){
                System.out.print("*"); 
            }
                else 
                    System.out.print(" ");
        }
            System.out.println();
}
    
}
}
