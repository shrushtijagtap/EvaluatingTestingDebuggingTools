/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.performance;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import junit.framework.TestCase;

import com.alibaba.json.test.codec.Codec;
import com.alibaba.json.test.codec.FastjsonCodec;
import com.alibaba.json.test.codec.JacksonCodec;
import com.alibaba.json.test.entity.Company;
import com.alibaba.json.test.entity.Department;
import com.alibaba.json.test.entity.Employee;
import com.alibaba.json.test.entity.Group;

public class ObjectEncodePerformanceTest extends TestCase {static class __CLR4_5_227he27helusyjx7l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,103083,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final int  COUNT  = 1000 * 100;
    private AtomicLong idSeed = new AtomicLong();

    private Object     object;

    protected void setUp() throws Exception {try{__CLR4_5_227he27helusyjx7l.R.inc(103010);
        __CLR4_5_227he27helusyjx7l.R.inc(103011);this.object = createObject();
    }finally{__CLR4_5_227he27helusyjx7l.R.flushNeeded();}}

    public void test_decodeObject() throws Exception {__CLR4_5_227he27helusyjx7l.R.globalSliceStart(getClass().getName(),103012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r89gv327hg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_227he27helusyjx7l.R.rethrow($CLV_t2$);}finally{__CLR4_5_227he27helusyjx7l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.performance.ObjectEncodePerformanceTest.test_decodeObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),103012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r89gv327hg() throws Exception{try{__CLR4_5_227he27helusyjx7l.R.inc(103012);
        __CLR4_5_227he27helusyjx7l.R.inc(103013);List<Codec> decoders = new ArrayList<Codec>();
        __CLR4_5_227he27helusyjx7l.R.inc(103014);decoders.add(new JacksonCodec());
        __CLR4_5_227he27helusyjx7l.R.inc(103015);decoders.add(new FastjsonCodec());
        // decoders.add(new SimpleJsonDecoderImpl());
        // decoders.add(new JsonLibDecoderImpl());

        __CLR4_5_227he27helusyjx7l.R.inc(103016);for (Codec decoder : decoders) {{
            __CLR4_5_227he27helusyjx7l.R.inc(103017);for (int i = 0; (((i < 10)&&(__CLR4_5_227he27helusyjx7l.R.iget(103018)!=0|true))||(__CLR4_5_227he27helusyjx7l.R.iget(103019)==0&false)); ++i) {{
                __CLR4_5_227he27helusyjx7l.R.inc(103020);encode(object, decoder);
            }
            }__CLR4_5_227he27helusyjx7l.R.inc(103021);System.out.println();
        }
    }}finally{__CLR4_5_227he27helusyjx7l.R.flushNeeded();}}

    public void encode(Object object, Codec decoder) throws Exception {try{__CLR4_5_227he27helusyjx7l.R.inc(103022);
        __CLR4_5_227he27helusyjx7l.R.inc(103023);long startNano = System.nanoTime();
        __CLR4_5_227he27helusyjx7l.R.inc(103024);for (int i = 0; (((i < COUNT)&&(__CLR4_5_227he27helusyjx7l.R.iget(103025)!=0|true))||(__CLR4_5_227he27helusyjx7l.R.iget(103026)==0&false)); ++i) {{
            __CLR4_5_227he27helusyjx7l.R.inc(103027);decoder.encode(object);
        }
        }__CLR4_5_227he27helusyjx7l.R.inc(103028);long nano = System.nanoTime() - startNano;
        __CLR4_5_227he27helusyjx7l.R.inc(103029);System.out.println(decoder.getName() + " : \t" + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_227he27helusyjx7l.R.flushNeeded();}}

    private Object createObject() {try{__CLR4_5_227he27helusyjx7l.R.inc(103030);
        __CLR4_5_227he27helusyjx7l.R.inc(103031);Group group = new Group();

        __CLR4_5_227he27helusyjx7l.R.inc(103032);group.setName("Alibaba Group");
        __CLR4_5_227he27helusyjx7l.R.inc(103033);group.setDescription("Alibaba Group makes it easy for anyone to buy or sell online anywhere in the world. ");

        {
            __CLR4_5_227he27helusyjx7l.R.inc(103034);Company company = new Company();
            __CLR4_5_227he27helusyjx7l.R.inc(103035);company.setId(createId());
            __CLR4_5_227he27helusyjx7l.R.inc(103036);company.setName("Alibaba.com");
            __CLR4_5_227he27helusyjx7l.R.inc(103037);company.setDescription("Global leader in e-commerce for small businesses");
            __CLR4_5_227he27helusyjx7l.R.inc(103038);company.setStock("1688.HK");
            __CLR4_5_227he27helusyjx7l.R.inc(103039);group.getCompanies().add(company);

            __CLR4_5_227he27helusyjx7l.R.inc(103040);Department root = new Department();
            __CLR4_5_227he27helusyjx7l.R.inc(103041);root.setId(createId());
            __CLR4_5_227he27helusyjx7l.R.inc(103042);root.setName("B2B");
            __CLR4_5_227he27helusyjx7l.R.inc(103043);company.setRootDepartment(root);

            {
                __CLR4_5_227he27helusyjx7l.R.inc(103044);Department cbu = new Department();
                __CLR4_5_227he27helusyjx7l.R.inc(103045);cbu.setId(createId());
                __CLR4_5_227he27helusyjx7l.R.inc(103046);cbu.setName("CBU");

                __CLR4_5_227he27helusyjx7l.R.inc(103047);root.getChildren().add(cbu);

                __CLR4_5_227he27helusyjx7l.R.inc(103048);Employee emp0 = new Employee();
                __CLR4_5_227he27helusyjx7l.R.inc(103049);emp0.setName("\u6821\u957f");
                __CLR4_5_227he27helusyjx7l.R.inc(103050);emp0.setDescription("\u795e\u68cd\u654c\u4eba\u59d0");
                __CLR4_5_227he27helusyjx7l.R.inc(103051);emp0.setAge(3);
                __CLR4_5_227he27helusyjx7l.R.inc(103052);emp0.setSalary(new BigDecimal("123456789.0123"));
                __CLR4_5_227he27helusyjx7l.R.inc(103053);emp0.setBirthdate(new Date());
                __CLR4_5_227he27helusyjx7l.R.inc(103054);emp0.setBadboy(true);

                __CLR4_5_227he27helusyjx7l.R.inc(103055);cbu.getMembers().add(emp0);
            }
            {
                __CLR4_5_227he27helusyjx7l.R.inc(103056);Department icbu = new Department();
                __CLR4_5_227he27helusyjx7l.R.inc(103057);icbu.setId(createId());
                __CLR4_5_227he27helusyjx7l.R.inc(103058);icbu.setName("ICBU");

                __CLR4_5_227he27helusyjx7l.R.inc(103059);root.getChildren().add(icbu);
            }
        }

        {
            __CLR4_5_227he27helusyjx7l.R.inc(103060);Company company = new Company();
            __CLR4_5_227he27helusyjx7l.R.inc(103061);company.setId(createId());
            __CLR4_5_227he27helusyjx7l.R.inc(103062);company.setName("Taobao");
            __CLR4_5_227he27helusyjx7l.R.inc(103063);company.setDescription("China's largest online retail website and one-stop platform for shopping, socializing and information sharing");
            __CLR4_5_227he27helusyjx7l.R.inc(103064);group.getCompanies().add(company);
        }
        {
            __CLR4_5_227he27helusyjx7l.R.inc(103065);Company company = new Company();
            __CLR4_5_227he27helusyjx7l.R.inc(103066);company.setId(createId());
            __CLR4_5_227he27helusyjx7l.R.inc(103067);company.setName("Alipay");
            __CLR4_5_227he27helusyjx7l.R.inc(103068);company.setDescription("China's leading third-party online payment platform");
            __CLR4_5_227he27helusyjx7l.R.inc(103069);group.getCompanies().add(company);
        }
        {
            __CLR4_5_227he27helusyjx7l.R.inc(103070);Company company = new Company();
            __CLR4_5_227he27helusyjx7l.R.inc(103071);company.setId(createId());
            __CLR4_5_227he27helusyjx7l.R.inc(103072);company.setName("Alibaba Cloud Computing");
            __CLR4_5_227he27helusyjx7l.R.inc(103073);company.setDescription("Developer of advanced data-centric cloud computing services");
            __CLR4_5_227he27helusyjx7l.R.inc(103074);group.getCompanies().add(company);
        }
        {
            __CLR4_5_227he27helusyjx7l.R.inc(103075);Company company = new Company();
            __CLR4_5_227he27helusyjx7l.R.inc(103076);company.setId(createId());
            __CLR4_5_227he27helusyjx7l.R.inc(103077);company.setName("China Yahoo");
            __CLR4_5_227he27helusyjx7l.R.inc(103078);company.setDescription("One of China's leading Internet portals");
            __CLR4_5_227he27helusyjx7l.R.inc(103079);group.getCompanies().add(company);
        }

        __CLR4_5_227he27helusyjx7l.R.inc(103080);return group;
    }finally{__CLR4_5_227he27helusyjx7l.R.flushNeeded();}}

    private Long createId() {try{__CLR4_5_227he27helusyjx7l.R.inc(103081);
        __CLR4_5_227he27helusyjx7l.R.inc(103082);return idSeed.incrementAndGet();
    }finally{__CLR4_5_227he27helusyjx7l.R.flushNeeded();}}
}
