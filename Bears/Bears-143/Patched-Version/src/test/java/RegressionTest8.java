import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

  public static boolean debug = false;

  @Test
  public void test4001() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4001");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    java.lang.Class<?> wildcardClass18 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test4002() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4002");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    java.lang.Class<?> wildcardClass27 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test4003() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4003");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user19 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity20 =
          passwordController0.registerUserByEmail(user19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4004() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4004");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4005() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4005");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4006() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4006");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass24 = javaMailSender23.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4007() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4007");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4008() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4008");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4009() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4009");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4010() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4010");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4011() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4011");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity24 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4012() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4012");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 =
          passwordController0.resetPasswordViaToken(strMap25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4013() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4013");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 = null;
    passwordController0.emailSender = javaMailSender31;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 = null;
    passwordController0.emailSender = javaMailSender33;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender30);
  }

  @Test
  public void test4014() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4014");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass12 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test4015() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4015");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    java.lang.Class<?> wildcardClass27 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test4016() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4016");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    edu.harvard.h2ms.domain.core.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 =
          passwordController0.registerUserByEmail(user18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4017() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4017");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity24 =
          passwordController0.resetPasswordViaToken(strMap23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4018() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4018");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass23 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test4019() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4019");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest31 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity32 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest31);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender28);
  }

  @Test
  public void test4020() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4020");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4021() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4021");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 =
          passwordController0.registerUserByEmail(user23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4022() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4022");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity30 =
          passwordController0.resetPasswordViaToken(strMap29);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender25);
    org.junit.Assert.assertNull(javaMailSender28);
  }

  @Test
  public void test4023() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4023");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    edu.harvard.h2ms.domain.core.User user25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 =
          passwordController0.registerUserByEmail(user25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4024() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4024");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 = null;
    passwordController0.emailSender = javaMailSender30;
    org.springframework.mail.javamail.JavaMailSender javaMailSender32 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user34 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity35 =
          passwordController0.registerUserByEmail(user34);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender28);
    org.junit.Assert.assertNull(javaMailSender29);
    org.junit.Assert.assertNull(javaMailSender32);
    org.junit.Assert.assertNull(javaMailSender33);
  }

  @Test
  public void test4025() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4025");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity29 =
          passwordController0.resetPasswordViaToken(strMap28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4026() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4026");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4027() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4027");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test4028() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4028");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 =
          passwordController0.registerUserByEmail(user30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender29);
  }

  @Test
  public void test4029() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4029");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4030() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4030");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4031() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4031");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4032() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4032");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4033() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4033");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass23 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test4034() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4034");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4035() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4035");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass20 = javaMailSender19.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4036() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4036");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass24 = javaMailSender23.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4037() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4037");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 =
          passwordController0.registerUserByEmail(user17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4038() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4038");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4039() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4039");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 = null;
    passwordController0.emailSender = javaMailSender30;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4040() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4040");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 =
          passwordController0.resetPasswordViaToken(strMap12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4041() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4041");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender29);
  }

  @Test
  public void test4042() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4042");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4043() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4043");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4044() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4044");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4045() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4045");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4046() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4046");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    java.lang.Class<?> wildcardClass25 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test4047() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4047");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    java.lang.Class<?> wildcardClass15 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test4048() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4048");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.resetPasswordViaToken(strMap24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4049() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4049");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    edu.harvard.h2ms.domain.core.User user21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 =
          passwordController0.registerUserByEmail(user21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4050() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4050");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass15 = javaMailSender14.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4051() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4051");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4052() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4052");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity23 =
          passwordController0.resetPasswordViaToken(strMap22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4053() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4053");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4054() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4054");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4055() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4055");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity32 =
          passwordController0.resetPasswordViaToken(strMap31);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4056() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4056");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    edu.harvard.h2ms.domain.core.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 =
          passwordController0.registerUserByEmail(user30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4057() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4057");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4058() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4058");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity29 =
          passwordController0.registerUserByEmail(user28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4059() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4059");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity20 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4060() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4060");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4061() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4061");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender25);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4062() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4062");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4063() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4063");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 = null;
    passwordController0.emailSender = javaMailSender30;
    edu.harvard.h2ms.domain.core.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity33 =
          passwordController0.registerUserByEmail(user32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4064() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4064");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.resetPasswordViaToken(strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4065() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4065");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity11 =
          passwordController0.resetPasswordViaToken(strMap10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test4066() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4066");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4067() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4067");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass23 = javaMailSender22.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4068() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4068");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity29 =
          passwordController0.resetPasswordViaToken(strMap28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4069() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4069");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    edu.harvard.h2ms.domain.core.User user23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 =
          passwordController0.registerUserByEmail(user23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4070() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4070");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity23 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4071() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4071");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4072() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4072");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity24 =
          passwordController0.resetPasswordViaToken(strMap23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4073() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4073");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    java.lang.Class<?> wildcardClass18 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test4074() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4074");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4075() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4075");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4076() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4076");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity23 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test4077() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4077");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass14 = javaMailSender13.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test4078() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4078");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 = null;
    passwordController0.emailSender = javaMailSender30;
    org.springframework.mail.javamail.JavaMailSender javaMailSender32 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 = null;
    passwordController0.emailSender = javaMailSender33;
    org.springframework.mail.javamail.JavaMailSender javaMailSender35 = null;
    passwordController0.emailSender = javaMailSender35;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender28);
    org.junit.Assert.assertNull(javaMailSender29);
    org.junit.Assert.assertNull(javaMailSender32);
  }

  @Test
  public void test4079() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4079");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test4080() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4080");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.resetPasswordViaToken(strMap27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4081() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4081");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 =
          passwordController0.registerUserByEmail(user25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4082() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4082");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    java.lang.Class<?> wildcardClass18 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test4083() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4083");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    edu.harvard.h2ms.domain.core.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity29 =
          passwordController0.registerUserByEmail(user28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4084() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4084");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass24 = javaMailSender23.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4085() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4085");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4086() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4086");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity13 =
          passwordController0.registerUserByEmail(user12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4087() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4087");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    edu.harvard.h2ms.domain.core.User user13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 =
          passwordController0.registerUserByEmail(user13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4088() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4088");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4089() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4089");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.resetPasswordViaToken(strMap14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4090() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4090");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 = null;
    passwordController0.emailSender = javaMailSender31;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 = null;
    passwordController0.emailSender = javaMailSender33;
    org.springframework.mail.javamail.JavaMailSender javaMailSender35 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender36 = null;
    passwordController0.emailSender = javaMailSender36;
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender28);
    org.junit.Assert.assertNull(javaMailSender35);
  }

  @Test
  public void test4091() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4091");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4092() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4092");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass29 = javaMailSender28.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender28);
  }

  @Test
  public void test4093() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4093");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4094() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4094");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity33 =
          passwordController0.resetPasswordViaToken(strMap32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender31);
  }

  @Test
  public void test4095() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4095");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender26);
  }

  @Test
  public void test4096() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4096");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 =
          passwordController0.resetPasswordViaToken(strMap15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4097() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4097");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4098() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4098");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.resetPasswordViaToken(strMap24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4099() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4099");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 =
          passwordController0.registerUserByEmail(user22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4100() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4100");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 =
          passwordController0.registerUserByEmail(user25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4101() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4101");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4102() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4102");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity23 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4103() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4103");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4104() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4104");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4105() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4105");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity19 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4106() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4106");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 = null;
    passwordController0.emailSender = javaMailSender31;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 = null;
    passwordController0.emailSender = javaMailSender33;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender28);
    org.junit.Assert.assertNull(javaMailSender29);
    org.junit.Assert.assertNull(javaMailSender30);
  }

  @Test
  public void test4107() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4107");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest29 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity30 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest29);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender26);
  }

  @Test
  public void test4108() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4108");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    java.lang.Class<?> wildcardClass11 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test4109() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4109");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    java.lang.Class<?> wildcardClass23 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test4110() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4110");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 =
          passwordController0.registerUserByEmail(user24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4111() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4111");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4112() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4112");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4113() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4113");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test4114() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4114");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 = null;
    passwordController0.emailSender = javaMailSender30;
    org.springframework.mail.javamail.JavaMailSender javaMailSender32 = null;
    passwordController0.emailSender = javaMailSender32;
    org.springframework.mail.javamail.JavaMailSender javaMailSender34 = null;
    passwordController0.emailSender = javaMailSender34;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4115() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4115");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity11 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test4116() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4116");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity14 =
          passwordController0.registerUserByEmail(user13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4117() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4117");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.resetPasswordViaToken(strMap14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test4118() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4118");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity31 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender25);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4119() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4119");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4120() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4120");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 = null;
    passwordController0.emailSender = javaMailSender31;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender34 = null;
    passwordController0.emailSender = javaMailSender34;
    java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity37 =
          passwordController0.resetPasswordViaToken(strMap36);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender28);
    org.junit.Assert.assertNull(javaMailSender33);
  }

  @Test
  public void test4121() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4121");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4122() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4122");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass15 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test4123() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4123");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass20 = javaMailSender19.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4124() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4124");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 =
          passwordController0.registerUserByEmail(user25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4125() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4125");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass27 = javaMailSender26.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender26);
  }

  @Test
  public void test4126() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4126");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 =
          passwordController0.registerUserByEmail(user16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4127() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4127");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    java.lang.Class<?> wildcardClass22 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test4128() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4128");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity12 =
          passwordController0.registerUserByEmail(user11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4129() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4129");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4130() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4130");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4131() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4131");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity19 =
          passwordController0.registerUserByEmail(user18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4132() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4132");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity23 =
          passwordController0.resetPasswordViaToken(strMap22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4133() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4133");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test4134() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4134");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4135() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4135");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    edu.harvard.h2ms.domain.core.User user25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 =
          passwordController0.registerUserByEmail(user25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4136() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4136");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    edu.harvard.h2ms.domain.core.User user15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 =
          passwordController0.registerUserByEmail(user15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4137() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4137");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity20 =
          passwordController0.resetPasswordViaToken(strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4138() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4138");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 = null;
    passwordController0.emailSender = javaMailSender2;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    java.lang.Class<?> wildcardClass6 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test4139() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4139");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity33 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender29);
  }

  @Test
  public void test4140() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4140");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    java.lang.Class<?> wildcardClass17 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test4141() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4141");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 = null;
    passwordController0.emailSender = javaMailSender2;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test4142() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4142");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4143() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4143");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4144() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4144");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test4145() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4145");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass15 = javaMailSender14.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4146() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4146");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    edu.harvard.h2ms.domain.core.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 =
          passwordController0.registerUserByEmail(user30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4147() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4147");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4148() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4148");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4149() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4149");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4150() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4150");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4151() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4151");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass10 = javaMailSender9.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test4152() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4152");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity27 =
          passwordController0.resetPasswordViaToken(strMap26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4153() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4153");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test4154() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4154");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.resetPasswordViaToken(strMap24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4155() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4155");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4156() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4156");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4157() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4157");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    edu.harvard.h2ms.domain.core.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 =
          passwordController0.registerUserByEmail(user30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4158() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4158");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 =
          passwordController0.resetPasswordViaToken(strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4159() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4159");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    java.lang.Class<?> wildcardClass18 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test4160() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4160");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity29 =
          passwordController0.resetPasswordViaToken(strMap28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4161() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4161");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 =
          passwordController0.resetPasswordViaToken(strMap25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4162() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4162");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity27 =
          passwordController0.resetPasswordViaToken(strMap26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4163() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4163");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4164() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4164");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    edu.harvard.h2ms.domain.core.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 =
          passwordController0.registerUserByEmail(user26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4165() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4165");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass9 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test4166() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4166");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass23 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test4167() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4167");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass18 = javaMailSender17.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4168() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4168");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4169() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4169");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4170() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4170");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4171() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4171");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    edu.harvard.h2ms.domain.core.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 =
          passwordController0.registerUserByEmail(user22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4172() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4172");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4173() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4173");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass27 = javaMailSender26.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender26);
  }

  @Test
  public void test4174() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4174");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 = null;
    passwordController0.emailSender = javaMailSender30;
    org.springframework.mail.javamail.JavaMailSender javaMailSender32 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user33 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity34 =
          passwordController0.registerUserByEmail(user33);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender32);
  }

  @Test
  public void test4175() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4175");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 =
          passwordController0.resetPasswordViaToken(strMap13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4176() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4176");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 =
          passwordController0.registerUserByEmail(user21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4177() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4177");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 =
          passwordController0.resetPasswordViaToken(strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4178() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4178");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4179() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4179");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    edu.harvard.h2ms.domain.core.User user29 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity30 =
          passwordController0.registerUserByEmail(user29);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender26);
  }

  @Test
  public void test4180() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4180");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity30 =
          passwordController0.resetPasswordViaToken(strMap29);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender26);
  }

  @Test
  public void test4181() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4181");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity29 =
          passwordController0.registerUserByEmail(user28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4182() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4182");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4183() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4183");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4184() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4184");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass26 = javaMailSender25.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4185() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4185");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity20 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4186() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4186");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    edu.harvard.h2ms.domain.core.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 =
          passwordController0.registerUserByEmail(user26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4187() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4187");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 =
          passwordController0.resetPasswordViaToken(strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4188() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4188");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4189() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4189");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender25);
    org.junit.Assert.assertNull(javaMailSender26);
  }

  @Test
  public void test4190() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4190");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 = null;
    passwordController0.emailSender = javaMailSender30;
    org.springframework.mail.javamail.JavaMailSender javaMailSender32 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender34 = null;
    passwordController0.emailSender = javaMailSender34;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender32);
    org.junit.Assert.assertNull(javaMailSender33);
  }

  @Test
  public void test4191() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4191");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4192() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4192");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    edu.harvard.h2ms.domain.core.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 =
          passwordController0.registerUserByEmail(user24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4193() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4193");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    java.lang.Class<?> wildcardClass26 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNotNull(wildcardClass26);
  }

  @Test
  public void test4194() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4194");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    edu.harvard.h2ms.domain.core.User user23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 =
          passwordController0.registerUserByEmail(user23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4195() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4195");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4196() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4196");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    java.lang.Class<?> wildcardClass16 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test4197() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4197");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test4198() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4198");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity19 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4199() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4199");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 =
          passwordController0.resetPasswordViaToken(strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4200() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4200");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass23 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test4201() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4201");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    javax.servlet.http.HttpServletRequest httpServletRequest28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity29 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4202() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4202");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity19 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4203() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4203");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4204() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4204");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 =
          passwordController0.resetPasswordViaToken(strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test4205() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4205");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 = null;
    passwordController0.emailSender = javaMailSender31;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 = null;
    passwordController0.emailSender = javaMailSender33;
    org.springframework.mail.javamail.JavaMailSender javaMailSender35 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender36 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity38 =
          passwordController0.resetPasswordViaToken(strMap37);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender25);
    org.junit.Assert.assertNull(javaMailSender28);
    org.junit.Assert.assertNull(javaMailSender35);
    org.junit.Assert.assertNull(javaMailSender36);
  }

  @Test
  public void test4206() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4206");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4207() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4207");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.resetPasswordViaToken(strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4208() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4208");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 =
          passwordController0.registerUserByEmail(user16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4209() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4209");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass17 = javaMailSender16.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4210() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4210");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test4211() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4211");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass23 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test4212() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4212");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    edu.harvard.h2ms.domain.core.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity21 =
          passwordController0.registerUserByEmail(user20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4213() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4213");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test4214() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4214");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass21 = javaMailSender20.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4215() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4215");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4216() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4216");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity29 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4217() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4217");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 =
          passwordController0.registerUserByEmail(user17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4218() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4218");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.resetPasswordViaToken(strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4219() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4219");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity31 =
          passwordController0.resetPasswordViaToken(strMap30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4220() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4220");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.resetPasswordViaToken(strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4221() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4221");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    java.lang.Class<?> wildcardClass26 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNotNull(wildcardClass26);
  }

  @Test
  public void test4222() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4222");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test4223() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4223");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.resetPasswordViaToken(strMap21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4224() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4224");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.resetPasswordViaToken(strMap14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test4225() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4225");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass15 = javaMailSender14.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4226() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4226");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4227() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4227");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender32 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 = null;
    passwordController0.emailSender = javaMailSender33;
    org.springframework.mail.javamail.JavaMailSender javaMailSender35 = null;
    passwordController0.emailSender = javaMailSender35;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender30);
    org.junit.Assert.assertNull(javaMailSender31);
    org.junit.Assert.assertNull(javaMailSender32);
  }

  @Test
  public void test4228() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4228");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    edu.harvard.h2ms.domain.core.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 =
          passwordController0.registerUserByEmail(user22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4229() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4229");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity24 =
          passwordController0.resetPasswordViaToken(strMap23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4230() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4230");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4231() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4231");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4232() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4232");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4233() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4233");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    java.lang.Class<?> wildcardClass21 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test4234() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4234");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity29 =
          passwordController0.registerUserByEmail(user28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4235() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4235");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    edu.harvard.h2ms.domain.core.User user27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 =
          passwordController0.registerUserByEmail(user27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4236() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4236");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity31 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4237() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4237");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity27 =
          passwordController0.resetPasswordViaToken(strMap26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4238() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4238");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass29 = javaMailSender28.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender28);
  }

  @Test
  public void test4239() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4239");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity31 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4240() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4240");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user31 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity32 =
          passwordController0.registerUserByEmail(user31);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender29);
    org.junit.Assert.assertNull(javaMailSender30);
  }

  @Test
  public void test4241() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4241");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity31 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4242() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4242");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4243() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4243");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4244() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4244");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    java.lang.Class<?> wildcardClass17 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test4245() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4245");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity24 =
          passwordController0.registerUserByEmail(user23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4246() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4246");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    edu.harvard.h2ms.domain.core.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity17 =
          passwordController0.registerUserByEmail(user16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test4247() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4247");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.resetPasswordViaToken(strMap27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender26);
  }

  @Test
  public void test4248() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4248");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 = null;
    passwordController0.emailSender = javaMailSender2;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test4249() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4249");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 =
          passwordController0.resetPasswordViaToken(strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4250() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4250");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4251() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4251");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity22 =
          passwordController0.registerUserByEmail(user21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4252() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4252");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4253() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4253");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 = null;
    passwordController0.emailSender = javaMailSender30;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender29);
  }

  @Test
  public void test4254() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4254");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    javax.servlet.http.HttpServletRequest httpServletRequest23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity24 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4255() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4255");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender28);
  }

  @Test
  public void test4256() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4256");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    javax.servlet.http.HttpServletRequest httpServletRequest28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity29 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4257() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4257");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity31 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4258() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4258");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4259() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4259");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.resetPasswordViaToken(strMap20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4260() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4260");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    edu.harvard.h2ms.domain.core.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 =
          passwordController0.registerUserByEmail(user24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4261() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4261");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test4262() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4262");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test4263() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4263");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.resetPasswordViaToken(strMap17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4264() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4264");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass24 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNotNull(wildcardClass24);
  }

  @Test
  public void test4265() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4265");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    edu.harvard.h2ms.domain.core.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 =
          passwordController0.registerUserByEmail(user26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4266() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4266");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender32 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 = null;
    passwordController0.emailSender = javaMailSender33;
    edu.harvard.h2ms.domain.core.User user35 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity36 =
          passwordController0.registerUserByEmail(user35);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender30);
    org.junit.Assert.assertNull(javaMailSender31);
    org.junit.Assert.assertNull(javaMailSender32);
  }

  @Test
  public void test4267() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4267");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity19 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test4268() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4268");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4269() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4269");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4270() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4270");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass26 = javaMailSender25.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4271() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4271");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    java.lang.Class<?> wildcardClass15 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test4272() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4272");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender28);
  }

  @Test
  public void test4273() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4273");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4274() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4274");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    edu.harvard.h2ms.domain.core.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 =
          passwordController0.registerUserByEmail(user26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4275() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4275");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    edu.harvard.h2ms.domain.core.User user15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity16 =
          passwordController0.registerUserByEmail(user15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4276() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4276");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 = null;
    passwordController0.emailSender = javaMailSender2;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 =
          passwordController0.resetPasswordViaToken(strMap7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test4277() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4277");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4278() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4278");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    edu.harvard.h2ms.domain.core.User user25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity26 =
          passwordController0.registerUserByEmail(user25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4279() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4279");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass21 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test4280() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4280");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity19 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test4281() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4281");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 = null;
    passwordController0.emailSender = javaMailSender30;
    javax.servlet.http.HttpServletRequest httpServletRequest34 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity35 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest34);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4282() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4282");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity18 =
          passwordController0.registerUserByEmail(user17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4283() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4283");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 = null;
    passwordController0.emailSender = javaMailSender31;
    java.lang.Class<?> wildcardClass33 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNotNull(wildcardClass33);
  }

  @Test
  public void test4284() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4284");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4285() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4285");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4286() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4286");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 =
          passwordController0.resetPasswordViaToken(strMap15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4287() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4287");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender26);
  }

  @Test
  public void test4288() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4288");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test4289() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4289");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4290() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4290");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 = null;
    passwordController0.emailSender = javaMailSender2;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test4291() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4291");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4292() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4292");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4293() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4293");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4294() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4294");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    edu.harvard.h2ms.domain.core.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 =
          passwordController0.registerUserByEmail(user30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4295() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4295");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity23 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4296() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4296");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test4297() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4297");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender32 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender33 = null;
    passwordController0.emailSender = javaMailSender33;
    org.springframework.mail.javamail.JavaMailSender javaMailSender35 = null;
    passwordController0.emailSender = javaMailSender35;
    org.springframework.mail.javamail.JavaMailSender javaMailSender37 = null;
    passwordController0.emailSender = javaMailSender37;
    edu.harvard.h2ms.domain.core.User user39 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity40 =
          passwordController0.registerUserByEmail(user39);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender30);
    org.junit.Assert.assertNull(javaMailSender31);
    org.junit.Assert.assertNull(javaMailSender32);
  }

  @Test
  public void test4298() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4298");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity25 =
          passwordController0.registerUserByEmail(user24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
  }

  @Test
  public void test4299() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4299");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity20 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4300() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4300");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    org.springframework.mail.javamail.JavaMailSender javaMailSender30 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user31 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity32 =
          passwordController0.registerUserByEmail(user31);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender23);
    org.junit.Assert.assertNull(javaMailSender30);
  }

  @Test
  public void test4301() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4301");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    java.lang.Class<?> wildcardClass13 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test4302() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4302");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    edu.harvard.h2ms.domain.core.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 =
          passwordController0.registerUserByEmail(user22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4303() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4303");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity31 =
          passwordController0.registerUserByEmail(user30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender27);
    org.junit.Assert.assertNull(javaMailSender28);
    org.junit.Assert.assertNull(javaMailSender29);
  }

  @Test
  public void test4304() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4304");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 =
          passwordController0.resetPasswordViaToken(strMap13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4305() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4305");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity23 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test4306() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4306");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
  }

  @Test
  public void test4307() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4307");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity28 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test4308() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4308");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity20 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test4309() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4309");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity19 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test4310() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4310");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass16 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test4311() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4311");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity19 =
          passwordController0.resetPasswordViaToken(strMap18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test4312() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4312");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 = null;
    passwordController0.emailSender = javaMailSender27;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.springframework.mail.javamail.JavaMailSender javaMailSender31 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender32 = null;
    passwordController0.emailSender = javaMailSender32;
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender25);
    org.junit.Assert.assertNull(javaMailSender26);
    org.junit.Assert.assertNull(javaMailSender31);
  }

  @Test
  public void test4313() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4313");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test4314() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4314");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 = null;
    passwordController0.emailSender = javaMailSender21;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    edu.harvard.h2ms.domain.core.User user27 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity28 =
          passwordController0.registerUserByEmail(user27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test4315() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4315");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity27 =
          passwordController0.registerUserByEmail(user26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender24);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test4316() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4316");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test4317() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4317");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.resetPasswordViaToken(strMap20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test4318() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4318");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4319() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4319");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4320() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4320");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.resetPasswordViaToken(strMap24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4321() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4321");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender23 = null;
    passwordController0.emailSender = javaMailSender23;
    org.springframework.mail.javamail.JavaMailSender javaMailSender25 = null;
    passwordController0.emailSender = javaMailSender25;
    org.springframework.mail.javamail.JavaMailSender javaMailSender27 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity29 =
          passwordController0.resetPasswordViaToken(strMap28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNull(javaMailSender27);
  }

  @Test
  public void test4322() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4322");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    edu.harvard.h2ms.domain.core.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity23 =
          passwordController0.registerUserByEmail(user22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test4323() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4323");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity25 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4324() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4324");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test4325() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4325");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 = null;
    passwordController0.emailSender = javaMailSender17;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.springframework.mail.javamail.JavaMailSender javaMailSender21 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 = null;
    passwordController0.emailSender = javaMailSender28;
    javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity33 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test4326() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4326");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 = null;
    passwordController0.emailSender = javaMailSender6;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test4327() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4327");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 = null;
    passwordController0.emailSender = javaMailSender18;
    org.springframework.mail.javamail.JavaMailSender javaMailSender20 = null;
    passwordController0.emailSender = javaMailSender20;
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 = null;
    passwordController0.emailSender = javaMailSender22;
    org.springframework.mail.javamail.JavaMailSender javaMailSender24 = null;
    passwordController0.emailSender = javaMailSender24;
    org.springframework.mail.javamail.JavaMailSender javaMailSender26 = null;
    passwordController0.emailSender = javaMailSender26;
    org.springframework.mail.javamail.JavaMailSender javaMailSender28 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender29 = null;
    passwordController0.emailSender = javaMailSender29;
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender28);
  }

  @Test
  public void test4328() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4328");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender6 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 = null;
    passwordController0.emailSender = javaMailSender9;
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    org.springframework.mail.javamail.JavaMailSender javaMailSender13 = null;
    passwordController0.emailSender = javaMailSender13;
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test4329() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest8.test4329");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    org.springframework.mail.javamail.JavaMailSender javaMailSender7 = null;
    passwordController0.emailSender = javaMailSender7;
    org.springframework.mail.javamail.JavaMailSender javaMailSender9 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
    org.springframework.mail.javamail.JavaMailSender javaMailSender12 = null;
    passwordController0.emailSender = javaMailSender12;
    org.springframework.mail.javamail.JavaMailSender javaMailSender14 = null;
    passwordController0.emailSender = javaMailSender14;
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 = null;
    passwordController0.emailSender = javaMailSender16;
    org.springframework.mail.javamail.JavaMailSender javaMailSender18 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender19 = null;
    passwordController0.emailSender = javaMailSender19;
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender18);
  }
}
