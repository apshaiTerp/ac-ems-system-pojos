package com.ac.ems.data;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class models the capturing of diversion events whenever a hospital changes a diversion state.
 * 
 * @author ac010168
 *
 */
public class HospitalDiversionHistory {

  /** A Unique Identifier for this record */
  private long   diversionID;
  /** Reference to the hospital */
  private long   hospitalID;
  /** The diversion category that was changed */
  private String divertCategory;
  /** The current state of that diversion */
  private String curState;
  /** The date this state was changed */
  private Date   changedOnDate;
  /** The user who initiated this state change */
  private long   changedByUserID;
  
  /** Default Constructor */
  public HospitalDiversionHistory() {
    diversionID     = -1L;
    hospitalID      = -1L;
    divertCategory  = null;
    curState        = null;
    changedOnDate   = null;
    changedByUserID = -1L;
  }
  
  /**
   * Basic Constructor
   * 
   * @param diversionID
   * @param hospitalID
   * @param divertCategory
   * @param curState
   * @param changedOnDate
   * @param changedByUserID
   */
  public HospitalDiversionHistory(long diversionID, long hospitalID, String divertCategory, String curState, 
      Date changedOnDate, long changedByUserID) {
    this.diversionID     = diversionID;
    this.hospitalID      = hospitalID;
    this.divertCategory  = divertCategory;
    this.curState        = curState;
    this.changedOnDate   = changedOnDate;
    this.changedByUserID = changedByUserID;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public HospitalDiversionHistory(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      HospitalDiversionHistory jsonData = mapper.readValue(jsonString, HospitalDiversionHistory.class);
      diversionID     = jsonData.diversionID;
      hospitalID      = jsonData.hospitalID;
      divertCategory  = jsonData.divertCategory;
      curState        = jsonData.curState;
      changedOnDate   = jsonData.changedOnDate;
      changedByUserID = jsonData.changedByUserID;
    } catch (JsonParseException jpe) {
      jpe.printStackTrace();
    } catch (JsonMappingException jme) {
      jme.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
  
  /**
   * @return the diversionID
   */
  public long getDiversionID() {
    return diversionID;
  }
  /**
   * @param diversionID the diversionID to set
   */
  public void setDiversionID(long diversionID) {
    this.diversionID = diversionID;
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
   * @return the divertCategory
   */
  public String getDivertCategory() {
    return divertCategory;
  }
  /**
   * @param divertCategory the divertCategory to set
   */
  public void setDivertCategory(String divertCategory) {
    this.divertCategory = divertCategory;
  }
  /**
   * @return the curState
   */
  public String getCurState() {
    return curState;
  }
  /**
   * @param curState the curState to set
   */
  public void setCurState(String curState) {
    this.curState = curState;
  }
  /**
   * @return the changedOnDate
   */
  public Date getChangedOnDate() {
    return changedOnDate;
  }
  /**
   * @param changedOnDate the changedOnDate to set
   */
  public void setChangedOnDate(Date changedOnDate) {
    this.changedOnDate = changedOnDate;
  }
  /**
   * @return the changedByUserID
   */
  public long getChangedByUserID() {
    return changedByUserID;
  }
  /**
   * @param changedByUserID the changedByUserID to set
   */
  public void setChangedByUserID(long changedByUserID) {
    this.changedByUserID = changedByUserID;
  }
}
