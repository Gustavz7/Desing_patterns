package estructural.adapter;

import estructural.adapter.round.RoundHole;
import estructural.adapter.round.RoundShape;
import estructural.adapter.square.SquareShape;

/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		// Round fits round, no surprise.
		RoundHole hole = new RoundHole(5);
		RoundShape rpeg = new RoundShape(5);
		if (hole.fits(rpeg)) {
			System.out.println("Round peg r5 fits round hole r5.");
		}

		SquareShape smallSqPeg = new SquareShape(2);
		SquareShape largeSqPeg = new SquareShape(20);
		// hole.fits(smallSqPeg); // Won't compile.

		// Adapter solves the problem.
		SquareShapeAdapter smallSqPegAdapter = new SquareShapeAdapter(smallSqPeg);
		SquareShapeAdapter largeSqPegAdapter = new SquareShapeAdapter(largeSqPeg);
		if (hole.fits(smallSqPegAdapter)) {
			System.out.println("Square peg w2 fits round hole r5.");
		}
		if (!hole.fits(largeSqPegAdapter)) {
			System.out.println("Square peg w20 does not fit into round hole r5.");
		}
	}
}