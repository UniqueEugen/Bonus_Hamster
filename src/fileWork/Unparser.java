package fileWork;

import animals.classes.actions.YourHamster;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import myLibrary.console.Console;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Unparser {
    public static YourHamster unpars() {//метод по извлечению хомяка из JSON объекта
        Gson gson = new GsonBuilder()//создание объекта gson для работы с json
                .setPrettyPrinting()//установка читабельной формы записи json
                .create();

        try( Reader reader = new FileReader("E:/ПСП/hamster.json")) {//создание объекта чтения файлов
            return new YourHamster(gson.fromJson(reader, YourHamster.class));//Возврат старого нового хомяка

        }catch (Exception e){
            Console.log(e);
        }
        return null;
    }

    public Unparser() throws FileNotFoundException {
    }
}
