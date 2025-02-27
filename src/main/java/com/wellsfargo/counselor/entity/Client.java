package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Client extends User {
    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    public Client(Advisor advisor, String first_name, String last_name, String address, String email, String phone) {
        super(first_name, last_name, address, email, phone);
        this.advisor = advisor;
    }

    public Advisor getAdvisor() { return advisor; }
    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}