public class GamerManager {
    public void register(Gamer gamer){
        System.out.println("Kayýt Baþarýlý : " + gamer.getFirstName() + " , " + gamer.getLastName().toUpperCase());
    }
    public void update(Gamer gamer){
        System.out.println("Bilgiler Güncellendi");
        System.out.println("_____________________");
        System.out.println("Kullanýcý Adý Soyadý: " +  gamer.getFirstName() + " , " + gamer.getLastName().toUpperCase());
        System.out.println("Kullanýcý Doðum Yýlý: "+gamer.getBirthYear());
        System.out.println("Kullanýcý TcNo: " + gamer.getNationalIdentity());
    }
    public void delete(Gamer gamer){
        System.out.println("Kayýt Baþarýlý  bir sekilde silindi: " + gamer.getFirstName() + " , " + gamer.getLastName().toUpperCase());
    }

}