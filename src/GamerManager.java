public class GamerManager {
    public void register(Gamer gamer){
        System.out.println("Kay�t Ba�ar�l� : " + gamer.getFirstName() + " , " + gamer.getLastName().toUpperCase());
    }
    public void update(Gamer gamer){
        System.out.println("Bilgiler G�ncellendi");
        System.out.println("_____________________");
        System.out.println("Kullan�c� Ad� Soyad�: " +  gamer.getFirstName() + " , " + gamer.getLastName().toUpperCase());
        System.out.println("Kullan�c� Do�um Y�l�: "+gamer.getBirthYear());
        System.out.println("Kullan�c� TcNo: " + gamer.getNationalIdentity());
    }
    public void delete(Gamer gamer){
        System.out.println("Kay�t Ba�ar�l�  bir sekilde silindi: " + gamer.getFirstName() + " , " + gamer.getLastName().toUpperCase());
    }

}