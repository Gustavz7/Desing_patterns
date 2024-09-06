package creacional.abstractfactory.factory.demo;

import creacional.abstractfactory.buttons.Button;
import creacional.abstractfactory.checkboxes.Checkbox;
import creacional.abstractfactory.factory.GUIFactory;

public class Application {
	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
