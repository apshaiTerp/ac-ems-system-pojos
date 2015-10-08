package com.ac.ems.data;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Base class for user.  The goal here is to potentially allow this class to be extended.
 * 
 * @author ac010168
 *
 */
public class User {

  /** The Unique ID for this user */
  protected long   userID;
  /** The username for logging in to the system */
  protected String userName;
  /** The displayable version of the user's name */
  protected String userNameDisplay;
  
  /** Default Constructor */
  public User() {
    userID          = -1L;
    userName        = null;
    userNameDisplay = null;
  }
  
  /**
   * Basic Constructor
   * 
   * @param userID
   * @param userName
   * @param userNameDisplay
   */
  public User(long userID, String userName, String userNameDisplay) {
    this.userID          = userID;
    this.userName        = userName;
    this.userNameDisplay = userNameDisplay;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public User(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      User jsonData = mapper.readValue(jsonString, User.class);
      userID          = jsonData.userID;
      userName        = jsonData.userName;
      userNameDisplay = jsonData.userNameDisplay;
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
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }
  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }
  /**
   * @return the userNameDisplay
   */
  public String getUserNameDisplay() {
    return userNameDisplay;
  }
  /**
   * @param userNameDisplay the userNameDisplay to set
   */
  public void setUserNameDisplay(String userNameDisplay) {
    this.userNameDisplay = userNameDisplay;
  }
}
