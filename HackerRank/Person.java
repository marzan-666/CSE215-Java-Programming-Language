package HackerRank;

import java.util.Scanner;

public class Person {
    private int age ;
    public Person(int initialAge){
      if(initialAge<0){
          System.out.println("Age is not valid, setting age to 0.");
          this.age=0;
      }
      else{
          this.age=initialAge;
      }
    }
   
    public void amIOld(){
        String result= "";
        if(age>=18){
            result="You are old.";
        }
        else if(age>=13){
            result="You are a teenager.";
        }
        else{
            result="You are young.";
        }
        System.out.println(result);
        
    }
     public void yearPasses(){
        this.age++;
    }
     	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		int T = f.nextInt();
		for (int i = 0; i < T; i++) {
			int age = f.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		f.close();
    }
}

/*public class Person {
    private int age;	
    public Person(int initialAge) {
        if(initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else{
            this.age = initialAge;
        }
    }
    public void amIOld() {
        String result = "";
        if(age >= 18){
            result = "You are old.";
        }
        else if(age >=13){
            result = "You are a teenager.";
        }
        else{
            result = "You are young.";
        }
        System.out.println(result);
    }

    public void yearPasses() {
        this.age++;
    }*/