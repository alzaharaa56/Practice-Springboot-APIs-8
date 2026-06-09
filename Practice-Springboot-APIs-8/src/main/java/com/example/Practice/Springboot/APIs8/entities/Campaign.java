package com.example.Practice.Springboot.APIs8.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity
@Table(name = "campaigns")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Campaign title is required")
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "platform")
    private String platform;
    @Column(name = "budget")
    private Double budget;

    public Campaign() {}

    public Campaign(String title, String platform, Double budget) {
        this.title = title;
        this.platform = platform;
        this.budget = budget;
    }
    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public Double getBudget() {
        return budget;
    }
    public void setBudget(Double budget) {
        this.budget = budget;
    }
}