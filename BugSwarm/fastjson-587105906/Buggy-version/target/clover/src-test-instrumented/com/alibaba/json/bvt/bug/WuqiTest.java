/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

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
public class WuqiTest extends TestCase {static class __CLR4_1_1017xs17xslusqk7ef{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,56969,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_wuqi() throws Exception {__CLR4_1_1017xs17xslusqk7ef.R.globalSliceStart(getClass().getName(),56944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pqxls17xs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017xs17xslusqk7ef.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017xs17xslusqk7ef.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.WuqiTest.test_for_wuqi",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56944,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pqxls17xs() throws Exception{try{__CLR4_1_1017xs17xslusqk7ef.R.inc(56944);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56945);SchemaResult schemaResult = new SchemaResult();
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56946);schemaResult.setCode(1001);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56947);schemaResult.setMassage("success");

        __CLR4_1_1017xs17xslusqk7ef.R.inc(56948);InstanceSchema instanceSchema = new InstanceSchema();
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56949);instanceSchema.setCreated(1466692258L);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56950);instanceSchema.setCycleType(0);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56951);instanceSchema.setDefaultValue("-1");
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56952);instanceSchema.setFieldBaseType("string");
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56953);instanceSchema.setFieldComment("\u666e\u901a\u5546\u54c1\u4ef7\u683c\u5e26\u6807\u7b7e");
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56954);instanceSchema.setFieldIndexed(1);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56955);instanceSchema.setFieldName("NormalPriceTag_ws");
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56956);instanceSchema.setFieldStored(1);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56957);instanceSchema.setFieldTag(0);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56958);instanceSchema.setFieldType("text_ws");
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56959);instanceSchema.setId(1317);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56960);instanceSchema.setInstanceName("xitem");
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56961);instanceSchema.setIsDeleted(0);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56962);instanceSchema.setIsTagField(1);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56963);instanceSchema.setUpdated(1466692258L);

        __CLR4_1_1017xs17xslusqk7ef.R.inc(56964);schemaResult.setData(Arrays.asList(instanceSchema));

        __CLR4_1_1017xs17xslusqk7ef.R.inc(56965);Result result = new Result();
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56966);result.setData(schemaResult);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56967);String jsonStr = JSON.toJSONString(result, SerializerFeature.WriteClassName);
        __CLR4_1_1017xs17xslusqk7ef.R.inc(56968);assertEquals("{\"@type\":\"com.alibaba.json.bvtVO.wuqi.Result\",\"data\":{\"@type\":\"com.alibaba.json.bvtVO.wuqi.SchemaResult\",\"code\":1001,\"data\":[{\"created\":1466692258,\"cycleType\":0,\"defaultValue\":\"-1\",\"fieldBaseType\":\"string\",\"fieldComment\":\"\u666e\u901a\u5546\u54c1\u4ef7\u683c\u5e26\u6807\u7b7e\",\"fieldIndexed\":1,\"fieldName\":\"NormalPriceTag_ws\",\"fieldStored\":1,\"fieldTag\":0,\"fieldType\":\"text_ws\",\"id\":1317,\"instanceName\":\"xitem\",\"isDeleted\":0,\"isTagField\":1,\"updated\":1466692258}],\"extra\":[],\"massage\":\"success\"}}", jsonStr);

    }finally{__CLR4_1_1017xs17xslusqk7ef.R.flushNeeded();}}


}
