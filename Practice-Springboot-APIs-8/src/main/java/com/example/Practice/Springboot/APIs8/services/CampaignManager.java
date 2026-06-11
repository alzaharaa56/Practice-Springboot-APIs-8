package com.example.Practice.Springboot.APIs8.services;
import com.example.Practice.Springboot.APIs8.entities.Campaign;
import com.example.Practice.Springboot.APIs8.repositories.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CampaignManager {
    @Autowired
    private CampaignRepository campaignRepository;
    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }
    public Optional<Campaign> getCampaignById(Long id) {
        return campaignRepository.findById(id);
    }
    public Campaign addCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public void deleteCampaign(Long id) {
        campaignRepository.deleteById(id);
    }
}