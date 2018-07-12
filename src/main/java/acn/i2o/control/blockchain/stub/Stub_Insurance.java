package acn.i2o.control.blockchain.stub;

import acn.i2o.entity.Insurance;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class Stub_Insurance {

    public String put(Insurance insurance) {

        File folder = new File("c:\\insurance_temp");
        if (!folder.exists()){
            folder.mkdir();
        }
        String pathname = pathname(folder);
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(pathname), insurance);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Temporary data created at : " + pathname;
    }

    public List<Insurance> get(String vin)  {

        List<Insurance> recordList = new ArrayList();
        File folder = new File("c:\\insurance_temp");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                ObjectMapper mapper = new ObjectMapper();
                Insurance record = null;
                try {
                    record = mapper.readValue(
                            new File("c:\\insurance_temp\\" + file.getName()),
                            Insurance.class);
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
            return folder + "\\insurance" + folder.listFiles().length + ".json";
        } else {
            return folder + "insurance.json";
        }
    }
}
