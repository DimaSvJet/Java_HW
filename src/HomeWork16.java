public class HomeWork16 {

    public static void main(String[] args) {
        PopMusic popMusic = new PopMusic("ONUKA", "СЕАНС", 4, "Ukraine",
                6);
        RockMusic rockMusic = new RockMusic("Rammstein", "Sonne", 6, "Deutschland",
                true);
        ClassicMusic classicMusic = new ClassicMusic("London Symphony Orchestra", "Rain",
                200, "Great Britain", "Ennio Morricone", true);

        MusicStyles [] musicGroups = {popMusic, rockMusic,classicMusic};

        for (MusicStyles i: musicGroups) {
            i.playMusic("super");
        }





    }
}



