package com.ac.ems.data;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class is designed to hold both halves of a User record.
 * 
 * @author ac010168
 *
 */
public class UserComplete {

  /** Reference to the basic user data */
  private User            user;
  /** Reference to the user role data */
  private UserInformation userInformation;
  
  /** Default Constructor */
  public UserComplete() {
    user            = null;
    userInformation = null;
  }
  
  /**
   * Basic Constructor
   * 
   * @param user
   * @param userInformation
   */
  public UserComplete(User user, UserInformation userInformation) {
    this.user            = user;
    this.userInformation = userInformation;
  }
  
  /**
   * Advanced Constructor designed to construct the object from a JSON record
   * 
   * @param jsonString
   */
  public UserComplete(String jsonString) {
    super();
    ObjectMapper mapper = new ObjectMapper();
    try {
      UserComplete jsonData = mapper.readValue(jsonString, UserComplete.class);
      user            = jsonData.user;
      userInformation = jsonData.userInformation;
    } catch (JsonParseException jpe) {
      jpe.printStackTrace();
    } catch (JsonMappingException jme) {
      jme.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }

  /**
   * @return the user
   */
  public User getUser() {
    return user;
  }

  /**
   * @param user the user to set
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * @return the userInformation
   */
  public UserInformation getUserInformation() {
    return userInformation;
  }

  /**
   * @param userInformation the userInformation to set
   */
  public void setUserInformation(UserInformation userInformation) {
    this.userInformation = userInformation;
  }
}
