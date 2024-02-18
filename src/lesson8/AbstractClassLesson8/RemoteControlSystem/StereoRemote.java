package lesson8.AbstractClassLesson8.RemoteControlSystem;

public class StereoRemote implements RemoteControl{
    
    private boolean isOn;
    private int volumeLevel;

    //constructor
    public StereoRemote(boolean isOn, int volumeLevel){
        this.isOn = isOn;
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Stereo is now turned on.");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Stereo is now turned off.");
    }

    @Override
    public void volumeUp() {
        if(isOn){
            volumeLevel++;
            System.out.println("Volume increased. Current volume level: " + volumeLevel);
        }else{
            System.out.println("Can't increase volume.Stereo is off.");
        }
    }

    @Override
    public void volumeDown() {
        if(isOn){
            volumeLevel--;
            System.out.println("Volume decreased. Current volume level: " + volumeLevel);
        }else{
            System.out.println("Can't decrease volume.Stereo is off.");
        }
    }

}
