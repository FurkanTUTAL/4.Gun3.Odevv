public class CampaignManager {
    public void add(Campaign campaign){
        System.out.println("Yeni kampanya olu�turuldu: " + campaign.getCampaignName());
    }
    public void delete(Campaign campaign){
        System.out.println("Kampanya kald�rl�d�: " + campaign.getCampaignName());
    }
    public void update(Campaign campaign){
        System.out.println("Kampanya G�ncellendi: " + campaign.getCampaignName());
        System.out.println("Kampanya'n�n Ad�: " + campaign.getCampaignNames());
        System.out.println("Kampanya'n�n Miktar�:%" + campaign.getCampaignAmount());
    }
}