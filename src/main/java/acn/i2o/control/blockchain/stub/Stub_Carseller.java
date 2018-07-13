package acn.i2o.control.blockchain.stub;

import acn.i2o.entity.CarSeller;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class Stub_Carseller {

    public String put(CarSeller carSeller) {

        File folder = new File("c:\\carseller_temp");
        if (!folder.exists()){
            folder.mkdir();
        }
        String pathname = pathname(folder);
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(pathname), carSeller);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Temporary data created at : " + pathname;
    }

    public List<CarSeller> get()  {

        List<CarSeller> recordList = new ArrayList();
        File folder = new File("c:\\carseller_temp");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                ObjectMapper mapper = new ObjectMapper();
                CarSeller record = null;
                try {
                    record = mapper.readValue(
                            new File("c:\\carseller_temp\\" + file.getName()),
                            CarSeller.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                recordList.add(record);
            }

        }
        return recordList;
    }

    public CarSeller get(String vin)  {

        File folder = new File("c:\\carseller_temp");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                ObjectMapper mapper = new ObjectMapper();
                CarSeller record = null;
                try {
                    record = mapper.readValue(
                            new File("c:\\carseller_temp\\" + file.getName()),
                            CarSeller.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (record.getVin().equalsIgnoreCase(vin)){
                    return record;
                }
            }

        }
        return null;
    }

    private String pathname(File folder) {
        if (folder.listFiles() != null) {
            return folder + "\\carseller" + folder.listFiles().length + ".json";
        } else {
            return folder + "carseller.json";
        }
    }
}
