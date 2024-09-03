package creacional.builder.impl;

import creacional.builder.Builder;
import creacional.builder.components.Engine;
import creacional.builder.components.GPSNavigator;
import creacional.builder.components.TripComputer;
import creacional.builder.enums.CarType;
import creacional.builder.enums.Transmission;
import creacional.builder.output.manual.Manual;

public class CarManualBuilderImpl implements Builder{
	 private CarType type;
	    private int seats;
	    private Engine engine;
	    private Transmission transmission;
	    private TripComputer tripComputer;
	    private GPSNavigator gpsNavigator;

	    @Override
	    public void setCarType(CarType type) {
	        this.type = type;
	    }

	    @Override
	    public void setSeats(int seats) {
	        this.seats = seats;
	    }

	    @Override
	    public void setEngine(Engine engine) {
	        this.engine = engine;
	    }

	    @Override
	    public void setTransmission(Transmission transmission) {
	        this.transmission = transmission;
	    }

	    @Override
	    public void setTripComputer(TripComputer tripComputer) {
	        this.tripComputer = tripComputer;
	    }

	    @Override
	    public void setGPSNavigator(GPSNavigator gpsNavigator) {
	        this.gpsNavigator = gpsNavigator;
	    }

	    public Manual getResult() {
	        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	    }
}
