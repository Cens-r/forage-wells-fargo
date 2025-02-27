package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long id;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    protected Portfolio() {}
    public Portfolio(Client client) {
        this.client = client;
    }

    public long getId() { return id; }

    public Client getClient() { return client; }
    public void setClient(Client client) {
        this.client = client;
    }
}
