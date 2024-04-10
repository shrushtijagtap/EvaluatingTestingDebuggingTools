/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kimmking on 02/07/2017.
 */
public class Issue1306 extends TestCase {static class __CLR4_5_219vs19vslusyjsrh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,59491,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() {__CLR4_5_219vs19vslusyjsrh.R.globalSliceStart(getClass().getName(),59464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb19vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219vs19vslusyjsrh.R.rethrow($CLV_t2$);}finally{__CLR4_5_219vs19vslusyjsrh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1306.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb19vs(){try{__CLR4_5_219vs19vslusyjsrh.R.inc(59464);
        __CLR4_5_219vs19vslusyjsrh.R.inc(59465);Goods goods = new Goods();
        __CLR4_5_219vs19vslusyjsrh.R.inc(59466);goods.setProperties(Arrays.asList(new Goods.Property()));
        __CLR4_5_219vs19vslusyjsrh.R.inc(59467);TT tt = new TT(goods);
        __CLR4_5_219vs19vslusyjsrh.R.inc(59468);String json = JSON.toJSONString(tt);
        __CLR4_5_219vs19vslusyjsrh.R.inc(59469);assertEquals("{\"goodsList\":[{\"properties\":[{}]}]}", json);
        __CLR4_5_219vs19vslusyjsrh.R.inc(59470);TT n = JSON.parseObject(json, TT.class);
        __CLR4_5_219vs19vslusyjsrh.R.inc(59471);assertNotNull(n);
        __CLR4_5_219vs19vslusyjsrh.R.inc(59472);assertNotNull(n.getGoodsList());
        __CLR4_5_219vs19vslusyjsrh.R.inc(59473);assertNotNull(n.getGoodsList().get(0));
        __CLR4_5_219vs19vslusyjsrh.R.inc(59474);assertNotNull(n.getGoodsList().get(0).getProperties());
    }finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}

    public static abstract class IdEntity<ID extends Serializable> implements Cloneable, Serializable{

        private static final long serialVersionUID = 4877536176216854937L;

        public IdEntity() {try{__CLR4_5_219vs19vslusyjsrh.R.inc(59475);}finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}

        public abstract ID getId();
        public abstract void setId(ID id);
    }

    public static class LongEntity extends IdEntity<Long> {

        private static final long serialVersionUID = -2740365657805589848L;

        private Long id;

        @Override
        public Long getId() {try{__CLR4_5_219vs19vslusyjsrh.R.inc(59476);
            __CLR4_5_219vs19vslusyjsrh.R.inc(59477);return id;
        }finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_219vs19vslusyjsrh.R.inc(59478);
            __CLR4_5_219vs19vslusyjsrh.R.inc(59479);this.id = id;
        }finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}
    }

    public static class Goods extends LongEntity{
        private static final long serialVersionUID = -5751106975913625097L;
        private List<Property> properties;

        public List<Property> getProperties() {try{__CLR4_5_219vs19vslusyjsrh.R.inc(59480);
            __CLR4_5_219vs19vslusyjsrh.R.inc(59481);return properties;
        }finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}

        public void setProperties(List<Property> properties) {try{__CLR4_5_219vs19vslusyjsrh.R.inc(59482);
            __CLR4_5_219vs19vslusyjsrh.R.inc(59483);this.properties = properties;
        }finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}

        public static class Property extends LongEntity{
            private static final long serialVersionUID = 7941148286688199390L;
        }
    }

    public static class TT extends LongEntity {
        private static final long serialVersionUID = 2988415809510669142L;

        public TT(){try{__CLR4_5_219vs19vslusyjsrh.R.inc(59484);}finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}
        public TT(Goods goods){try{__CLR4_5_219vs19vslusyjsrh.R.inc(59485);
            __CLR4_5_219vs19vslusyjsrh.R.inc(59486);goodsList = Arrays.asList(goods);
        }finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}


        private List<Goods> goodsList;

        public List<Goods> getGoodsList() {try{__CLR4_5_219vs19vslusyjsrh.R.inc(59487);
            __CLR4_5_219vs19vslusyjsrh.R.inc(59488);return goodsList;
        }finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}

        public void setGoodsList(List<Goods> goodsList) {try{__CLR4_5_219vs19vslusyjsrh.R.inc(59489);
            __CLR4_5_219vs19vslusyjsrh.R.inc(59490);this.goodsList = goodsList;
        }finally{__CLR4_5_219vs19vslusyjsrh.R.flushNeeded();}}
    }
}
