/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.bvtVO.wuqi.InstanceSchema;
import com.alibaba.json.bvtVO.wuqi.*;
import junit.framework.TestCase;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

import static org.springframework.web.socket.sockjs.frame.SockJsFrame.CHARSET;

/**
 * Created by wenshao on 01/04/2017.
 */
public class WuqiTest extends TestCase {static class __CLR4_5_218vp18vplusvn8te{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,58190,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_wuqi() throws Exception {__CLR4_5_218vp18vplusvn8te.R.globalSliceStart(getClass().getName(),58165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pqxls18vp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218vp18vplusvn8te.R.rethrow($CLV_t2$);}finally{__CLR4_5_218vp18vplusvn8te.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.WuqiTest.test_for_wuqi",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pqxls18vp() throws Exception{try{__CLR4_5_218vp18vplusvn8te.R.inc(58165);
        __CLR4_5_218vp18vplusvn8te.R.inc(58166);SchemaResult schemaResult = new SchemaResult();
        __CLR4_5_218vp18vplusvn8te.R.inc(58167);schemaResult.setCode(1001);
        __CLR4_5_218vp18vplusvn8te.R.inc(58168);schemaResult.setMassage("success");

        __CLR4_5_218vp18vplusvn8te.R.inc(58169);InstanceSchema instanceSchema = new InstanceSchema();
        __CLR4_5_218vp18vplusvn8te.R.inc(58170);instanceSchema.setCreated(1466692258L);
        __CLR4_5_218vp18vplusvn8te.R.inc(58171);instanceSchema.setCycleType(0);
        __CLR4_5_218vp18vplusvn8te.R.inc(58172);instanceSchema.setDefaultValue("-1");
        __CLR4_5_218vp18vplusvn8te.R.inc(58173);instanceSchema.setFieldBaseType("string");
        __CLR4_5_218vp18vplusvn8te.R.inc(58174);instanceSchema.setFieldComment("\u666e\u901a\u5546\u54c1\u4ef7\u683c\u5e26\u6807\u7b7e");
        __CLR4_5_218vp18vplusvn8te.R.inc(58175);instanceSchema.setFieldIndexed(1);
        __CLR4_5_218vp18vplusvn8te.R.inc(58176);instanceSchema.setFieldName("NormalPriceTag_ws");
        __CLR4_5_218vp18vplusvn8te.R.inc(58177);instanceSchema.setFieldStored(1);
        __CLR4_5_218vp18vplusvn8te.R.inc(58178);instanceSchema.setFieldTag(0);
        __CLR4_5_218vp18vplusvn8te.R.inc(58179);instanceSchema.setFieldType("text_ws");
        __CLR4_5_218vp18vplusvn8te.R.inc(58180);instanceSchema.setId(1317);
        __CLR4_5_218vp18vplusvn8te.R.inc(58181);instanceSchema.setInstanceName("xitem");
        __CLR4_5_218vp18vplusvn8te.R.inc(58182);instanceSchema.setIsDeleted(0);
        __CLR4_5_218vp18vplusvn8te.R.inc(58183);instanceSchema.setIsTagField(1);
        __CLR4_5_218vp18vplusvn8te.R.inc(58184);instanceSchema.setUpdated(1466692258L);

        __CLR4_5_218vp18vplusvn8te.R.inc(58185);schemaResult.setData(Arrays.asList(instanceSchema));

        __CLR4_5_218vp18vplusvn8te.R.inc(58186);Result result = new Result();
        __CLR4_5_218vp18vplusvn8te.R.inc(58187);result.setData(schemaResult);
        __CLR4_5_218vp18vplusvn8te.R.inc(58188);String jsonStr = JSON.toJSONString(result, SerializerFeature.WriteClassName);
        __CLR4_5_218vp18vplusvn8te.R.inc(58189);assertEquals("{\"@type\":\"com.alibaba.json.bvtVO.wuqi.Result\",\"data\":{\"@type\":\"com.alibaba.json.bvtVO.wuqi.SchemaResult\",\"code\":1001,\"data\":[{\"created\":1466692258,\"cycleType\":0,\"defaultValue\":\"-1\",\"fieldBaseType\":\"string\",\"fieldComment\":\"\u666e\u901a\u5546\u54c1\u4ef7\u683c\u5e26\u6807\u7b7e\",\"fieldIndexed\":1,\"fieldName\":\"NormalPriceTag_ws\",\"fieldStored\":1,\"fieldTag\":0,\"fieldType\":\"text_ws\",\"id\":1317,\"instanceName\":\"xitem\",\"isDeleted\":0,\"isTagField\":1,\"updated\":1466692258}],\"extra\":[],\"massage\":\"success\"}}", jsonStr);

    }finally{__CLR4_5_218vp18vplusvn8te.R.flushNeeded();}}


}
