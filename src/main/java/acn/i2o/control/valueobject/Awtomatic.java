package acn.i2o.control.valueobject;

import acn.i2o.entity.CarSeller;
import acn.i2o.entity.Insurance;
import acn.i2o.entity.Police;
import acn.i2o.entity.Repairshop;

import java.util.List;
import java.util.Objects;

public class Awtomatic {

    private CarSeller carSeller;

    private List<Insurance> insuranceList;

    private List<Police> policeList;

    private List<Repairshop> repairshopList;

    public CarSeller getCarSeller() {
        return carSeller;
    }

    public void setCarSeller(CarSeller carSeller) {
        this.carSeller = carSeller;
    }

    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(List<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public List<Police> getPoliceList() {
        return policeList;
    }

    public void setPoliceList(List<Police> policeList) {
        this.policeList = policeList;
    }

    public List<Repairshop> getRepairshopList() {
        return repairshopList;
    }

    public void setRepairshopList(List<Repairshop> repairshopList) {
        this.repairshopList = repairshopList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Awtomatic awtomatic = (Awtomatic) o;
        return Objects.equals(carSeller, awtomatic.carSeller) &&
                Objects.equals(insuranceList, awtomatic.insuranceList) &&
                Objects.equals(policeList, awtomatic.policeList) &&
                Objects.equals(repairshopList, awtomatic.repairshopList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(carSeller, insuranceList, policeList, repairshopList);
    }
}
