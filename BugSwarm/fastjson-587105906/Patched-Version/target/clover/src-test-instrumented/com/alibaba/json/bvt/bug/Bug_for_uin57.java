/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class Bug_for_uin57 extends TestCase {static class __CLR4_5_216nj16njlusvn79l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,55329,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_multiArray() throws Exception {__CLR4_5_216nj16njlusvn79l.R.globalSliceStart(getClass().getName(),55279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ii659016nj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216nj16njlusvn79l.R.rethrow($CLV_t2$);}finally{__CLR4_5_216nj16njlusvn79l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_uin57.test_multiArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55279,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ii659016nj() throws Exception{try{__CLR4_5_216nj16njlusvn79l.R.inc(55279);
        __CLR4_5_216nj16njlusvn79l.R.inc(55280);String jsonString = "{\"block\":{\"boxList\":[{\"dx\":1,\"dy\":1},{\"dx\":0,\"dy\":0},{\"dx\":0,\"dy\":2},{\"dx\":2,\"dy\":0},{\"dx\":2,\"dy\":2}],\"centerBox\":{\"dx\":1,\"dy\":1},\"offsetX\":0,\"offsetY\":0},\"boxs\":[[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null],[null,null,null,null,null,null,null,null,null,null,null,null]]}";

        __CLR4_5_216nj16njlusvn79l.R.inc(55281);GameSnapShot gs = JSON.parseObject(jsonString, GameSnapShot.class);

        __CLR4_5_216nj16njlusvn79l.R.inc(55282);Block block = gs.getBlock();
        __CLR4_5_216nj16njlusvn79l.R.inc(55283);Assert.assertEquals(5, block.getBoxList().size());
        __CLR4_5_216nj16njlusvn79l.R.inc(55284);Assert.assertEquals(1, block.getBoxList().get(0).getX());
        __CLR4_5_216nj16njlusvn79l.R.inc(55285);Assert.assertEquals(1, block.getBoxList().get(0).getY());
        __CLR4_5_216nj16njlusvn79l.R.inc(55286);Assert.assertEquals(0, block.getBoxList().get(2).getX());
        __CLR4_5_216nj16njlusvn79l.R.inc(55287);Assert.assertEquals(2, block.getBoxList().get(2).getY());
        
        __CLR4_5_216nj16njlusvn79l.R.inc(55288);Box[][] boxs = gs.getBoxs();
        __CLR4_5_216nj16njlusvn79l.R.inc(55289);Assert.assertEquals(20, boxs.length);
        __CLR4_5_216nj16njlusvn79l.R.inc(55290);Assert.assertEquals(12, boxs[0].length);
    }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

    public static class GameSnapShot implements Serializable {

        /**
         * 
         */
        private static final long serialVersionUID = 8755961532274905269L;
        protected Box[][]         boxs             = null;
        private Block             block;

        public GameSnapShot(){
            super();__CLR4_5_216nj16njlusvn79l.R.inc(55292);try{__CLR4_5_216nj16njlusvn79l.R.inc(55291);
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public GameSnapShot(Box[][] boxs, Block block){
            super();__CLR4_5_216nj16njlusvn79l.R.inc(55294);try{__CLR4_5_216nj16njlusvn79l.R.inc(55293);
            __CLR4_5_216nj16njlusvn79l.R.inc(55295);this.boxs = boxs;
            __CLR4_5_216nj16njlusvn79l.R.inc(55296);this.block = block;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public Box[][] getBoxs() {try{__CLR4_5_216nj16njlusvn79l.R.inc(55297);
            __CLR4_5_216nj16njlusvn79l.R.inc(55298);return boxs;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public void setBoxs(Box[][] boxs) {try{__CLR4_5_216nj16njlusvn79l.R.inc(55299);
            __CLR4_5_216nj16njlusvn79l.R.inc(55300);this.boxs = boxs;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public Block getBlock() {try{__CLR4_5_216nj16njlusvn79l.R.inc(55301);
            __CLR4_5_216nj16njlusvn79l.R.inc(55302);return block;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public void setBlock(Block block) {try{__CLR4_5_216nj16njlusvn79l.R.inc(55303);
            __CLR4_5_216nj16njlusvn79l.R.inc(55304);this.block = block;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

    }

    public static class Box {

        @JSONField(name = "dx")
        private int x;

        @JSONField(name = "dy")
        private int y;

        public int getX() {try{__CLR4_5_216nj16njlusvn79l.R.inc(55305);
            __CLR4_5_216nj16njlusvn79l.R.inc(55306);return x;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public void setX(int x) {try{__CLR4_5_216nj16njlusvn79l.R.inc(55307);
            __CLR4_5_216nj16njlusvn79l.R.inc(55308);this.x = x;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public int getY() {try{__CLR4_5_216nj16njlusvn79l.R.inc(55309);
            __CLR4_5_216nj16njlusvn79l.R.inc(55310);return y;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public void setY(int y) {try{__CLR4_5_216nj16njlusvn79l.R.inc(55311);
            __CLR4_5_216nj16njlusvn79l.R.inc(55312);this.y = y;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

    }

    public static class Block {

        private List<Box> boxList = new ArrayList<Box>();

        private Box       centerBox;

        private int       offsetX;

        private int       offsetY;

        public int getOffsetX() {try{__CLR4_5_216nj16njlusvn79l.R.inc(55313);
            __CLR4_5_216nj16njlusvn79l.R.inc(55314);return offsetX;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public void setOffsetX(int offsetX) {try{__CLR4_5_216nj16njlusvn79l.R.inc(55315);
            __CLR4_5_216nj16njlusvn79l.R.inc(55316);this.offsetX = offsetX;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public int getOffsetY() {try{__CLR4_5_216nj16njlusvn79l.R.inc(55317);
            __CLR4_5_216nj16njlusvn79l.R.inc(55318);return offsetY;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public void setOffsetY(int offsetY) {try{__CLR4_5_216nj16njlusvn79l.R.inc(55319);
            __CLR4_5_216nj16njlusvn79l.R.inc(55320);this.offsetY = offsetY;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public Box getCenterBox() {try{__CLR4_5_216nj16njlusvn79l.R.inc(55321);
            __CLR4_5_216nj16njlusvn79l.R.inc(55322);return centerBox;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public void setCenterBox(Box centerBox) {try{__CLR4_5_216nj16njlusvn79l.R.inc(55323);
            __CLR4_5_216nj16njlusvn79l.R.inc(55324);this.centerBox = centerBox;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public List<Box> getBoxList() {try{__CLR4_5_216nj16njlusvn79l.R.inc(55325);
            __CLR4_5_216nj16njlusvn79l.R.inc(55326);return boxList;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

        public void setBoxList(List<Box> boxList) {try{__CLR4_5_216nj16njlusvn79l.R.inc(55327);
            __CLR4_5_216nj16njlusvn79l.R.inc(55328);this.boxList = boxList;
        }finally{__CLR4_5_216nj16njlusvn79l.R.flushNeeded();}}

    }
}
