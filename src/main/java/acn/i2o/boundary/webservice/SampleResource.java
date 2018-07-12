package acn.i2o.boundary.webservice;

import acn.i2o.control.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleResource
{
    SampleService sampleService = new SampleService();

    @GetMapping
    public String index() {
        return sampleService.welcome();
    }
}
