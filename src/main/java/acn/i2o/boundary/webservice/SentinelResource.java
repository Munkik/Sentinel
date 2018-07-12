package acn.i2o.boundary.webservice;

import acn.i2o.control.service.SentinelService;
import acn.i2o.control.valueobject.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/sentinel")
public class SentinelResource {

    @Autowired
    SentinelService sentinelService;

    @RequestMapping(
            value = "/create",
            method = RequestMethod.POST,
            consumes = "application/json")
    public String generate(@RequestBody Record record) {

        return sentinelService.generate(record);
    }

    @RequestMapping(
            value = "/get",
            method = RequestMethod.GET,
            produces = "application/json")
    public List<Record> getRecords() {

        return sentinelService.getRecords();
    }
}
