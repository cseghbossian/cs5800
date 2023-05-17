class MusicCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic();
    }
}