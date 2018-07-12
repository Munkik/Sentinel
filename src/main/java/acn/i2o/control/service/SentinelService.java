package acn.i2o.control.service;

import acn.i2o.control.blockchain.HyperLedgerService;
import acn.i2o.control.valueobject.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentinelService {

    @Autowired
    HyperLedgerService hyperLedgerStub;

    public String generate(Record record) {
        return hyperLedgerStub.generate(record);
    }

    public List<Record> getRecords() {
        return hyperLedgerStub.getRecords();
    }
}
