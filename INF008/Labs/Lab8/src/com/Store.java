package com;

import java.util.Calendar;

public class Store {
    private float openTime;
    private float closeTime;
    private String closeMenssage;
    private String openMenssage;
    
    public Store(){
        this.openTime = 9.0f;
        this.closeTime = 21.0f;
        this.openMenssage = "A loja está aberta!";
        this.closeMenssage = "A loja está fechada!";
    }

    public boolean isOpen(){
        int hour = getHourInt();

        return hour >= openTime && hour < closeTime?true:false;
    }

    private int getHourInt() { 
        Calendar c = Calendar.getInstance(); 
        return c.get(Calendar.HOUR_OF_DAY); 
    }

    public void getOpenClosedMessage(boolean open){

        if(open) System.out.println(openMenssage);
        else System.out.println(closeMenssage);
    }

    public void displayHoursOfOperation(){
        System.out.println(String.format("%.0f:%.0f - %.0f:%.0f", openTime, (openTime%1), closeTime, (closeTime%1)));
    }

// ------------------------ GET And SET ------------------------
    public float getOpenTime() {
        return openTime;
    }
    public float getCloseTime() {
        return closeTime;
    }
    public String getOpenMenssage() {
        return openMenssage;
    }
    public String getCloseMenssage() {
        return closeMenssage;
    }
    public void setOpenMenssage(String openMenssage) {
        this.openMenssage = openMenssage;
    }
    public void setCloseMenssage(String closeMenssage) {
        this.closeMenssage = closeMenssage;
    }
    public void setOpenTime(float openTime) {
        if(openTime < 1f || openTime > 23.59f)
            this.openTime = openTime;
        else
            System.out.println("Horario Invalido!");
    }
    public void setCloseTime(float closeTime) {
        if(closeTime < 1f || closeTime > 23.59f)
            this.closeTime = closeTime;
        else
            System.out.println("Horario Invalido!");
    }
}
