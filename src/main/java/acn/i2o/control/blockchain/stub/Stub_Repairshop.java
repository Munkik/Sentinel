package acn.i2o.control.blockchain.stub;

import acn.i2o.entity.Repairshop;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class Stub_Repairshop {

    public String put(Repairshop police) {

        File folder = new File("c:\\repair_temp");
        if (!folder.exists()){
            folder.mkdir();
        }
        String pathname = pathname(folder);
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(pathname), police);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Temporary data created at : " + pathname;
    }

    public List<Repairshop> get(String vin)  {

        List<Repairshop> recordList = new ArrayList();
        File folder = new File("c:\\repair_temp");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                ObjectMapper mapper = new ObjectMapper();
                Repairshop record = null;
                try {
                    record = mapper.readValue(
                            new File("c:\\repair_temp\\" + file.getName()),
                            Repairshop.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (record.getVin().equalsIgnoreCase(vin)) {
                    recordList.add(record);
                }
            }
        }
        return recordList;
    }

    private String pathname(File folder) {
        if (folder.listFiles() != null) {
            return folder + "\\repair" + folder.listFiles().length + ".json";
        } else {
            return folder + "repair.json";
        }
    }
}
