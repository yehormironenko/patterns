package main.rafactoring.patterns.creational.factory;

import main.rafactoring.patterns.creational.factory.buttons.Button;
import main.rafactoring.patterns.creational.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
