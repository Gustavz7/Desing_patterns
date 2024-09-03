package creacional.builder.demo;

import creacional.builder.director.Director;
import creacional.builder.impl.CarBuilderImpl;
import creacional.builder.impl.CarManualBuilderImpl;
import creacional.builder.output.car.Car;
import creacional.builder.output.manual.Manual;

public class Demo {
	public static void main(String[] args) {
		Director director = new Director();

		// Director gets the concrete builder object from the client
		// (application code). That's because application knows better which
		// builder to use to get a specific product.
		CarBuilderImpl builder = new CarBuilderImpl();
		director.constructSportsCar(builder);

		// The final product is often retrieved from a builder object, since
		// Director is not aware and not dependent on concrete builders and
		// products.
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getCarType());

		CarManualBuilderImpl manualBuilder = new CarManualBuilderImpl();

		// Director may know several building recipes.
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());
	}

}
