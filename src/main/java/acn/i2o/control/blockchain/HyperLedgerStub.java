package acn.i2o.control.blockchain;

import acn.i2o.control.valueobject.Record;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HyperLedgerStub {

    public String generate(Record record) {

        String date = new SimpleDateFormat("MM/dd/yy").format(new Date());
        record.setDateCreated(date);
        File folder = new File("c:\\sentinel_temp");
        if (!folder.exists()){
            folder.mkdir();
        }
        String pathname = pathname(folder);
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(pathname), record);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Temporary data created at : " + pathname;
    }

    public List<Record> getRecords()  {

        List<Record> recordList = new ArrayList<Record>();
        File folder = new File("c:\\sentinel_temp");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                ObjectMapper mapper = new ObjectMapper();
                Record record = null;
                try {
                    record = mapper.readValue(
                            new File("c:\\sentinel_temp\\" + file.getName()),
                            Record.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                recordList.add(record);
            }
        }
        return recordList;
    }

    private String pathname(File folder) {
        if (folder.listFiles() != null) {
            return folder + "\\Sentinel" + folder.listFiles().length + ".json";
        } else {
            return folder + "Sentinel.json";
        }
    }
}