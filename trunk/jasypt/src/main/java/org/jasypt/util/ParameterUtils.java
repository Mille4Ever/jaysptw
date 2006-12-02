package org.jasypt.util;

public class ParameterUtils {
    
    
    public static String getParameterizedValue(String systemPropertyName, 
            String envVariableName) {
        
        try {
            String systemValue = 
                System.getProperty(systemPropertyName);
            if ((systemValue != null) && (!systemValue.trim().equals(""))) {
                return systemValue;
            }
        } catch (SecurityException e) {
            // do nothing
        }

        try {
            String envValue = 
                System.getenv(envVariableName);
            if ((envValue != null) && (!envValue.trim().equals(""))) {
                return envValue;
            }
        } catch (SecurityException e) {
            // do nothing
        }

        return null;
        
    }
    
    
    private ParameterUtils() {}
    
}
