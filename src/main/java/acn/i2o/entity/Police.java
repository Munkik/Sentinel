package acn.i2o.entity;

import java.util.List;
import java.util.Objects;

public class Police {

    private String vin;

    private String reportId;

    private String desc;

    private String dateOfIncident;

    private List<String> involvedParties;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDateOfIncident() {
        return dateOfIncident;
    }

    public void setDateOfIncident(String dateOfIncident) {
        this.dateOfIncident = dateOfIncident;
    }

    public List<String> getInvolvedParties() {
        return involvedParties;
    }

    public void setInvolvedParties(List<String> involvedParties) {
        this.involvedParties = involvedParties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Police police = (Police) o;
        return Objects.equals(vin, police.vin) &&
                Objects.equals(reportId, police.reportId) &&
                Objects.equals(desc, police.desc) &&
                Objects.equals(dateOfIncident, police.dateOfIncident) &&
                Objects.equals(involvedParties, police.involvedParties);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vin, reportId, desc, dateOfIncident, involvedParties);
    }
}
