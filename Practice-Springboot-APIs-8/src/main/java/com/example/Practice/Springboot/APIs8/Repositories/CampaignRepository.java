package com.example.Practice.Springboot.APIs8.Repositories;
import com.example.Practice.Springboot.APIs8.entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
