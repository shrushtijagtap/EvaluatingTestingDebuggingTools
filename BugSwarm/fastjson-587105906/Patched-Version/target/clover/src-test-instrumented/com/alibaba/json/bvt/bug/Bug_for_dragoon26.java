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

public class Bug_for_dragoon26 extends TestCase {static class __CLR4_5_214mq14mqlusvn646{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,52722,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_214mq14mqlusvn646.R.inc(52658);
        __CLR4_5_214mq14mqlusvn646.R.inc(52659);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_dragoon26");
    }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_214mq14mqlusvn646.R.globalSliceStart(getClass().getName(),52660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp214ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214mq14mqlusvn646.R.rethrow($CLV_t2$);}finally{__CLR4_5_214mq14mqlusvn646.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_dragoon26.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp214ms() throws Exception{try{__CLR4_5_214mq14mqlusvn646.R.inc(52660);
        __CLR4_5_214mq14mqlusvn646.R.inc(52661);MonitorConfigMessage message = new MonitorConfigMessage();
        __CLR4_5_214mq14mqlusvn646.R.inc(52662);MonitorConfig config = new MonitorConfig();
        __CLR4_5_214mq14mqlusvn646.R.inc(52663);message.setContent(config);

        __CLR4_5_214mq14mqlusvn646.R.inc(52664);AlarmReceiver receiver1 = new AlarmReceiver(2001L);
        __CLR4_5_214mq14mqlusvn646.R.inc(52665);AlarmReceiver receiver2 = new AlarmReceiver(2002L);
        __CLR4_5_214mq14mqlusvn646.R.inc(52666);AlarmReceiver receiver3 = new AlarmReceiver(2003L);

        __CLR4_5_214mq14mqlusvn646.R.inc(52667);ArrayList<MonitorItem> items = new ArrayList<MonitorItem>();
        {
            __CLR4_5_214mq14mqlusvn646.R.inc(52668);MonitorItem item1 = new MonitorItem();
            __CLR4_5_214mq14mqlusvn646.R.inc(52669);item1.setId(1001L);

            __CLR4_5_214mq14mqlusvn646.R.inc(52670);MonitorItemAlarmRule rule = new MonitorItemAlarmRule();

            __CLR4_5_214mq14mqlusvn646.R.inc(52671);rule.getAlarmReceivers().add(receiver1);
            __CLR4_5_214mq14mqlusvn646.R.inc(52672);rule.getAlarmReceivers().add(receiver2);

            __CLR4_5_214mq14mqlusvn646.R.inc(52673);item1.getRules().add(rule);
            __CLR4_5_214mq14mqlusvn646.R.inc(52674);items.add(item1);
        }

        {

            __CLR4_5_214mq14mqlusvn646.R.inc(52675);MonitorItem item = new MonitorItem();
            __CLR4_5_214mq14mqlusvn646.R.inc(52676);item.setId(1002L);

            __CLR4_5_214mq14mqlusvn646.R.inc(52677);MonitorItemAlarmRule rule = new MonitorItemAlarmRule();

            __CLR4_5_214mq14mqlusvn646.R.inc(52678);rule.getAlarmReceivers().add(receiver1);
            __CLR4_5_214mq14mqlusvn646.R.inc(52679);rule.getAlarmReceivers().add(receiver3);

            __CLR4_5_214mq14mqlusvn646.R.inc(52680);item.getRules().add(rule);
            __CLR4_5_214mq14mqlusvn646.R.inc(52681);items.add(item);
        }
        {
            
            __CLR4_5_214mq14mqlusvn646.R.inc(52682);MonitorItem item = new MonitorItem();
            __CLR4_5_214mq14mqlusvn646.R.inc(52683);item.setId(1003L);
            
            __CLR4_5_214mq14mqlusvn646.R.inc(52684);MonitorItemAlarmRule rule = new MonitorItemAlarmRule();
            
            __CLR4_5_214mq14mqlusvn646.R.inc(52685);rule.getAlarmReceivers().add(receiver2);
            __CLR4_5_214mq14mqlusvn646.R.inc(52686);rule.getAlarmReceivers().add(receiver3);
            
            __CLR4_5_214mq14mqlusvn646.R.inc(52687);item.getRules().add(rule);
            __CLR4_5_214mq14mqlusvn646.R.inc(52688);items.add(item);
        }

        __CLR4_5_214mq14mqlusvn646.R.inc(52689);config.setMonitorItems(items);

        __CLR4_5_214mq14mqlusvn646.R.inc(52690);String text = JSON.toJSONString(message, SerializerFeature.WriteClassName);
        __CLR4_5_214mq14mqlusvn646.R.inc(52691);System.out.println(JSON.toJSONString(message, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat));

        __CLR4_5_214mq14mqlusvn646.R.inc(52692);MonitorConfigMessage message2 = (MonitorConfigMessage) JSON.parse(text);
        __CLR4_5_214mq14mqlusvn646.R.inc(52693);System.out.println(JSON.toJSONString(message2, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat));
    }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

    public static class MonitorConfigMessage {

        private Object content;

        public Object getContent() {try{__CLR4_5_214mq14mqlusvn646.R.inc(52694);
            __CLR4_5_214mq14mqlusvn646.R.inc(52695);return content;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

        public void setContent(Object content) {try{__CLR4_5_214mq14mqlusvn646.R.inc(52696);
            __CLR4_5_214mq14mqlusvn646.R.inc(52697);this.content = content;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

    }

    public static class MonitorConfig {

        private Map<Long, MonitorItem> monitorItems = new HashMap<Long, MonitorItem>();

        @JSONField(name = "MonitorItems")
        public Collection<MonitorItem> getMonitorItems() {try{__CLR4_5_214mq14mqlusvn646.R.inc(52698);
            __CLR4_5_214mq14mqlusvn646.R.inc(52699);return monitorItems.values();
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

        @JSONField(name = "MonitorItems")
        public void setMonitorItems(Collection<MonitorItem> items) {try{__CLR4_5_214mq14mqlusvn646.R.inc(52700);
            __CLR4_5_214mq14mqlusvn646.R.inc(52701);for (MonitorItem item : items) {{
                __CLR4_5_214mq14mqlusvn646.R.inc(52702);this.monitorItems.put(item.getId(), item);
            }
        }}finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}
    }

    public static class MonitorItem extends MonitorItemBase<MonitorItemAlarmRule> {

    }

    public static class MonitorItemBase <K extends AlarmRuleBase> {

        private Long                       id;
        private List<K> rules = new ArrayList<K>();

        @JSONField(name = "mid")
        public Long getId() {try{__CLR4_5_214mq14mqlusvn646.R.inc(52703);
            __CLR4_5_214mq14mqlusvn646.R.inc(52704);return id;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

        @JSONField(name = "mid")
        public void setId(Long id) {try{__CLR4_5_214mq14mqlusvn646.R.inc(52705);
            __CLR4_5_214mq14mqlusvn646.R.inc(52706);this.id = id;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

        public List<K> getRules() {try{__CLR4_5_214mq14mqlusvn646.R.inc(52707);
            __CLR4_5_214mq14mqlusvn646.R.inc(52708);return rules;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

        public void setRules(List<K> rules) {try{__CLR4_5_214mq14mqlusvn646.R.inc(52709);
            __CLR4_5_214mq14mqlusvn646.R.inc(52710);this.rules = rules;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

    }
    
    public static class AlarmRuleBase {
        
    }

    public static class MonitorItemAlarmRule extends AlarmRuleBase {

        private List<AlarmReceiver> alarmReceivers = new ArrayList<AlarmReceiver>();

        public List<AlarmReceiver> getAlarmReceivers() {try{__CLR4_5_214mq14mqlusvn646.R.inc(52711);
            __CLR4_5_214mq14mqlusvn646.R.inc(52712);return alarmReceivers;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

        public void setAlarmReceivers(List<AlarmReceiver> alarmReceivers) {try{__CLR4_5_214mq14mqlusvn646.R.inc(52713);
            __CLR4_5_214mq14mqlusvn646.R.inc(52714);this.alarmReceivers = alarmReceivers;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

    }

    public static class AlarmReceiver {

        private Long id;

        public AlarmReceiver(){try{__CLR4_5_214mq14mqlusvn646.R.inc(52715);

        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

        public AlarmReceiver(Long id){try{__CLR4_5_214mq14mqlusvn646.R.inc(52716);
            __CLR4_5_214mq14mqlusvn646.R.inc(52717);this.id = id;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

        public Long getId() {try{__CLR4_5_214mq14mqlusvn646.R.inc(52718);
            __CLR4_5_214mq14mqlusvn646.R.inc(52719);return id;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_214mq14mqlusvn646.R.inc(52720);
            __CLR4_5_214mq14mqlusvn646.R.inc(52721);this.id = id;
        }finally{__CLR4_5_214mq14mqlusvn646.R.flushNeeded();}}

    }
}
