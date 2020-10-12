package bmi;
 class Bmi {

    public static void main(String[] args) {
        BodyMassIndex p1=new BodyMassIndex("karim",20,1.70,60);
        BodyMassIndex p2=new BodyMassIndex("rahim" , 19, 1.75 , 78);
        
        //System.out.println(p1.getStatus());
        //System.out.println(p2.getStatus());
        //System.out.println(p1.getBMI());
        System.out.printf(p2.getStatus()); 
        System.out.printf("%.1f %s %n" ,p2.getBMI(),p2.getStatus());
    }
    
}
