package com;

import com.MusicTitle;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Store {
    private String owner;
    private float openTime;
    private float closeTime;
    private String closeMenssage;
    private String openMenssage;
    // private MusicTitle []titles;
    private List<MusicTitle> titles;
    
    public Store(){
        this.owner = "Sem Dono!";
        this.openTime = 9.0f;
        this.closeTime = 21.0f;
        this.openMenssage = "A loja está aberta!";
        this.closeMenssage = "A loja está fechada!";
        // this.titles = null;
        this.titles = new ArrayList<>();
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

    public void setOpenTime(float openTime) {
        if(openTime < 1 || openTime > 23.59)
            System.out.println("Horario Invalido!");
        else
            this.openTime = openTime;
        
    }

    public void setCloseTime(float closeTime) {
        if(closeTime < 1 || closeTime > 23.59)
            System.out.println("Horario Invalido!");
        else
            this.closeTime = closeTime;
    }

    // public void DisplayMusicTitles(){
    //     if(titles)
    //         for(int i=0; i<titles.length; i++){
    //             System.out.println(String.format("\nTitulo %d: ", i+1)); 
    //             System.out.println(    
    //                 "Title: "+titles[i].getTitle()+
    //                 "\nArtist: "+titles[i].getArtist()
    //             );
    //         }
    //     else
    //         System.out.println("Nenhum Disco Disponível!");
    // }

    public void DisplayMusicTitles(){
        if(titles.size() > 0){
            for(MusicTitle disc: titles){
                System.out.println(    
                    "Title: "+disc.getTitle()+
                    "\nArtist: "+disc.getArtist()
                );
            }
        }
    }

// ------------------------ GET And SET ------------------------
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
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
    public void setTitles(String artist, String title) {
        MusicTitle newDisc = new MusicTitle();
        newDisc.setArtist(artist);
        newDisc.setTitle(title);

        this.titles.add(newDisc);
    }
    public List<MusicTitle> getTitles() {
        return titles;
    }
    // public void setTitles(MusicTitle[] titles) {
    //     this.titles = titles;
    // }
    // public MusicTitle[] getTitles() {
    //     return titles;
    // }
}
