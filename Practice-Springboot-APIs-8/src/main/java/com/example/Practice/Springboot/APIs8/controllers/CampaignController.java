package com.example.Practice.Springboot.APIs8.controllers;

import com.example.Practice.Springboot.APIs8.entities.Campaign;
import com.example.Practice.Springboot.APIs8.services.CampaignManager;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/campaigns")
public class CampaignController {
    private final CampaignManager campaignManager;

    public CampaignController(CampaignManager campaignManager) {
        this.campaignManager = campaignManager;
    }

    @PostMapping("/add")
    public String createCampaign(@RequestBody Campaign campaign) {
        return campaignManager.addCampaign(campaign);
    }

    @GetMapping("/list")
    public List<Campaign> listCampaigns() {
        return campaignManager.getCampaigns();
    }
}
