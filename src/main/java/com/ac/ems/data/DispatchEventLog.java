package com.ac.ems.data;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class captures event state changes that occur.
 * 
 * @author ac010168
 *
 */
public class DispatchEventLog {

  /** The eventID */
  private long   eventID;
  /** The new/current state of the event */
  private String curState;
  /** The date this state change occurred */
  private Date   changedOnDate;
  /** The userID who recorded this state change */
  private long   changedByUserID;
  
  /** Default Constructor */
  public DispatchEventLog() {
    eventID         = -1L;
    curState        = null;
    changedOnDate   = null;
    changedByUserID = -1L;
  }
  
  /**
   * Basic Constructor
   * 
   * @param eventID
   * @param curState
   * @param changedOnDate
   * @param changedByUserID
   */
  public DispatchEventLog(long eventID, String curState, Date changedOnDate, long changedByUserID) {
    this.eventID         = eventID;
    this.curState        = curState;
    this.changedOnDate   = changedOnDate;
    this.changedByUserID = changedByUserID;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public DispatchEventLog(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      DispatchEventLog jsonData = mapper.readValue(jsonString, DispatchEventLog.class);
      eventID         = jsonData.eventID;
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
