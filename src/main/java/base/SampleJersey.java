package base;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * springboot
 * Created by his majesty jansedlakMBp on 23/10/2017.
 */

@SpringBootApplication
public class SampleJersey extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new SampleJersey()
                .configure(new SpringApplicationBuilder(SampleJersey.class))
                .run(args);
    }
}
