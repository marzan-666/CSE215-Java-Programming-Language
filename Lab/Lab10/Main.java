package Lab10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Main {
    static int index=0;
    public static void main(String[] args) {
        Plant[] plants = new Plant[10]; 
        Plant p1=new Plant("money","grey");
        Flower f1=new Flower("Mumu","white",true,true);
        Plant p2=new Flower("rose","red",true,false);
        Flower f2=(Flower)p2;
        System.out.println(((Flower)p2).getHasSmell());
        add(plants,p1);
        add(plants,p2);
        search(plants,"marzan");
        search(plants,"money");
        remove(plants,"rose");
        display(plants);
    }
    public static void add(Plant[]plants,Plant p){
        plants[index]=p;
        index++;
    }
    public static void remove(Plant[]plants,String n){
        for(int i=0;i<index;i++){
            if(n.equals(plants[i].getName())==true)
                plants[i]=null;
        }
    }
    public static Plant search(Plant[]plants,String n){
           int j=0;
        for(int i=0;i<index;i++){
            String s=plants[i].getName();
            if(s.equals(n)==true)
                System.out.println("found>>>: "+s);
                return plants[i];
            }
        Plant np = new Plant();
        System.out.println("Plant not found");
        return np;
    }
    public static void display(Plant[]plants){
        for(int i=0;i<index;i++){
            System.out.println(plants[i]);
        }
    }
    
}
