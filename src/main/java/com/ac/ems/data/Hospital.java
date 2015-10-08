package com.ac.ems.data;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This version of the hospital comes from the last version of this project, almost completely untouched.
 * 
 * @author ac010168
 *
 */
public class Hospital {

  /** The unique Hospital ID */
  private long     hospitalID;
  /** The hospital Name */
  private String   hospitalName;
  /** The latitude of the hospital's location */
  private double   hospitalLat;
  /** The longitude of the hospital's location */
  private double   hospitalLon;
  /** The hospital location */
  private String   address;
  /** A list of the levels of care available at this hospital */
  private String[] levelOfCare;
  /** A list of the host ages provided at this hospital */
  private String[] hostAges;
  /** The number of trauma beds present at the hospital */
  private int      traumaBeds;
  /** The available trauma beds */
  private int      traumaBedsFree;
  /** The number of occupied trauma beds */
  private int      traumaBedsOccupied;
  /** The number of beds transitioning to cleanup */
  private int      traumaBedsCleanup;
  /** The number of the ER beds */
  private int      erBeds;
  /** The number of the ER beds currently available */
  private int      erBedsFree;
  /** The number of the ER beds currently occupied */
  private int      erBedsOccupied;
  /** The number of the ER beds transitioning to cleanup */
  private int      erBedsCleanup;
  
  /** The current ER Divert state */
  private String   erDivert;
  /** The current Trauma Divert state */
  private String   traumaDivert;
  /** The current Burn Divert state */
  private String   burnDivert;
  /** The current STEMI Divert state */
  private String   stemiDivert;
  /** The current Stroke Divert state */
  private String   strokeDivert;

  public Hospital() {
    hospitalID         = -1;
    hospitalName       = null;
    hospitalLat        = 0.0;
    hospitalLon        = 0.0;
    address            = null;
    levelOfCare        = null;
    hostAges           = null;
    traumaBeds         = -1;
    traumaBedsFree     = -1;
    traumaBedsOccupied = -1;
    traumaBedsCleanup  = -1;
    erBeds             = -1;
    erBedsFree         = -1;
    erBedsOccupied     = -1;
    erBedsCleanup      = -1;
    
    erDivert           = null;
    traumaDivert       = null;
    burnDivert         = null;
    stemiDivert        = null;
    strokeDivert       = null;
  }
  
