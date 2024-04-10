/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_dragoon26 extends TestCase {static class __CLR4_5_213oi13oilusyjrjk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,51490,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51426);
        __CLR4_5_213oi13oilusyjrjk.R.inc(51427);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_dragoon26");
    }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_213oi13oilusyjrjk.R.globalSliceStart(getClass().getName(),51428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp213ok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213oi13oilusyjrjk.R.rethrow($CLV_t2$);}finally{__CLR4_5_213oi13oilusyjrjk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_dragoon26.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp213ok() throws Exception{try{__CLR4_5_213oi13oilusyjrjk.R.inc(51428);
        __CLR4_5_213oi13oilusyjrjk.R.inc(51429);MonitorConfigMessage message = new MonitorConfigMessage();
        __CLR4_5_213oi13oilusyjrjk.R.inc(51430);MonitorConfig config = new MonitorConfig();
        __CLR4_5_213oi13oilusyjrjk.R.inc(51431);message.setContent(config);

        __CLR4_5_213oi13oilusyjrjk.R.inc(51432);AlarmReceiver receiver1 = new AlarmReceiver(2001L);
        __CLR4_5_213oi13oilusyjrjk.R.inc(51433);AlarmReceiver receiver2 = new AlarmReceiver(2002L);
        __CLR4_5_213oi13oilusyjrjk.R.inc(51434);AlarmReceiver receiver3 = new AlarmReceiver(2003L);

        __CLR4_5_213oi13oilusyjrjk.R.inc(51435);ArrayList<MonitorItem> items = new ArrayList<MonitorItem>();
        {
            __CLR4_5_213oi13oilusyjrjk.R.inc(51436);MonitorItem item1 = new MonitorItem();
            __CLR4_5_213oi13oilusyjrjk.R.inc(51437);item1.setId(1001L);

            __CLR4_5_213oi13oilusyjrjk.R.inc(51438);MonitorItemAlarmRule rule = new MonitorItemAlarmRule();

            __CLR4_5_213oi13oilusyjrjk.R.inc(51439);rule.getAlarmReceivers().add(receiver1);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51440);rule.getAlarmReceivers().add(receiver2);

            __CLR4_5_213oi13oilusyjrjk.R.inc(51441);item1.getRules().add(rule);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51442);items.add(item1);
        }

        {

            __CLR4_5_213oi13oilusyjrjk.R.inc(51443);MonitorItem item = new MonitorItem();
            __CLR4_5_213oi13oilusyjrjk.R.inc(51444);item.setId(1002L);

            __CLR4_5_213oi13oilusyjrjk.R.inc(51445);MonitorItemAlarmRule rule = new MonitorItemAlarmRule();

            __CLR4_5_213oi13oilusyjrjk.R.inc(51446);rule.getAlarmReceivers().add(receiver1);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51447);rule.getAlarmReceivers().add(receiver3);

            __CLR4_5_213oi13oilusyjrjk.R.inc(51448);item.getRules().add(rule);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51449);items.add(item);
        }
        {
            
            __CLR4_5_213oi13oilusyjrjk.R.inc(51450);MonitorItem item = new MonitorItem();
            __CLR4_5_213oi13oilusyjrjk.R.inc(51451);item.setId(1003L);
            
            __CLR4_5_213oi13oilusyjrjk.R.inc(51452);MonitorItemAlarmRule rule = new MonitorItemAlarmRule();
            
            __CLR4_5_213oi13oilusyjrjk.R.inc(51453);rule.getAlarmReceivers().add(receiver2);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51454);rule.getAlarmReceivers().add(receiver3);
            
            __CLR4_5_213oi13oilusyjrjk.R.inc(51455);item.getRules().add(rule);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51456);items.add(item);
        }

        __CLR4_5_213oi13oilusyjrjk.R.inc(51457);config.setMonitorItems(items);

        __CLR4_5_213oi13oilusyjrjk.R.inc(51458);String text = JSON.toJSONString(message, SerializerFeature.WriteClassName);
        __CLR4_5_213oi13oilusyjrjk.R.inc(51459);System.out.println(JSON.toJSONString(message, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat));

        __CLR4_5_213oi13oilusyjrjk.R.inc(51460);MonitorConfigMessage message2 = (MonitorConfigMessage) JSON.parse(text);
        __CLR4_5_213oi13oilusyjrjk.R.inc(51461);System.out.println(JSON.toJSONString(message2, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat));
    }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

    public static class MonitorConfigMessage {

        private Object content;

        public Object getContent() {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51462);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51463);return content;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

        public void setContent(Object content) {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51464);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51465);this.content = content;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

    }

    public static class MonitorConfig {

        private Map<Long, MonitorItem> monitorItems = new HashMap<Long, MonitorItem>();

        @JSONField(name = "MonitorItems")
        public Collection<MonitorItem> getMonitorItems() {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51466);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51467);return monitorItems.values();
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

        @JSONField(name = "MonitorItems")
        public void setMonitorItems(Collection<MonitorItem> items) {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51468);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51469);for (MonitorItem item : items) {{
                __CLR4_5_213oi13oilusyjrjk.R.inc(51470);this.monitorItems.put(item.getId(), item);
            }
        }}finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}
    }

    public static class MonitorItem extends MonitorItemBase<MonitorItemAlarmRule> {

    }

    public static class MonitorItemBase <K extends AlarmRuleBase> {

        private Long                       id;
        private List<K> rules = new ArrayList<K>();

        @JSONField(name = "mid")
        public Long getId() {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51471);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51472);return id;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

        @JSONField(name = "mid")
        public void setId(Long id) {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51473);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51474);this.id = id;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

        public List<K> getRules() {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51475);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51476);return rules;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

        public void setRules(List<K> rules) {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51477);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51478);this.rules = rules;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

    }
    
    public static class AlarmRuleBase {
        
    }

    public static class MonitorItemAlarmRule extends AlarmRuleBase {

        private List<AlarmReceiver> alarmReceivers = new ArrayList<AlarmReceiver>();

        public List<AlarmReceiver> getAlarmReceivers() {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51479);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51480);return alarmReceivers;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

        public void setAlarmReceivers(List<AlarmReceiver> alarmReceivers) {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51481);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51482);this.alarmReceivers = alarmReceivers;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

    }

    public static class AlarmReceiver {

        private Long id;

        public AlarmReceiver(){try{__CLR4_5_213oi13oilusyjrjk.R.inc(51483);

        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

        public AlarmReceiver(Long id){try{__CLR4_5_213oi13oilusyjrjk.R.inc(51484);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51485);this.id = id;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

        public Long getId() {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51486);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51487);return id;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_213oi13oilusyjrjk.R.inc(51488);
            __CLR4_5_213oi13oilusyjrjk.R.inc(51489);this.id = id;
        }finally{__CLR4_5_213oi13oilusyjrjk.R.flushNeeded();}}

    }
}
