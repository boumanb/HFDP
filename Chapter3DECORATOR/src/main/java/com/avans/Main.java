package com.avans;

import com.avans.Domain.Beverage;
import com.avans.Domain.DarkRoast;
import com.avans.Domain.Decorators.LowerCaseInputStream;
import com.avans.Domain.Decorators.Mocha;
import com.avans.Domain.Decorators.Soy;
import com.avans.Domain.Decorators.Whip;
import com.avans.Domain.Espresso;
import com.avans.Domain.HouseBlend;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+ " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+ " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+ " $" + beverage2.cost());

        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\local\\IVH11\\ADP\\IntelliJ\\HFDP\\Chapter3DECORATOR\\src\\main\\java\\com\\avans\\test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
