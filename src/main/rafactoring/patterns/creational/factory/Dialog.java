package main.rafactoring.patterns.creational.factory;

import main.rafactoring.patterns.creational.factory.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

