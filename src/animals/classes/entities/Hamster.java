package animals.classes.entities;

import animals.interfaces.mammals.Mammal;

//класс является абстрактным, так как он реализует интерфейс Mammal, но не переопределяет методы
public abstract class Hamster extends Animal implements Mammal {//POJO-class для всех хомяков
    private String color;//цвет хомяка
    private int age;//возраст хомяка
    private boolean sex; //true --Male, false--female

    public Hamster(){}//дефолтный конструктор
    public Hamster(Hamster hamster){//конструктор для создания нового объекта по существующему
        this.color=hamster.color;
        this.age=hamster.age;
        this.sex=hamster.sex;
    }
    public Hamster(String color, int age, boolean sex){//Конструктор для создания объекта по заданным параметрам
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
