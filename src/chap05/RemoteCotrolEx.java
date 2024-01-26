package chap05;

public class RemoteCotrolEx {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
        rc.setVolume(50);
        rc.turnOff();

    }
}
