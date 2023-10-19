import animals.classes.actions.Action;
import animals.classes.actions.YourHamster;
import fileWork.Unparser;
import fileWork.Work1;
import myLibrary.console.Console;//Импорт класса для консольного вывода из моей библотеки
import myLibrary.input.Scan;//Импорт класса для консольного ввода из моей библиотеки

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Console.log("Привет! Как тебя зовут?");
        String master = Scan.stringScan();//Получение имени пользователя
        Console.log("Приятно познакомится "+master+"!\n1.Давай создадим твоего хомяка!\n2.Завести Б/У хомяка");
        YourHamster hamster;
        if(Scan.booleanScan()){//получение ответа пользователя
            Console.log("Введи имя хомяка, его вид, цвет, возраст и пол(1 или 2): ");
            hamster = new YourHamster(Scan.stringScan(),Scan.stringScan(),master, Scan.stringScan(),
                Scan.intScan(), Scan.booleanScan());//Создаем хомячка
        }else{
            hamster = new YourHamster(Unparser.unpars());//Получаем хомячка из json файла
            hamster.setMaster(master);//устанавливаем хозяина
        }
        Console.log("Вот твой хомячок!");
        hamster.toString();
        boolean flag=false;
        while (!flag){
            Console.log("Новое действие хомячка?\n1.Да\n2.Закончить играть с хомячком");
            if (!Scan.booleanScan()){flag=true; continue;}//если выходим, заканчиваем цикл
            if (Action.act(hamster)==666){flag=true;Console.log("Увы, это случается, твой хомячок умер(");}
        }
        Work1.create(hamster);//записываем в файл хомячка
    }
}