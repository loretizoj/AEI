/*
 * INCOGNITO CONFIDENTIAL 
 * 
 * [2018] Incognito Solutions 
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Incognito Solutions and its client.
 * The intellectual and technical concepts contained
 * herein are proprietary to Adobe Systems Incorporated
 * and its client and may be covered by U.S. and Foreign Patents
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Incognito Solutions.
 */
package ph.com.incognitosolutions.aei.main;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ph.com.incognitosolutions.aei.view.Dashboard;

/**
 *
 * @author loretizoj
 */
public class MainClassLoader {
    
    private static EntityManagerFactory instance;
    
    public static void main(String args[]) {
        
        Map propertyMap = new HashMap();

        propertyMap.put("javax.persistence.jdbc.user", "root");
        propertyMap.put("javax.persistence.jdbc.password", "root");
        propertyMap.put("javax.persistence.jdbc.url", "jdbc:mysql://localhost:3306/aeinternational");
        
        if (instance == null) {
            instance = Persistence.createEntityManagerFactory("aeinternational", propertyMap);

        }
        
        System.out.println("...Starting Sytem...");
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }
    
}
