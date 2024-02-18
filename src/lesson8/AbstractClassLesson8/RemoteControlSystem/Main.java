package lesson8.AbstractClassLesson8.RemoteControlSystem;

public class Main {
    public static void main(String[] args) {
        
        TVRemote tVRemote = new TVRemote(true, 50);
        tVRemote.powerOn();
        tVRemote.volumeUp();
        tVRemote.volumeDown();
        tVRemote.powerOff();
        System.out.println();

        StereoRemote stereoRemote = new StereoRemote(true, 99);
        stereoRemote.powerOn();
        stereoRemote.volumeUp();
        stereoRemote.volumeDown();
        stereoRemote.powerOff();
        
    }
}