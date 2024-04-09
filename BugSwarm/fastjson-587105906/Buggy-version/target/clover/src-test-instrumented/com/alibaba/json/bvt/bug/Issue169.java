/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.io.StringReader;
import java.io.StringWriter;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.JSONWriter;

public class Issue169 extends TestCase {static class __CLR4_1_1016pz16pzlusqk6md{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,55405,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_1016pz16pzlusqk6md.R.globalSliceStart(getClass().getName(),55367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb16pz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016pz16pzlusqk6md.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016pz16pzlusqk6md.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue169.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55367,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb16pz() throws Exception{try{__CLR4_1_1016pz16pzlusqk6md.R.inc(55367);
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55368);StringWriter strWriter = new StringWriter();
        
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55369);SectionRequest req = new SectionRequest();
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55370);req.setScreenHeight(100);// \u7236\u7c7b\u4e2d\u7684\u5c5e\u6027
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55371);req.setScreenWidth(12);// \u7236\u7c7b\u4e2d\u7684\u5c5e\u6027
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55372);req.setTag("11");
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55373);JSONWriter writer = new JSONWriter(strWriter);
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55374);writer.startArray();
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55375);writer.writeObject(req);
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55376);writer.endArray();
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55377);writer.close();
        
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55378);String text = strWriter.toString();
        
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55379);StringReader strReader = new StringReader(text);
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55380);JSONReader reader = new JSONReader(strReader);
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55381);reader.startArray();
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55382);;
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55383);while ((((reader.hasNext())&&(__CLR4_1_1016pz16pzlusqk6md.R.iget(55384)!=0|true))||(__CLR4_1_1016pz16pzlusqk6md.R.iget(55385)==0&false))) {{
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55386);SectionRequest vo = reader.readObject(SectionRequest.class);
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55387);System.out.println("tag:" + vo.getTag() + "screenHeight:" + vo.getScreenHeight() + "ScreenWidth:"
                               + vo.getScreenWidth());
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55388);Assert.assertEquals(100, vo.getScreenHeight());
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55389);Assert.assertEquals(12, vo.getScreenWidth());
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55390);Assert.assertEquals("11", vo.getTag());

        }
        }__CLR4_1_1016pz16pzlusqk6md.R.inc(55391);reader.endArray();
        __CLR4_1_1016pz16pzlusqk6md.R.inc(55392);reader.close();
    }finally{__CLR4_1_1016pz16pzlusqk6md.R.flushNeeded();}}

    public static class SectionRequest {

        private String tag;
        private int    screenHeight;
        private int    screenWidth;

        public String getTag() {try{__CLR4_1_1016pz16pzlusqk6md.R.inc(55393);
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55394);return tag;
        }finally{__CLR4_1_1016pz16pzlusqk6md.R.flushNeeded();}}

        public void setTag(String tag) {try{__CLR4_1_1016pz16pzlusqk6md.R.inc(55395);
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55396);this.tag = tag;
        }finally{__CLR4_1_1016pz16pzlusqk6md.R.flushNeeded();}}

        public int getScreenHeight() {try{__CLR4_1_1016pz16pzlusqk6md.R.inc(55397);
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55398);return screenHeight;
        }finally{__CLR4_1_1016pz16pzlusqk6md.R.flushNeeded();}}

        public void setScreenHeight(int screenHeight) {try{__CLR4_1_1016pz16pzlusqk6md.R.inc(55399);
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55400);this.screenHeight = screenHeight;
        }finally{__CLR4_1_1016pz16pzlusqk6md.R.flushNeeded();}}

        public int getScreenWidth() {try{__CLR4_1_1016pz16pzlusqk6md.R.inc(55401);
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55402);return screenWidth;
        }finally{__CLR4_1_1016pz16pzlusqk6md.R.flushNeeded();}}

        public void setScreenWidth(int screenWidth) {try{__CLR4_1_1016pz16pzlusqk6md.R.inc(55403);
            __CLR4_1_1016pz16pzlusqk6md.R.inc(55404);this.screenWidth = screenWidth;
        }finally{__CLR4_1_1016pz16pzlusqk6md.R.flushNeeded();}}

    }
}
