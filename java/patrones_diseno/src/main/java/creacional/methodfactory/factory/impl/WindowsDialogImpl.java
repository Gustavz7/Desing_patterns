package creacional.methodfactory.factory.impl;

import creacional.methodfactory.factory.Dialog;
import creacional.methodfactory.product.Button;
import creacional.methodfactory.product.impl.WindowsButton;

public class WindowsDialogImpl extends Dialog {
	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
