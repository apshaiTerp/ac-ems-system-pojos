package com.ac.ems.data.enums;

/**
 * Helper class to manage conversions safely.
 * 
 * @author ac010168
 *
 */
public class SeverityLevelConverter {

  //NONCRITICAL, PEDNONCRITICAL, BURN, PEDBURN, MINORTRAUMA, SEVERETRAUMA, PEDTRAUMA, STEMI, STROKE

  public final static String NONCRITICAL_TEXT    = "Non-Critical Injuries";
  public final static String PEDNONCRITICAL_TEXT = "Pediatric Non-Critical Injuries";
  public final static String BURN_TEXT           = "Severe Burns";
  public final static String PEDBURN_TEXT        = "Pediatric Severe Burns";
  public final static String MINORTRAUMA_TEXT    = "Minor Trauma";
  public final static String SEVERETRAUMA_TEXT   = "Severe Trauma";
  public final static String PEDTRAUMA_TEXT      = "Pediatric Trauma";
  public final static String STEMI_TEXT          = "STEMI";
  public final static String STROKE_TEXT         = "Stroke";
  public final static String UNKNOWN_TEXT        = "Unknown Condition";
  
  public static String convertSeverityToString(SeverityLevel level) {
    if (level == null) return UNKNOWN_TEXT;
    switch(level) {
      case NONCRITICAL    : return NONCRITICAL_TEXT;
      case PEDNONCRITICAL : return PEDNONCRITICAL_TEXT;
      case BURN           : return BURN_TEXT;
      case PEDBURN        : return PEDBURN_TEXT;
      case MINORTRAUMA    : return MINORTRAUMA_TEXT;
      case SEVERETRAUMA   : return SEVERETRAUMA_TEXT;
      case PEDTRAUMA      : return PEDTRAUMA_TEXT;
      case STEMI          : return STEMI_TEXT;
      case STROKE         : return STROKE_TEXT;
      case UNKNOWN        : return UNKNOWN_TEXT;
      default             : return UNKNOWN_TEXT;
    }
  }
  
  public static SeverityLevel convertStringToSeverity(String levelText) {
    if (levelText == null) return null;
    if (levelText.equalsIgnoreCase(NONCRITICAL_TEXT))         return SeverityLevel.NONCRITICAL;
    else if (levelText.equalsIgnoreCase(PEDNONCRITICAL_TEXT)) return SeverityLevel.PEDNONCRITICAL;
    else if (levelText.equalsIgnoreCase(BURN_TEXT))           return SeverityLevel.BURN;
    else if (levelText.equalsIgnoreCase(PEDBURN_TEXT))        return SeverityLevel.PEDBURN;
    else if (levelText.equalsIgnoreCase(MINORTRAUMA_TEXT))    return SeverityLevel.MINORTRAUMA;
    else if (levelText.equalsIgnoreCase(SEVERETRAUMA_TEXT))   return SeverityLevel.SEVERETRAUMA;
    else if (levelText.equalsIgnoreCase(PEDTRAUMA_TEXT))      return SeverityLevel.PEDTRAUMA;
    else if (levelText.equalsIgnoreCase(STEMI_TEXT))          return SeverityLevel.STEMI;
    else if (levelText.equalsIgnoreCase(STROKE_TEXT))         return SeverityLevel.STROKE;
    else if (levelText.equalsIgnoreCase(UNKNOWN_TEXT))        return SeverityLevel.UNKNOWN;
    else return null;
  }
}
