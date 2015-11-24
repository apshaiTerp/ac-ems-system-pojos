package com.ac.ems.data;

import java.io.IOException;
import java.util.Date;

import com.ac.ems.data.enums.SeverityLevel;
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
  /** The patient Gender */
  private String patientGender;   //Should be limited to "Male", "Female", "Unknown"
  /** The age range of the patient */
  private String patientAgeRange;  //Should be limited to "child", "teen", "adult", "unknown"
  /** The address where response is requested */
  private String patientAddress;
  /** The primary complaint recorded as part of the dispatch */
  private String patientComplaint;
  /** The reported initial severity level (May not be known) */
  private SeverityLevel reportedSeverity;
  /** The name of the reporter */
  private String reportedByName;
  /** The user ID for the dispatcher who assigned this request */
  private long   dispatchUserID;
  /** The date this dispatch was recorded */
  private Date   dispatchReceivedDate;
  
  /** Redesign to associate to a specific provider */
  private long   providerID;
  /** Need to store this somewhere */
  private double incidentLat;
  /** Need to store this somewhere */
  private double incidentLon;
  
  /** The contact phone number */
  private String contactPhone;
  
  /**
   * Default Constructor
   */
  public DispatchDetails() {
    dispatchID           = -1L;
    patientName          = null;
    patientGender        = null;
    patientAgeRange      = null;
    patientAddress       = null;
    patientComplaint     = null;
    reportedSeverity     = null;
    reportedByName       = null;
    dispatchUserID       = -1L;
    dispatchReceivedDate = null;
    providerID           = -1L;
    incidentLat          = 0.0;
    incidentLon          = 0.0;
    contactPhone         = null;
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
  public DispatchDetails(long dispatchID, String patientName, String patientGender, String patientAgeRange,
      String patientAddress, String patientComplaint, SeverityLevel reportedSeverity, String reportedByName, String contactPhone,
      long dispatchUserID, Date dispatchReceivedDate, long providerID, double incidentLat, double incidentLon) {
    this.dispatchID           = dispatchID;
    this.patientName          = patientName;
    this.patientGender        = patientGender;
    this.patientAgeRange      = patientAgeRange;
    this.patientAddress       = patientAddress;
    this.patientComplaint     = patientComplaint;
    this.reportedSeverity     = reportedSeverity;
    this.reportedByName       = reportedByName;
    this.contactPhone         = contactPhone;
    this.dispatchUserID       = dispatchUserID;
    this.dispatchReceivedDate = dispatchReceivedDate;
    this.providerID           = providerID;
    this.incidentLat          = incidentLat;
    this.incidentLon          = incidentLon;
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
      patientGender        = jsonData.patientGender;
      patientAgeRange      = jsonData.patientAgeRange;
      patientAddress       = jsonData.patientAddress;
      patientComplaint     = jsonData.patientComplaint;
      reportedSeverity     = jsonData.reportedSeverity;
      reportedByName       = jsonData.reportedByName;
      contactPhone         = jsonData.contactPhone;
      dispatchUserID       = jsonData.dispatchUserID;
      dispatchReceivedDate = jsonData.dispatchReceivedDate;
      providerID           = jsonData.providerID;
      incidentLat          = jsonData.incidentLat;
      incidentLon          = jsonData.incidentLon;
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

  /**
   * @return the reportedSeverity
   */
  public SeverityLevel getReportedSeverity() {
    return reportedSeverity;
  }

  /**
   * @param reportedSeverity the reportedSeverity to set
   */
  public void setReportedSeverity(SeverityLevel reportedSeverity) {
    this.reportedSeverity = reportedSeverity;
  }

  /**
   * @return the patientGender
   */
  public String getPatientGender() {
    return patientGender;
  }

  /**
   * @param patientGender the patientGender to set
   */
  public void setPatientGender(String patientGender) {
    this.patientGender = patientGender;
  }

  /**
   * @return the patientAgeRange
   */
  public String getPatientAgeRange() {
    return patientAgeRange;
  }

  /**
   * @param patientAgeRange the patientAgeRange to set
   */
  public void setPatientAgeRange(String patientAgeRange) {
    this.patientAgeRange = patientAgeRange;
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
   * @return the incidentLat
   */
  public double getIncidentLat() {
    return incidentLat;
  }

  /**
   * @param incidentLat the incidentLat to set
   */
  public void setIncidentLat(double incidentLat) {
    this.incidentLat = incidentLat;
  }

  /**
   * @return the incidentLon
   */
  public double getIncidentLon() {
    return incidentLon;
  }

  /**
   * @param incidentLon the incidentLon to set
   */
  public void setIncidentLon(double incidentLon) {
    this.incidentLon = incidentLon;
  }

  /**
   * @return the contactPhone
   */
  public String getContactPhone() {
    return contactPhone;
  }

  /**
   * @param contactPhone the contactPhone to set
   */
  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }
}
