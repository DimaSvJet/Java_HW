public class PopMusic extends MusicStyles {

    int valueSellDisk;

    public PopMusic(String nameGroup, String song, int memberesBand, String country) {
        super(nameGroup, song, memberesBand, country);
    }

    public PopMusic(String nameGroup, String song, int memberesBand, String country, int valueSellDisk) {
        super(nameGroup, song, memberesBand, country);
        this.valueSellDisk = valueSellDisk;
    }

    @Override
    public void playMusic(String text) {
        System.out.println("Play only " + text + " Pop music!");
    }
}
