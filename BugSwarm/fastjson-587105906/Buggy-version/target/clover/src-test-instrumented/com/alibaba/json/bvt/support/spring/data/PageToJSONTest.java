/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring.data;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class PageToJSONTest extends TestCase {static class __CLR4_1_101x161x16lusqkmez{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,89476,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_page() throws Exception {__CLR4_1_101x161x16lusqkmez.R.globalSliceStart(getClass().getName(),89466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108gi0il1x16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x161x16lusqkmez.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x161x16lusqkmez.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.data.PageToJSONTest.test_page",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89466,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108gi0il1x16() throws Exception{try{__CLR4_1_101x161x16lusqkmez.R.inc(89466);
        __CLR4_1_101x161x16lusqkmez.R.inc(89467);List<Post> postList = new ArrayList<Post>();
        {
            __CLR4_1_101x161x16lusqkmez.R.inc(89468);postList.add(new Post(1001));
        }
        
        __CLR4_1_101x161x16lusqkmez.R.inc(89469);Page<Post> page = new PageImpl(postList);
        
        __CLR4_1_101x161x16lusqkmez.R.inc(89470);JSONObject obj = (JSONObject) JSON.toJSON(page);
        __CLR4_1_101x161x16lusqkmez.R.inc(89471);Assert.assertNotNull(obj);
        __CLR4_1_101x161x16lusqkmez.R.inc(89472);Assert.assertEquals(1, obj.getJSONArray("content").size());
    }finally{__CLR4_1_101x161x16lusqkmez.R.flushNeeded();}}
    
    public static class Post{
        public int id;
        
        public Post() {try{__CLR4_1_101x161x16lusqkmez.R.inc(89473);
            
        }finally{__CLR4_1_101x161x16lusqkmez.R.flushNeeded();}}
        
        public Post(int id) {try{__CLR4_1_101x161x16lusqkmez.R.inc(89474);
            __CLR4_1_101x161x16lusqkmez.R.inc(89475);this.id = id;
        }finally{__CLR4_1_101x161x16lusqkmez.R.flushNeeded();}}
    }
}
