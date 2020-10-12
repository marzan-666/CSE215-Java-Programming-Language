
package testtv;

public class Tv {
    int channel=1;
    int volumeLevel=1;
    private boolean on=false;
    
    public Tv(){
        
    }
    public void turnOn(){
        on=true;
    }
    public void turnOf(){
        on=false;
    }
    public void setChannel(int newChannel){
        if(on && newChannel>=1 && newChannel<=120){
            channel=newChannel;
            
        }
        
    }
    public void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel>=1 && newVolumeLevel<=10){
            volumeLevel=newVolumeLevel;
        }
    }
    public void channelUp(){
        if(on && channel<120 ){
            channel++ ;
        }
    }
    public void channelDown(){
        if(on && channel>1){
            channel-- ;
        }
    }
    public void volumeUp(){
        if(on && volumeLevel<10){
            volumeLevel++ ; 
        }
    }
    public void volumeDown(){
        if(on && volumeLevel>1){
            volumeLevel-- ;
        }
    }
    
    
    
}

