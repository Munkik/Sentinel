package acn.i2o.entity;

public class Bank {

    private String vin;

    private String titleIssueDate;

    private String seller;

    private String saleLocation;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTitleIssueDate() {
        return titleIssueDate;
    }

    public void setTitleIssueDate(String titleIssueDate) {
        this.titleIssueDate = titleIssueDate;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getSaleLocation() {
        return saleLocation;
    }

    public void setSaleLocation(String saleLocation) {
        this.saleLocation = saleLocation;
    }
}
