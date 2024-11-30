
package org.example;

public class Player {
    private String nama;
    private int rollCount;

    public Player(String nama, int rollCount) {
        this.nama = nama;
        this.rollCount = rollCount;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getRollCount() {
        return rollCount;
    }

    public void setRollCount(int rollCount) {
        this.rollCount = rollCount;
    }
    
    public void updateRoll(){
        this.rollCount = this.rollCount + 1;
    }
    
    public String rollGacha(int rand){
        String grade = "";
        switch(rand){
            case 5 -> grade = "SSR";
            case 4 -> grade = "SR";
            case 3 -> grade = "R";
        }
        this.updateRoll();
        return grade;
    }
    
    public String rollGacha(Machine m){
        int rand = m.roll();
        String grade = "";
        switch(rand){
            case 5 -> grade = "SSR";
            case 4 -> grade = "SR";
            case 3 -> grade = "R";
        }
        this.updateRoll();
        return grade;
    }
}
