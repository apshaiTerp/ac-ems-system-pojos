package com.ac.ems.data;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserInformation {

  /** Reference to the userID */
  private long       userID;
  /** The user's password */
  private String     password;
  /** The user role type */
  private UserRole   userRole;
  /** The list of organizations to which this user belongs */
  private List<Long> authorizedIDs;
  
  /** Default Constructor */
  public UserInformation() {
    userID        = -1L;
    password      = null;
    userRole      = null;
    authorizedIDs = null;
  }
  
  /**
   * Basic Constructor
   * 
   * @param userID
   * @param password
   * @param userRole
   * @param authorizedIDs
   */
  public UserInformation(long userID, String password, UserRole userRole, List<Long> authorizedIDs) {
    this.userID        = userID;
    this.password      = password;
    this.userRole      = userRole;
    this.authorizedIDs = authorizedIDs;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public UserInformation(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      UserInformation jsonData = mapper.readValue(jsonString, UserInformation.class);
      userID        = jsonData.userID;
      password      = jsonData.password;
      userRole      = jsonData.userRole;
      authorizedIDs = jsonData.authorizedIDs;
    } catch (JsonParseException jpe) {
      jpe.printStackTrace();
    } catch (JsonMappingException jme) {
      jme.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  } 
  
  /**
   * @return the userID
   */
  public long getUserID() {
    return userID;
  }
  /**
   * @param userID the userID to set
   */
  public void setUserID(long userID) {
    this.userID = userID;
  }
  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }
  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }
  /**
   * @return the userRole
   */
  public UserRole getUserRole() {
    return userRole;
  }
  /**
   * @param userRole the userRole to set
   */
  public void setUserRole(UserRole userRole) {
    this.userRole = userRole;
  }
  /**
   * @return the authorizedIDs
   */
  public List<Long> getAuthorizedIDs() {
    return authorizedIDs;
  }
  /**
   * @param authorizedIDs the authorizedIDs to set
   */
  public void setAuthorizedIDs(List<Long> authorizedIDs) {
    this.authorizedIDs = authorizedIDs;
  }
}
