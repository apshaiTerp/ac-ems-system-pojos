package com.ac.ems.data;

import java.io.IOException;
import java.util.Date;

import com.ac.ems.data.enums.SeverityLevel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The core class for monitoring active events.
 * 
 * @author ac010168
 *
 */
public class DispatchEvent {

  /** The eventID that was generated for this event */
  private long   eventID;
  /** The dispatch ID that was generated for this dispatch */
  private long   dispatchID;
  /** The ambulance ID assigned to respond */
  private long   ambulanceID;
  /** The hospital ID recommended at dispatch */
  private long   recommendedHospitalID;
  /** The actual destination hospital.  Can be blank (-1). */
  private long   targetHospitalID;
  /** The current state of the event */
  private String eventState;
  /** The date the event began */
  private Date   eventStartDate;
  /** The date transport of the patient began.  Can be null. */
  private Date   beginTransportDate;
  
  /** The observed age range of the patient */
  private String actualAgeRange;  //Should be limited to "child", "teen", "adult", "unknown"
  /** The observed severity of the patient's condition */
  private SeverityLevel observedSeverity;

  /** Default Constructor */
  public DispatchEvent() {
    eventID               = -1L;
    dispatchID            = -1L;
    ambulanceID           = -1L;
    recommendedHospitalID = -1L;
    targetHospitalID      = -1L;
    eventState            = null;
    eventStartDate        = null;
    beginTransportDate    = null;
    actualAgeRange        = null;
    observedSeverity      = null;
  }

  /**
   * Basic Constructor
   * 
   * @param eventID
   * @param dispatchID
   * @param ambulanceID
   * @param recommendedHospitalID
   * @param targetHospitalID
   * @param eventState
   * @param eventStartDate
   * @param beginTransportDate
   * @param actualAgeRange
   * @param observedSeverity
   */
  public DispatchEvent(long eventID, long dispatchID, long ambulanceID, long recommendedHospitalID,
      long targetHospitalID, String eventState, Date eventStartDate, Date beginTransportDate,
      String actualAgeRange, SeverityLevel observedSeverity) {
    this.eventID               = eventID;
    this.dispatchID            = dispatchID;
    this.ambulanceID           = ambulanceID;
    this.recommendedHospitalID = recommendedHospitalID;
    this.targetHospitalID      = targetHospitalID;
    this.eventState            = eventState;
    this.eventStartDate        = eventStartDate;
    this.beginTransportDate    = beginTransportDate;
    this.actualAgeRange        = actualAgeRange;
    this.observedSeverity      = observedSeverity;
  }

  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public DispatchEvent(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      DispatchEvent jsonData = mapper.readValue(jsonString, DispatchEvent.class);
      eventID               = jsonData.eventID;
      dispatchID            = jsonData.dispatchID;
      ambulanceID           = jsonData.ambulanceID;
      recommendedHospitalID = jsonData.recommendedHospitalID;
      targetHospitalID      = jsonData.targetHospitalID;
      eventState            = jsonData.eventState;
      eventStartDate        = jsonData.eventStartDate;
      beginTransportDate    = jsonData.beginTransportDate;
      actualAgeRange        = jsonData.actualAgeRange;
      observedSeverity      = jsonData.observedSeverity;
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
   * @return the dispatchID
   */
  public long getDispatchID() {
    return dispatchID;
  }

  /**
   * @param dispatchID the dispatchID to set
   */
  public void setDispatchID(long dispatchID) {
    this.dispatchID = dispatchID;
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
   * @return the recommendedHospitalID
   */
  public long getRecommendedHospitalID() {
    return recommendedHospitalID;
  }

  /**
   * @param recommendedHospitalID the recommendedHospitalID to set
   */
  public void setRecommendedHospitalID(long recommendedHospitalID) {
    this.recommendedHospitalID = recommendedHospitalID;
  }

  /**
   * @return the targetHospitalID
   */
  public long getTargetHospitalID() {
    return targetHospitalID;
  }

  /**
   * @param targetHospitalID the targetHospitalID to set
   */
  public void setTargetHospitalID(long targetHospitalID) {
    this.targetHospitalID = targetHospitalID;
  }

  /**
   * @return the eventState
   */
  public String getEventState() {
    return eventState;
  }

  /**
   * @param eventState the eventState to set
   */
  public void setEventState(String eventState) {
    this.eventState = eventState;
  }

  /**
   * @return the eventStartDate
   */
  public Date getEventStartDate() {
    return eventStartDate;
  }

  /**
   * @param eventStartDate the eventStartDate to set
   */
  public void setEventStartDate(Date eventStartDate) {
    this.eventStartDate = eventStartDate;
  }

  /**
   * @return the beginTransportDate
   */
  public Date getBeginTransportDate() {
    return beginTransportDate;
  }

  /**
   * @param beginTransportDate the beginTransportDate to set
   */
  public void setBeginTransportDate(Date beginTransportDate) {
    this.beginTransportDate = beginTransportDate;
  }

  /**
   * @return the actualAgeRange
   */
  public String getActualAgeRange() {
    return actualAgeRange;
  }

  /**
   * @param actualAgeRange the actualAgeRange to set
   */
  public void setActualAgeRange(String actualAgeRange) {
    this.actualAgeRange = actualAgeRange;
  }

  /**
   * @return the observedSeverity
   */
  public SeverityLevel getObservedSeverity() {
    return observedSeverity;
  }

  /**
   * @param observedSeverity the observedSeverity to set
   */
  public void setObservedSeverity(SeverityLevel observedSeverity) {
    this.observedSeverity = observedSeverity;
  }
}
