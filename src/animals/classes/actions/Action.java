package animals.classes.actions;

import myLibrary.console.Console;
import service.Service;

public class Action {
    public static int act(YourHamster hamster) {
        switch (Service.randInt(6)) {
            case 1:
                hamster.hide();
                break;
            case 2:
                hamster.move();
                break;
            case 3:
                hamster.run();
                break;
            case 4:
                hamster.eat();
                break;
            case 5:
                hamster.poop();
                break;
            case 6:
                hamster.GiveBirth();
                break;
        }
        return Service.randInt(1000);
    }
}
