package acn.i2o.control.service;

import acn.i2o.control.blockchain.HyperLedgerService;
import acn.i2o.control.valueobject.Awtomatic;
import acn.i2o.control.valueobject.Record;
import acn.i2o.entity.CarSeller;
import acn.i2o.entity.Insurance;
import acn.i2o.entity.Police;
import acn.i2o.entity.Repairshop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentinelService {

    @Autowired
    HyperLedgerService hyperLedgerService;

    public List<Awtomatic> getAllAwtomaticRecords(){

        return hyperLedgerService.awtomaticRecords();
    }

    public String put(CarSeller carSeller){

        return hyperLedgerService.insertCarSellerRecord(carSeller);
    }
    public String put(Insurance insurance){

        return hyperLedgerService.insertInsuranceRecord(insurance);
    }
    public String put(Police police){

        return hyperLedgerService.insertPoliceRecord(police);
    }
    public String put(Repairshop repairshop){

        return hyperLedgerService.insertRepairshopRecord(repairshop);
    }

    public Awtomatic getAwtomaticRecord(String vin) {

        return hyperLedgerService.getAwtomaticRecord(vin);
    }
}
