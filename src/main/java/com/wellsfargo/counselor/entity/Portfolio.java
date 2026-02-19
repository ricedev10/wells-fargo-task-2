package com.wellsfargo.counselor.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne(mappedBy="portfolio")
    private Client client;

    @OneToMany(mappedBy="portfolio")
    private List<Security> securities;

    protected Portfolio() {

    }

    public Portfolio(Client client) {
        this.client = client;
        this.securities = new ArrayList<>();
    }

    public void addSecurity(Security security)
    {
        this.securities.add(security);
    }

    public void removeSecurity(Security security) {
        this.securities.remove(security);
    }

    public List<Security> getSecurities() {
        return this.securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    public long getPortfolioId()
    {
        return portfolioId;
    }

    public Client getClient()
    {
        return client;
    }
}
