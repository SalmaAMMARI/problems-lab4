package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    //Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return (double) this.temperatureCelsius*9/5+32;

   }

     //Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f°C (%.1f°F) and %s",
                this.temperatureCelsius,
                temperatureFahrenheit(),
                this.conditions);

    }

    // Static factory method to create a WeatherData record from Fahrenheit
   public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       double tempCelsius = (tempFahrenheit - 32) * 5 / 9;
       return new WeatherData(tempCelsius, conditions);

    }

    public static void main(String[] args) {

        WeatherData yesterday = WeatherData.fromFahrenheit(50.0, "Cloudy");


        WeatherData today = new WeatherData(25.0, "Sunny");


        System.out.println("Today's weather: " + today.getSummary());
        System.out.println("Yesterday's weather: " + yesterday.getSummary());


    }
}
