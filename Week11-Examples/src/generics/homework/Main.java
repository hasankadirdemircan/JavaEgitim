package generics.homework;

public class Main {
    public static void main(String[] args) {
        // // TODO: Farklı türlerde oyuncu nesneleri oluşturun ve Team sınıfını kullanarak bir takım oluşturun.
        //        // Takıma oyuncuları ekleyin ve takımın oyuncularını listeyin.

        FootballPlayer footballPlayer1 = new FootballPlayer("haci");
        FootballPlayer footballPlayer2 = new FootballPlayer("Drogba");

        BasketballPlayer basketballPlayer1 = new BasketballPlayer("basketci1");
        BasketballPlayer basketballPlayer2 = new BasketballPlayer("basketci2");

        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("ahmet");

        Team<Player> team1 = new Team("Galatasaray");
        team1.addPlayer(footballPlayer1);
        team1.addPlayer(footballPlayer2);
        team1.addPlayer(basketballPlayer1);
       // team1.addPlayer(hockeyPlayer1);
        //Hata verir çünkü Team class'ında Bounded yaptık. Yalnızca Player tipi olabilir.
        /*
        Required type:
            Player
            Provided:
            HockeyPlayer
         */

    }
}
