package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private float quantity;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private long purchasePrice;

    @Column(nullable=false)
    private String purchaseDate;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable=false)
    private Portfolio portfolio;

    protected Security() {

    }

    public Security(String name, float quantity, String category, long purchasePrice, String purchaseDate, Portfolio portfolio) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.portfolio = portfolio;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float newQuantitiy) {
        this.quantity = newQuantitiy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long newPurchasePrice) {
        this.purchasePrice = newPurchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String newPurchaseDate) {
        this.purchaseDate = newPurchaseDate;
    }
}
