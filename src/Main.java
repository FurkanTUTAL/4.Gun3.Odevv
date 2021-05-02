public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(1,"111111111111","FURKAN","TUTAL",1800);
        Game game = new Game(1,"EA SPORTS™ FIFA 21",419);
        Campaign campaign = new Campaign(1,38,"%  67 indirimli", "ÖZEL PROMOSYON!");

        GamerManager gamerManager = new GamerManager();
        GameManager gameManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();
        SellManager sellManager = new SellManager();
        System.out.println("GAMING GECESÝNE HOÞGELDÝNÝZ");
        gamerManager.register(gamer);
        System.out.println("____________");
        gameManager.add(game);
        System.out.println("____________");
        campaignManager.add(campaign);
        System.out.println("____________");
        sellManager.sell(gamer,game);
        System.out.println("____________");

        gamer.setFirstName("FURKAN");
        gamerManager.update(gamer);
        System.out.println("____________");
        campaign.setCampaignAmount(67);
        campaignManager.update(campaign);
        System.out.println("____________");
        game.setCampaignAmount(campaign.getCampaignAmount());
        gameManager.update(game);
        System.out.println("____________");
        sellManager.sell(gamer,game);
        System.out.println("____________");
        gameManager.delete(game);
        System.out.println("____________");
        gamerManager.delete(gamer);
        System.out.println("____________");
        campaignManager.delete(campaign);
    }
}