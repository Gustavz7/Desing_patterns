package creacional.builder;

import creacional.builder.components.Engine;
import creacional.builder.components.GPSNavigator;
import creacional.builder.components.TripComputer;
import creacional.builder.enums.CarType;
import creacional.builder.enums.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
