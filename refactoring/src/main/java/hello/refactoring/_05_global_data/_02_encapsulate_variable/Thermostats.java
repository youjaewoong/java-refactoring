package hello.refactoring._05_global_data._02_encapsulate_variable;

public class Thermostats {

    private static Integer targetTemperature = 70;

    private static Boolean heating = true;

    private static Boolean cooling = false;

    private static Boolean readInFahrenheit = true;

	public static Integer getTargetTemperature() {
		return targetTemperature;
	}

	public static void setTargetTemperature(Integer targetTemperature) {
		Thermostats.targetTemperature = targetTemperature;
	}

	public static Boolean getHeating() {
		return heating;
	}

	public static void setHeating(Boolean heating) {
		Thermostats.heating = heating;
	}

	public static Boolean getCooling() {
		return cooling;
	}

	public static void setCooling(Boolean cooling) {
		// TODO validation
		Thermostats.cooling = cooling;
		// TODO notify
	}

	public static Boolean getReadInFahrenheit() {
		return readInFahrenheit;
	}

	public static void setReadInFahrenheit(Boolean readInFahrenheit) {
		Thermostats.readInFahrenheit = readInFahrenheit;
	}
    
    

}
