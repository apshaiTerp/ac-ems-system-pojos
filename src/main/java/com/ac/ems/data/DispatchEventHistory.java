package com.ac.ems.data;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class records the final history of an event.
 * 
 * @author ac010168
 *
 */
public class DispatchEventHistory {

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
  /** The final state of the event */
  private String eventResolvedState;
  /** The date the event began */
  private Date   eventStartDate;
  /** The date transport of the patient began.  Can be null. */
  private Date   beginTransportDate;
  /** The date the event was ended. */
  private Date   eventEndDate;
  
  /** Default Constructor */
  public DispatchEventHistory() {
    eventID               = -1L;
    dispatchID            = -1L;
    ambulanceID           = -1L;
    recommendedHospitalID = -1L;
    targetHospitalID      = -1L;
    eventResolvedState    = null;
    eventStartDate        = null;
    beginTransportDate    = null;
    eventEndDate          = null;
  }
  
  /**
   * Basic Constructor
   * 
   * @param eventID
   * @param dispatchID
   * @param ambulanceID
   * @param recommendedHospitalID
   * @param targetHospitalID
   * @param eventResolvedState
   * @param eventStartDate
   * @param beginTransportDate
   * @param eventEndDate
   */
  public DispatchEventHistory(long eventID, long dispatchID, long ambulanceID, long recommendedHospitalID,
      long targetHospitalID, String eventResolvedState, Date eventStartDate, Date beginTransportDate, Date eventEndDate) {
    this.eventID               = eventID;
    this.dispatchID            = dispatchID;
    this.ambulanceID           = ambulanceID;
    this.recommendedHospitalID = recommendedHospitalID;
    this.targetHospitalID      = targetHospitalID;
    this.eventResolvedState    = eventResolvedState;
    this.eventStartDate        = eventStartDate;
    this.beginTransportDate    = beginTransportDate;
    this.eventEndDate          = eventEndDate;
  }

  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public DispatchEventHistory(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      DispatchEventHistory jsonData = mapper.readValue(jsonString, DispatchEventHistory.class);
      eventID               = jsonData.eventID;
      dispatchID            = jsonData.dispatchID;
      ambulanceID           = jsonData.ambulanceID;
      recommendedHospitalID = jsonData.recommendedHospitalID;
      targetHospitalID      = jsonData.targetHospitalID;
      eventResolvedState    = jsonData.eventResolvedState;
      eventStartDate        = jsonData.eventStartDate;
      beginTransportDate    = jsonData.beginTransportDate;
      eventEndDate          = jsonData.eventEndDate;
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
   * @return the eventResolvedState
   */
  public String getEventResolvedState() {
    return eventResolvedState;
  }
  /**
   * @param eventResolvedState the eventResolvedState to set
   */
  public void setEventResolvedState(String eventResolvedState) {
    this.eventResolvedState = eventResolvedState;
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
   * @return the eventEndDate
   */
  public Date getEventEndDate() {
    return eventEndDate;
  }
  /**
   * @param eventEndDate the eventEndDate to set
   */
  public void setEventEndDate(Date eventEndDate) {
    this.eventEndDate = eventEndDate;
  }
}
