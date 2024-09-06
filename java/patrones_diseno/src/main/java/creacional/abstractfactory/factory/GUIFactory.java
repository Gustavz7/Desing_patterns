package creacional.abstractfactory.factory;

import creacional.abstractfactory.buttons.Button;
import creacional.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}
