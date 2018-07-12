package acn.i2o.control.blockchain;

import acn.i2o.control.blockchain.stub.Stub_Carseller;
import acn.i2o.control.blockchain.stub.Stub_Insurance;
import acn.i2o.control.blockchain.stub.Stub_Police;
import acn.i2o.control.blockchain.stub.Stub_Repairshop;
import acn.i2o.entity.CarSeller;
import acn.i2o.entity.Insurance;
import acn.i2o.entity.Police;
import acn.i2o.entity.Repairshop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}