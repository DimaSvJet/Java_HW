public class MusicStyles {

    String nameGroup;
    String song;
    int memberesBand;
    String country;

    public MusicStyles(String nameGroup, String song, int memberesBand, String country) {
        this.nameGroup = nameGroup;
        this.song = song;
        this.memberesBand = memberesBand;
        this.country = country;
    }

    public void playMusic(String text) {
        System.out.println("Play " + text + " music!");

     }

}


