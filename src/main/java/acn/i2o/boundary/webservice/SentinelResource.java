package acn.i2o.boundary.webservice;

import acn.i2o.control.service.SentinelService;
import acn.i2o.control.valueobject.Awtomatic;
import acn.i2o.entity.CarSeller;
import acn.i2o.entity.Insurance;
import acn.i2o.entity.Police;
import acn.i2o.entity.Repairshop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sentinel")
public class SentinelResource {

    @Autowired
    SentinelService sentinelService;

    @CrossOrigin
    @RequestMapping(
            value = "/create/carseller",
            method = RequestMethod.POST,
            consumes = "application/json")
    public String generate(@RequestBody CarSeller record) {

        return sentinelService.put(record);
    }

    @CrossOrigin
    @RequestMapping(
            value = "/create/insurance",
            method = RequestMethod.POST,
            consumes = "application/json")
    public String generate(@RequestBody Insurance record) {

        return sentinelService.put(record);
    }

    @CrossOrigin
    @RequestMapping(
            value = "/create/police",
            method = RequestMethod.POST,
            consumes = "application/json")
    public String generate(@RequestBody Police record) {

        return sentinelService.put(record);
    }

    @CrossOrigin
    @RequestMapping(
            value = "/create/repairshop",
            method = RequestMethod.POST,
            consumes = "application/json")
    public String generate(@RequestBody Repairshop record) {

        return sentinelService.put(record);
    }

    @CrossOrigin
    @RequestMapping(
            value = "/awtomatic-records",
            method = RequestMethod.GET,
            produces = "application/json")
    public List<Awtomatic> getRecords() {

        return sentinelService.getAllAwtomaticRecords();
    }
}
