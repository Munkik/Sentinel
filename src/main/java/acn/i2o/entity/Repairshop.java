package acn.i2o.entity;

import java.util.Objects;

public class Repairshop {

    private String vin;

    private String damageDescription;

    private String damageDate;

    private String damageLocation;

    private String repairShop;

    private String shopLocation;

    private String repairDate;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDamageDescription() {
        return damageDescription;
    }

    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    public String getDamageDate() {
        return damageDate;
    }

    public void setDamageDate(String damageDate) {
        this.damageDate = damageDate;
    }

    public String getDamageLocation() {
        return damageLocation;
    }

    public void setDamageLocation(String damageLocation) {
        this.damageLocation = damageLocation;
    }

    public String getRepairShop() {
        return repairShop;
    }

    public void setRepairShop(String repairShop) {
        this.repairShop = repairShop;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation;
    }

    public String getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(String repairDate) {
        this.repairDate = repairDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repairshop that = (Repairshop) o;
        return Objects.equals(vin, that.vin) &&
                Objects.equals(damageDescription, that.damageDescription) &&
                Objects.equals(damageDate, that.damageDate) &&
                Objects.equals(damageLocation, that.damageLocation) &&
                Objects.equals(repairShop, that.repairShop) &&
                Objects.equals(shopLocation, that.shopLocation) &&
                Objects.equals(repairDate, that.repairDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vin, damageDescription, damageDate, damageLocation, repairShop, shopLocation, repairDate);
    }
}
