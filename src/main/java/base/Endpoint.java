package base;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * springboot
 * Created by his majesty jansedlakMBp on 23/10/2017.
 */
@Component
@Path("/hello")
public class Endpoint {

    @GET
    public String message(){
        return "Hello!";
    }
}
