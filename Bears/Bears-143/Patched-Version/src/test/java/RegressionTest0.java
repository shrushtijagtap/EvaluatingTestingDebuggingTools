import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test0001() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0001");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    edu.harvard.h2ms.domain.core.User user1 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity2 =
          passwordController0.registerUserByEmail(user1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0002() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0002");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    java.lang.Class<?> wildcardClass1 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0003() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0003");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity2 =
          passwordController0.resetPasswordViaToken(strMap1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0004() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0004");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0005() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0005");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0006() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0006");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0007() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0007");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0008() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0008");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0009() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0009");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    edu.harvard.h2ms.domain.core.User user5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity6 =
          passwordController0.registerUserByEmail(user5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0010() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0010");
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
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.resetPasswordViaToken(strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0011() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0011");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 =
          passwordController0.resetPasswordViaToken(strMap5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0012() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0012");
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
    edu.harvard.h2ms.domain.core.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 =
          passwordController0.registerUserByEmail(user8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0013() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0013");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    java.lang.Class<?> wildcardClass5 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0014() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0014");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
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
  }

  @Test
  public void test0015() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0015");
    java.lang.Object obj0 = new java.lang.Object();
    java.lang.Class<?> wildcardClass1 = obj0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0016() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0016");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 =
          passwordController0.resetPasswordViaToken(strMap4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0017() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0017");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0018() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0018");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass8 = javaMailSender7.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0019() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0019");
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
    java.lang.Class<?> wildcardClass8 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0020() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0020");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0021() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0021");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0022() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0022");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity5 =
          passwordController0.registerUserByEmail(user4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0023() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0023");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0024() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0024");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    edu.harvard.h2ms.domain.core.User user7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 =
          passwordController0.registerUserByEmail(user7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0025() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0025");
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
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0026() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0026");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 =
          passwordController0.resetPasswordViaToken(strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0027() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0027");
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
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0028() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0028");
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
    edu.harvard.h2ms.domain.core.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 =
          passwordController0.registerUserByEmail(user10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0029() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0029");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
    java.lang.Class<?> wildcardClass7 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0030() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0030");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0031() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0031");
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
    java.lang.Class<?> wildcardClass10 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0032() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0032");
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
  }

  @Test
  public void test0033() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0033");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 =
          passwordController0.resetPasswordViaToken(strMap3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0034() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0034");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    edu.harvard.h2ms.domain.core.User user6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 =
          passwordController0.registerUserByEmail(user6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0035() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0035");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity6 =
          passwordController0.registerUserByEmail(user5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test0036() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0036");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0037() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0037");
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
  }

  @Test
  public void test0038() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0038");
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
  }

  @Test
  public void test0039() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0039");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass6 = javaMailSender5.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test0040() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0040");
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
    java.lang.Class<?> wildcardClass11 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0041() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0041");
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
    edu.harvard.h2ms.domain.core.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 =
          passwordController0.registerUserByEmail(user10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0042() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0042");
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
    java.lang.Class<?> wildcardClass13 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0043() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0043");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass5 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0044() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0044");
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
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.resetPasswordViaToken(strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0045() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0045");
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
  }

  @Test
  public void test0046() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0046");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0047() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0047");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0048() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0048");
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
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0049() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0049");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    java.lang.Class<?> wildcardClass6 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0050() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0050");
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
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.resetPasswordViaToken(strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0051() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0051");
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
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0052() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0052");
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
    java.lang.Class<?> wildcardClass7 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0053() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0053");
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
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0054() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0054");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 =
          passwordController0.resetPasswordViaToken(strMap5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test0055() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0055");
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
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity11 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0056() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0056");
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
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0057() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0057");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0058() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0058");
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
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0059() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0059");
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
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity11 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0060() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0060");
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
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0061() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0061");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0062() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0062");
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
    java.lang.Class<?> wildcardClass12 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0063() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0063");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test0064() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0064");
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
    java.lang.Class<?> wildcardClass13 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0065() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0065");
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
    edu.harvard.h2ms.domain.core.User user7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 =
          passwordController0.registerUserByEmail(user7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0066() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0066");
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
    edu.harvard.h2ms.domain.core.User user7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 =
          passwordController0.registerUserByEmail(user7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0067() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0067");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0068() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0068");
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
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0069() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0069");
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
    java.lang.Class<?> wildcardClass14 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0070() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0070");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 = null;
    passwordController0.emailSender = javaMailSender4;
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0071() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0071");
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
    edu.harvard.h2ms.domain.core.User user6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 =
          passwordController0.registerUserByEmail(user6);
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
  public void test0072() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0072");
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
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0073() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0073");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0074() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0074");
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
  }

  @Test
  public void test0075() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0075");
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
          passwordController0.getPasswordResetToken("", "", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0076() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0076");
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
  }

  @Test
  public void test0077() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0077");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0078() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0078");
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
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0079() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0079");
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
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0080() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0080");
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
    edu.harvard.h2ms.domain.core.User user9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 =
          passwordController0.registerUserByEmail(user9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0081() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0081");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0082() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0082");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    java.lang.Class<?> wildcardClass3 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0083() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0083");
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
  }

  @Test
  public void test0084() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0084");
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
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.resetPasswordViaToken(strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0085() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0085");
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
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0086() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0086");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass9 = javaMailSender8.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0087() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0087");
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
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0088() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0088");
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
    java.lang.Class<?> wildcardClass6 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0089() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0089");
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
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0090() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0090");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass12 = javaMailSender11.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0091() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0091");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0092() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0092");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0093() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0093");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0094() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0094");
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
  }

  @Test
  public void test0095() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0095");
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
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest8);
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
  public void test0096() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0096");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0097() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0097");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0098() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0098");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
  }

  @Test
  public void test0099() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0099");
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
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0100() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0100");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0101() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0101");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0102() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0102");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0103() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0103");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user2 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity3 =
          passwordController0.registerUserByEmail(user2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
  }

  @Test
  public void test0104() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0104");
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
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0105() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0105");
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
    edu.harvard.h2ms.domain.core.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 =
          passwordController0.registerUserByEmail(user8);
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
  }

  @Test
  public void test0106() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0106");
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
    edu.harvard.h2ms.domain.core.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 =
          passwordController0.registerUserByEmail(user14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0107() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0107");
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
    java.lang.Class<?> wildcardClass11 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0108() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0108");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0109() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0109");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0110() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0110");
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
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0111() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0111");
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
  }

  @Test
  public void test0112() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0112");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0113() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0113");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 =
          passwordController0.registerUserByEmail(user6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test0114() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0114");
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
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0115() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0115");
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
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0116() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0116");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0117() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0117");
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
    java.lang.Class<?> wildcardClass19 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0118() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0118");
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
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0119() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0119");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0120() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0120");
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
    javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity11 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest10);
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
  }

  @Test
  public void test0121() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0121");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass15 = javaMailSender14.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0122() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0122");
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
    edu.harvard.h2ms.domain.core.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 =
          passwordController0.registerUserByEmail(user10);
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
  }

  @Test
  public void test0123() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0123");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0124() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0124");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0125() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0125");
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
  }

  @Test
  public void test0126() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0126");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0127() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0127");
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
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.resetPasswordViaToken(strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test0128() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0128");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0129() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0129");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass11 = javaMailSender10.getClass();
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
  }

  @Test
  public void test0130() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0130");
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
    edu.harvard.h2ms.domain.core.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 =
          passwordController0.registerUserByEmail(user8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0131() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0131");
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
  }

  @Test
  public void test0132() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0132");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0133() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0133");
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
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0134() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0134");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0135() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0135");
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
    java.lang.Class<?> wildcardClass18 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0136() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0136");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 = null;
    passwordController0.emailSender = javaMailSender5;
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
  }

  @Test
  public void test0137() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0137");
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
    edu.harvard.h2ms.domain.core.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 =
          passwordController0.registerUserByEmail(user14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0138() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0138");
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
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.resetPasswordViaToken(strMap8);
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
  }

  @Test
  public void test0139() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0139");
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
    java.lang.Class<?> wildcardClass11 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0140() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0140");
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
    java.lang.Class<?> wildcardClass11 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0141() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0141");
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
    javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity20 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0142() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0142");
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
    java.lang.Class<?> wildcardClass15 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0143() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0143");
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
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0144() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0144");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0145() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0145");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test0146() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0146");
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
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0147() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0147");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0148() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0148");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
  }

  @Test
  public void test0149() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0149");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity3 =
          passwordController0.resetPasswordViaToken(strMap2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
  }

  @Test
  public void test0150() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0150");
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
  }

  @Test
  public void test0151() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0151");
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
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest17);
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
  public void test0152() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0152");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0153() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0153");
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
  }

  @Test
  public void test0154() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0154");
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
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0155() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0155");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0156() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0156");
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
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0157() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0157");
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
    edu.harvard.h2ms.domain.core.User user9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 =
          passwordController0.registerUserByEmail(user9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0158() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0158");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 =
          passwordController0.resetPasswordViaToken(strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test0159() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0159");
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
    java.lang.Class<?> wildcardClass15 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0160() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0160");
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
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0161() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0161");
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
  }

  @Test
  public void test0162() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0162");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass4 = javaMailSender3.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0163() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0163");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass2 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNotNull(wildcardClass2);
  }

  @Test
  public void test0164() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0164");
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
          passwordController0.getPasswordResetToken("", "", httpServletRequest18);
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
  public void test0165() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0165");
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
    java.lang.Class<?> wildcardClass12 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0166() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0166");
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
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest14);
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
  }

  @Test
  public void test0167() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0167");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0168() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0168");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    org.springframework.mail.javamail.JavaMailSender javaMailSender5 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass6 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0169() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0169");
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
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0170() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0170");
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
    java.lang.Class<?> wildcardClass13 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0171() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0171");
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
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0172() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0172");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0173() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0173");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0174() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0174");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass7 = javaMailSender6.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0175() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0175");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0176() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0176");
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
    java.lang.Class<?> wildcardClass9 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0177() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0177");
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
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0178() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0178");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0179() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0179");
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
    edu.harvard.h2ms.domain.core.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 =
          passwordController0.registerUserByEmail(user10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0180() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0180");
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
    java.lang.Class<?> wildcardClass10 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0181() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0181");
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
    java.lang.Class<?> wildcardClass16 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0182() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0182");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0183() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0183");
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
    java.lang.Class<?> wildcardClass22 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test0184() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0184");
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
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0185() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0185");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0186() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0186");
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
  }

  @Test
  public void test0187() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0187");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass16 = javaMailSender15.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0188() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0188");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0189() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0189");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0190() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0190");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass6 = javaMailSender5.getClass();
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
  public void test0191() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0191");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0192() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0192");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0193() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0193");
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
    javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0194() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0194");
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
    java.lang.Class<?> wildcardClass17 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0195() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0195");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0196() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0196");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0197() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0197");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass10 = javaMailSender9.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0198() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0198");
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
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0199() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0199");
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
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0200() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0200");
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
    java.lang.Class<?> wildcardClass16 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0201() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0201");
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
  }

  @Test
  public void test0202() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0202");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0203() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0203");
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
    edu.harvard.h2ms.domain.core.User user9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 =
          passwordController0.registerUserByEmail(user9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0204() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0204");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0205() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0205");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0206() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0206");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0207() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0207");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass2 = javaMailSender1.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
  }

  @Test
  public void test0208() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0208");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0209() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0209");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0210() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0210");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0211() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0211");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0212() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0212");
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
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
  }

  @Test
  public void test0213() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0213");
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
    java.lang.Class<?> wildcardClass16 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0214() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0214");
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
    java.lang.Class<?> wildcardClass12 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0215() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0215");
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
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0216() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0216");
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
  }

  @Test
  public void test0217() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0217");
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
  }

  @Test
  public void test0218() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0218");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
  }

  @Test
  public void test0219() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0219");
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
    javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity18 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0220() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0220");
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
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest12);
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
  }

  @Test
  public void test0221() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0221");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass8 = javaMailSender7.getClass();
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
  }

  @Test
  public void test0222() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0222");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0223() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0223");
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
    org.springframework.mail.javamail.JavaMailSender javaMailSender11 = null;
    passwordController0.emailSender = javaMailSender11;
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0224() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0224");
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
    edu.harvard.h2ms.domain.core.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 =
          passwordController0.registerUserByEmail(user8);
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
  public void test0225() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0225");
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
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0226() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0226");
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
    edu.harvard.h2ms.domain.core.User user9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 =
          passwordController0.registerUserByEmail(user9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0227() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0227");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test0228() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0228");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0229() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0229");
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
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0230() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0230");
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
    javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0231() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0231");
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
    java.lang.Class<?> wildcardClass10 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0232() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0232");
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
    java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity6 =
          passwordController0.resetPasswordViaToken(strMap5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test0233() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0233");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0234() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0234");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity5 =
          passwordController0.resetPasswordViaToken(strMap4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0235() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0235");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0236() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0236");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0237() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0237");
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
    java.lang.Class<?> wildcardClass16 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0238() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0238");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0239() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0239");
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
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
  }

  @Test
  public void test0240() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0240");
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
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0241() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0241");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0242() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0242");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0243() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0243");
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
    java.lang.Class<?> wildcardClass9 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0244() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0244");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0245() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0245");
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
    java.lang.Class<?> wildcardClass18 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0246() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0246");
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
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0247() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0247");
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
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.resetPasswordViaToken(strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0248() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0248");
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
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0249() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0249");
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
    java.lang.Class<?> wildcardClass15 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0250() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0250");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0251() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0251");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0252() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0252");
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
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest20);
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
  public void test0253() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0253");
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
    java.lang.Class<?> wildcardClass17 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0254() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0254");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0255() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0255");
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
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.resetPasswordViaToken(strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0256() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0256");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass5 = javaMailSender4.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test0257() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0257");
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
    java.lang.Class<?> wildcardClass9 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0258() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0258");
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
    java.lang.Class<?> wildcardClass19 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0259() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0259");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0260() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0260");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0261() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0261");
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
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0262() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0262");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0263() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0263");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0264() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0264");
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
  }

  @Test
  public void test0265() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0265");
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
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0266() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0266");
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
    java.lang.Class<?> wildcardClass21 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test0267() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0267");
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
    javax.servlet.http.HttpServletRequest httpServletRequest26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity27 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest26);
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
  }

  @Test
  public void test0268() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0268");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0269() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0269");
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
    javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0270() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0270");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0271() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0271");
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
    javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity20 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0272() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0272");
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
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest14);
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
  public void test0273() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0273");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0274() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0274");
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
    edu.harvard.h2ms.domain.core.User user7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 =
          passwordController0.registerUserByEmail(user7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0275() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0275");
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
    javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0276() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0276");
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
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0277() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0277");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0278() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0278");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass17 = javaMailSender16.getClass();
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
  }

  @Test
  public void test0279() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0279");
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
    java.lang.Class<?> wildcardClass17 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0280() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0280");
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
    edu.harvard.h2ms.domain.core.User user6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 =
          passwordController0.registerUserByEmail(user6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test0281() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0281");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0282() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0282");
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
    java.lang.Class<?> wildcardClass10 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0283() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0283");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0284() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0284");
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
    javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0285() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0285");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0286() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0286");
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
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0287() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0287");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0288() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0288");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0289() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0289");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass8 = javaMailSender7.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0290() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0290");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0291() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0291");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0292() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0292");
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
  }

  @Test
  public void test0293() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0293");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass16 = javaMailSender15.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0294() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0294");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0295() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0295");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test0296() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0296");
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
    java.lang.Class<?> wildcardClass18 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0297() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0297");
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
    org.junit.Assert.assertNull(javaMailSender2);
  }

  @Test
  public void test0298() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0298");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0299() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0299");
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
    java.lang.Class<?> wildcardClass13 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0300() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0300");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0301() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0301");
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
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.resetPasswordViaToken(strMap8);
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
  public void test0302() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0302");
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
    java.lang.Class<?> wildcardClass21 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test0303() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0303");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0304() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0304");
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
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test0305() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0305");
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
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0306() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0306");
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
    java.lang.Class<?> wildcardClass8 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0307() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0307");
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
    java.lang.Class<?> wildcardClass21 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test0308() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0308");
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
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0309() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0309");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0310() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0310");
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
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0311() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0311");
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
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0312() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0312");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0313() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0313");
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
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0314() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0314");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0315() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0315");
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
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0316() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0316");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0317() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0317");
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
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0318() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0318");
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
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 =
          passwordController0.resetPasswordViaToken(strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test0319() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0319");
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
    edu.harvard.h2ms.domain.core.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity9 =
          passwordController0.registerUserByEmail(user8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0320() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0320");
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
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test0321() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0321");
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
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest14);
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
  }

  @Test
  public void test0322() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0322");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0323() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0323");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0324() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0324");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass9 = javaMailSender8.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0325() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0325");
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
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.resetPasswordViaToken(strMap11);
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
  }

  @Test
  public void test0326() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0326");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0327() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0327");
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
  }

  @Test
  public void test0328() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0328");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    edu.harvard.h2ms.domain.core.User user3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity4 =
          passwordController0.registerUserByEmail(user3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0329() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0329");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0330() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0330");
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
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
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
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0331() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0331");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0332() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0332");
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
    edu.harvard.h2ms.domain.core.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 =
          passwordController0.registerUserByEmail(user10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0333() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0333");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0334() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0334");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0335() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0335");
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
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test0336() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0336");
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
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test0337() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0337");
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
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0338() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0338");
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
    edu.harvard.h2ms.domain.core.User user9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 =
          passwordController0.registerUserByEmail(user9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
  }

  @Test
  public void test0339() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0339");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass15 = javaMailSender14.getClass();
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
  public void test0340() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0340");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0341() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0341");
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
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0342() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0342");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0343() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0343");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass6 = javaMailSender5.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test0344() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0344");
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
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0345() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0345");
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
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest8);
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
  public void test0346() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0346");
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
    org.springframework.mail.javamail.JavaMailSender javaMailSender16 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity20 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0347() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0347");
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
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0348() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0348");
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
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0349() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0349");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0350() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0350");
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
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0351() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0351");
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
    java.lang.Class<?> wildcardClass24 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNotNull(wildcardClass24);
  }

  @Test
  public void test0352() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0352");
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
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity7 =
          passwordController0.resetPasswordViaToken(strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0353() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0353");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0354() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0354");
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
    javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity17 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest16);
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
  }

  @Test
  public void test0355() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0355");
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
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test0356() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0356");
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
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0357() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0357");
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
    javax.servlet.http.HttpServletRequest httpServletRequest23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity24 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0358() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0358");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0359() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0359");
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
    java.lang.Class<?> wildcardClass21 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test0360() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0360");
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
  }

  @Test
  public void test0361() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0361");
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
    javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest21);
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
  }

  @Test
  public void test0362() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0362");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass20 = javaMailSender19.getClass();
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
  }

  @Test
  public void test0363() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0363");
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
    java.lang.Class<?> wildcardClass9 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0364() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0364");
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
    java.lang.Class<?> wildcardClass14 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0365() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0365");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender4 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test0366() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0366");
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
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0367() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0367");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass4 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0368() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0368");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0369() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0369");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0370() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0370");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0371() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0371");
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
    java.lang.Class<?> wildcardClass23 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test0372() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0372");
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
    java.lang.Class<?> wildcardClass9 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0373() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0373");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0374() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0374");
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
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0375() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0375");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0376() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0376");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0377() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0377");
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
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0378() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0378");
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
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0379() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0379");
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
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest8);
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
  public void test0380() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0380");
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
    java.lang.Class<?> wildcardClass22 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test0381() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0381");
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
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0382() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0382");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0383() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0383");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0384() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0384");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0385() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0385");
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
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0386() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0386");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0387() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0387");
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
  }

  @Test
  public void test0388() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0388");
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
    javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity15 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0389() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0389");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass13 = javaMailSender12.getClass();
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
  public void test0390() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0390");
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
    javax.servlet.http.HttpServletRequest httpServletRequest26 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity27 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest26);
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
  }

  @Test
  public void test0391() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0391");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0392() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0392");
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
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0393() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0393");
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
          passwordController0.getPasswordResetToken("", "", httpServletRequest11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0394() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0394");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0395() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0395");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0396() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0396");
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
    java.lang.Class<?> wildcardClass20 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test0397() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0397");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0398() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0398");
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
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.resetPasswordViaToken(strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0399() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0399");
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
    edu.harvard.h2ms.domain.core.User user5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity6 =
          passwordController0.registerUserByEmail(user5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test0400() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0400");
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
  }

  @Test
  public void test0401() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0401");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0402() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0402");
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
  }

  @Test
  public void test0403() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0403");
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
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0404() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0404");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0405() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0405");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 = null;
    passwordController0.emailSender = javaMailSender1;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 = null;
    passwordController0.emailSender = javaMailSender3;
    javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity8 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0406() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0406");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0407() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0407");
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
    java.lang.Class<?> wildcardClass23 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test0408() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0408");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0409() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0409");
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
    edu.harvard.h2ms.domain.core.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity11 =
          passwordController0.registerUserByEmail(user10);
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
  public void test0410() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0410");
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
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0411() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0411");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0412() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0412");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass17 = javaMailSender16.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0413() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0413");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0414() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0414");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity4 =
          passwordController0.resetPasswordViaToken(strMap3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
  }

  @Test
  public void test0415() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0415");
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
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass23 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test0416() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0416");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass19 = javaMailSender18.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0417() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0417");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0418() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0418");
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
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0419() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0419");
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
    java.lang.Class<?> wildcardClass22 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test0420() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0420");
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
    javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity10 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
  }

  @Test
  public void test0421() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0421");
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
    javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity16 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0422() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0422");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0423() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0423");
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
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0424() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0424");
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
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0425() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0425");
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
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0426() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0426");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0427() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0427");
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
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.resetPasswordViaToken(strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0428() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0428");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0429() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0429");
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
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNull(javaMailSender25);
  }

  @Test
  public void test0430() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0430");
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
    java.lang.Class<?> wildcardClass16 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0431() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0431");
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
    edu.harvard.h2ms.domain.core.User user7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity8 =
          passwordController0.registerUserByEmail(user7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
  }

  @Test
  public void test0432() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0432");
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
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.resetPasswordViaToken(strMap8);
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
  public void test0433() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0433");
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
    java.lang.Class<?> wildcardClass25 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test0434() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0434");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0435() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0435");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0436() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0436");
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
    javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity22 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0437() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0437");
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
    java.lang.Class<?> wildcardClass21 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test0438() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0438");
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
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0439() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0439");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass10 = javaMailSender9.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0440() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0440");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0441() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0441");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass10 = javaMailSender9.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0442() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0442");
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
    java.lang.Class<?> wildcardClass6 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0443() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0443");
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
    java.lang.Class<?> wildcardClass21 = passwordController0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test0444() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0444");
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
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0445() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0445");
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
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
    java.lang.Class<?> wildcardClass18 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender17);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0446() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0446");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass18 = javaMailSender17.getClass();
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
  }

  @Test
  public void test0447() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0447");
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
    edu.harvard.h2ms.domain.core.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 =
          passwordController0.registerUserByEmail(user14);
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
  }

  @Test
  public void test0448() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0448");
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
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.getPasswordResetToken("", "hi!", httpServletRequest20);
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
  }

  @Test
  public void test0449() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0449");
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
    edu.harvard.h2ms.domain.core.User user9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 =
          passwordController0.registerUserByEmail(user9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0450() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0450");
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
    java.lang.Class<?> wildcardClass16 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0451() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0451");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0452() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0452");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass11 = javaMailSender10.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0453() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0453");
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
    org.junit.Assert.assertNull(javaMailSender7);
  }

  @Test
  public void test0454() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0454");
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
    java.lang.Class<?> wildcardClass12 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0455() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0455");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0456() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0456");
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
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0457() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0457");
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
    javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
  }

  @Test
  public void test0458() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0458");
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
    javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity14 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0459() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0459");
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
    edu.harvard.h2ms.domain.core.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity15 =
          passwordController0.registerUserByEmail(user14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender13);
  }

  @Test
  public void test0460() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0460");
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
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0461() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0461");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
  }

  @Test
  public void test0462() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0462");
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
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0463() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0463");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
  }

  @Test
  public void test0464() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0464");
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
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0465() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0465");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0466() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0466");
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
    javax.servlet.http.HttpServletRequest httpServletRequest23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity24 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest23);
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
  }

  @Test
  public void test0467() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0467");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0468() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0468");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0469() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0469");
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
    org.springframework.mail.javamail.JavaMailSender javaMailSender15 = null;
    passwordController0.emailSender = javaMailSender15;
    org.springframework.mail.javamail.JavaMailSender javaMailSender17 =
        passwordController0.emailSender;
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
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0470() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0470");
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
    java.lang.Class<?> wildcardClass11 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0471() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0471");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass12 = javaMailSender11.getClass();
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
  public void test0472() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0472");
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
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0473() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0473");
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
    org.junit.Assert.assertNull(javaMailSender21);
  }

  @Test
  public void test0474() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0474");
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
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
  }

  @Test
  public void test0475() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0475");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender15);
  }

  @Test
  public void test0476() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0476");
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
    javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity21 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest20);
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
  public void test0477() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0477");
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
    javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity9 =
          passwordController0.getPasswordResetToken("hi!", "", httpServletRequest8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0478() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0478");
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
    org.springframework.mail.javamail.JavaMailSender javaMailSender22 =
        passwordController0.emailSender;
    javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity26 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test0479() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0479");
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
    org.junit.Assert.assertNull(javaMailSender12);
    org.junit.Assert.assertNull(javaMailSender17);
  }

  @Test
  public void test0480() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0480");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass11 = javaMailSender10.getClass();
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
  public void test0481() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0481");
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
    edu.harvard.h2ms.domain.core.User user9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity10 =
          passwordController0.registerUserByEmail(user9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender8);
  }

  @Test
  public void test0482() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0482");
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
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0483() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0483");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
  }

  @Test
  public void test0484() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0484");
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
    javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity13 =
          passwordController0.getPasswordResetToken("hi!", "hi!", httpServletRequest12);
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
  public void test0485() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0485");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender3 =
        passwordController0.emailSender;
    edu.harvard.h2ms.domain.core.User user4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity5 =
          passwordController0.registerUserByEmail(user4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0486() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0486");
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
    org.springframework.mail.javamail.JavaMailSender javaMailSender8 = null;
    passwordController0.emailSender = javaMailSender8;
    org.springframework.mail.javamail.JavaMailSender javaMailSender10 = null;
    passwordController0.emailSender = javaMailSender10;
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
    org.junit.Assert.assertNull(javaMailSender5);
  }

  @Test
  public void test0487() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0487");
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
    java.lang.Class<?> wildcardClass21 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender20);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test0488() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0488");
    edu.harvard.h2ms.web.controller.PasswordController passwordController0 =
        new edu.harvard.h2ms.web.controller.PasswordController();
    org.springframework.mail.javamail.JavaMailSender javaMailSender1 =
        passwordController0.emailSender;
    org.springframework.mail.javamail.JavaMailSender javaMailSender2 = null;
    passwordController0.emailSender = javaMailSender2;
    java.lang.Class<?> wildcardClass4 = passwordController0.getClass();
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0489() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0489");
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
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender18);
    org.junit.Assert.assertNull(javaMailSender19);
    org.junit.Assert.assertNull(javaMailSender24);
  }

  @Test
  public void test0490() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0490");
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
    edu.harvard.h2ms.domain.core.User user6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<?> wildcardResponseEntity7 =
          passwordController0.registerUserByEmail(user6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender1);
    org.junit.Assert.assertNull(javaMailSender2);
    org.junit.Assert.assertNull(javaMailSender3);
  }

  @Test
  public void test0491() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0491");
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
    javax.servlet.http.HttpServletRequest httpServletRequest23 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity24 =
          passwordController0.getPasswordResetToken("", "", httpServletRequest23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender7);
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender20);
  }

  @Test
  public void test0492() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0492");
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
    org.junit.Assert.assertNull(javaMailSender9);
    org.junit.Assert.assertNull(javaMailSender12);
  }

  @Test
  public void test0493() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0493");
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
    org.junit.Assert.assertNull(javaMailSender10);
    org.junit.Assert.assertNull(javaMailSender13);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0494() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0494");
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
    org.junit.Assert.assertNull(javaMailSender21);
    org.junit.Assert.assertNull(javaMailSender22);
  }

  @Test
  public void test0495() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0495");
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
    org.junit.Assert.assertNull(javaMailSender11);
    org.junit.Assert.assertNull(javaMailSender14);
    org.junit.Assert.assertNull(javaMailSender15);
    org.junit.Assert.assertNull(javaMailSender16);
    org.junit.Assert.assertNull(javaMailSender19);
  }

  @Test
  public void test0496() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0496");
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
  }

  @Test
  public void test0497() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0497");
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
    org.junit.Assert.assertNull(javaMailSender11);
  }

  @Test
  public void test0498() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0498");
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
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender6);
  }

  @Test
  public void test0499() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0499");
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
    org.junit.Assert.assertNull(javaMailSender16);
  }

  @Test
  public void test0500() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test0500");
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
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.springframework.http.ResponseEntity<java.lang.Object> objResponseEntity12 =
          passwordController0.resetPasswordViaToken(strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNull(javaMailSender3);
    org.junit.Assert.assertNull(javaMailSender4);
    org.junit.Assert.assertNull(javaMailSender5);
    org.junit.Assert.assertNull(javaMailSender8);
  }
}
