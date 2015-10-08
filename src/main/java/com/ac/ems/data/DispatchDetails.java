package com.ac.ems.data;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class holds the basic information from a dispatch assignment.
 * 
 * @author ac010168
 *
 */
public class DispatchDetails {

  /** The uniqueID for this dispatch. */
  private long   dispatchID;
  /** The patient name.  Can be undefined. */
  private String patientName;
  /** The address where response is requested */
  private String patientAddress;
  /** The primary complaint recorded as part of the dispatch */
  private String patientComplaint;
  /** The name of the reporter */
  private String reportedByName;
  /** The user ID for the dispatcher who assigned this request */
  private long   dispatchUserID;
  /** The date this dispatch was recorded */
  private Date   dispatchReceivedDate;
  
  /**
   * Default Constructor
   */
  public DispatchDetails() {
    dispatchID           = -1L;
    patientName          = null;
    patientAddress       = null;
    patientComplaint     = null;
    reportedByName       = null;
    dispatchUserID       = -1L;
    dispatchReceivedDate = null;
  }
  
  /**
   * Basic Constructor
   * 
   * @param dispatchID
   * @param patientName
   * @param patientAddress
   * @param patientComplaint
   * @param reportedByName
   * @param dispatchUserID
   * @param dispatchReceivedDate
   */
  public DispatchDetails(long dispatchID, String patientName, String patientAddress, String patientComplaint, 
      String reportedByName, long dispatchUserID, Date dispatchReceivedDate) {
    this.dispatchID           = dispatchID;
    this.patientName          = patientName;
    this.patientAddress       = patientAddress;
    this.patientComplaint     = patientComplaint;
    this.reportedByName       = reportedByName;
    this.dispatchUserID       = dispatchUserID;
    this.dispatchReceivedDate = dispatchReceivedDate;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public DispatchDetails(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      DispatchDetails jsonData = mapper.readValue(jsonString, DispatchDetails.class);
      dispatchID           = jsonData.dispatchID;
      patientName          = jsonData.patientName;
      patientAddress       = jsonData.patientAddress;
      patientComplaint     = jsonData.patientComplaint;
      reportedByName       = jsonData.reportedByName;
      dispatchUserID       = jsonData.dispatchUserID;
      dispatchReceivedDate = jsonData.dispatchReceivedDate;
    } catch (JsonParseException jpe) {
      jpe.printStackTrace();
    } catch (JsonMappingException jme) {
      jme.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
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
   * @return the patientName
   */
  public String getPatientName() {
    return patientName;
  }
  /**
   * @param patientName the patientName to set
   */
  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }
  /**
   * @return the patientAddress
   */
  public String getPatientAddress() {
    return patientAddress;
  }
  /**
   * @param patientAddress the patientAddress to set
   */
  public void setPatientAddress(String patientAddress) {
    this.patientAddress = patientAddress;
  }
  /**
   * @return the patientComplaint
   */
  public String getPatientComplaint() {
    return patientComplaint;
  }
  /**
   * @param patientComplaint the patientComplaint to set
   */
  public void setPatientComplaint(String patientComplaint) {
    this.patientComplaint = patientComplaint;
  }
  /**
   * @return the reportedByName
   */
  public String getReportedByName() {
    return reportedByName;
  }
  /**
   * @param reportedByName the reportedByName to set
   */
  public void setReportedByName(String reportedByName) {
    this.reportedByName = reportedByName;
  }
  /**
   * @return the dispatchUserID
   */
  public long getDispatchUserID() {
    return dispatchUserID;
  }
  /**
   * @param dispatchUserID the dispatchUserID to set
   */
  public void setDispatchUserID(long dispatchUserID) {
    this.dispatchUserID = dispatchUserID;
  }
  /**
   * @return the dispatchReceivedDate
   */
  public Date getDispatchReceivedDate() {
    return dispatchReceivedDate;
  }
  /**
   * @param dispatchReceivedDate the dispatchReceivedDate to set
   */
  public void setDispatchReceivedDate(Date dispatchReceivedDate) {
    this.dispatchReceivedDate = dispatchReceivedDate;
  }
}
