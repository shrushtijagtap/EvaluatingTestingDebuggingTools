/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessable;
import com.alibaba.fastjson.serializer.JSONSerializable;
import com.alibaba.fastjson.serializer.JSONSerializer;

import junit.framework.TestCase;

public class Bug_for_issue_265 extends TestCase {static class __CLR4_1_10144p144plusqk2tt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,52031,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_10144p144plusqk2tt.R.globalSliceStart(getClass().getName(),52009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb144p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10144p144plusqk2tt.R.rethrow($CLV_t2$);}finally{__CLR4_1_10144p144plusqk2tt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_265.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52009,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb144p() throws Exception{try{__CLR4_1_10144p144plusqk2tt.R.inc(52009);
        __CLR4_1_10144p144plusqk2tt.R.inc(52010);User user = new User();
        __CLR4_1_10144p144plusqk2tt.R.inc(52011);user.setName("wenshao");
        
        __CLR4_1_10144p144plusqk2tt.R.inc(52012);String text = JSON.toJSONString(user);
        
        __CLR4_1_10144p144plusqk2tt.R.inc(52013);Assert.assertEquals("{\"name\":\"wenshao\"}", text);
        
    }finally{__CLR4_1_10144p144plusqk2tt.R.flushNeeded();}}
    
    public void test_for_issue_decode() throws Exception {__CLR4_1_10144p144plusqk2tt.R.globalSliceStart(getClass().getName(),52014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w8g2bm144u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10144p144plusqk2tt.R.rethrow($CLV_t2$);}finally{__CLR4_1_10144p144plusqk2tt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_265.test_for_issue_decode",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52014,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w8g2bm144u() throws Exception{try{__CLR4_1_10144p144plusqk2tt.R.inc(52014);
        __CLR4_1_10144p144plusqk2tt.R.inc(52015);String text = "{\"name\":\"wenshao\",\"id\":1001}";
        
        __CLR4_1_10144p144plusqk2tt.R.inc(52016);User user = JSON.parseObject(text, User.class);
        __CLR4_1_10144p144plusqk2tt.R.inc(52017);Assert.assertEquals("wenshao", user.getName());
        __CLR4_1_10144p144plusqk2tt.R.inc(52018);Assert.assertEquals(1001, user.getAttribute("id"));
    }finally{__CLR4_1_10144p144plusqk2tt.R.flushNeeded();}}

    public static class Model implements JSONSerializable, ExtraProcessable {

        protected Map<String, Object> attributes = new HashMap<String, Object>();

        public Map<String, Object> getAttributes() {try{__CLR4_1_10144p144plusqk2tt.R.inc(52019);
            __CLR4_1_10144p144plusqk2tt.R.inc(52020);return attributes;
        }finally{__CLR4_1_10144p144plusqk2tt.R.flushNeeded();}}
        
        public Object getAttribute(String name) {try{__CLR4_1_10144p144plusqk2tt.R.inc(52021);
            __CLR4_1_10144p144plusqk2tt.R.inc(52022);return attributes.get(name);
        }finally{__CLR4_1_10144p144plusqk2tt.R.flushNeeded();}}

        @Override
        public void write(JSONSerializer serializer, Object fieldName, Type fieldType,
                          int features) throws IOException {try{__CLR4_1_10144p144plusqk2tt.R.inc(52023);
            __CLR4_1_10144p144plusqk2tt.R.inc(52024);serializer.write(attributes);
        }finally{__CLR4_1_10144p144plusqk2tt.R.flushNeeded();}}

        @Override
        public void processExtra(String key, Object value) {try{__CLR4_1_10144p144plusqk2tt.R.inc(52025);
            __CLR4_1_10144p144plusqk2tt.R.inc(52026);attributes.put(key, value);
        }finally{__CLR4_1_10144p144plusqk2tt.R.flushNeeded();}}
    }

    public static class User extends Model {

        public String getName() {try{__CLR4_1_10144p144plusqk2tt.R.inc(52027);
            __CLR4_1_10144p144plusqk2tt.R.inc(52028);return (String) attributes.get("name");
        }finally{__CLR4_1_10144p144plusqk2tt.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10144p144plusqk2tt.R.inc(52029);
            __CLR4_1_10144p144plusqk2tt.R.inc(52030);attributes.put("name", name);
        }finally{__CLR4_1_10144p144plusqk2tt.R.flushNeeded();}}
    }
}
