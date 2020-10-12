package testtv;

public class TestTv {

    public static void main(String[] args) {
        Tv tv1=new Tv();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(7);
        
        Tv tv2=new Tv();
        tv2.turnOn();
        tv2.setChannel(30);
        tv2.channelUp();
        tv2.setVolume(7);
        tv2.volumeUp();
        
        System.out.println("Tv1's channel is : " + tv1.channel + " and volumelevel is : " + tv1.volumeLevel);
        System.out.println("Tv2's channel is : " + tv2.channel + " and volume is : " + tv2.volumeLevel);
    
}
    
}
