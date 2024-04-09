import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        io.swagger.oas.models.PathItem.HttpMethod httpMethod0 = io.swagger.oas.models.PathItem.HttpMethod.POST;
        org.junit.Assert.assertTrue("'" + httpMethod0 + "' != '" + io.swagger.oas.models.PathItem.HttpMethod.POST + "'", httpMethod0.equals(io.swagger.oas.models.PathItem.HttpMethod.POST));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        io.swagger.oas.models.PathItem.HttpMethod httpMethod0 = io.swagger.oas.models.PathItem.HttpMethod.DELETE;
        java.lang.Class<?> wildcardClass1 = httpMethod0.getClass();
        org.junit.Assert.assertTrue("'" + httpMethod0 + "' != '" + io.swagger.oas.models.PathItem.HttpMethod.DELETE + "'", httpMethod0.equals(io.swagger.oas.models.PathItem.HttpMethod.DELETE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        io.swagger.oas.models.PathItem.HttpMethod httpMethod0 = io.swagger.oas.models.PathItem.HttpMethod.HEAD;
        org.junit.Assert.assertTrue("'" + httpMethod0 + "' != '" + io.swagger.oas.models.PathItem.HttpMethod.HEAD + "'", httpMethod0.equals(io.swagger.oas.models.PathItem.HttpMethod.HEAD));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        io.swagger.oas.models.PathItem.HttpMethod httpMethod0 = io.swagger.oas.models.PathItem.HttpMethod.GET;
        java.lang.Class<?> wildcardClass1 = httpMethod0.getClass();
        org.junit.Assert.assertTrue("'" + httpMethod0 + "' != '" + io.swagger.oas.models.PathItem.HttpMethod.GET + "'", httpMethod0.equals(io.swagger.oas.models.PathItem.HttpMethod.GET));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        io.swagger.oas.models.PathItem.HttpMethod httpMethod0 = io.swagger.oas.models.PathItem.HttpMethod.OPTIONS;
        org.junit.Assert.assertTrue("'" + httpMethod0 + "' != '" + io.swagger.oas.models.PathItem.HttpMethod.OPTIONS + "'", httpMethod0.equals(io.swagger.oas.models.PathItem.HttpMethod.OPTIONS));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        io.swagger.oas.models.PathItem.HttpMethod httpMethod0 = io.swagger.oas.models.PathItem.HttpMethod.PUT;
        java.lang.Class<?> wildcardClass1 = httpMethod0.getClass();
        org.junit.Assert.assertTrue("'" + httpMethod0 + "' != '" + io.swagger.oas.models.PathItem.HttpMethod.PUT + "'", httpMethod0.equals(io.swagger.oas.models.PathItem.HttpMethod.PUT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        io.swagger.oas.models.PathItem.HttpMethod httpMethod0 = io.swagger.oas.models.PathItem.HttpMethod.TRACE;
        java.lang.Class<?> wildcardClass1 = httpMethod0.getClass();
        org.junit.Assert.assertTrue("'" + httpMethod0 + "' != '" + io.swagger.oas.models.PathItem.HttpMethod.TRACE + "'", httpMethod0.equals(io.swagger.oas.models.PathItem.HttpMethod.TRACE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.lang.String str1 = pathItem0.getSummary();
        io.swagger.oas.models.Operation operation2 = null;
        pathItem0.setPost(operation2);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.PathItem pathItem1 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation2 = null;
        io.swagger.oas.models.PathItem pathItem3 = pathItem1.post(operation2);
        io.swagger.oas.models.parameters.Parameter[] parameterArray4 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList5 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList5, parameterArray4);
        io.swagger.oas.models.PathItem pathItem7 = pathItem1.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList5);
        io.swagger.oas.models.PathItem pathItem8 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(pathItem3);
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(pathItem7);
        org.junit.Assert.assertNotNull(pathItem8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        io.swagger.oas.models.PathItem.HttpMethod httpMethod0 = io.swagger.oas.models.PathItem.HttpMethod.PATCH;
        org.junit.Assert.assertTrue("'" + httpMethod0 + "' != '" + io.swagger.oas.models.PathItem.HttpMethod.PATCH + "'", httpMethod0.equals(io.swagger.oas.models.PathItem.HttpMethod.PATCH));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        io.swagger.oas.models.servers.Server server7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem0.addServersItem(server7);
        java.lang.String str9 = pathItem8.toString();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: [null]\n    parameters: []\n    $ref: null\n}" + "'", str9, "class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: [null]\n    parameters: []\n    $ref: null\n}");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = pathItem14.getExtensions();
        io.swagger.oas.models.Operation operation16 = null;
        pathItem14.setGet(operation16);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = pathItem14.getExtensions();
        pathItem14.setSummary("");
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        pathItem0.setExtensions(strMap1);
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.put(operation3);
        io.swagger.oas.models.servers.Server[] serverArray5 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList6 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList6, serverArray5);
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList6);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(serverArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pathItem8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        io.swagger.oas.models.Operation operation15 = null;
        io.swagger.oas.models.PathItem pathItem16 = pathItem14.put(operation15);
        io.swagger.oas.models.Operation operation17 = null;
        pathItem16.setDelete(operation17);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNotNull(pathItem16);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.lang.String str1 = pathItem0.getSummary();
        io.swagger.oas.models.Operation operation2 = null;
        io.swagger.oas.models.PathItem pathItem3 = pathItem0.trace(operation2);
        io.swagger.oas.models.Operation operation4 = null;
        pathItem3.setHead(operation4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(pathItem3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        io.swagger.oas.models.Operation operation7 = pathItem0.getTrace();
        java.lang.String str8 = pathItem0.getDescription();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNull(operation7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        pathItem0.setDescription("");
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.delete(operation3);
        java.lang.Class<?> wildcardClass5 = pathItem4.getClass();
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        io.swagger.oas.models.Operation operation15 = pathItem2.getGet();
        java.util.List<io.swagger.oas.models.Operation> operationList16 = pathItem2.readOperations();
        io.swagger.oas.models.PathItem pathItem17 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation18 = null;
        io.swagger.oas.models.PathItem pathItem19 = pathItem17.post(operation18);
        io.swagger.oas.models.PathItem pathItem20 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation21 = null;
        io.swagger.oas.models.PathItem pathItem22 = pathItem20.post(operation21);
        io.swagger.oas.models.parameters.Parameter[] parameterArray23 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList24 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList24, parameterArray23);
        io.swagger.oas.models.PathItem pathItem26 = pathItem20.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList24);
        io.swagger.oas.models.PathItem pathItem27 = pathItem19.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList24);
        io.swagger.oas.models.PathItem pathItem28 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList24);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNull(operation15);
        org.junit.Assert.assertNotNull(operationList16);
        org.junit.Assert.assertNotNull(pathItem19);
        org.junit.Assert.assertNotNull(pathItem22);
        org.junit.Assert.assertNotNull(parameterArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pathItem26);
        org.junit.Assert.assertNotNull(pathItem27);
        org.junit.Assert.assertNotNull(pathItem28);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        io.swagger.oas.models.servers.Server server7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem0.addServersItem(server7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem0.setDelete(operation9);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        pathItem0.setExtensions(strMap1);
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.put(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.trace(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem4.setPut(operation9);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        pathItem0.setExtensions(strMap1);
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.put(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.trace(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setOptions(operation9);
        io.swagger.oas.models.Operation operation11 = pathItem8.getDelete();
        io.swagger.oas.models.Operation operation12 = null;
        pathItem8.setHead(operation12);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(operation11);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        pathItem0.setExtensions(strMap1);
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.put(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.trace(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setOptions(operation9);
        io.swagger.oas.models.Operation operation11 = pathItem8.getDelete();
        io.swagger.oas.models.Operation operation12 = null;
        io.swagger.oas.models.PathItem pathItem13 = pathItem8.options(operation12);
        io.swagger.oas.models.PathItem pathItem15 = pathItem13.description("");
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(operation11);
        org.junit.Assert.assertNotNull(pathItem13);
        org.junit.Assert.assertNotNull(pathItem15);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = pathItem14.getExtensions();
        io.swagger.oas.models.Operation operation16 = pathItem14.getTrace();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(operation16);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        io.swagger.oas.models.Operation operation15 = null;
        io.swagger.oas.models.PathItem pathItem16 = pathItem14.put(operation15);
        io.swagger.oas.models.Operation operation17 = pathItem16.getPatch();
        io.swagger.oas.models.Operation operation18 = pathItem16.getPatch();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNotNull(pathItem16);
        org.junit.Assert.assertNull(operation17);
        org.junit.Assert.assertNull(operation18);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        pathItem0.setExtensions(strMap1);
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.put(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.trace(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setOptions(operation9);
        io.swagger.oas.models.Operation operation11 = pathItem8.getPost();
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(operation11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        java.lang.Object obj15 = null;
        boolean boolean16 = pathItem2.equals(obj15);
        java.lang.String str17 = pathItem2.toString();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: []\n    parameters: []\n    $ref: null\n}" + "'", str17, "class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: []\n    parameters: []\n    $ref: null\n}");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        io.swagger.oas.models.Operation operation15 = pathItem2.getGet();
        java.util.List<io.swagger.oas.models.Operation> operationList16 = pathItem2.readOperations();
        java.lang.String str17 = pathItem2.getDescription();
        java.util.List<io.swagger.oas.models.servers.Server> serverList18 = pathItem2.getServers();
        io.swagger.oas.models.Operation operation19 = null;
        io.swagger.oas.models.PathItem pathItem20 = pathItem2.delete(operation19);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNull(operation15);
        org.junit.Assert.assertNotNull(operationList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(serverList18);
        org.junit.Assert.assertNotNull(pathItem20);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList7 = pathItem0.getParameters();
        io.swagger.oas.models.Operation operation8 = null;
        pathItem0.setPost(operation8);
        io.swagger.oas.models.Operation operation10 = pathItem0.getDelete();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNull(operation10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        pathItem0.setExtensions(strMap1);
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.put(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.trace(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setOptions(operation9);
        io.swagger.oas.models.PathItem pathItem12 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation13 = null;
        io.swagger.oas.models.PathItem pathItem14 = pathItem12.post(operation13);
        io.swagger.oas.models.parameters.Parameter[] parameterArray15 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList16 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList16, parameterArray15);
        io.swagger.oas.models.PathItem pathItem18 = pathItem12.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList16);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList19 = pathItem12.getParameters();
        pathItem8.addExtension("", (java.lang.Object) pathItem12);
        java.util.List<io.swagger.oas.models.Operation> operationList21 = pathItem8.readOperations();
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(pathItem18);
        org.junit.Assert.assertNotNull(parameterList19);
        org.junit.Assert.assertNotNull(operationList21);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        io.swagger.oas.models.servers.Server server7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem0.addServersItem(server7);
        io.swagger.oas.models.Operation operation9 = pathItem8.getPost();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(operation9);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        pathItem0.setDescription("");
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.delete(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.put(operation5);
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.$ref("");
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        io.swagger.oas.models.Operation operation15 = pathItem2.getTrace();
        io.swagger.oas.models.Operation operation16 = null;
        io.swagger.oas.models.PathItem pathItem17 = pathItem2.get(operation16);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNull(operation15);
        org.junit.Assert.assertNotNull(pathItem17);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        io.swagger.oas.models.servers.Server server7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem0.addServersItem(server7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = pathItem0.getExtensions();
        io.swagger.oas.models.PathItem pathItem11 = pathItem0.description("");
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(pathItem11);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        io.swagger.oas.models.Operation operation7 = pathItem0.getTrace();
        io.swagger.oas.models.Operation operation8 = pathItem0.getTrace();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNull(operation7);
        org.junit.Assert.assertNull(operation8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList7 = pathItem0.getParameters();
        io.swagger.oas.models.Operation operation8 = null;
        pathItem0.setPost(operation8);
        io.swagger.oas.models.Operation operation10 = null;
        pathItem0.setDelete(operation10);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterList7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.Operation operation3 = pathItem0.getGet();
        io.swagger.oas.models.Operation operation4 = null;
        pathItem0.setPost(operation4);
        io.swagger.oas.models.Operation operation6 = pathItem0.getHead();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNull(operation3);
        org.junit.Assert.assertNull(operation6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.lang.String str1 = pathItem0.getSummary();
        io.swagger.oas.models.Operation operation2 = null;
        io.swagger.oas.models.PathItem pathItem3 = pathItem0.trace(operation2);
        io.swagger.oas.models.Operation operation4 = pathItem3.getHead();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(pathItem3);
        org.junit.Assert.assertNull(operation4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList7 = pathItem0.getParameters();
        io.swagger.oas.models.Operation operation8 = null;
        pathItem0.setPost(operation8);
        io.swagger.oas.models.Operation operation10 = null;
        pathItem0.setHead(operation10);
        pathItem0.set$ref("class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: [null]\n    parameters: []\n    $ref: null\n}");
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterList7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        io.swagger.oas.models.Operation operation15 = pathItem2.getTrace();
        io.swagger.oas.models.PathItem pathItem16 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation17 = null;
        io.swagger.oas.models.PathItem pathItem18 = pathItem16.post(operation17);
        io.swagger.oas.models.PathItem pathItem19 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation20 = null;
        io.swagger.oas.models.PathItem pathItem21 = pathItem19.post(operation20);
        io.swagger.oas.models.parameters.Parameter[] parameterArray22 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList23 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList23, parameterArray22);
        io.swagger.oas.models.PathItem pathItem25 = pathItem19.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList23);
        io.swagger.oas.models.PathItem pathItem26 = pathItem18.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList23);
        io.swagger.oas.models.servers.Server[] serverArray27 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList28 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList28, serverArray27);
        io.swagger.oas.models.PathItem pathItem30 = pathItem18.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList28);
        io.swagger.oas.models.PathItem pathItem31 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation32 = null;
        io.swagger.oas.models.PathItem pathItem33 = pathItem31.post(operation32);
        io.swagger.oas.models.parameters.Parameter[] parameterArray34 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList35 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList35, parameterArray34);
        io.swagger.oas.models.PathItem pathItem37 = pathItem31.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList35);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList38 = pathItem31.getParameters();
        io.swagger.oas.models.PathItem pathItem39 = pathItem30.parameters(parameterList38);
        io.swagger.oas.models.PathItem pathItem40 = pathItem2.parameters(parameterList38);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNull(operation15);
        org.junit.Assert.assertNotNull(pathItem18);
        org.junit.Assert.assertNotNull(pathItem21);
        org.junit.Assert.assertNotNull(parameterArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(pathItem25);
        org.junit.Assert.assertNotNull(pathItem26);
        org.junit.Assert.assertNotNull(serverArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(pathItem30);
        org.junit.Assert.assertNotNull(pathItem33);
        org.junit.Assert.assertNotNull(parameterArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(pathItem37);
        org.junit.Assert.assertNotNull(parameterList38);
        org.junit.Assert.assertNotNull(pathItem39);
        org.junit.Assert.assertNotNull(pathItem40);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        pathItem2.set$ref("");
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        pathItem0.setDescription("");
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.delete(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.put(operation5);
        io.swagger.oas.models.Operation operation7 = pathItem6.getDelete();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        pathItem6.setExtensions(strMap8);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNull(operation7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        pathItem0.set$ref("");
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.description("class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: []\n    parameters: []\n    $ref: null\n}");
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem6);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        pathItem0.setExtensions(strMap1);
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.put(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.trace(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setOptions(operation9);
        io.swagger.oas.models.Operation operation11 = pathItem8.getDelete();
        io.swagger.oas.models.Operation operation12 = null;
        io.swagger.oas.models.PathItem pathItem13 = pathItem8.options(operation12);
        io.swagger.oas.models.PathItem pathItem15 = new io.swagger.oas.models.PathItem();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        pathItem15.setExtensions(strMap16);
        io.swagger.oas.models.Operation operation18 = null;
        io.swagger.oas.models.PathItem pathItem19 = pathItem15.put(operation18);
        io.swagger.oas.models.Operation operation20 = null;
        pathItem19.setPost(operation20);
        io.swagger.oas.models.Operation operation22 = null;
        io.swagger.oas.models.PathItem pathItem23 = pathItem19.trace(operation22);
        pathItem13.addExtension("class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: []\n    parameters: []\n    $ref: null\n}", (java.lang.Object) operation22);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(operation11);
        org.junit.Assert.assertNotNull(pathItem13);
        org.junit.Assert.assertNotNull(pathItem19);
        org.junit.Assert.assertNotNull(pathItem23);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        io.swagger.oas.models.PathItem pathItem15 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation16 = null;
        io.swagger.oas.models.PathItem pathItem17 = pathItem15.post(operation16);
        io.swagger.oas.models.parameters.Parameter[] parameterArray18 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList19 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList19, parameterArray18);
        io.swagger.oas.models.PathItem pathItem21 = pathItem15.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList19);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList22 = pathItem15.getParameters();
        io.swagger.oas.models.PathItem pathItem23 = pathItem14.parameters(parameterList22);
        io.swagger.oas.models.PathItem pathItem24 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation25 = null;
        io.swagger.oas.models.PathItem pathItem26 = pathItem24.post(operation25);
        io.swagger.oas.models.PathItem pathItem27 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation28 = null;
        io.swagger.oas.models.PathItem pathItem29 = pathItem27.post(operation28);
        io.swagger.oas.models.parameters.Parameter[] parameterArray30 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList31 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList31, parameterArray30);
        io.swagger.oas.models.PathItem pathItem33 = pathItem27.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList31);
        io.swagger.oas.models.PathItem pathItem34 = pathItem26.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList31);
        io.swagger.oas.models.servers.Server[] serverArray35 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList36 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList36, serverArray35);
        io.swagger.oas.models.PathItem pathItem38 = pathItem26.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList36);
        io.swagger.oas.models.Operation operation39 = pathItem26.getGet();
        java.util.List<io.swagger.oas.models.Operation> operationList40 = pathItem26.readOperations();
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList41 = pathItem26.getParameters();
        pathItem14.setParameters(parameterList41);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNotNull(pathItem17);
        org.junit.Assert.assertNotNull(parameterArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(pathItem21);
        org.junit.Assert.assertNotNull(parameterList22);
        org.junit.Assert.assertNotNull(pathItem23);
        org.junit.Assert.assertNotNull(pathItem26);
        org.junit.Assert.assertNotNull(pathItem29);
        org.junit.Assert.assertNotNull(parameterArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(pathItem33);
        org.junit.Assert.assertNotNull(pathItem34);
        org.junit.Assert.assertNotNull(serverArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(pathItem38);
        org.junit.Assert.assertNull(operation39);
        org.junit.Assert.assertNotNull(operationList40);
        org.junit.Assert.assertNotNull(parameterList41);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        pathItem0.setExtensions(strMap1);
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.put(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.trace(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setOptions(operation9);
        io.swagger.oas.models.PathItem pathItem12 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation13 = null;
        io.swagger.oas.models.PathItem pathItem14 = pathItem12.post(operation13);
        io.swagger.oas.models.parameters.Parameter[] parameterArray15 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList16 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList16, parameterArray15);
        io.swagger.oas.models.PathItem pathItem18 = pathItem12.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList16);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList19 = pathItem12.getParameters();
        pathItem8.addExtension("", (java.lang.Object) pathItem12);
        io.swagger.oas.models.Operation operation21 = null;
        io.swagger.oas.models.PathItem pathItem22 = pathItem12.delete(operation21);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(pathItem18);
        org.junit.Assert.assertNotNull(parameterList19);
        org.junit.Assert.assertNotNull(pathItem22);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.PathItem pathItem3 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.parameters.Parameter[] parameterArray6 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList7 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList7, parameterArray6);
        io.swagger.oas.models.PathItem pathItem9 = pathItem3.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem2.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList7);
        io.swagger.oas.models.servers.Server[] serverArray11 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList12 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList12, serverArray11);
        io.swagger.oas.models.PathItem pathItem14 = pathItem2.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList12);
        java.util.List<io.swagger.oas.models.Operation> operationList15 = pathItem2.readOperations();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pathItem9);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(serverArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(pathItem14);
        org.junit.Assert.assertNotNull(operationList15);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList7 = pathItem0.getParameters();
        io.swagger.oas.models.Operation operation8 = null;
        pathItem0.setPost(operation8);
        io.swagger.oas.models.PathItem pathItem11 = pathItem0.$ref("");
        io.swagger.oas.models.Operation operation12 = pathItem11.getOptions();
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(pathItem11);
        org.junit.Assert.assertNull(operation12);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        io.swagger.oas.models.servers.Server server7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem0.addServersItem(server7);
        java.lang.String str9 = pathItem0.get$ref();
        io.swagger.oas.models.PathItem pathItem10 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation11 = null;
        io.swagger.oas.models.PathItem pathItem12 = pathItem10.post(operation11);
        io.swagger.oas.models.PathItem pathItem13 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation14 = null;
        io.swagger.oas.models.PathItem pathItem15 = pathItem13.post(operation14);
        io.swagger.oas.models.parameters.Parameter[] parameterArray16 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList17 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList17, parameterArray16);
        io.swagger.oas.models.PathItem pathItem19 = pathItem13.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList17);
        io.swagger.oas.models.PathItem pathItem20 = pathItem12.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList17);
        io.swagger.oas.models.servers.Server[] serverArray21 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList22 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList22, serverArray21);
        io.swagger.oas.models.PathItem pathItem24 = pathItem12.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList22);
        io.swagger.oas.models.Operation operation25 = pathItem12.getGet();
        io.swagger.oas.models.PathItem pathItem26 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation27 = null;
        io.swagger.oas.models.PathItem pathItem28 = pathItem26.post(operation27);
        io.swagger.oas.models.PathItem pathItem29 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation30 = null;
        io.swagger.oas.models.PathItem pathItem31 = pathItem29.post(operation30);
        io.swagger.oas.models.parameters.Parameter[] parameterArray32 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList33 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList33, parameterArray32);
        io.swagger.oas.models.PathItem pathItem35 = pathItem29.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList33);
        io.swagger.oas.models.PathItem pathItem36 = pathItem28.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList33);
        io.swagger.oas.models.servers.Server[] serverArray37 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList38 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList38, serverArray37);
        io.swagger.oas.models.PathItem pathItem40 = pathItem28.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList38);
        io.swagger.oas.models.PathItem pathItem41 = pathItem12.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList38);
        boolean boolean42 = pathItem0.equals((java.lang.Object) serverList38);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(pathItem12);
        org.junit.Assert.assertNotNull(pathItem15);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(pathItem19);
        org.junit.Assert.assertNotNull(pathItem20);
        org.junit.Assert.assertNotNull(serverArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pathItem24);
        org.junit.Assert.assertNull(operation25);
        org.junit.Assert.assertNotNull(pathItem28);
        org.junit.Assert.assertNotNull(pathItem31);
        org.junit.Assert.assertNotNull(parameterArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(pathItem35);
        org.junit.Assert.assertNotNull(pathItem36);
        org.junit.Assert.assertNotNull(serverArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(pathItem40);
        org.junit.Assert.assertNotNull(pathItem41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList7 = pathItem0.getParameters();
        io.swagger.oas.models.Operation operation8 = null;
        pathItem0.setPost(operation8);
        io.swagger.oas.models.PathItem pathItem11 = pathItem0.$ref("");
        io.swagger.oas.models.Operation operation12 = null;
        io.swagger.oas.models.PathItem pathItem13 = pathItem0.put(operation12);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(pathItem11);
        org.junit.Assert.assertNotNull(pathItem13);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        pathItem0.setDescription("");
        io.swagger.oas.models.Operation operation3 = null;
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.delete(operation3);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.put(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem6.patch(operation7);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = null;
        io.swagger.oas.models.PathItem pathItem2 = pathItem0.post(operation1);
        io.swagger.oas.models.parameters.Parameter[] parameterArray3 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList4 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList4, parameterArray3);
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList4);
        io.swagger.oas.models.servers.Server server7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem0.addServersItem(server7);
        io.swagger.oas.models.Operation operation9 = null;
        io.swagger.oas.models.PathItem pathItem10 = pathItem0.options(operation9);
        io.swagger.oas.models.Operation operation11 = null;
        io.swagger.oas.models.PathItem pathItem12 = pathItem0.delete(operation11);
        org.junit.Assert.assertNotNull(pathItem2);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(pathItem12);
    }
}

