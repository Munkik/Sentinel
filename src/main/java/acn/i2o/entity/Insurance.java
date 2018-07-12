package acn.i2o.entity;

import java.util.Objects;

public class Insurance {

    private String vin;

    private String datePaid;

    private String payer;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insurance insurance = (Insurance) o;
        return Objects.equals(vin, insurance.vin) &&
                Objects.equals(datePaid, insurance.datePaid) &&
                Objects.equals(payer, insurance.payer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vin, datePaid, payer);
    }
}
