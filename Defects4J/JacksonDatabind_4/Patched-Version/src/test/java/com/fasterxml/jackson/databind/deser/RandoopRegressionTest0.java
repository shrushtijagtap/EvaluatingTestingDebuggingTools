package com.fasterxml.jackson.databind.deser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test1");
        com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing0 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC;
        org.junit.Assert.assertTrue("'" + typing0 + "' != '" + com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC + "'", typing0.equals(com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test2");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.node.LongNode longNode2 = com.fasterxml.jackson.databind.node.LongNode.valueOf((long) 'a');
        com.fasterxml.jackson.databind.node.TreeTraversingParser treeTraversingParser3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser((com.fasterxml.jackson.databind.JsonNode) longNode2);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext4 = treeTraversingParser3.getParsingContext();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stringArrayDeserializer0.deserializeWithType((com.fasterxml.jackson.core.JsonParser) treeTraversingParser3, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longNode2);
        org.junit.Assert.assertNotNull(jsonStreamContext4);
    }
}

