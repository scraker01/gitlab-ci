package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Player> players;
    
    public Game(){
        this.players = new ArrayList<>();
    }
    
    public void save(){
        try{
            FileWriter fw = new FileWriter("data.txt");
            for(Player p : this.players){
                fw.write(p.getNama()+" ");
                fw.write(p.getRollCount()+"\n");
            }
            fw.close();
        }catch(IOException e){
            e.getStackTrace();
        }    
    }
    
    public void load() {
        try{
            Scanner file = new Scanner(new FileReader("data.txt"));
            this.players = new ArrayList<>();
            while(file.hasNext()){
                String nama = file.next();
                int rollCount = file.nextInt();
                file.nextLine();
                this.players.add(new Player(nama,rollCount));
            }
            file.close();
        }catch(IOException e){
            e.getStackTrace();
        }
    }
    
    public Player getPlayer(int idx){
        return this.players.get(idx);
    }
    
    public String roll(int idx, int rand){
        String grade = this.players.get(idx).rollGacha(rand);
        this.save();
        return grade;
    }
}
