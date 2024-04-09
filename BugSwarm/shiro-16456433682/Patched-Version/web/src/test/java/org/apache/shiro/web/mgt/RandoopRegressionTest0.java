import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = org.apache.shiro.web.mgt.CookieRememberMeManager.DEFAULT_REMEMBER_ME_COOKIE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rememberMe" + "'", str0, "rememberMe");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        org.apache.shiro.web.servlet.Cookie cookie4 = cookieRememberMeManager0.getCookie();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-34, -118, -41, -92, 104, 100, -113, 15, -8, 38, 106, -3, 85, -93, -110, 91]");
        org.junit.Assert.assertNull(cookie4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray7 = new byte[] { (byte) -1 };
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray7);
        org.apache.shiro.subject.SubjectContext subjectContext9 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection10 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext9);
        org.apache.shiro.subject.SubjectContext subjectContext11 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext11);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[41, 103, 42, -106, -60, 35, -18, -80, -109, 123, 16, -73, 36, 107, -39, -73]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNull(principalCollection10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        byte[] byteArray5 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-36, -4, -13, 41, 104, -85, 112, 21, 79, 2, 84, -58, -107, -52, 76, -63]");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[53, 1, 112, 101, 73, 4, -93, 55, -12, 120, -95, -114, -94, 31, -74, -93]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[53, 1, 112, 101, 73, 4, -93, 55, -12, 120, -95, -114, -94, 31, -74, -93]");
        org.junit.Assert.assertNull(principalCollection8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        org.apache.shiro.subject.Subject subject9 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken10 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject9, authenticationToken10, authenticationInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(principalCollection8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.web.servlet.Cookie cookie7 = cookieRememberMeManager0.getCookie();
        org.junit.Assert.assertNull(cookie7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.Subject subject7 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken8 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject7, authenticationToken8, authenticationInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-19, -119, 48, -56, -64, -57, -115, 66, -99, -105, -9, 20, -23, 95, -63, -72]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[82, 36, 91, 43, -115, -49, -60, -117, 66, 110, -54, -37, -96, 57, -77, 30]");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer1 = cookieRememberMeManager0.getSerializer();
        org.apache.shiro.subject.SubjectContext subjectContext2 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext2);
        org.junit.Assert.assertNotNull(principalCollectionSerializer1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.subject.SubjectContext subjectContext1 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection2 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext1);
        java.lang.Class<?> wildcardClass3 = cookieRememberMeManager0.getClass();
        org.junit.Assert.assertNull(principalCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        org.apache.shiro.web.servlet.Cookie cookie4 = null;
        cookieRememberMeManager0.setCookie(cookie4);
        org.apache.shiro.subject.Subject subject6 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException8 = null;
        cookieRememberMeManager0.onFailedLogin(subject6, authenticationToken7, authenticationException8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-116, -22, 57, 52, -33, 119, 35, 94, 122, 81, 80, 18, 77, -67, -38, 67]");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer5 = cookieRememberMeManager3.getSerializer();
        cookieRememberMeManager0.setSerializer(principalCollectionSerializer5);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[82, 72, 8, -93, 31, 118, -71, 122, 81, 85, -19, -102, -107, 7, -57, -72]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-14, -125, 95, 72, -118, -58, -58, -120, 110, -49, -60, 30, -101, -111, -8, -11]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        org.apache.shiro.subject.Subject subject3 = null;
        cookieRememberMeManager0.onLogout(subject3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer7 = cookieRememberMeManager5.getSerializer();
        cookieRememberMeManager0.setSerializer(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-115, -85, 48, -22, 112, 39, -65, 83, -46, 127, -17, 36, 13, 83, -96, 51]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-100, -29, 72, -72, 26, -35, -35, 18, 127, 97, 6, -38, 7, -73, 50, -32]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.subject.Subject subject8 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken9 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject8, authenticationToken9, authenticationInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[46, -78, -87, -94, -14, 121, -108, 118, -17, 124, 92, -121, -98, 108, -3, -60]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-63, 113, -128, -17, -97, 67, 114, -102, -100, -19, -128, 89, 17, -87, 99, -83]");
        org.junit.Assert.assertNotNull(cipherService7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.subject.SubjectContext subjectContext1 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection2 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie5 = cookieRememberMeManager3.getCookie();
        cookieRememberMeManager0.setCookie(cookie5);
        org.junit.Assert.assertNull(principalCollection2);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-81, -88, 88, 90, 112, 68, -45, -25, 116, 98, -105, 52, 12, 99, 80, -67]");
        org.junit.Assert.assertNotNull(cookie5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager1 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray2 = cookieRememberMeManager1.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie3 = cookieRememberMeManager1.getCookie();
        cookieRememberMeManager0.setCookie(cookie3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager7 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray8 = cookieRememberMeManager7.getDecryptionCipherKey();
        cookieRememberMeManager5.setDecryptionCipherKey(byteArray8);
        org.apache.shiro.subject.Subject subject10 = null;
        cookieRememberMeManager5.onLogout(subject10);
        org.apache.shiro.crypto.CipherService cipherService12 = cookieRememberMeManager5.getCipherService();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager13 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager14 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray15 = cookieRememberMeManager14.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie16 = cookieRememberMeManager14.getCookie();
        cookieRememberMeManager13.setCookie(cookie16);
        cookieRememberMeManager5.setCookie(cookie16);
        cookieRememberMeManager0.setCookie(cookie16);
        org.junit.Assert.assertNotNull(byteArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[126, 60, 85, -76, -109, -24, 14, 62, -49, 23, 61, -28, -88, -89, 43, -81]");
        org.junit.Assert.assertNotNull(cookie3);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-124, -36, 99, -125, 44, -29, -104, -74, -34, 0, 5, 54, 5, 17, -96, -98]");
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[52, -69, -101, -6, 93, -51, -12, 96, -53, 112, 87, 89, 88, 89, -121, -30]");
        org.junit.Assert.assertNotNull(cipherService12);
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-32, 61, -32, 65, -68, 81, -27, 26, 97, -83, 69, -64, 35, 39, -74, 21]");
        org.junit.Assert.assertNotNull(cookie16);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie7 = null;
        cookieRememberMeManager5.setCookie(cookie7);
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer9 = cookieRememberMeManager5.getSerializer();
        cookieRememberMeManager0.setSerializer(principalCollectionSerializer9);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[127, 63, -124, -65, 15, -7, 112, 22, -31, -40, 94, 105, 21, -62, 95, -20]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager4 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie6 = null;
        cookieRememberMeManager5.setCookie(cookie6);
        org.apache.shiro.subject.SubjectContext subjectContext8 = null;
        cookieRememberMeManager5.forgetIdentity(subjectContext8);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager5.setEncryptionCipherKey(byteArray16);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager18 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray19 = cookieRememberMeManager18.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie20 = cookieRememberMeManager18.getCookie();
        cookieRememberMeManager5.setCookie(cookie20);
        cookieRememberMeManager4.setCookie(cookie20);
        cookieRememberMeManager0.setCookie(cookie20);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[125, -86, -28, -73, 33, -74, 0, 96, 106, -19, 117, -70, -33, 43, -23, -19]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[125, -86, -28, -73, 33, -74, 0, 96, 106, -19, 117, -70, -33, 43, -23, -19]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 118, 13, -99, 10, -105, -123, -56, 31, 43, 13, 18, -15, -128, -95, -82]");
        org.junit.Assert.assertNotNull(cookie20);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        byte[] byteArray7 = null;
        cookieRememberMeManager0.setCipherKey(byteArray7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.subject.Subject subject8 = null;
        cookieRememberMeManager0.onLogout(subject8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[21, 36, -97, 107, 9, 26, -32, -92, 39, 31, 105, 86, 59, -19, 12, -23]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[123, 123, 1, -116, -108, -108, 54, 87, 57, 68, -125, 67, -67, 63, -45, 94]");
        org.junit.Assert.assertNotNull(cipherService7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager7 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray8 = cookieRememberMeManager7.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        cookieRememberMeManager7.setDecryptionCipherKey(byteArray10);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray10);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager13 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray14 = cookieRememberMeManager13.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager15 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray16 = cookieRememberMeManager15.getDecryptionCipherKey();
        cookieRememberMeManager13.setDecryptionCipherKey(byteArray16);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray16);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-102, 84, 104, 87, 119, -89, -25, 14, 53, 80, -45, 66, 22, -29, 100, -113]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[112, -77, 109, 60, 60, -18, 70, 70, -18, 65, -106, -74, -34, 24, 122, -17]");
        org.junit.Assert.assertNotNull(byteArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[9, -12, -37, 60, 67, -109, -103, -30, -30, -106, 84, 97, -128, 87, -63, -46]");
        org.junit.Assert.assertNotNull(byteArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[126, -11, 82, 100, -40, 44, 94, -46, -57, -40, 28, -112, -10, 97, 9, 56]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cookieRememberMeManager0.rememberIdentity(subject5, authenticationToken6, authenticationInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager8 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray9 = cookieRememberMeManager8.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie10 = cookieRememberMeManager8.getCookie();
        cookieRememberMeManager0.setCookie(cookie10);
        org.apache.shiro.subject.Subject subject12 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken13 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo14 = null;
        cookieRememberMeManager0.onSuccessfulLogin(subject12, authenticationToken13, authenticationInfo14);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-58, -56, 63, 118, -98, -82, -28, 96, 43, -9, -108, 45, -41, -74, -71, -26]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-75, 40, 101, -80, 3, 103, -25, 43, -60, -95, -15, 107, 64, -25, 30, 4]");
        org.junit.Assert.assertNotNull(cipherService7);
        org.junit.Assert.assertNotNull(byteArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[75, -42, -28, -14, 80, 93, -92, -6, -115, 65, 2, -26, 50, 71, -7, -48]");
        org.junit.Assert.assertNotNull(cookie10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        java.lang.Class<?> wildcardClass7 = cookieRememberMeManager0.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-3, -124, -11, -119, 104, 39, -98, 108, 56, 118, -26, 105, -119, 19, -3, 73]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-3, -124, -11, -119, 104, 39, -98, 108, 56, 118, -26, 105, -119, 19, -3, 73]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer2 = cookieRememberMeManager0.getSerializer();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager4 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray5 = cookieRememberMeManager4.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager6 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray7 = cookieRememberMeManager6.getDecryptionCipherKey();
        cookieRememberMeManager4.setDecryptionCipherKey(byteArray7);
        cookieRememberMeManager0.setCipherKey(byteArray7);
        org.apache.shiro.subject.SubjectContext subjectContext10 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext10);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, -68, 77, -45, -34, 24, 38, -9, -60, 34, 103, -27, 14, 79, -106, -50]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -68, 77, -45, -34, 24, 38, -9, -60, 34, 103, -27, 14, 79, -106, -50]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[96, -109, -96, 80, 121, 126, -82, 96, -7, 25, -25, -16, -95, 55, 35, 77]");
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[43, 116, 114, 75, 64, -2, -53, 54, -41, -49, -17, 64, -69, -93, 46, -2]");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        org.apache.shiro.subject.Subject subject3 = null;
        cookieRememberMeManager0.onLogout(subject3);
        java.lang.Class<?> wildcardClass5 = cookieRememberMeManager0.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-31, -126, 52, 43, -55, 76, 50, 62, -1, 10, 20, 57, 126, -7, 62, 29]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager7 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray8 = cookieRememberMeManager7.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        cookieRememberMeManager7.setDecryptionCipherKey(byteArray10);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray10);
        org.apache.shiro.subject.SubjectContext subjectContext13 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection14 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext13);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[47, -118, -43, -37, 34, -103, -59, 49, 22, -59, 48, 99, -107, 19, 73, 79]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-2, -114, -108, -68, 89, -89, 83, -111, -15, -23, -74, 55, 51, -25, 7, 71]");
        org.junit.Assert.assertNull(principalCollection14);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.Subject subject5 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException7 = null;
        cookieRememberMeManager0.onFailedLogin(subject5, authenticationToken6, authenticationException7);
        byte[] byteArray9 = new byte[] {};
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray9);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[31, -128, 28, 19, 84, 33, -54, 7, -25, -68, 26, -92, -123, 30, -1, -15]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[31, -128, 28, 19, 84, 33, -54, 7, -25, -68, 26, -92, -123, 30, -1, -15]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[63, -111, -32, 121, 36, -57, -92, -113, -90, -10, -109, 48, -32, -117, 42, 70]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager1 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager1.setCookie(cookie2);
        org.apache.shiro.subject.SubjectContext subjectContext4 = null;
        cookieRememberMeManager1.forgetIdentity(subjectContext4);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager1.setEncryptionCipherKey(byteArray12);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager14 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray15 = cookieRememberMeManager14.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie16 = cookieRememberMeManager14.getCookie();
        cookieRememberMeManager1.setCookie(cookie16);
        cookieRememberMeManager0.setCookie(cookie16);
        org.apache.shiro.subject.SubjectContext subjectContext19 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection20 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext19);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[44, -45, -51, 4, -109, 8, -96, 46, -75, 41, 99, 65, -16, 60, -81, -14]");
        org.junit.Assert.assertNotNull(cookie16);
        org.junit.Assert.assertNull(principalCollection20);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        org.apache.shiro.subject.SubjectContext subjectContext4 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext4);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-18, 55, 70, 97, -17, -124, 106, 102, 116, 75, 72, 105, -22, 31, 60, 123]");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer2 = cookieRememberMeManager0.getSerializer();
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection4 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext3);
        org.apache.shiro.subject.SubjectContext subjectContext5 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection6 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext5);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[43, 119, -93, -27, -61, -29, -1, -126, -70, -49, 76, 35, -20, 68, 33, -87]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNull(principalCollection4);
        org.junit.Assert.assertNull(principalCollection6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.Subject subject4 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken5 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException6 = null;
        cookieRememberMeManager0.onFailedLogin(subject4, authenticationToken5, authenticationException6);
        org.apache.shiro.subject.Subject subject8 = null;
        cookieRememberMeManager0.onLogout(subject8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-36, -98, 71, -51, 118, -115, -106, 124, 78, 14, 60, 123, -124, 43, 33, -18]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-36, -98, 71, -51, 118, -115, -106, 124, 78, 14, 60, 123, -124, 43, 33, -18]");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = cookieRememberMeManager0.getCookie();
        byte[] byteArray3 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.SubjectContext subjectContext4 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext4);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1, 82, -101, -59, -61, -31, 0, -112, 57, -2, 38, 29, -112, -122, -3, -75]");
        org.junit.Assert.assertNotNull(cookie2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 82, -101, -59, -61, -31, 0, -112, 57, -2, 38, 29, -112, -122, -3, -75]");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager2 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray3 = cookieRememberMeManager2.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.crypto.CipherService cipherService7 = cookieRememberMeManager0.getCipherService();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager8 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie11 = cookieRememberMeManager9.getCookie();
        cookieRememberMeManager8.setCookie(cookie11);
        cookieRememberMeManager0.setCookie(cookie11);
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer14 = cookieRememberMeManager0.getSerializer();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-29, -27, 97, -62, 73, 29, -69, 86, -115, 84, 84, -3, -82, -66, 67, 97]");
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-52, 114, -84, 77, -60, -107, -109, 65, -58, 72, -22, 118, 21, 98, 126, -100]");
        org.junit.Assert.assertNotNull(cipherService7);
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-87, -77, 55, 34, -97, -69, -45, -50, -25, -74, -110, -57, 55, -87, 119, -113]");
        org.junit.Assert.assertNotNull(cookie11);
        org.junit.Assert.assertNotNull(principalCollectionSerializer14);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        byte[] byteArray5 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[65, -73, 55, -59, 11, -73, -58, 85, -117, 106, 116, 40, 13, -119, -103, -16]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[65, -73, 55, -59, 11, -73, -58, 85, -117, 106, 116, 40, 13, -119, -103, -16]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[65, -73, 55, -59, 11, -73, -58, 85, -117, 106, 116, 40, 13, -119, -103, -16]");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        org.apache.shiro.subject.Subject subject5 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken6 = null;
        org.apache.shiro.authc.AuthenticationException authenticationException7 = null;
        cookieRememberMeManager0.onFailedLogin(subject5, authenticationToken6, authenticationException7);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray10 = cookieRememberMeManager9.getDecryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager11 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray12 = cookieRememberMeManager11.getDecryptionCipherKey();
        cookieRememberMeManager9.setDecryptionCipherKey(byteArray12);
        org.apache.shiro.subject.Subject subject14 = null;
        cookieRememberMeManager9.onLogout(subject14);
        org.apache.shiro.crypto.CipherService cipherService16 = cookieRememberMeManager9.getCipherService();
        cookieRememberMeManager0.setCipherService(cipherService16);
        org.apache.shiro.subject.SubjectContext subjectContext18 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext18);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[94, 39, -37, -113, 56, -17, 61, 93, 33, 55, -58, -6, 79, 22, -76, -87]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[94, 39, -37, -113, 56, -17, 61, 93, 33, 55, -58, -6, 79, 22, -76, -87]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-64, 108, 50, -94, 44, 6, 9, -110, 80, -88, -122, -108, -55, -22, -46, 60]");
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-99, 54, 63, -52, 19, 66, 45, 41, 89, 111, -30, 97, 76, 111, -80, 35]");
        org.junit.Assert.assertNotNull(cipherService16);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie7 = cookieRememberMeManager0.getCookie();
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-26, 123, 35, -2, 26, -35, 119, 7, 66, -72, -121, 83, 6, 86, 98, 14]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-26, 123, 35, -2, 26, -35, 119, 7, 66, -72, -121, 83, 6, 86, 98, 14]");
        org.junit.Assert.assertNull(cookie7);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager1 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray2 = cookieRememberMeManager1.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie3 = cookieRememberMeManager1.getCookie();
        cookieRememberMeManager0.setCookie(cookie3);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getDecryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray6);
        org.junit.Assert.assertNotNull(byteArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[93, -14, -71, 60, -32, -112, -6, -41, 29, 11, -110, 100, 17, -47, -40, 118]");
        org.junit.Assert.assertNotNull(cookie3);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-16, -22, -19, -48, -37, -107, -78, -27, 107, -81, 119, 44, -108, 67, -5, 63]");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        byte[] byteArray4 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer7 = cookieRememberMeManager5.getSerializer();
        byte[] byteArray8 = cookieRememberMeManager5.getEncryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray8);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager10 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie11 = null;
        cookieRememberMeManager10.setCookie(cookie11);
        org.apache.shiro.subject.SubjectContext subjectContext13 = null;
        cookieRememberMeManager10.forgetIdentity(subjectContext13);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager10.setEncryptionCipherKey(byteArray21);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray21);
        org.apache.shiro.subject.Subject subject24 = null;
        cookieRememberMeManager0.onLogout(subject24);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager26 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray27 = cookieRememberMeManager26.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie28 = null;
        cookieRememberMeManager26.setCookie(cookie28);
        byte[] byteArray30 = cookieRememberMeManager26.getEncryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray30);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[111, -42, -27, 121, -26, 48, 63, 71, -49, 8, -15, 67, 52, 35, 98, 73]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[111, -42, -27, 121, -26, 48, 63, 71, -49, 8, -15, 67, 52, 35, 98, 73]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[19, -65, 70, -58, 31, -4, 30, 16, 28, 6, -35, -67, -24, -102, 52, -108]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[19, -65, 70, -58, 31, -4, 30, 16, 28, 6, -35, -67, -24, -102, 52, -108]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-79, 29, 115, -5, -57, -66, 6, -52, 9, -67, -125, 9, -121, 63, 71, -89]");
        org.junit.Assert.assertNotNull(byteArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-79, 29, 115, -5, -57, -66, 6, -52, 9, -67, -125, 9, -121, 63, 71, -89]");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager3 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray4 = cookieRememberMeManager3.getDecryptionCipherKey();
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray4);
        byte[] byteArray6 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.subject.Subject subject7 = null;
        cookieRememberMeManager0.onLogout(subject7);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager9 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie10 = null;
        cookieRememberMeManager9.setCookie(cookie10);
        org.apache.shiro.subject.SubjectContext subjectContext12 = null;
        cookieRememberMeManager9.forgetIdentity(subjectContext12);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager9.setEncryptionCipherKey(byteArray20);
        cookieRememberMeManager0.setDecryptionCipherKey(byteArray20);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[102, 93, 118, -49, 80, -63, -79, 23, -73, -38, -99, -56, 115, -65, -33, 123]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[102, 93, 118, -49, 80, -63, -79, 23, -73, -38, -99, -56, 115, -65, -33, 123]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10, 1, 10, 0, 1]");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer2 = cookieRememberMeManager0.getSerializer();
        byte[] byteArray3 = cookieRememberMeManager0.getEncryptionCipherKey();
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0 };
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray6);
        byte[] byteArray8 = cookieRememberMeManager0.getCipherKey();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[99, -7, -12, -105, -61, 40, 119, -22, 117, 118, -90, 86, 11, -55, 120, -4]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer2);
        org.junit.Assert.assertNotNull(byteArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[99, -7, -12, -105, -61, 40, 119, -22, 117, 118, -90, 86, 11, -55, 120, -4]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0]");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer1 = cookieRememberMeManager0.getSerializer();
        byte[] byteArray2 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.junit.Assert.assertNotNull(principalCollectionSerializer1);
        org.junit.Assert.assertNotNull(byteArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-30, -78, 60, 102, -103, 98, 118, 2, -55, -32, -11, -40, -97, 15, 91, -43]");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        byte[] byteArray9 = cookieRememberMeManager0.getCipherKey();
        byte[] byteArray10 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.junit.Assert.assertNull(principalCollection8);
        org.junit.Assert.assertNotNull(byteArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[4, -62, -46, -21, 115, -35, -31, -93, -83, 65, -121, 111, 21, -125, 18, -42]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[4, -62, -46, -21, 115, -35, -31, -93, -83, 65, -121, 111, 21, -125, 18, -42]");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.subject.Subject subject2 = null;
        cookieRememberMeManager0.onLogout(subject2);
        byte[] byteArray4 = cookieRememberMeManager0.getCipherKey();
        byte[] byteArray5 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager6 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray7 = cookieRememberMeManager6.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie8 = null;
        cookieRememberMeManager6.setCookie(cookie8);
        byte[] byteArray10 = cookieRememberMeManager6.getEncryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray10);
        org.apache.shiro.crypto.CipherService cipherService12 = cookieRememberMeManager0.getCipherService();
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-28, -32, -39, -83, -81, 116, -86, 16, 53, 123, 65, -22, 106, -49, -66, -105]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-28, -32, -39, -83, -81, 116, -86, 16, 53, 123, 65, -22, 106, -49, -66, -105]");
        org.junit.Assert.assertNotNull(byteArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-28, -32, -39, -83, -81, 116, -86, 16, 53, 123, 65, -22, 106, -49, -66, -105]");
        org.junit.Assert.assertNotNull(byteArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[109, -31, -96, 9, 85, -102, -116, 47, -97, 123, -48, 89, 83, 40, -41, 84]");
        org.junit.Assert.assertNotNull(byteArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[109, -31, -96, 9, 85, -102, -116, 47, -97, 123, -48, 89, 83, 40, -41, 84]");
        org.junit.Assert.assertNotNull(cipherService12);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie1 = null;
        cookieRememberMeManager0.setCookie(cookie1);
        org.apache.shiro.subject.SubjectContext subjectContext3 = null;
        cookieRememberMeManager0.forgetIdentity(subjectContext3);
        org.apache.shiro.subject.Subject subject5 = null;
        cookieRememberMeManager0.onLogout(subject5);
        org.apache.shiro.subject.SubjectContext subjectContext7 = null;
        org.apache.shiro.subject.PrincipalCollection principalCollection8 = cookieRememberMeManager0.getRememberedPrincipals(subjectContext7);
        org.apache.shiro.subject.Subject subject9 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken10 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo11 = null;
        cookieRememberMeManager0.onSuccessfulLogin(subject9, authenticationToken10, authenticationInfo11);
        byte[] byteArray13 = cookieRememberMeManager0.getCipherKey();
        org.junit.Assert.assertNull(principalCollection8);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-64, -97, -75, 32, 24, -97, -112, 21, 72, -114, -54, 47, -46, 106, -8, 16]");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        byte[] byteArray4 = cookieRememberMeManager0.getEncryptionCipherKey();
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager5 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray6 = cookieRememberMeManager5.getEncryptionCipherKey();
        org.apache.shiro.io.Serializer<org.apache.shiro.subject.PrincipalCollection> principalCollectionSerializer7 = cookieRememberMeManager5.getSerializer();
        byte[] byteArray8 = cookieRememberMeManager5.getEncryptionCipherKey();
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray8);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager10 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie11 = null;
        cookieRememberMeManager10.setCookie(cookie11);
        org.apache.shiro.subject.SubjectContext subjectContext13 = null;
        cookieRememberMeManager10.forgetIdentity(subjectContext13);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        cookieRememberMeManager10.setEncryptionCipherKey(byteArray21);
        cookieRememberMeManager0.setEncryptionCipherKey(byteArray21);
        org.apache.shiro.subject.Subject subject24 = null;
        cookieRememberMeManager0.onLogout(subject24);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager26 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        org.apache.shiro.web.servlet.Cookie cookie27 = null;
        cookieRememberMeManager26.setCookie(cookie27);
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager29 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray30 = cookieRememberMeManager29.getDecryptionCipherKey();
        cookieRememberMeManager26.setDecryptionCipherKey(byteArray30);
        cookieRememberMeManager0.setCipherKey(byteArray30);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[124, 58, 9, -4, -16, -55, 32, -36, 42, -29, -71, -41, -6, 118, -24, -24]");
        org.junit.Assert.assertNotNull(byteArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[124, 58, 9, -4, -16, -55, 32, -36, 42, -29, -71, -41, -6, 118, -24, -24]");
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[18, -24, 16, 56, 100, 55, 89, 84, 99, -57, -66, 44, -66, 116, 90, 52]");
        org.junit.Assert.assertNotNull(principalCollectionSerializer7);
        org.junit.Assert.assertNotNull(byteArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[18, -24, 16, 56, 100, 55, 89, 84, 99, -57, -66, 44, -66, 116, 90, 52]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-42, -13, 20, 66, -99, -57, 59, -59, 91, -105, 50, -111, 94, 97, -80, 49]");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.shiro.web.mgt.CookieRememberMeManager cookieRememberMeManager0 = new org.apache.shiro.web.mgt.CookieRememberMeManager();
        byte[] byteArray1 = cookieRememberMeManager0.getDecryptionCipherKey();
        org.apache.shiro.web.servlet.Cookie cookie2 = null;
        cookieRememberMeManager0.setCookie(cookie2);
        org.apache.shiro.web.servlet.Cookie cookie4 = null;
        cookieRememberMeManager0.setCookie(cookie4);
        org.apache.shiro.subject.Subject subject6 = null;
        org.apache.shiro.authc.AuthenticationToken authenticationToken7 = null;
        org.apache.shiro.authc.AuthenticationInfo authenticationInfo8 = null;
        cookieRememberMeManager0.onSuccessfulLogin(subject6, authenticationToken7, authenticationInfo8);
        org.junit.Assert.assertNotNull(byteArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[119, -44, 116, 74, -12, 18, -100, 38, -18, 0, 102, 110, 1, -96, 32, 94]");
    }
}
