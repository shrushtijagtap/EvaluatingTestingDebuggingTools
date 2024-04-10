/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenshao on 15/06/2017.
 */
public class Bug_for_luogongwu extends TestCase {static class __CLR4_5_215cg15cglusyjrt4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,53621,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_215cg15cglusyjrt4.R.globalSliceStart(getClass().getName(),53584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb15cg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215cg15cglusyjrt4.R.rethrow($CLV_t2$);}finally{__CLR4_5_215cg15cglusyjrt4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_luogongwu.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb15cg() throws Exception{try{__CLR4_5_215cg15cglusyjrt4.R.inc(53584);
        __CLR4_5_215cg15cglusyjrt4.R.inc(53585);List<IflowItemImage> imageList = new ArrayList<IflowItemImage>();
        __CLR4_5_215cg15cglusyjrt4.R.inc(53586);IflowItemImage image = new IflowItemImage();
        __CLR4_5_215cg15cglusyjrt4.R.inc(53587);image.id = "72c7275c6b";
        __CLR4_5_215cg15cglusyjrt4.R.inc(53588);imageList.add(image);

        __CLR4_5_215cg15cglusyjrt4.R.inc(53589);imageList = new ArrayList();
        __CLR4_5_215cg15cglusyjrt4.R.inc(53590);image = new IflowItemImage();
        __CLR4_5_215cg15cglusyjrt4.R.inc(53591);image.id = "72c7275c6c";
        __CLR4_5_215cg15cglusyjrt4.R.inc(53592);imageList.add(image);

        // force ASM
        __CLR4_5_215cg15cglusyjrt4.R.inc(53593);boolean asm = SerializeConfig.globalInstance.isAsmEnable();
        __CLR4_5_215cg15cglusyjrt4.R.inc(53594);SerializeConfig.globalInstance.setAsmEnable(true);

        // Test ASM
        __CLR4_5_215cg15cglusyjrt4.R.inc(53595);Foo foo = new Foo();
        __CLR4_5_215cg15cglusyjrt4.R.inc(53596);foo.thumbnails = imageList;

        __CLR4_5_215cg15cglusyjrt4.R.inc(53597);String jsonString = JSON.toJSONString(foo);
        __CLR4_5_215cg15cglusyjrt4.R.inc(53598);System.out.println(jsonString);

        __CLR4_5_215cg15cglusyjrt4.R.inc(53599);Foo foo1 = JSON.parseObject(jsonString, Foo.class);

        __CLR4_5_215cg15cglusyjrt4.R.inc(53600);assertEquals(1, foo1.thumbnails.size());
        __CLR4_5_215cg15cglusyjrt4.R.inc(53601);assertNotNull(foo1.thumbnails.get(0));
        __CLR4_5_215cg15cglusyjrt4.R.inc(53602);assertSame(foo1.getThumbnail(), foo1.thumbnails.get(0));


        // test Not ASM
        __CLR4_5_215cg15cglusyjrt4.R.inc(53603);SerializeConfig.globalInstance.setAsmEnable(false);
        __CLR4_5_215cg15cglusyjrt4.R.inc(53604);FooNotAsm fooNotAsm = new FooNotAsm();
        __CLR4_5_215cg15cglusyjrt4.R.inc(53605);fooNotAsm.thumbnails = imageList;

        __CLR4_5_215cg15cglusyjrt4.R.inc(53606);jsonString = JSON.toJSONString(foo);
        __CLR4_5_215cg15cglusyjrt4.R.inc(53607);System.out.println(jsonString);

        __CLR4_5_215cg15cglusyjrt4.R.inc(53608);FooNotAsm fooNotAsm1 = JSON.parseObject(jsonString, FooNotAsm.class);

        __CLR4_5_215cg15cglusyjrt4.R.inc(53609);assertEquals(1, fooNotAsm1.thumbnails.size());
        __CLR4_5_215cg15cglusyjrt4.R.inc(53610);assertNotNull(fooNotAsm1.thumbnails.get(0));
        __CLR4_5_215cg15cglusyjrt4.R.inc(53611);assertSame(fooNotAsm1.getThumbnail(), fooNotAsm1.thumbnails.get(0));

        // restore
        __CLR4_5_215cg15cglusyjrt4.R.inc(53612);SerializeConfig.globalInstance.setAsmEnable(asm);
    }finally{__CLR4_5_215cg15cglusyjrt4.R.flushNeeded();}}

    @JSONType(asm=false)
    public static class FooNotAsm {
        @JSONField(serialzeFeatures = SerializerFeature.DisableCircularReferenceDetect)
        public List<IflowItemImage> thumbnails;

        public IflowItemImage getThumbnail() {try{__CLR4_5_215cg15cglusyjrt4.R.inc(53613);
            __CLR4_5_215cg15cglusyjrt4.R.inc(53614);return (((thumbnails != null && thumbnails.size() > 0 )&&(__CLR4_5_215cg15cglusyjrt4.R.iget(53615)!=0|true))||(__CLR4_5_215cg15cglusyjrt4.R.iget(53616)==0&false))? thumbnails.get(0) : null;
        }finally{__CLR4_5_215cg15cglusyjrt4.R.flushNeeded();}}
    }

    public static class Foo {
        @JSONField(serialzeFeatures = SerializerFeature.DisableCircularReferenceDetect)
        public List<IflowItemImage> thumbnails;

        public IflowItemImage getThumbnail() {try{__CLR4_5_215cg15cglusyjrt4.R.inc(53617);
            __CLR4_5_215cg15cglusyjrt4.R.inc(53618);return (((thumbnails != null && thumbnails.size() > 0 )&&(__CLR4_5_215cg15cglusyjrt4.R.iget(53619)!=0|true))||(__CLR4_5_215cg15cglusyjrt4.R.iget(53620)==0&false))? thumbnails.get(0) : null;
        }finally{__CLR4_5_215cg15cglusyjrt4.R.flushNeeded();}}
    }

    public static class IflowItemImage {
        public String id;
    }
}
