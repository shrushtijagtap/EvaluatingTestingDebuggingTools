/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.stream;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONReader;

public class JSONReader_array extends TestCase {static class __CLR4_5_21o511o51lusyjugw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,77967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_array() throws Exception {__CLR4_5_21o511o51lusyjugw.R.globalSliceStart(getClass().getName(),77941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw0vd91o51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o511o51lusyjugw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o511o51lusyjugw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_array.test_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw0vd91o51() throws Exception{try{__CLR4_5_21o511o51lusyjugw.R.inc(77941);
        __CLR4_5_21o511o51lusyjugw.R.inc(77942);JSONReader reader = new JSONReader(new StringReader("[[],[],3,null,{\"name\":\"jobs\"},{\"id\":123},{\"id\":1},{\"id\":2}]"));
        __CLR4_5_21o511o51lusyjugw.R.inc(77943);reader.startArray();

        __CLR4_5_21o511o51lusyjugw.R.inc(77944);JSONArray first = (JSONArray) reader.readObject();
        __CLR4_5_21o511o51lusyjugw.R.inc(77945);JSONArray second = (JSONArray) reader.readObject();

        __CLR4_5_21o511o51lusyjugw.R.inc(77946);Assert.assertNotNull(first);
        __CLR4_5_21o511o51lusyjugw.R.inc(77947);Assert.assertNotNull(second);

        __CLR4_5_21o511o51lusyjugw.R.inc(77948);Assert.assertEquals(new Integer(3), reader.readInteger());
        __CLR4_5_21o511o51lusyjugw.R.inc(77949);Assert.assertNull(reader.readString());
        
        {
            __CLR4_5_21o511o51lusyjugw.R.inc(77950);Map<String, Object> map = new HashMap<String, Object>();
            __CLR4_5_21o511o51lusyjugw.R.inc(77951);reader.readObject(map);
            __CLR4_5_21o511o51lusyjugw.R.inc(77952);Assert.assertEquals("jobs", map.get("name"));
        }

        {
            __CLR4_5_21o511o51lusyjugw.R.inc(77953);VO vo = new VO();
            __CLR4_5_21o511o51lusyjugw.R.inc(77954);reader.readObject(vo);
            __CLR4_5_21o511o51lusyjugw.R.inc(77955);Assert.assertEquals(123, vo.getId());
        }
        
        __CLR4_5_21o511o51lusyjugw.R.inc(77956);while ((((reader.hasNext())&&(__CLR4_5_21o511o51lusyjugw.R.iget(77957)!=0|true))||(__CLR4_5_21o511o51lusyjugw.R.iget(77958)==0&false))) {{
            __CLR4_5_21o511o51lusyjugw.R.inc(77959);VO vo = reader.readObject(VO.class);
            __CLR4_5_21o511o51lusyjugw.R.inc(77960);Assert.assertNotNull(vo);
        }
        }__CLR4_5_21o511o51lusyjugw.R.inc(77961);reader.endArray();
        __CLR4_5_21o511o51lusyjugw.R.inc(77962);reader.close();
    }finally{__CLR4_5_21o511o51lusyjugw.R.flushNeeded();}}

    public static class VO {

        private int id;

        public int getId() {try{__CLR4_5_21o511o51lusyjugw.R.inc(77963);
            __CLR4_5_21o511o51lusyjugw.R.inc(77964);return id;
        }finally{__CLR4_5_21o511o51lusyjugw.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21o511o51lusyjugw.R.inc(77965);
            __CLR4_5_21o511o51lusyjugw.R.inc(77966);this.id = id;
        }finally{__CLR4_5_21o511o51lusyjugw.R.flushNeeded();}}
    }
}
