package com.company;

public interface ITelephone {
    public void powerOn();
    void dial(int phoneNumber);
    void answer();
    public boolean callPhone(int phoneNumber);
    boolean isRinging();
}
