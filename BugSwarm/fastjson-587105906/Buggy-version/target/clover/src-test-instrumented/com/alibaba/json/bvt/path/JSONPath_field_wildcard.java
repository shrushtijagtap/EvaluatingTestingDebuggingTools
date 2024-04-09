/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

import junit.framework.TestCase;

public class JSONPath_field_wildcard extends TestCase {static class __CLR4_1_101pfv1pfvlusqkiol{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,79653,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_map() throws Exception {__CLR4_1_101pfv1pfvlusqkiol.R.globalSliceStart(getClass().getName(),79627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ivxo4x1pfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pfv1pfvlusqkiol.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pfv1pfvlusqkiol.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_wildcard.test_list_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79627,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ivxo4x1pfv() throws Exception{try{__CLR4_1_101pfv1pfvlusqkiol.R.inc(79627);
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79628);JSONPath path = new JSONPath("$.*");
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79629);Map<String, Object> map = new LinkedHashMap<String, Object>();
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79630);map.put("id", 123);
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79631);map.put("name", "wenshao");

        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79632);Collection<Object> fieldValues = (Collection<Object>) path.eval(map);
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79633);Iterator<Object> it = fieldValues.iterator();
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79634);Assert.assertSame(map.get("id"), it.next());
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79635);Assert.assertSame(map.get("name"), it.next());
    }finally{__CLR4_1_101pfv1pfvlusqkiol.R.flushNeeded();}}
    
    public void test_list_map_none_root() throws Exception {__CLR4_1_101pfv1pfvlusqkiol.R.globalSliceStart(getClass().getName(),79636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ohzj531pg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pfv1pfvlusqkiol.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pfv1pfvlusqkiol.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_wildcard.test_list_map_none_root",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79636,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ohzj531pg4() throws Exception{try{__CLR4_1_101pfv1pfvlusqkiol.R.inc(79636);
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79637);JSONPath path = new JSONPath("*");
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79638);Entity entity = new Entity(123, "wenshao");
        
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79639);List<Object> fieldValues = (List<Object>) path.eval(entity);
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79640);Assert.assertSame(entity.getId(), fieldValues.get(0));
        __CLR4_1_101pfv1pfvlusqkiol.R.inc(79641);Assert.assertSame(entity.getName(), fieldValues.get(1));
    }finally{__CLR4_1_101pfv1pfvlusqkiol.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101pfv1pfvlusqkiol.R.inc(79642);
            __CLR4_1_101pfv1pfvlusqkiol.R.inc(79643);this.id = id;
            __CLR4_1_101pfv1pfvlusqkiol.R.inc(79644);this.name = name;
        }finally{__CLR4_1_101pfv1pfvlusqkiol.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101pfv1pfvlusqkiol.R.inc(79645);
            __CLR4_1_101pfv1pfvlusqkiol.R.inc(79646);return id;
        }finally{__CLR4_1_101pfv1pfvlusqkiol.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101pfv1pfvlusqkiol.R.inc(79647);
            __CLR4_1_101pfv1pfvlusqkiol.R.inc(79648);this.id = id;
        }finally{__CLR4_1_101pfv1pfvlusqkiol.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101pfv1pfvlusqkiol.R.inc(79649);
            __CLR4_1_101pfv1pfvlusqkiol.R.inc(79650);return name;
        }finally{__CLR4_1_101pfv1pfvlusqkiol.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101pfv1pfvlusqkiol.R.inc(79651);
            __CLR4_1_101pfv1pfvlusqkiol.R.inc(79652);this.name = name;
        }finally{__CLR4_1_101pfv1pfvlusqkiol.R.flushNeeded();}}

    }
}
