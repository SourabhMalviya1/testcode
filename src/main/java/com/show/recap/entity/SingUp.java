package com.show.recap.entity;

import jakarta.persistence.*;

@Entity
public class SingUp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Long userId;
    private String email;
    private String phone;
    private boolean isNotify;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isNotify() {
        return isNotify;
    }

    public void setNotify(boolean notify) {
        isNotify = notify;
    }

    @Override
    public String toString() {
        return "SingUp{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", isNotify=" + isNotify +
                '}';
    }
}
