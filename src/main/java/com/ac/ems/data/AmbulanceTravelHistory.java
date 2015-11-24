package com.ac.ems.data;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class captures ambulance locations while the ambulance is en route.
 * 
 * @author ac010168
 *
 */
public class AmbulanceTravelHistory {
  
  /** The ambulance ID */
  private long   ambulanceID;
  /** The event for which this ambulance is responding */
  private long   eventID;
  /** The current latitude of the ambulance */
  private double ambLat;
  /** The current longitude of the ambulance */
  private double ambLon;
  /** The date this location was recorded */
  private Date   recordedDate;
  
  /** Default Constructor */
  public AmbulanceTravelHistory() {
    ambulanceID  = -1L;
    eventID      = -1L;
    ambLat       = 0.0;
    ambLon       = 0.0;
    recordedDate = null;
  }
  
  /**
   * Basic Constructor
   * 
   * @param ambulanceID
   * @param eventID
   * @param ambLat
   * @param ambLon
   * @param recordedDate
   */
  public AmbulanceTravelHistory(long ambulanceID, long eventID, double ambLat, double ambLon, Date recordedDate) {
    this.ambulanceID  = ambulanceID;
    this.eventID      = eventID;
    this.ambLat       = ambLat;
    this.ambLon       = ambLon;
    this.recordedDate = recordedDate;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public AmbulanceTravelHistory(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      AmbulanceTravelHistory jsonData = mapper.readValue(jsonString, AmbulanceTravelHistory.class);
      ambulanceID  = jsonData.ambulanceID;
      eventID      = jsonData.eventID;
      ambLat       = jsonData.ambLat;
      ambLon       = jsonData.ambLon;
      recordedDate = jsonData.recordedDate;
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
   * @return the eventID
   */
  public long getEventID() {
    return eventID;
  }
  /**
   * @param eventID the eventID to set
   */
  public void setEventID(long eventID) {
    this.eventID = eventID;
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
   * @return the recordedDate
   */
  public Date getRecordedDate() {
    return recordedDate;
  }
  /**
   * @param recordedDate the recordedDate to set
   */
  public void setRecordedDate(Date recordedDate) {
    this.recordedDate = recordedDate;
  }
}
