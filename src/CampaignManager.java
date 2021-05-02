public class CampaignManager {
    public void add(Campaign campaign){
        System.out.println("Yeni kampanya oluþturuldu: " + campaign.getCampaignName());
    }
    public void delete(Campaign campaign){
        System.out.println("Kampanya kaldýrlýdý: " + campaign.getCampaignName());
    }
    public void update(Campaign campaign){
        System.out.println("Kampanya Güncellendi: " + campaign.getCampaignName());
        System.out.println("Kampanya'nýn Adý: " + campaign.getCampaignNames());
        System.out.println("Kampanya'nýn Miktarý:%" + campaign.getCampaignAmount());
    }
}