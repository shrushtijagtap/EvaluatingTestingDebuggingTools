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
public class Bug_for_luogongwu extends TestCase {static class __CLR4_5_216ao16aolusvn73f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,54853,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_216ao16aolusvn73f.R.globalSliceStart(getClass().getName(),54816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb16ao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ao16aolusvn73f.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ao16aolusvn73f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_luogongwu.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb16ao() throws Exception{try{__CLR4_5_216ao16aolusvn73f.R.inc(54816);
        __CLR4_5_216ao16aolusvn73f.R.inc(54817);List<IflowItemImage> imageList = new ArrayList<IflowItemImage>();
        __CLR4_5_216ao16aolusvn73f.R.inc(54818);IflowItemImage image = new IflowItemImage();
        __CLR4_5_216ao16aolusvn73f.R.inc(54819);image.id = "72c7275c6b";
        __CLR4_5_216ao16aolusvn73f.R.inc(54820);imageList.add(image);

        __CLR4_5_216ao16aolusvn73f.R.inc(54821);imageList = new ArrayList();
        __CLR4_5_216ao16aolusvn73f.R.inc(54822);image = new IflowItemImage();
        __CLR4_5_216ao16aolusvn73f.R.inc(54823);image.id = "72c7275c6c";
        __CLR4_5_216ao16aolusvn73f.R.inc(54824);imageList.add(image);

        // force ASM
        __CLR4_5_216ao16aolusvn73f.R.inc(54825);boolean asm = SerializeConfig.globalInstance.isAsmEnable();
        __CLR4_5_216ao16aolusvn73f.R.inc(54826);SerializeConfig.globalInstance.setAsmEnable(true);

        // Test ASM
        __CLR4_5_216ao16aolusvn73f.R.inc(54827);Foo foo = new Foo();
        __CLR4_5_216ao16aolusvn73f.R.inc(54828);foo.thumbnails = imageList;

        __CLR4_5_216ao16aolusvn73f.R.inc(54829);String jsonString = JSON.toJSONString(foo);
        __CLR4_5_216ao16aolusvn73f.R.inc(54830);System.out.println(jsonString);

        __CLR4_5_216ao16aolusvn73f.R.inc(54831);Foo foo1 = JSON.parseObject(jsonString, Foo.class);

        __CLR4_5_216ao16aolusvn73f.R.inc(54832);assertEquals(1, foo1.thumbnails.size());
        __CLR4_5_216ao16aolusvn73f.R.inc(54833);assertNotNull(foo1.thumbnails.get(0));
        __CLR4_5_216ao16aolusvn73f.R.inc(54834);assertSame(foo1.getThumbnail(), foo1.thumbnails.get(0));


        // test Not ASM
        __CLR4_5_216ao16aolusvn73f.R.inc(54835);SerializeConfig.globalInstance.setAsmEnable(false);
        __CLR4_5_216ao16aolusvn73f.R.inc(54836);FooNotAsm fooNotAsm = new FooNotAsm();
        __CLR4_5_216ao16aolusvn73f.R.inc(54837);fooNotAsm.thumbnails = imageList;

        __CLR4_5_216ao16aolusvn73f.R.inc(54838);jsonString = JSON.toJSONString(foo);
        __CLR4_5_216ao16aolusvn73f.R.inc(54839);System.out.println(jsonString);

        __CLR4_5_216ao16aolusvn73f.R.inc(54840);FooNotAsm fooNotAsm1 = JSON.parseObject(jsonString, FooNotAsm.class);

        __CLR4_5_216ao16aolusvn73f.R.inc(54841);assertEquals(1, fooNotAsm1.thumbnails.size());
        __CLR4_5_216ao16aolusvn73f.R.inc(54842);assertNotNull(fooNotAsm1.thumbnails.get(0));
        __CLR4_5_216ao16aolusvn73f.R.inc(54843);assertSame(fooNotAsm1.getThumbnail(), fooNotAsm1.thumbnails.get(0));

        // restore
        __CLR4_5_216ao16aolusvn73f.R.inc(54844);SerializeConfig.globalInstance.setAsmEnable(asm);
    }finally{__CLR4_5_216ao16aolusvn73f.R.flushNeeded();}}

    @JSONType(asm=false)
    public static class FooNotAsm {
        @JSONField(serialzeFeatures = SerializerFeature.DisableCircularReferenceDetect)
        public List<IflowItemImage> thumbnails;

        public IflowItemImage getThumbnail() {try{__CLR4_5_216ao16aolusvn73f.R.inc(54845);
            __CLR4_5_216ao16aolusvn73f.R.inc(54846);return (((thumbnails != null && thumbnails.size() > 0 )&&(__CLR4_5_216ao16aolusvn73f.R.iget(54847)!=0|true))||(__CLR4_5_216ao16aolusvn73f.R.iget(54848)==0&false))? thumbnails.get(0) : null;
        }finally{__CLR4_5_216ao16aolusvn73f.R.flushNeeded();}}
    }

    public static class Foo {
        @JSONField(serialzeFeatures = SerializerFeature.DisableCircularReferenceDetect)
        public List<IflowItemImage> thumbnails;

        public IflowItemImage getThumbnail() {try{__CLR4_5_216ao16aolusvn73f.R.inc(54849);
            __CLR4_5_216ao16aolusvn73f.R.inc(54850);return (((thumbnails != null && thumbnails.size() > 0 )&&(__CLR4_5_216ao16aolusvn73f.R.iget(54851)!=0|true))||(__CLR4_5_216ao16aolusvn73f.R.iget(54852)==0&false))? thumbnails.get(0) : null;
        }finally{__CLR4_5_216ao16aolusvn73f.R.flushNeeded();}}
    }

    public static class IflowItemImage {
        public String id;
    }
}
