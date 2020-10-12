/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;
public class HR5 { // HR5 means Person class
    private int age;	
  
    public HR5(int initialAge) {
        if(initialAge < 0){ // initial age is invalid
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else{ // set age to valid initial age
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Set correct statement to print
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
  		// Increment this person's age.
        this.age++;
    }
    
}
