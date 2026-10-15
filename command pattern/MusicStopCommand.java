public class MusicStopCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicStopCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.stop();
    }

    @Override
    public void undo() {
        musicPlayer.play();
    }
}
