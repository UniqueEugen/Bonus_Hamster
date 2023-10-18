package animals.classes.actions;

import animals.classes.entities.Hamster;
import myLibrary.console.Console;
import service.Service;

public class YourHamster extends Hamster {
    private String name;
    private String kind;
    private String master;
    public YourHamster(){
        super();
    }
    public YourHamster(String name, String kind, String master, String color, int age, boolean sex){
        super(color,age,sex);
        this.kind =kind;
        this.master=master;
        this.name=name;
    }
    public YourHamster(YourHamster hamster){
        super(hamster);
        this.name=hamster.name;
        this.master=hamster.master;
        this.kind=hamster.kind;
    }
    //getters+setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public void move() {
        switch (Service.randInt(4)){//узнаем действия хомяка
            case 1:
                Console.log("Хомячок ворочается на спинке");
                break;
            case 2:
                Console.log("Хомячок мирно спит");
                break;
            case 3:
                Console.log("Хомячок пытается пролезть под дверью");
                break;
            case 4:
                Console.log("Хомячок уходит в угол");
                break;
        }
    }

    @Override
    public void eat() {
        switch (Service.randInt(4)){
            case 1:
                Console.log("Хомячок ест травку");
                break;
            case 2:
                Console.log("Хомячок ест сухой корм");
                break;
            case 3:
                Console.log("Хомячок пьет");
                break;
            case 4:
                Console.log("Хомячок обиделся и отказывается кушать");
                break;
        }
    }

    @Override
    public void run() {
        switch (Service.randInt(5)){
            case 1:
                Console.log("Хомячок сбежал! Быстрее лови его!");
                break;
            case 2:
                Console.log("Хомячок подбегает к тебе. Он тебя любит)\nНу или просто проголадался");
                break;
            case 3:
                Console.log("Хомячок бегает в колесе");
                break;
            case 4:
                Console.log("Хомячок носится по комнате. Кажется у него хорошее настрение)");
                break;
            case 5:
                Console.log("Хомячок бегает из угла в угол. Кажется ищет закладки.\n Пора звонить в хомячью милицию)");
                break;
        }
    }

    @Override
    public void hide() {
        switch (Service.randInt(3)){
            case 1:
                Console.log("Хомячок прячется от тебя. Ты его обидел(");
                break;
            case 2:
                Console.log("Хомячок исчез! А может просто спид где-нибудь под диваном)");
                break;
            case 3:
                Console.log("Хомячок зарылся в наполнитель и думает, что его не видно)");
                break;
        }
    }

    @Override
    public void poop() {
        switch (Service.randInt(3)){
            case 1:
                Console.log("Пора менять подстилку в клетке!");
                break;
            case 2:
                Console.log("Хомячок нагадил прям посреди комнаты!");
                break;
            case 3:
                Console.log("Хомячку приспичело прямо когда ты его гладил!");
                break;
        }
    }

    @Override
    public void GiveBirth() {
        if(!isSex()){
            switch (Service.randInt(3)){
                case 1:
                    Console.log("Твоя хомячиха хочет к парню)");
                    break;
                case 2:
                    Console.log("Твоя хомячиха забеременела");
                    break;
                case 3:
                    Console.log("Твоя хомячиха родила!");
                    break;
            }
        }
        else {
            Console.log("Твой хомяк хочет к даме!");
        }
    }
    @Override
    public String toString(){
        Console.log("Хозяин: "+ getMaster()+ " имя хомячка: " +getName()+" возраст: "+super.getAge()+" пол: "+
                (super.isSex()? " мужской ": " женский ")+ " вид хомячка: "+ getKind()+" цвет хомячка: "+super.getColor());
        return  null;
    }
}
