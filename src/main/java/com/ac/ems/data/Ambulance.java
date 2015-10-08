package com.ac.ems.data;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Simple model for an ambulance
 * 
 * @author ac010168
 *
 */
public class Ambulance {

  /** The unique ID for this ambulance */
  private long   ambulanceID;
  /** the EMSProvider ID this ambulance is assigned to */
  private long   providerID;
  /** The current latitude of the ambulance */
  private double ambLat;
  /** The current longitude of the ambulance */
  private double ambLon;
  /** The date the location was last updated */
  private Date   lastUpdate;
  
  /**
   * Default Constructor
   */
  public Ambulance() {
    ambulanceID = -1L;
    providerID  = -1L;
    ambLat      = -1.0;
    ambLon      = -1.0;
    lastUpdate  = null;
  }
  
  /**
   * Basic Constructor
   * 
   * @param ambulanceID
   * @param providerID
   * @param ambLat
   * @param ambLon
   * @param lastUpdate
   */
  public Ambulance(long ambulanceID, long providerID, double ambLat, double ambLon, Date lastUpdate) {
    this.ambulanceID = ambulanceID;
    this.providerID  = providerID;
    this.ambLat      = ambLat;
    this.ambLon      = ambLon;
    this.lastUpdate  = lastUpdate;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public Ambulance(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      Ambulance jsonData = mapper.readValue(jsonString, Ambulance.class);
      ambulanceID = jsonData.ambulanceID;
      providerID  = jsonData.providerID;
      ambLat      = jsonData.ambLat;
      ambLon      = jsonData.ambLon;
      lastUpdate  = jsonData.lastUpdate;
    } catch (JsonParseException jpe) {
      jpe.printStackTrace();
    } catch (JsonMappingException jme) {
      jme.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    
  }
  
  /**
   * @return the ambulanceID
   */
  public long getAmbulanceID() {
    return ambulanceID;
  }
  /**
   * @param ambulanceID the ambulanceID to set
   */
  public void setAmbulanceID(long ambulanceID) {
    this.ambulanceID = ambulanceID;
  }
  /**
   * @return the providerID
   */
  public long getProviderID() {
    return providerID;
  }
  /**
   * @param providerID the providerID to set
   */
  public void setProviderID(long providerID) {
    this.providerID = providerID;
  }
  /**
   * @return the ambLat
   */
  public double getAmbLat() {
    return ambLat;
  }
  /**
   * @param ambLat the ambLat to set
   */
  public void setAmbLat(double ambLat) {
    this.ambLat = ambLat;
  }
  /**
   * @return the ambLon
   */
  public double getAmbLon() {
    return ambLon;
  }
  /**
   * @param ambLon the ambLon to set
   */
  public void setAmbLon(double ambLon) {
    this.ambLon = ambLon;
  }
  /**
   * @return the lastUpdate
   */
  public Date getLastUpdate() {
    return lastUpdate;
  }
  /**
   * @param lastUpdate the lastUpdate to set
   */
  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}
