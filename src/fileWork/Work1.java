package fileWork;

import animals.classes.actions.YourHamster;
import animals.classes.entities.Hamster;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Work1 {

    public static void create(YourHamster hamster) {//метод для записи объекта в json формате в файл
        Gson gson = new GsonBuilder()//создание нового объекта gson
                .setPrettyPrinting()//установка читабельности
                .create();//Создание gson парсера
        try (FileWriter writer = new FileWriter("E:/ПСП/hamster.json")) {//создание ридера для файла
            gson.toJson(hamster, writer);//извлечение и запись хомяка
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
