package creacional.methodfactory.factory.impl;

import creacional.methodfactory.factory.Dialog;
import creacional.methodfactory.product.Button;
import creacional.methodfactory.product.impl.HtmlButton;

public class HtmlDialogImpl extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
