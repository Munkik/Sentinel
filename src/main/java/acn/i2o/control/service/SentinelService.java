package acn.i2o.control.service;

import acn.i2o.control.blockchain.HyperLedgerStub;
import acn.i2o.control.valueobject.Record;

import java.util.List;

public class SentinelService {

    HyperLedgerStub hyperLedgerStub = new HyperLedgerStub();

    public String generate(Record record) {
        return hyperLedgerStub.generate(record);
    }

    public List<Record> getRecords() {
        return hyperLedgerStub.getRecords();
    }
}
