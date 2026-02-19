package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientid;

    @Column(nullable=false)
    private String firstname;

    @Column(nullable=false)
    private String lastname;

    @Column(nullable=false)
    private String phone;

    @Column(nullable=false)
    private String email;

    @OneToOne
    @JoinColumn(name="portfolio", nullable=false)
    private Portfolio portfolio;

    protected Client() {

    }

    public Client(String firstname, String lastname, String phone, String email, Portfolio portfolio)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.portfolio = portfolio;
    }

    public Long getClientId()
    {
        return clientid;
    }

    public Portfolio getPortfolio()
    {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) 
    { 
        this.portfolio = portfolio;
    }

    public String getFirstName()
    {
        return firstname;
    }

    public void setFirstName(String firstName)
    {
        this.firstname = firstName;
    }

    public String getLastName()
    {
        return lastname;
    }

    public void setLastName(String lastName)
    {
        this.lastname = lastName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phoneNumber)
    {
        this.phone = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String newEmail)
    {
        this.email = newEmail;
    }
}
