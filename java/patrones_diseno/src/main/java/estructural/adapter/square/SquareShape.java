package estructural.adapter.square;

/**
 * SquareShape are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public class SquareShape {

	private double width;

	public SquareShape(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double getSquare() {
		double result;
		result = Math.pow(this.width, 2);
		return result;
	}
}
