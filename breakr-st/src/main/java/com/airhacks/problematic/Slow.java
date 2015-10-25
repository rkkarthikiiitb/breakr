package com.airhacks.problematic;

import com.airhacks.breakr.Breakr;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Singleton;
import javax.interceptor.Interceptors;

/**
 *
 * @author airhacks.com
 */
@Singleton
@Interceptors(Breakr.class)
public class Slow {

    public String tooSlow() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Slow.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Slow: " + System.currentTimeMillis();
    }

}