package animals.classes.entities;

import animals.interfaces.mammals.Mammal;
import myLibrary.console.Console;
import service.Service;

public abstract class Hamster implements Mammal {
    private String color;
    private int age;
    private boolean sex; //true --Male, false--female

    public Hamster(){}
    public Hamster(Hamster hamster){
        this.color=hamster.color;
        this.age=hamster.age;
        this.sex=hamster.sex;
    }
    public Hamster(String color, int age, boolean sex){
        this.color=color;
        this.age=age;
        this.sex=sex;
    }
//геттеры+сеттеры
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }


}
