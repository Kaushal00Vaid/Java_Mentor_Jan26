package w4;

interface Device {
    void start();
}

interface SmartDevice extends Device {
    void connectToWifi();
    // void start(); // inheriting
}

interface Entertainment {
    void playMedia();
}

class SmartTV implements Entertainment, SmartDevice {
    String brand;
    int volume;

    // parameterized and default constructor...

    // methods to MUST override
    // start, playMedia, connectToWifi

    public void start() {
        System.out.println("Device is starting");
    }

    public void connectToWifi() {
        System.out.println("We are connecting to wifi");
    }

    public void playMedia() {
        System.out.println("Playing media");
    }
    
    void setVolume(int v) {
        volume = v;
    }

    void setVolume(int v, boolean mute) {
        if(mute) {
            volume = 0;
            System.out.println("Volume muted");
        } else {
            volume = v;
            System.out.println("Volume set to " + volume);
        }
    }


}

public class HWTest {
    public static void main(String[] args) {
        
    }
}
