package by.nurbolat.weatherappv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherAppV1Application {

    public static void main(String[] args) {
        var context = SpringApplication.run(WeatherAppV1Application.class, args);
    }

}
