/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

public class Bug_for_zhuangzaowen extends TestCase {static class __CLR4_5_2166r166rlusyjs2u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,54728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_zhuangzaowen() throws Exception {__CLR4_5_2166r166rlusyjs2u.R.globalSliceStart(getClass().getName(),54675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i5abm3166r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2166r166rlusyjs2u.R.rethrow($CLV_t2$);}finally{__CLR4_5_2166r166rlusyjs2u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_zhuangzaowen.test_for_zhuangzaowen",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i5abm3166r() throws Exception{try{__CLR4_5_2166r166rlusyjs2u.R.inc(54675);
        __CLR4_5_2166r166rlusyjs2u.R.inc(54676);String value = "{\"begin\":1340263804415,\"buildIds\":[\"42\"],\"end\":1340265305070,\"endBuildId\":\"50\",\"id\":\"4\",\"jobs\":[\"cb-intl-rfqma-UT\",\"cb-intl-rfqma-selenium\"],\"owners\":[\"wb_jianping.shenjp\"],\"triggerBuildId\":\"42\"}";
        __CLR4_5_2166r166rlusyjs2u.R.inc(54677);System.out.println(JSON.parseObject(value, JenkinsFailedPhase.class, Feature.DisableASM));
    }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

    public static class JenkinsFailedPhase {// extends BaseEntity<JenkinsFailedPhase> {

        private String             id;
        public static final String KEY_NAME_SPACE = "phase";

        private Set<String>        owners;

        private List<String>       buildIds;

        private Set<String>        jobs;

        private Date               begin;

        private Date               end;

        private String             endBuildId;

        private String             triggerBuildId;

        /*
         * @Override public String generateKey(String id) { return KeyUtils.generatePhaseKey(id); }
         */

        public Set<String> getOwners() {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54678);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54679);return owners;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void setOwners(Set<String> owners) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54680);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54681);this.owners = owners;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void addOwner(String owner) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54682);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54683);if ((((owners == null)&&(__CLR4_5_2166r166rlusyjs2u.R.iget(54684)!=0|true))||(__CLR4_5_2166r166rlusyjs2u.R.iget(54685)==0&false))) {{
                __CLR4_5_2166r166rlusyjs2u.R.inc(54686);owners = new HashSet<String>();
            }
            }__CLR4_5_2166r166rlusyjs2u.R.inc(54687);owners.add(owner);
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public List<String> getBuildIds() {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54688);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54689);return buildIds;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void setBuildIds(List<String> buildIds) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54690);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54691);this.buildIds = buildIds;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void addBuild(String bid) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54692);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54693);if ((((buildIds == null)&&(__CLR4_5_2166r166rlusyjs2u.R.iget(54694)!=0|true))||(__CLR4_5_2166r166rlusyjs2u.R.iget(54695)==0&false))) {{
                __CLR4_5_2166r166rlusyjs2u.R.inc(54696);buildIds = new ArrayList<String>();
            }
            }__CLR4_5_2166r166rlusyjs2u.R.inc(54697);buildIds.add(bid);
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public Set<String> getJobs() {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54698);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54699);return jobs;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void setJobs(Set<String> jobs) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54700);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54701);this.jobs = jobs;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void addJobs(String job) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54702);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54703);if ((((this.jobs == null)&&(__CLR4_5_2166r166rlusyjs2u.R.iget(54704)!=0|true))||(__CLR4_5_2166r166rlusyjs2u.R.iget(54705)==0&false))) {{
                __CLR4_5_2166r166rlusyjs2u.R.inc(54706);jobs = new HashSet<String>();
            }
            }__CLR4_5_2166r166rlusyjs2u.R.inc(54707);jobs.add(job);
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public Date getEnd() {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54708);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54709);return end;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void setEnd(Date end) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54710);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54711);this.end = end;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public Date getBegin() {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54712);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54713);return begin;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void setBegin(Date begin) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54714);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54715);this.begin = begin;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public String getEndBuildId() {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54716);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54717);return endBuildId;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void setEndBuildId(String endBuildId) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54718);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54719);this.endBuildId = endBuildId;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public String getTriggerBuildId() {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54720);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54721);return triggerBuildId;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void setTriggerBuildId(String triggerBuildId) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54722);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54723);this.triggerBuildId = triggerBuildId;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public String getId() {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54724);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54725);return id;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_5_2166r166rlusyjs2u.R.inc(54726);
            __CLR4_5_2166r166rlusyjs2u.R.inc(54727);this.id = id;
        }finally{__CLR4_5_2166r166rlusyjs2u.R.flushNeeded();}}

    }
}
