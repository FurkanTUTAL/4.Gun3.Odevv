public class GameManager {
    public void add(Game game){
        System.out.println("Oyun sisteme eklendi : " + game.getName().toString().toUpperCase());
    }
    public void update(Game game){
        System.out.println("Oyun Bilgileri G�ncellendi : " + game.getName().toUpperCase());
    }
    public void delete(Game game){
        System.out.println("Oyun sistemden ba�ar�l� �ekilde kald�r�ld� : " + game.getName().toUpperCase());
    }
    

}