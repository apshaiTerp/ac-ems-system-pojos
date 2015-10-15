package com.ac.ems.data;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Object representing an EMS Organization.
 * 
 * @author ac010168
 *
 */
public class EMSProvider {

  /** The unique ID for this provider */
  private long       providerID;
  /** The display name for this provider */
  private String     providerName;
  /** The latitude for this provider's location */
  private double     providerLat;
  /** The longitude for this provider's location */
  private double     providerLon;
  /** The full list of Ambulance IDs assigned to this provider */
  private List<Long> ambulances;
  /** The list of ambulances currently available right now */
  private List<Long> availAmbulances;
  /** The list of ambulances currently on assignment for this provider */
  private List<Long> assignedAmbulances;
  
  /** Default Constructor */
  public EMSProvider() {
    providerID         = -1L;
    providerName       = null;
    providerLat        = 0.0;
    providerLon        = 0.0;
    ambulances         = null;
    availAmbulances    = null;
    assignedAmbulances = null;
  }
  
  /**
   * Basic Constructor
   * 
   * @param providerID
   * @param providerName
   * @param providerLat
   * @param providerLon
   * @param ambulances
   * @param availAmbulances
   * @param assignedAmbulances
   */
  public EMSProvider(long providerID, String providerName, double providerLat, double providerLon, List<Long> ambulances,
      List<Long> availAmbulances, List<Long> assignedAmbulances) {
    this.providerID         = providerID;
    this.providerName       = providerName;
    this.providerLat        = providerLat;
    this.providerLon        = providerLon;
    this.ambulances         = ambulances;
    this.availAmbulances    = availAmbulances;
    this.assignedAmbulances = assignedAmbulances;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public EMSProvider(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      EMSProvider jsonData = mapper.readValue(jsonString, EMSProvider.class);
      providerID         = jsonData.providerID;
      providerName       = jsonData.providerName;
      providerLat        = jsonData.providerLat;
      providerLon        = jsonData.providerLon;
      ambulances         = jsonData.ambulances;
      availAmbulances    = jsonData.availAmbulances;
      assignedAmbulances = jsonData.assignedAmbulances;
    } catch (JsonParseException jpe) {
      jpe.printStackTrace();
    } catch (JsonMappingException jme) {
      jme.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
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
   * @return the providerName
   */
  public String getProviderName() {
    return providerName;
  }
  /**
   * @param providerName the providerName to set
   */
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }
  /**
   * @return the providerLat
   */
  public double getProviderLat() {
    return providerLat;
  }
  /**
   * @param providerLat the providerLat to set
   */
  public void setProviderLat(double providerLat) {
    this.providerLat = providerLat;
  }
  /**
   * @return the privaderLon
   */
  public double getProviderLon() {
    return providerLon;
  }
  /**
   * @param privaderLon the privaderLon to set
   */
  public void setProviderLon(double providerLon) {
    this.providerLon = providerLon;
  }
  /**
   * @return the ambulances
   */
  public List<Long> getAmbulances() {
    return ambulances;
  }
  /**
   * @param ambulances the ambulances to set
   */
  public void setAmbulances(List<Long> ambulances) {
    this.ambulances = ambulances;
  }
  /**
   * @return the availAmbulances
   */
  public List<Long> getAvailAmbulances() {
    return availAmbulances;
  }
  /**
   * @param availAmbulances the availAmbulances to set
   */
  public void setAvailAmbulances(List<Long> availAmbulances) {
    this.availAmbulances = availAmbulances;
  }
  /**
   * @return the assignedAmbulances
   */
  public List<Long> getAssignedAmbulances() {
    return assignedAmbulances;
  }
  /**
   * @param assignedAmbulances the assignedAmbulances to set
   */
  public void setAssignedAmbulances(List<Long> assignedAmbulances) {
    this.assignedAmbulances = assignedAmbulances;
  }
}
