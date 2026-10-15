public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light hallLight = new Light("홀");
        MusicPlayer musicPlayer = new MusicPlayer();

        remote.setCommand(0, new LightOnCommand(hallLight), new LightOffCommand(hallLight));
        remote.setCommand(1, new MusicPlayCommand(musicPlayer), new MusicStopCommand(musicPlayer));

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(1);
        remote.undoButtonWasPushed();
    }
}
