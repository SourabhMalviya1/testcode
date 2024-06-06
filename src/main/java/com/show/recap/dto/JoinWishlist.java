package com.show.recap.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class JoinWishlist {

    String email;
    String phone;
    boolean isNotify;

    public JoinWishlist(String email, String phone, boolean isNotify) {
        this.email = email;
        this.phone = phone;
        this.isNotify = isNotify;
    }

    public JoinWishlist() {
        }

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

        public void setIsNotify(boolean isNotify) {
            this.isNotify = isNotify;
        }
}
