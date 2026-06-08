package com.example.Practice.Springboot.APIs8;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class CampaignManager {

    private final List<Campaign> campaigns = new ArrayList<>();

    public CampaignManager() {
        campaigns.add(new Campaign("C101", "Summer Sale", "Instagram", 500.0));
        campaigns.add(new Campaign("C102", "Black Friday", "Google Ads", 1000.0));
        campaigns.add(new Campaign("C103", "Email Promo", "Email", 300.0));
    }

    public String addCampaign(Campaign campaign) {

        for (Campaign c : campaigns) {
            if (c.getCampaignId().equalsIgnoreCase(campaign.getCampaignId())) {
                return "Campaign ID already exists\nNo campaign was created";
            }
        }

        campaigns.add(campaign);

        return "Campaign Created Successfully\n" +
                "Campaign ID: " + campaign.getCampaignId() + "\n" +
                "Campaign Name: " + campaign.getCampaignName() + "\n" +
                "Platform: " + campaign.getPlatform() + "\n" +
                "Budget: " + campaign.getBudget() + "\n" +
                "Status: Active";
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }
}
