/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class Bug_for_42283905_1 extends TestCase {static class __CLR4_1_1013vb13vbluszw7fl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,51718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_1013vb13vbluszw7fl.R.globalSliceStart(getClass().getName(),51671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp213vb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013vb13vbluszw7fl.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013vb13vbluszw7fl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_42283905_1.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51671,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp213vb() throws Exception{try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51671);

        __CLR4_1_1013vb13vbluszw7fl.R.inc(51672);String text;
        {
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51673);List<Group> groups = new ArrayList<Group>();

            __CLR4_1_1013vb13vbluszw7fl.R.inc(51674);Command c0 = new Command(1);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51675);Command c1 = new Command(2);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51676);Command c2 = new Command(3);

            __CLR4_1_1013vb13vbluszw7fl.R.inc(51677);c1.setPre(c0);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51678);c2.setPre(c1);

            {
                __CLR4_1_1013vb13vbluszw7fl.R.inc(51679);Group group = new Group("g0");
                __CLR4_1_1013vb13vbluszw7fl.R.inc(51680);group.getBattleCommandList().add(c0);
                __CLR4_1_1013vb13vbluszw7fl.R.inc(51681);groups.add(group);
            }

            {
                __CLR4_1_1013vb13vbluszw7fl.R.inc(51682);Group group = new Group("g1");
                __CLR4_1_1013vb13vbluszw7fl.R.inc(51683);group.getBattleCommandList().add(c1);
                __CLR4_1_1013vb13vbluszw7fl.R.inc(51684);groups.add(group);
            }
            
            {
                __CLR4_1_1013vb13vbluszw7fl.R.inc(51685);Group group = new Group("g2");
                __CLR4_1_1013vb13vbluszw7fl.R.inc(51686);group.getBattleCommandList().add(c2);
                __CLR4_1_1013vb13vbluszw7fl.R.inc(51687);groups.add(group);
            }
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51688);text = JSON.toJSONString(groups);
        }

        __CLR4_1_1013vb13vbluszw7fl.R.inc(51689);System.out.println(text);

        __CLR4_1_1013vb13vbluszw7fl.R.inc(51690);Group[] groups = JSON.parseObject(text, new TypeReference<Group[]>() {
        });
        __CLR4_1_1013vb13vbluszw7fl.R.inc(51691);Group g0 = groups[0];
        __CLR4_1_1013vb13vbluszw7fl.R.inc(51692);Group g1 = groups[1];

        __CLR4_1_1013vb13vbluszw7fl.R.inc(51693);System.out.println(JSON.toJSONString(groups));
    }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

    public static class Group {

        private String        name;

        private List<Command> battleCommandList = new ArrayList<Command>();

        public Group(){try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51694);

        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public Group(String name){try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51695);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51696);this.name = name;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public List<Command> getBattleCommandList() {try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51697);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51698);return battleCommandList;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public void setBattleCommandList(List<Command> battleCommandList) {try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51699);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51700);this.battleCommandList = battleCommandList;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51701);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51702);return name;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51703);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51704);this.name = name;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

    }

    public static class Command {

        private int id;

        public Command(){try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51705);

        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public Command(int id){try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51706);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51707);this.id = id;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51708);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51709);return id;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51710);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51711);this.id = id;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        private Command pre;

        public Command getPre() {try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51712);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51713);return pre;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public void setPre(Command pre) {try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51714);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51715);this.pre = pre;
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}

        public String toString() {try{__CLR4_1_1013vb13vbluszw7fl.R.inc(51716);
            __CLR4_1_1013vb13vbluszw7fl.R.inc(51717);return "{id:" + id + "}";
        }finally{__CLR4_1_1013vb13vbluszw7fl.R.flushNeeded();}}
    }
}
