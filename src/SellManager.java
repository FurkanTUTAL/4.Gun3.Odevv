public class SellManager {
    public void sell(Gamer gamer,Game game){
        Sell sell = new Sell(1,gamer.getFirstName() + " , " + gamer.getLastName(),game.getName());
        System.out.println(game.getName() + " Oyununu " + gamer.getFirstName() + " " + gamer.getLastName()
                + " tarafından "+ "%"+game.getCampaignAmount() +" indirimle " + game.getPriceBeforeCampaign() + " ₺ karşılığında satın alındı");

        System.out.println("Satış Bilgileri");
        System.out.println("_______________");
        System.out.println("Satış Id: " + sell.getId());
        System.out.println("Satışı Yapılan Oyun: " + sell.getGameName());
        System.out.println("Satın Alan Kişi: " + sell.getGamerName());
    }
}