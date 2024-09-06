package creacional.abstractfactory.factory;

import creacional.abstractfactory.buttons.Button;
import creacional.abstractfactory.buttons.MacOSButton;
import creacional.abstractfactory.checkboxes.Checkbox;
import creacional.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
