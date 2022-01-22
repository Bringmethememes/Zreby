package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zreb z = new Zreb();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcete si typnut Keno + ? Y/N");
        String rozhodnutie = scanner.next();
        System.out.println("Ste investor ? Y/N");
        String invest = scanner.next();

        if (rozhodnutie.equals("Y") && invest.equals("Y")) {
            z.getInvestor();
        }
        if (rozhodnutie.equals("Y") && invest == "N"){
            z.runZreb();
        }
        else {
            System.out.println("Drbe ti ?");
            System.exit(0);
        }



    }
}
