package acn.i2o.control.blockchain;

import acn.i2o.control.blockchain.stub.Stub_Carseller;
import acn.i2o.control.blockchain.stub.Stub_Insurance;
import acn.i2o.control.blockchain.stub.Stub_Police;
import acn.i2o.control.blockchain.stub.Stub_Repairshop;
import acn.i2o.control.valueobject.Awtomatic;
import acn.i2o.entity.CarSeller;
import acn.i2o.entity.Insurance;
import acn.i2o.entity.Police;
import acn.i2o.entity.Repairshop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HyperLedgerService {

    @Autowired
    Stub_Carseller stub_carseller;

    @Autowired
    Stub_Insurance stub_insurance;

    @Autowired
    Stub_Police stub_police;

    @Autowired
    Stub_Repairshop stub_repairshop;

    public List<Awtomatic> awtomaticRecords(){

        List<Awtomatic> awtomaticList = new ArrayList<Awtomatic>();
        List<CarSeller> carSellerList = stub_carseller.get();
        for (CarSeller carSeller : carSellerList) {

            Awtomatic awtomatic = new Awtomatic();
            awtomatic.setCarSeller(carSeller);
            String vin = carSeller.getVin();
            awtomatic.setPoliceList(stub_police.get(vin));
            awtomatic.setInsuranceList(stub_insurance.get(vin));
            awtomatic.setRepairshopList(stub_repairshop.get(vin));
            awtomaticList.add(awtomatic);
        }

        return awtomaticList;
    }

    public String insertCarSellerRecord(CarSeller carSeller){

        return stub_carseller.put(carSeller);
    }

    public String insertInsuranceRecord(Insurance insurance){

        return stub_insurance.put(insurance);
    }

    public String insertPoliceRecord(Police police){

        return stub_police.put(police);
    }

    public String insertRepairshopRecord(Repairshop repairshop){

        return stub_repairshop.put(repairshop);
    }

    public Awtomatic getAwtomaticRecord(String vin) {

        CarSeller carSeller = stub_carseller.get(vin);

        Awtomatic awtomatic = new Awtomatic();
        awtomatic.setCarSeller(carSeller);
        awtomatic.setPoliceList(stub_police.get(vin));
        awtomatic.setInsuranceList(stub_insurance.get(vin));
        awtomatic.setRepairshopList(stub_repairshop.get(vin));
        return awtomatic;
    }

    public List<Insurance> getInsurance(String vin){

        return stub_insurance.get(vin);
    }

    public List<Police> getPolice(String vin){

        return stub_police.get(vin);
    }

    public List<Repairshop> getRepair(String vin){

        return stub_repairshop.get(vin);
    }
}