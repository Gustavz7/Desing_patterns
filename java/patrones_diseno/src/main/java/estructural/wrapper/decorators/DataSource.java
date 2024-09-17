package estructural.wrapper.decorators;

public interface DataSource {
	void writeData(String data);

	String readData();
}