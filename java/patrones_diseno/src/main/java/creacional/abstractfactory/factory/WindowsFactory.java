package creacional.abstractfactory.factory;

import creacional.abstractfactory.buttons.Button;
import creacional.abstractfactory.buttons.WindowsButton;
import creacional.abstractfactory.checkboxes.Checkbox;
import creacional.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}