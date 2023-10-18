package fileWork;

import animals.classes.actions.YourHamster;
import animals.classes.entities.Hamster;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import myLibrary.console.Console;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class Unparser {
    public static YourHamster unpars() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try( Reader reader = new FileReader("E:/ПСП/hamster.json")) {
            Type collectionType = new TypeToken<YourHamster>(){}.getType();
            return new YourHamster(gson.fromJson(reader, YourHamster.class));

        }catch (Exception e){
            Console.log(e);
        }
        return null;
    }

    public Unparser() throws FileNotFoundException {
    }
}
