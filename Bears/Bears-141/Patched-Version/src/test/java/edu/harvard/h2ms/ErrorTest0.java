package edu.harvard.h2ms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        edu.harvard.h2ms.service.UserDetailsServiceImpl userDetailsServiceImpl0 = new edu.harvard.h2ms.service.UserDetailsServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.security.core.userdetails.UserDetails userDetails2 = userDetailsServiceImpl0.loadUserByUsername("hi!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        edu.harvard.h2ms.service.UserDetailsServiceImpl userDetailsServiceImpl0 = new edu.harvard.h2ms.service.UserDetailsServiceImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.security.core.userdetails.UserDetails userDetails2 = userDetailsServiceImpl0.loadUserByUsername("");
    }
}

