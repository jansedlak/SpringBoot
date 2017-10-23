import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * springboot
 * Created by his majesty jansedlakMBp on 23/10/2017.
 */
@Component
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig() {
        register(Endpoint.class);
    }
}
