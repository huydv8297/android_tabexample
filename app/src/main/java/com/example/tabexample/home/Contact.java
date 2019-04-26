package com.example.tabexample.home;

public class Contact {
    public String number;
    public String address;
    public int avartarId;

    public Contact(int avartarId, String number, String address) {
        this.avartarId = avartarId;
        this.number = number;
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAvartarId() {
        return avartarId;
    }

    public void setAvartarId(int avartarId) {
        this.avartarId = avartarId;
    }
}
