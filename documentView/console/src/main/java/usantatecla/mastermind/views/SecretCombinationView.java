package usantatecla.mastermind.views;

import usantatecla.mastermind.models.SecretCombination;
import usantatecla.utils.Console;

class SecretCombinationView {

    void writeln() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            Console.getInstance().write(Message.SECRET.getMessage());
        }
        Console.getInstance().writeln();
    }

}
