
public class ReturnPrintGrade {
    public static char PrintGrade(double score){
        if(score>=90.0){
            return 'A';
        }
        else if(score>=80.0){
            return 'B';
        }
        else if(score>=70.0){
            return 'C';
        }
        else if(score>=60.0){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        System.out.println("The grade is "+PrintGrade(90.0));
        System.out.println("The grade is "+PrintGrade(80.0));
    }
    
}
