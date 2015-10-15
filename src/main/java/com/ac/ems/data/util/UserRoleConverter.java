package com.ac.ems.data.util;

import com.ac.ems.data.UserRole;

/**
 * Helper class to manage conversions safely.
 * 
 * @author ac010168
 *
 */
public class UserRoleConverter {

  public final static String EMS_TEXT       = "EMS Staff";
  public final static String AMBULANCE_TEXT = "Ambulance Staff";
  public final static String HOSPITAL_TEXT  = "Hospital Staff";
  public final static String DISPATCH_TEXT  = "Dispatch Staff";
  public final static String SUPER_TEXT     = "SuperUser";
  public final static String DEFAULT_TEXT   = "Unknown Role";
  
  public static String convertUserRoleToString(UserRole role) {
    if (role == null) return DEFAULT_TEXT;
    switch (role) {
      case EMS       : return EMS_TEXT;
      case AMBULANCE : return AMBULANCE_TEXT;
      case HOSPITAL  : return HOSPITAL_TEXT;
      case DISPATCH  : return DISPATCH_TEXT;
      case SUPER     : return SUPER_TEXT;
      default        : return DEFAULT_TEXT;
    }
  }
  
  public static UserRole convertStringToUserRole(String roleText) {
    if (roleText == null) return null;
    if (roleText.equalsIgnoreCase(EMS_TEXT))            return UserRole.EMS;
    else if (roleText.equalsIgnoreCase(AMBULANCE_TEXT)) return UserRole.AMBULANCE;
    else if (roleText.equalsIgnoreCase(HOSPITAL_TEXT))  return UserRole.HOSPITAL;
    else if (roleText.equalsIgnoreCase(DISPATCH_TEXT))  return UserRole.DISPATCH;
    else if (roleText.equalsIgnoreCase(SUPER_TEXT))     return UserRole.SUPER;
    else return null;
  }
}
