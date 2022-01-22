package com.company;

import java.awt.*;
import java.net.URI;
import java.util.*;

public class Zreb {
    private String[][] rand;
    private final ArrayList<String> kenoPlus = new ArrayList<>();
    private ArrayList<String> typ = new ArrayList<>();
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public void generateZreb(){
        String[][] bruh = new String[3][10];
        for (int row = 0; row < 3; row++){
            for (int col = 0;col < 10;col++){
                bruh[row][col] = Integer.toString(row) + col;
            }
        }
        this.rand = bruh;
    }

    public void vypisZreb(){

        System.out.println();
        String[][] bruh = new String[3][10];
        for (int row = 0; row < 3; row++){
            for (int col = 0;col < 10;col++){
                bruh[row][col] = "-";
            }
        }
        for (int i = 0;i < 5;i++){
            int randRow = random.nextInt(3);
            int randCol = random.nextInt(10);
            if (bruh[randRow][randCol].equals("-")){
                bruh[randRow][randCol] = "+";
                this.kenoPlus.add(Integer.toString(randRow) + randCol);
            }
            else{
                i--;
            }
        }
        this.rand = bruh;
    }

    public void getTyp(String[] A){
        String[][] bruh = this.getRand();
        ArrayList<String> pepega = new ArrayList<>();
        String a;
        String b;
        int c;
        int d;
        for(int i = 0;i < 5; i++){
            String[]parts = A[i].split("");
            a = parts[0];
            b = parts[1];
            c = Integer.parseInt(a);
            d = Integer.parseInt(b);
            if(bruh[c][d].equals("+")){
                pepega.add(A[i]);
            }
            this.typ = pepega;
        }
    }

    public void getInvestor(){
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI url = new URI("https://www.google.com");
            desktop.browse(url);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void runZreb(){
        boolean run = true;
        while(run) {
            this.generateZreb();
            this.printZreb(this.getRand());
            this.vypisZreb();
            System.out.println("Zadajte vyherne cisla");
            System.out.println("format : 00-00-00-00-00");
            String temp = scanner.next();
            this.getTyp(this.doSplit(temp));
            System.out.println("V keno Plus boli vyzrebovane tieto cisla : " + this.getKenoPlus().toString().replaceAll("(^\\[|]$)", ""));
            this.kenoPlus.clear();
            System.out.println("Uhadli ste " + this.getSpravne().size());
            System.out.println("Chcete si typnut dalsie Keno + ? 0/1");
            int bruh = scanner.nextInt();
            if (bruh == 0){
                run = false;
            }
        }
    }
    public void printZreb(String[][] mat){
        for (String []row : mat){
            System.out.println(Arrays.toString(row));
        }
    }

    public String[][] getRand() {
        return rand;
    }

    public ArrayList<String> getSpravne() {
        return typ;
    }

    public String[] doSplit(String a){
        return a.split("-");
    }
    public ArrayList<String> getKenoPlus() {
        return kenoPlus;
    }

}

