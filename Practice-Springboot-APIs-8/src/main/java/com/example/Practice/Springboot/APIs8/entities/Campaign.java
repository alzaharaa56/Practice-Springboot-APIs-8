package com.example.Practice.Springboot.APIs8.entities;

public class Campaign {
    private String campaignId;
    private String campaignName;
    private String platform;
    private double budget;

    public Campaign() {
    }

    public Campaign(String campaignId, String campaignName, String platform, double budget) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.platform = platform;
        this.budget = budget;
    }

    public String getCampaignId() {
        return campaignId;
    }
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }
    public String getCampaignName() {
        return campaignName;
    }
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
}

