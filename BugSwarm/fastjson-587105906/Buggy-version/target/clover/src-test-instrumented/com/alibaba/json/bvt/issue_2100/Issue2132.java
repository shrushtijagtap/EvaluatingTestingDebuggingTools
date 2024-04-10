/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2100;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class Issue2132 extends TestCase {static class __CLR4_1_101dse1dseluszwbj5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,64592,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101dse1dseluszwbj5.R.globalSliceStart(getClass().getName(),64526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1dse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dse1dseluszwbj5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dse1dseluszwbj5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2132.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64526,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1dse() throws Exception{try{__CLR4_1_101dse1dseluszwbj5.R.inc(64526);
        __CLR4_1_101dse1dseluszwbj5.R.inc(64527);Cpu cpu = new Cpu("intel", 3.3);
        __CLR4_1_101dse1dseluszwbj5.R.inc(64528);Screen screen = new Screen(16, 9, "samsung");
        __CLR4_1_101dse1dseluszwbj5.R.inc(64529);Student student = new Student();
        __CLR4_1_101dse1dseluszwbj5.R.inc(64530);Computer computer = student.assembling(cpu,screen);
        __CLR4_1_101dse1dseluszwbj5.R.inc(64531);cpu.setName("intell");

        __CLR4_1_101dse1dseluszwbj5.R.inc(64532);Object[] objectArray = new Object[4];
        __CLR4_1_101dse1dseluszwbj5.R.inc(64533);objectArray[0] = cpu;
        __CLR4_1_101dse1dseluszwbj5.R.inc(64534);objectArray[1] = screen;
        __CLR4_1_101dse1dseluszwbj5.R.inc(64535);objectArray[2] = "2";
        __CLR4_1_101dse1dseluszwbj5.R.inc(64536);objectArray[3] = "3";
        __CLR4_1_101dse1dseluszwbj5.R.inc(64537);List<Object> list1 = new ArrayList<Object>();
        __CLR4_1_101dse1dseluszwbj5.R.inc(64538);list1.add(objectArray);
        __CLR4_1_101dse1dseluszwbj5.R.inc(64539);list1.add(computer);
        __CLR4_1_101dse1dseluszwbj5.R.inc(64540);String s = JSON.toJSONString(list1);

        __CLR4_1_101dse1dseluszwbj5.R.inc(64541);assertEquals("[[{\"name\":\"intell\",\"speed\":3.3},{\"height\":9,\"name\":\"samsung\",\"width\":16},\"2\",\"3\"],{\"cpu\":{\"$ref\":\"$[0][0]\"},\"screen\":{\"$ref\":\"$[0][1]\"}}]", s);
    }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

    public static class Cpu {
        private String name;
        private double speed;

        public Cpu(String name, double speed) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64542);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64543);this.name = name;
            __CLR4_1_101dse1dseluszwbj5.R.inc(64544);this.speed = speed;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64545);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64546);return name;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64547);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64548);this.name = name;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public double getSpeed() {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64549);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64550);return speed;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public void setSpeed(double speed) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64551);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64552);this.speed = speed;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}
    }

    public static class Screen {
        private int width;
        private int height;
        private String name;

        public Screen(int width, int height, String name) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64553);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64554);this.width = width;
            __CLR4_1_101dse1dseluszwbj5.R.inc(64555);this.height = height;
            __CLR4_1_101dse1dseluszwbj5.R.inc(64556);this.name = name;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public int getWidth() {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64557);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64558);return width;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public void setWidth(int width) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64559);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64560);this.width = width;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public int getHeight() {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64561);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64562);return height;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public void setHeight(int height) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64563);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64564);this.height = height;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64565);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64566);return name;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64567);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64568);this.name = name;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}
    }

    public static class Computer {
        Cpu cpu;
        Screen screen;

        public Computer(Cpu cpu, Screen screen) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64569);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64570);this.cpu = cpu;
            __CLR4_1_101dse1dseluszwbj5.R.inc(64571);this.screen = screen;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public Cpu getCpu() {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64572);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64573);return cpu;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public void setCpu(Cpu cpu) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64574);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64575);this.cpu = cpu;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public Screen getScreen() {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64576);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64577);return screen;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public void setScreen(Screen screen) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64578);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64579);this.screen = screen;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}
    }

    public static class Student {
        private Cpu cpu;
        private Screen screen;

        public Computer assembling(Cpu cpu, Screen screen) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64580);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64581);this.cpu = cpu;
            __CLR4_1_101dse1dseluszwbj5.R.inc(64582);this.screen = screen;

            __CLR4_1_101dse1dseluszwbj5.R.inc(64583);return new Computer(cpu, screen);
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public Cpu getCpu() {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64584);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64585);return cpu;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public void setCpu(Cpu cpu) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64586);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64587);this.cpu = cpu;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public Screen getScreen() {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64588);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64589);return screen;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}

        public void setScreen(Screen screen) {try{__CLR4_1_101dse1dseluszwbj5.R.inc(64590);
            __CLR4_1_101dse1dseluszwbj5.R.inc(64591);this.screen = screen;
        }finally{__CLR4_1_101dse1dseluszwbj5.R.flushNeeded();}}
    }
}
