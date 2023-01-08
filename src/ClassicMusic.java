public class ClassicMusic extends MusicStyles {

    String nameComposer;
    boolean choir;


    public ClassicMusic(String nameGroup, String song, int memberesBand, String country) {
        super(nameGroup, song, memberesBand, country);
    }

    public ClassicMusic(String nameGroup, String song, int memberesBand, String country, String nameComposer,
                        boolean choir) {
        super(nameGroup, song, memberesBand, country);
        this.nameComposer = nameComposer;
        this.choir = choir;
    }

    @Override
    public void playMusic(String text) {
        System.out.println("Classic " + text + " music is forever!");
    }
}
