public class RockMusic extends MusicStyles {

    boolean heavyMetal;


    public RockMusic(String nameGroup, String song, int memberesBand, String country) {
        super(nameGroup, song, memberesBand, country);
    }

    public RockMusic(String nameGroup, String song, int memberesBand, String country, boolean heavyMetal) {
        super(nameGroup, song, memberesBand, country);
        this.heavyMetal = heavyMetal;
    }

    @Override
    public void playMusic(String text) {
        System.out.println("Rock " + text + " burn music!");
    }
}
