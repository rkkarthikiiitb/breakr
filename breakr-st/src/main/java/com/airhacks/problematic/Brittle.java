package com.airhacks.problematic;

import com.airhacks.breakr.Breakr;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import javax.interceptor.Interceptors;

/**
 *
 * @author airhacks.com
 */
@Singleton
@Interceptors(Breakr.class)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class Brittle {

    public String test(boolean exception) throws Exception {
        if (exception) {
            throw new Exception("Here is your exception");
        }
        return "works " + System.currentTimeMillis();
    }
}