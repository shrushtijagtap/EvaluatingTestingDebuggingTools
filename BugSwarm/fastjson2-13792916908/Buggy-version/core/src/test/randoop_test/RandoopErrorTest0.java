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
        com.alibaba.fastjson2.JSONObject jSONObject0 = new com.alibaba.fastjson2.JSONObject();
        java.time.Instant instant2 = jSONObject0.getInstant("");
        com.alibaba.fastjson2.JSONObject jSONObject6 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj8 = jSONObject6.get("");
        java.lang.Boolean boolean10 = jSONObject6.getBoolean("");
        com.alibaba.fastjson2.JSONObject jSONObject14 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject15 = new com.alibaba.fastjson2.JSONObject((java.util.Map) jSONObject14);
        java.lang.Object obj16 = jSONObject0.getOrDefault((java.lang.Object) jSONObject6, (java.lang.Object) jSONObject14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = jSONObject0.getByPath("");
    }
}

