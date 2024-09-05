package creacional.methodfactory.factory;

import creacional.methodfactory.factory.impl.HtmlDialogImpl;
import creacional.methodfactory.factory.impl.WindowsDialogImpl;

public class Demo {
	private static Dialog dialog;

	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}

	/**
	 * The concrete factory is usually chosen depending on configuration or
	 * environment options.
	 */
	static void configure() {
		if (System.getProperty("os.name").equals("Windows 10")) {
			dialog = new WindowsDialogImpl();
		} else {
			dialog = new HtmlDialogImpl();
		}
	}

	/**
	 * All of the client code should work with factories and products through
	 * abstract interfaces. This way it does not care which factory it works with
	 * and what kind of product it returns.
	 */
	static void runBusinessLogic() {
		dialog.renderWindow();
	}
}
