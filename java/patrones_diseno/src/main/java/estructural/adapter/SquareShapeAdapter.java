package estructural.adapter;

import estructural.adapter.round.RoundShape;
import estructural.adapter.square.SquareShape;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquareShapeAdapter extends RoundShape {
    private SquareShape peg;

    public SquareShapeAdapter(SquareShape peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}