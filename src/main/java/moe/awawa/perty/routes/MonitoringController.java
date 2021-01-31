package moe.awawa.perty.routes;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class MonitoringController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "OK";
    }
}
