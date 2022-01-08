package main.rafactoring.patterns.creational.factory;

import main.rafactoring.patterns.creational.factory.buttons.Button;
import main.rafactoring.patterns.creational.factory.buttons.WindowsButton;


public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
