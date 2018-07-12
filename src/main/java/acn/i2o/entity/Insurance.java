package acn.i2o.entity;

import java.util.Objects;

public class Insurance {

    private String vin;

    private String company;

    private String policyNo;

    private String coverPeriod;

    private String claims;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getCoverPeriod() {
        return coverPeriod;
    }

    public void setCoverPeriod(String coverPeriod) {
        this.coverPeriod = coverPeriod;
    }

    public String getClaims() {
        return claims;
    }

    public void setClaims(String claims) {
        this.claims = claims;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insurance insurance = (Insurance) o;
        return Objects.equals(vin, insurance.vin) &&
                Objects.equals(company, insurance.company) &&
                Objects.equals(policyNo, insurance.policyNo) &&
                Objects.equals(coverPeriod, insurance.coverPeriod) &&
                Objects.equals(claims, insurance.claims);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vin, company, policyNo, coverPeriod, claims);
    }
}
