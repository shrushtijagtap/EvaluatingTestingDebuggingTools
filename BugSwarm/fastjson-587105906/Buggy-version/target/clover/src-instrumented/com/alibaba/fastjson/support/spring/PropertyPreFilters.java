/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link SimplePropertyPreFilter}\u7684\u4e00\u4e2a\u7b80\u5355\u5c01\u88c5
 * @author  yanquanyu
 * @author  liuming
 */
public class PropertyPreFilters {public static class __CLR4_1_10p3ip3iluszw0id{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,32561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private List<MySimplePropertyPreFilter> filters = new ArrayList<MySimplePropertyPreFilter>();


    public MySimplePropertyPreFilter addFilter(){try{__CLR4_1_10p3ip3iluszw0id.R.inc(32526);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32527);MySimplePropertyPreFilter filter = new MySimplePropertyPreFilter();
        __CLR4_1_10p3ip3iluszw0id.R.inc(32528);filters.add(filter);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32529);return filter;
    }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

    public MySimplePropertyPreFilter addFilter(String... properties){try{__CLR4_1_10p3ip3iluszw0id.R.inc(32530);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32531);MySimplePropertyPreFilter filter = new MySimplePropertyPreFilter(properties);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32532);filters.add(filter);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32533);return filter;
    }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

    public MySimplePropertyPreFilter addFilter(Class<?> clazz, String... properties){try{__CLR4_1_10p3ip3iluszw0id.R.inc(32534);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32535);MySimplePropertyPreFilter filter = new MySimplePropertyPreFilter(clazz,properties);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32536);filters.add(filter);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32537);return filter;
    }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

    public List<MySimplePropertyPreFilter> getFilters() {try{__CLR4_1_10p3ip3iluszw0id.R.inc(32538);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32539);return filters;
    }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

    public void setFilters(List<MySimplePropertyPreFilter> filters) {try{__CLR4_1_10p3ip3iluszw0id.R.inc(32540);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32541);this.filters = filters;
    }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

    public MySimplePropertyPreFilter[] toFilters(){try{__CLR4_1_10p3ip3iluszw0id.R.inc(32542);
        __CLR4_1_10p3ip3iluszw0id.R.inc(32543);return filters.toArray(new MySimplePropertyPreFilter[]{});
    }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

    public class MySimplePropertyPreFilter extends SimplePropertyPreFilter {

        public MySimplePropertyPreFilter(){try{__CLR4_1_10p3ip3iluszw0id.R.inc(32544);}finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

        public MySimplePropertyPreFilter(String... properties){
            super(properties);__CLR4_1_10p3ip3iluszw0id.R.inc(32546);try{__CLR4_1_10p3ip3iluszw0id.R.inc(32545);
        }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

        public MySimplePropertyPreFilter(Class<?> clazz, String... properties){
            super(clazz,properties);__CLR4_1_10p3ip3iluszw0id.R.inc(32548);try{__CLR4_1_10p3ip3iluszw0id.R.inc(32547);
        }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

        public MySimplePropertyPreFilter addExcludes(String... filters){try{__CLR4_1_10p3ip3iluszw0id.R.inc(32549);
            __CLR4_1_10p3ip3iluszw0id.R.inc(32550);for (int i = 0; (((i < filters.length)&&(__CLR4_1_10p3ip3iluszw0id.R.iget(32551)!=0|true))||(__CLR4_1_10p3ip3iluszw0id.R.iget(32552)==0&false)); i++) {{
                __CLR4_1_10p3ip3iluszw0id.R.inc(32553);this.getExcludes().add(filters[i]);
            }
            }__CLR4_1_10p3ip3iluszw0id.R.inc(32554);return this;
        }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}

        public MySimplePropertyPreFilter addIncludes(String... filters){try{__CLR4_1_10p3ip3iluszw0id.R.inc(32555);
            __CLR4_1_10p3ip3iluszw0id.R.inc(32556);for (int i = 0; (((i < filters.length)&&(__CLR4_1_10p3ip3iluszw0id.R.iget(32557)!=0|true))||(__CLR4_1_10p3ip3iluszw0id.R.iget(32558)==0&false)); i++) {{
                __CLR4_1_10p3ip3iluszw0id.R.inc(32559);this.getIncludes().add(filters[i]);
            }
            }__CLR4_1_10p3ip3iluszw0id.R.inc(32560);return this;
        }finally{__CLR4_1_10p3ip3iluszw0id.R.flushNeeded();}}
    }
}
