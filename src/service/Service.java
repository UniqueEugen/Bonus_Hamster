package service;

import java.util.Random;

public class Service {
    public static int randInt(int kol){
        Random r = new Random();
        return r.nextInt(kol)+1;
    }
}
