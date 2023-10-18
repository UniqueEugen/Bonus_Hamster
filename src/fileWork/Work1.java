package fileWork;

import animals.classes.actions.YourHamster;
import animals.classes.entities.Hamster;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Work1 {

    public static void create(YourHamster hamster) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(hamster);
        try (FileWriter writer = new FileWriter("E:/ПСП/hamster.json")) {
            gson.toJson(hamster, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
