package lesson8.AbstractClassLesson8.RemoteControlSystem;

public class TVRemote implements RemoteControl{
    
    private boolean isOn;
    private int volumeLevel;

    //constructor
    public TVRemote(boolean isOn, int volumeLevel){
        this.isOn = isOn;
        this.volumeLevel = volumeLevel;
    }

    //add implement method
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("TV now is turn on.");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("TV now is turn off.");
    }

    @Override
    public void volumeUp() {
        if(isOn){
            volumeLevel++;
            System.out.println("Volume increased. Current volume level: " + volumeLevel);
        }else{
            System.out.println("Can't increase volume.TV is off.");
        }
    }

    @Override
    public void volumeDown() {
        if(isOn){
            volumeLevel--;
            System.out.println("Volume decreased. Current volume level: " + volumeLevel);
        }else{
            System.out.println("Can't decrease volume.TV is off.");
        }
    }

}
