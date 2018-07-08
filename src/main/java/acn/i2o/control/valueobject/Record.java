package acn.i2o.control.valueobject;

import java.util.Map;

public class Record {

  String recordType;
  String recordOwner;
  String notes;
  String dateCreated;
  Map<String, Object> item;
  Map<String, Object> description;

  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public String getRecordOwner() {
    return recordOwner;
  }

  public void setRecordOwner(String recordOwner) {
    this.recordOwner = recordOwner;
  }

  public Map<String, Object> getItem() {
    return item;
  }

  public void setItem(Map<String, Object> item) {
    this.item = item;
  }

  public Map<String, Object> getDescription() {
    return description;
  }

  public void setDescription(Map<String, Object> description) {
    this.description = description;
  }

  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }
}
