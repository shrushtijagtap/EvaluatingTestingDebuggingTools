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
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setPost(operation9);
        io.swagger.oas.models.Operation operation11 = pathItem8.getGet();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(operation11);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setPost(operation9);
        pathItem8.addExtension("", (java.lang.Object) 'a');
        io.swagger.oas.models.Operation operation14 = null;
        io.swagger.oas.models.PathItem pathItem15 = pathItem8.patch(operation14);
        pathItem8.setSummary("");
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem15);
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
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem4.setPost(operation9);
        io.swagger.oas.models.Operation operation11 = pathItem4.getGet();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(operation11);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.post(operation5);
        io.swagger.oas.models.servers.Server[] serverArray7 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList8 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList8, serverArray7);
        pathItem6.setServers((java.util.List<io.swagger.oas.models.servers.Server>) serverList8);
        io.swagger.oas.models.Operation operation11 = pathItem6.getPatch();
        java.lang.Object obj13 = null;
        pathItem6.addExtension("hi!", obj13);
        boolean boolean16 = pathItem6.equals((java.lang.Object) 100L);
        java.lang.String str17 = pathItem6.toString();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(serverArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operation11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: []\n    parameters: []\n    $ref: null\n}" + "'", str17, "class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: []\n    parameters: []\n    $ref: null\n}");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.parameters.Parameter parameter5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.addParametersItem(parameter5);
        pathItem0.setSummary("");
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.options(operation7);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.post(operation5);
        java.lang.String str7 = pathItem4.getDescription();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        io.swagger.oas.models.parameters.Parameter[] parameterArray7 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList8 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList8, parameterArray7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList8);
        io.swagger.oas.models.Operation operation11 = null;
        pathItem0.setGet(operation11);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pathItem10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        java.util.List<io.swagger.oas.models.servers.Server> serverList1 = pathItem0.getServers();
        io.swagger.oas.models.Operation operation2 = pathItem0.getOptions();
        org.junit.Assert.assertNull(serverList1);
        org.junit.Assert.assertNull(operation2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem4.setPost(operation9);
        pathItem4.setDescription("");
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = pathItem4.getOptions();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNull(operation7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        pathItem6.setPost(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        io.swagger.oas.models.PathItem pathItem10 = pathItem6.patch(operation9);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        pathItem6.setPost(operation7);
        java.util.List<io.swagger.oas.models.servers.Server> serverList9 = pathItem6.getServers();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNull(serverList9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setPost(operation9);
        pathItem8.addExtension("", (java.lang.Object) 'a');
        io.swagger.oas.models.Operation operation14 = null;
        io.swagger.oas.models.PathItem pathItem15 = pathItem8.patch(operation14);
        io.swagger.oas.models.Operation operation16 = null;
        io.swagger.oas.models.PathItem pathItem17 = pathItem15.trace(operation16);
        io.swagger.oas.models.Operation operation18 = pathItem17.getOptions();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem15);
        org.junit.Assert.assertNotNull(pathItem17);
        org.junit.Assert.assertNull(operation18);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.post(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem6.options(operation7);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setPost(operation9);
        pathItem8.addExtension("", (java.lang.Object) 'a');
        io.swagger.oas.models.Operation operation14 = null;
        io.swagger.oas.models.PathItem pathItem15 = pathItem8.patch(operation14);
        io.swagger.oas.models.Operation operation16 = pathItem8.getPost();
        java.lang.String str17 = pathItem8.toString();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem15);
        org.junit.Assert.assertNull(operation16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: null\n    parameters: []\n    $ref: null\n}" + "'", str17, "class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: null\n    parameters: []\n    $ref: null\n}");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        io.swagger.oas.models.parameters.Parameter[] parameterArray7 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList8 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList8, parameterArray7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList8);
        io.swagger.oas.models.Operation operation11 = null;
        io.swagger.oas.models.PathItem pathItem12 = pathItem0.delete(operation11);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(pathItem12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.parameters.Parameter parameter5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.addParametersItem(parameter5);
        io.swagger.oas.models.PathItem pathItem8 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray9 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList10 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList10, parameterArray9);
        io.swagger.oas.models.PathItem pathItem12 = pathItem8.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList10);
        pathItem0.addExtension("hi!", (java.lang.Object) pathItem8);
        io.swagger.oas.models.Operation operation14 = null;
        io.swagger.oas.models.PathItem pathItem15 = pathItem0.trace(operation14);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pathItem12);
        org.junit.Assert.assertNotNull(pathItem15);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setPost(operation9);
        pathItem8.addExtension("", (java.lang.Object) 'a');
        io.swagger.oas.models.Operation operation14 = null;
        io.swagger.oas.models.PathItem pathItem15 = pathItem8.patch(operation14);
        io.swagger.oas.models.Operation operation16 = pathItem8.getPost();
        io.swagger.oas.models.Operation operation17 = null;
        io.swagger.oas.models.PathItem pathItem18 = pathItem8.delete(operation17);
        io.swagger.oas.models.Operation operation19 = null;
        pathItem8.setPut(operation19);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem15);
        org.junit.Assert.assertNull(operation16);
        org.junit.Assert.assertNotNull(pathItem18);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        java.lang.String str7 = pathItem0.getSummary();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        pathItem0.setExtensions(strMap8);
        java.util.List<io.swagger.oas.models.Operation> operationList10 = pathItem0.getOperations();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(operationList10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        pathItem6.setSummary("");
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = pathItem0.getPut();
        io.swagger.oas.models.PathItem pathItem3 = pathItem0.$ref("");
        io.swagger.oas.models.Operation operation4 = null;
        pathItem3.setDelete(operation4);
        org.junit.Assert.assertNull(operation1);
        org.junit.Assert.assertNotNull(pathItem3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.parameters.Parameter parameter5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.addParametersItem(parameter5);
        io.swagger.oas.models.PathItem pathItem8 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray9 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList10 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList10, parameterArray9);
        io.swagger.oas.models.PathItem pathItem12 = pathItem8.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList10);
        pathItem0.addExtension("hi!", (java.lang.Object) pathItem8);
        pathItem0.setDescription("hi!");
        io.swagger.oas.models.Operation operation16 = null;
        io.swagger.oas.models.PathItem pathItem17 = pathItem0.head(operation16);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pathItem12);
        org.junit.Assert.assertNotNull(pathItem17);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.parameters.Parameter parameter5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.addParametersItem(parameter5);
        pathItem0.set$ref("class PathItem {\n    summary: null\n    description: null\n    get: null\n    put: null\n    post: null\n    delete: null\n    options: null\n    head: null\n    patch: null\n    trace: null\n    servers: null\n    parameters: []\n    $ref: null\n}");
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        io.swagger.oas.models.Operation operation7 = pathItem6.getPut();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNull(operation7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.post(operation5);
        io.swagger.oas.models.servers.Server server7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem6.addServersItem(server7);
        io.swagger.oas.models.Operation operation9 = pathItem6.getTrace();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNull(operation9);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.post(operation5);
        io.swagger.oas.models.parameters.Parameter[] parameterArray7 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList8 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList8, parameterArray7);
        pathItem4.setParameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList8);
        io.swagger.oas.models.PathItem pathItem12 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray13 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList14 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList14, parameterArray13);
        io.swagger.oas.models.PathItem pathItem16 = pathItem12.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList14);
        pathItem4.addExtension("", (java.lang.Object) pathItem16);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList18 = pathItem4.getParameters();
        io.swagger.oas.models.Operation operation19 = null;
        pathItem4.setHead(operation19);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parameterArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(pathItem16);
        org.junit.Assert.assertNotNull(parameterList18);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        io.swagger.oas.models.PathItem pathItem10 = pathItem4.options(operation9);
        java.util.List<io.swagger.oas.models.Operation> operationList11 = pathItem4.getOperations();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(operationList11);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = pathItem0.getPut();
        io.swagger.oas.models.PathItem pathItem3 = pathItem0.$ref("");
        io.swagger.oas.models.Operation operation4 = pathItem0.getTrace();
        org.junit.Assert.assertNull(operation1);
        org.junit.Assert.assertNotNull(pathItem3);
        org.junit.Assert.assertNull(operation4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setPost(operation9);
        pathItem8.addExtension("", (java.lang.Object) 'a');
        io.swagger.oas.models.Operation operation14 = null;
        io.swagger.oas.models.PathItem pathItem15 = pathItem8.patch(operation14);
        io.swagger.oas.models.Operation operation16 = pathItem15.getTrace();
        io.swagger.oas.models.Operation operation17 = null;
        pathItem15.setOptions(operation17);
        io.swagger.oas.models.PathItem pathItem20 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray21 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList22 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList22, parameterArray21);
        io.swagger.oas.models.PathItem pathItem24 = pathItem20.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList22);
        io.swagger.oas.models.Operation operation25 = null;
        io.swagger.oas.models.PathItem pathItem26 = pathItem24.post(operation25);
        io.swagger.oas.models.Operation operation27 = null;
        io.swagger.oas.models.PathItem pathItem28 = pathItem24.delete(operation27);
        pathItem15.addExtension("", (java.lang.Object) pathItem28);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem15);
        org.junit.Assert.assertNull(operation16);
        org.junit.Assert.assertNotNull(parameterArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pathItem24);
        org.junit.Assert.assertNotNull(pathItem26);
        org.junit.Assert.assertNotNull(pathItem28);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.servers.Server[] serverArray9 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList10 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList10, serverArray9);
        io.swagger.oas.models.PathItem pathItem12 = pathItem8.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList10);
        java.lang.String str13 = pathItem12.getDescription();
        boolean boolean15 = pathItem12.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass16 = pathItem12.getClass();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(serverArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pathItem12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setPost(operation9);
        pathItem8.addExtension("", (java.lang.Object) 'a');
        io.swagger.oas.models.Operation operation14 = null;
        io.swagger.oas.models.PathItem pathItem15 = pathItem8.patch(operation14);
        io.swagger.oas.models.Operation operation16 = null;
        pathItem15.setDelete(operation16);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList18 = pathItem15.getParameters();
        io.swagger.oas.models.Operation operation19 = null;
        pathItem15.setHead(operation19);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem15);
        org.junit.Assert.assertNotNull(parameterList18);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.post(operation5);
        io.swagger.oas.models.servers.Server[] serverArray7 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList8 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList8, serverArray7);
        pathItem6.setServers((java.util.List<io.swagger.oas.models.servers.Server>) serverList8);
        io.swagger.oas.models.Operation operation11 = pathItem6.getPatch();
        java.lang.Object obj13 = null;
        pathItem6.addExtension("hi!", obj13);
        java.util.List<io.swagger.oas.models.servers.Server> serverList15 = pathItem6.getServers();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(serverArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(operation11);
        org.junit.Assert.assertNotNull(serverList15);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = pathItem0.getExtensions();
        io.swagger.oas.models.Operation operation8 = null;
        pathItem0.setPut(operation8);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        io.swagger.oas.models.parameters.Parameter[] parameterArray7 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList8 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList8, parameterArray7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList8);
        java.util.Map<io.swagger.oas.models.PathItem.HttpMethod, io.swagger.oas.models.Operation> httpMethodMap11 = pathItem10.getOperationMap();
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(httpMethodMap11);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.parameters.Parameter parameter5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.addParametersItem(parameter5);
        io.swagger.oas.models.PathItem pathItem8 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray9 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList10 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList10, parameterArray9);
        io.swagger.oas.models.PathItem pathItem12 = pathItem8.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList10);
        pathItem0.addExtension("hi!", (java.lang.Object) pathItem8);
        pathItem0.setDescription("hi!");
        java.util.Map<io.swagger.oas.models.PathItem.HttpMethod, io.swagger.oas.models.Operation> httpMethodMap16 = pathItem0.getOperationMap();
        pathItem0.addExtension("hi!", (java.lang.Object) 1.0d);
        java.util.List<io.swagger.oas.models.parameters.Parameter> parameterList20 = pathItem0.getParameters();
        boolean boolean22 = pathItem0.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(pathItem12);
        org.junit.Assert.assertNotNull(httpMethodMap16);
        org.junit.Assert.assertNotNull(parameterList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        pathItem4.setPost(operation5);
        io.swagger.oas.models.Operation operation7 = null;
        io.swagger.oas.models.PathItem pathItem8 = pathItem4.head(operation7);
        io.swagger.oas.models.Operation operation9 = null;
        pathItem8.setPost(operation9);
        pathItem8.addExtension("", (java.lang.Object) 'a');
        io.swagger.oas.models.Operation operation14 = null;
        io.swagger.oas.models.PathItem pathItem15 = pathItem8.patch(operation14);
        io.swagger.oas.models.Operation operation16 = null;
        io.swagger.oas.models.PathItem pathItem17 = pathItem15.trace(operation16);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = pathItem17.getExtensions();
        io.swagger.oas.models.PathItem pathItem19 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray20 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList21 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList21, parameterArray20);
        io.swagger.oas.models.PathItem pathItem23 = pathItem19.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList21);
        io.swagger.oas.models.Operation operation24 = null;
        pathItem23.setPost(operation24);
        io.swagger.oas.models.Operation operation26 = null;
        io.swagger.oas.models.PathItem pathItem27 = pathItem23.head(operation26);
        io.swagger.oas.models.servers.Server[] serverArray28 = new io.swagger.oas.models.servers.Server[] {};
        java.util.ArrayList<io.swagger.oas.models.servers.Server> serverList29 = new java.util.ArrayList<io.swagger.oas.models.servers.Server>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.servers.Server>) serverList29, serverArray28);
        io.swagger.oas.models.PathItem pathItem31 = pathItem27.servers((java.util.List<io.swagger.oas.models.servers.Server>) serverList29);
        pathItem17.setServers((java.util.List<io.swagger.oas.models.servers.Server>) serverList29);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem8);
        org.junit.Assert.assertNotNull(pathItem15);
        org.junit.Assert.assertNotNull(pathItem17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(pathItem23);
        org.junit.Assert.assertNotNull(pathItem27);
        org.junit.Assert.assertNotNull(serverArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(pathItem31);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem4.post(operation5);
        io.swagger.oas.models.Operation operation7 = pathItem6.getPost();
        io.swagger.oas.models.Operation operation8 = null;
        io.swagger.oas.models.PathItem pathItem9 = pathItem6.get(operation8);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNull(operation7);
        org.junit.Assert.assertNotNull(pathItem9);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray1 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList2 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList2, parameterArray1);
        io.swagger.oas.models.PathItem pathItem4 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList2);
        io.swagger.oas.models.Operation operation5 = null;
        io.swagger.oas.models.PathItem pathItem6 = pathItem0.get(operation5);
        io.swagger.oas.models.parameters.Parameter[] parameterArray7 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList8 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList8, parameterArray7);
        io.swagger.oas.models.PathItem pathItem10 = pathItem0.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList8);
        io.swagger.oas.models.PathItem pathItem11 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.parameters.Parameter[] parameterArray12 = new io.swagger.oas.models.parameters.Parameter[] {};
        java.util.ArrayList<io.swagger.oas.models.parameters.Parameter> parameterList13 = new java.util.ArrayList<io.swagger.oas.models.parameters.Parameter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<io.swagger.oas.models.parameters.Parameter>) parameterList13, parameterArray12);
        io.swagger.oas.models.PathItem pathItem15 = pathItem11.parameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList13);
        pathItem10.setParameters((java.util.List<io.swagger.oas.models.parameters.Parameter>) parameterList13);
        org.junit.Assert.assertNotNull(parameterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pathItem4);
        org.junit.Assert.assertNotNull(pathItem6);
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pathItem10);
        org.junit.Assert.assertNotNull(parameterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pathItem15);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        io.swagger.oas.models.PathItem pathItem0 = new io.swagger.oas.models.PathItem();
        io.swagger.oas.models.Operation operation1 = pathItem0.getPut();
        io.swagger.oas.models.PathItem pathItem3 = pathItem0.$ref("");
        io.swagger.oas.models.Operation operation4 = null;
        io.swagger.oas.models.PathItem pathItem5 = pathItem3.post(operation4);
        io.swagger.oas.models.Operation operation6 = null;
        io.swagger.oas.models.PathItem pathItem7 = pathItem3.options(operation6);
        org.junit.Assert.assertNull(operation1);
        org.junit.Assert.assertNotNull(pathItem3);
        org.junit.Assert.assertNotNull(pathItem5);
        org.junit.Assert.assertNotNull(pathItem7);
    }
}