  public Hospital(long hospitalID, String hospitalName, double hospitalLat, double hospitalLon, String address,
      String[] levelOfCare, String[] hostAges, int traumaBeds, int traumaBedsFree, int traumaBedsOccupied, int traumaBedsCleanup,
      int erBeds, int erBedsFree, int erBedsOccupied, int erBedsCleanup, String erDivert, String traumaDivert, String burnDivert,
      String stemiDivert, String strokeDivert) {
    this.hospitalID         = hospitalID;
    this.hospitalName       = hospitalName;
    this.hospitalLat        = hospitalLat;
    this.hospitalLon        = hospitalLon;
    this.address            = address;
    this.levelOfCare        = levelOfCare;
    this.hostAges           = hostAges;
    this.traumaBeds         = traumaBeds;
    this.traumaBedsFree     = traumaBedsFree;
    this.traumaBedsOccupied = traumaBedsOccupied;
    this.traumaBedsCleanup  = traumaBedsCleanup;
    this.erBeds             = erBeds;
    this.erBedsFree         = erBedsFree;
    this.erBedsOccupied     = erBedsOccupied;
    this.erBedsCleanup      = erBedsOccupied;
    
    this.erDivert           = erDivert;
    this.traumaDivert       = traumaDivert;
    this.burnDivert         = burnDivert;
    this.stemiDivert        = stemiDivert;
    this.strokeDivert       = strokeDivert;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public Hospital(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      Hospital jsonData = mapper.readValue(jsonString, Hospital.class);
      hospitalID         = jsonData.hospitalID;
      hospitalName       = jsonData.hospitalName;
      hospitalLat        = jsonData.hospitalLat;
      hospitalLon        = jsonData.hospitalLon;
      address            = jsonData.address;
      levelOfCare        = jsonData.levelOfCare;
      hostAges           = jsonData.hostAges;
      traumaBeds         = jsonData.traumaBeds;
      traumaBedsFree     = jsonData.traumaBedsFree;
      traumaBedsOccupied = jsonData.traumaBedsOccupied;
      traumaBedsCleanup  = jsonData.traumaBedsCleanup;
      erBeds             = jsonData.erBeds;
      erBedsFree         = jsonData.erBedsFree;
      erBedsOccupied     = jsonData.erBedsOccupied;
      erBedsCleanup      = jsonData.erBedsOccupied;
      
      erDivert           = jsonData.erDivert;
      traumaDivert       = jsonData.traumaDivert;
      burnDivert         = jsonData.burnDivert;
      stemiDivert        = jsonData.stemiDivert;
      strokeDivert       = jsonData.strokeDivert;
    } catch (JsonParseException jpe) {
      jpe.printStackTrace();
    } catch (JsonMappingException jme) {
      jme.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }

  /**
   * @return the hospitalID
   */
  public long getHospitalID() {
    return hospitalID;
  }

  /**
   * @param hospitalID the hospitalID to set
   */
  public void setHospitalID(long hospitalID) {
    this.hospitalID = hospitalID;
  }

  /**
   * @return the hospitalName
   */
  public String getHospitalName() {
    return hospitalName;
  }

  /**
   * @param hospitalName the hospitalName to set
   */
  public void setHospitalName(String hospitalName) {
    this.hospitalName = hospitalName;
  }

  /**
   * @return the hospitalLat
   */
  public double getHospitalLat() {
    return hospitalLat;
  }

  /**
   * @param hospitalLat the hospitalLat to set
   */
  public void setHospitalLat(double hospitalLat) {
    this.hospitalLat = hospitalLat;
  }

  /**
   * @return the hospitalLon
   */
  public double getHospitalLon() {
    return hospitalLon;
  }

  /**
   * @param hospitalLon the hospitalLon to set
   */
  public void setHospitalLon(double hospitalLon) {
    this.hospitalLon = hospitalLon;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * @return the levelOfCare
   */
  public String[] getLevelOfCare() {
    return levelOfCare;
  }

  /**
   * @param levelOfCare the levelOfCare to set
   */
  public void setLevelOfCare(String[] levelOfCare) {
    this.levelOfCare = levelOfCare;
  }

  /**
   * @return the hostAges
   */
  public String[] getHostAges() {
    return hostAges;
  }

  /**
   * @param hostAges the hostAges to set
   */
  public void setHostAges(String[] hostAges) {
    this.hostAges = hostAges;
  }

  /**
   * @return the traumaBeds
   */
  public int getTraumaBeds() {
    return traumaBeds;
  }

  /**
   * @param traumaBeds the traumaBeds to set
   */
  public void setTraumaBeds(int traumaBeds) {
    this.traumaBeds = traumaBeds;
  }

  /**
   * @return the traumaBedsFree
   */
  public int getTraumaBedsFree() {
    return traumaBedsFree;
  }

  /**
   * @param traumaBedsFree the traumaBedsFree to set
   */
  public void setTraumaBedsFree(int traumaBedsFree) {
    this.traumaBedsFree = traumaBedsFree;
  }

  /**
   * @return the traumaBedsOccupied
   */
  public int getTraumaBedsOccupied() {
    return traumaBedsOccupied;
  }

  /**
   * @param traumaBedsOccupied the traumaBedsOccupied to set
   */
  public void setTraumaBedsOccupied(int traumaBedsOccupied) {
    this.traumaBedsOccupied = traumaBedsOccupied;
  }

  /**
   * @return the traumaBedsCleanup
   */
  public int getTraumaBedsCleanup() {
    return traumaBedsCleanup;
  }

  /**
   * @param traumaBedsCleanup the traumaBedsCleanup to set
   */
  public void setTraumaBedsCleanup(int traumaBedsCleanup) {
    this.traumaBedsCleanup = traumaBedsCleanup;
  }

  /**
   * @return the erBeds
   */
  public int getErBeds() {
    return erBeds;
  }

  /**
   * @param erBeds the erBeds to set
   */
  public void setErBeds(int erBeds) {
    this.erBeds = erBeds;
  }

  /**
   * @return the erBedsFree
   */
  public int getErBedsFree() {
    return erBedsFree;
  }

  /**
   * @param erBedsFree the erBedsFree to set
   */
  public void setErBedsFree(int erBedsFree) {
    this.erBedsFree = erBedsFree;
  }

  /**
   * @return the erBedsOccupied
   */
  public int getErBedsOccupied() {
    return erBedsOccupied;
  }

  /**
   * @param erBedsOccupied the erBedsOccupied to set
   */
  public void setErBedsOccupied(int erBedsOccupied) {
    this.erBedsOccupied = erBedsOccupied;
  }

  /**
   * @return the erBedsCleanup
   */
  public int getErBedsCleanup() {
    return erBedsCleanup;
  }

  /**
   * @param erBedsCleanup the erBedsCleanup to set
   */
  public void setErBedsCleanup(int erBedsCleanup) {
    this.erBedsCleanup = erBedsCleanup;
  }

  /**
   * @return the erDivert
   */
  public String getErDivert() {
    return erDivert;
  }

  /**
   * @param erDivert the erDivert to set
   */
  public void setErDivert(String erDivert) {
    this.erDivert = erDivert;
  }

  /**
   * @return the traumaDivert
   */
  public String getTraumaDivert() {
    return traumaDivert;
  }

  /**
   * @param traumaDivert the traumaDivert to set
   */
  public void setTraumaDivert(String traumaDivert) {
    this.traumaDivert = traumaDivert;
  }

  /**
   * @return the burnDivert
   */
  public String getBurnDivert() {
    return burnDivert;
  }

  /**
   * @param burnDivert the burnDivert to set
   */
  public void setBurnDivert(String burnDivert) {
    this.burnDivert = burnDivert;
  }

  /**
   * @return the stemiDivert
   */
  public String getStemiDivert() {
    return stemiDivert;
  }

  /**
   * @param stemiDivert the stemiDivert to set
   */
  public void setStemiDivert(String stemiDivert) {
    this.stemiDivert = stemiDivert;
  }

  /**
   * @return the strokeDivert
   */
  public String getStrokeDivert() {
    return strokeDivert;
  }

  /**
   * @param strokeDivert the strokeDivert to set
   */
  public void setStrokeDivert(String strokeDivert) {
    this.strokeDivert = strokeDivert;
  }
}
