package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDateTime purchase_date;

    @Column(nullable = false)
    private float purchase_price;

    @Column(nullable = false)
    private int quantity;

    protected Security() {}
    public Security(Portfolio portfolio, String name, String category, LocalDateTime purchase_date, float purchase_price, int quantity) {
        this.name = name;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public long getId() { return id; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getPurchaseDate() { return purchase_date; }
    public void setPurchaseDate(LocalDateTime purchase_date) {
        this.purchase_date = purchase_date;
    }

    public float getPurchasePrice() { return purchase_price; }
    public void setPurchasePrice(float purchase_price) {
        this.purchase_price = purchase_price;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
