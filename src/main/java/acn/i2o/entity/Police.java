package acn.i2o.entity;

import java.util.Objects;

public class Police {

    private String vin;

    private String policeReport;

    private String date;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPoliceReport() {
        return policeReport;
    }

    public void setPoliceReport(String policeReport) {
        this.policeReport = policeReport;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Police police = (Police) o;
        return Objects.equals(vin, police.vin) &&
                Objects.equals(policeReport, police.policeReport) &&
                Objects.equals(date, police.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vin, policeReport, date);
    }
}
