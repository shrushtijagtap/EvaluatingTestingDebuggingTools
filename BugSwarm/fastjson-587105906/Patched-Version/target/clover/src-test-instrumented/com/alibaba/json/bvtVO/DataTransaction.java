/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * \u4ea4\u6613\u6d88\u606f\u4f53
 */
@SuppressWarnings("rawtypes")
public class DataTransaction implements Serializable {public static class __CLR4_5_2204w204wlusvnj0l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,93606,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1L;

    private Head              head             = new Head();

    private Body              body             = new Body();

    public DataTransaction(){try{__CLR4_5_2204w204wlusvnj0l.R.inc(93488);

    }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

    /**
     * Head
     **/
    public static class Head {

        private String appid;

        private String transcode;

        private String seqno;

        private User   user = new User();

        private Ret    ret  = new Ret();

        /**
         * \u7528\u6237\u4fe1\u606f
         */
        public static class User {

            private String id;

            public String getId() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93489);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93490);return id;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public void setId(String id) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93491);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93492);this.id = id;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}
        }

        /**
         * \u5904\u7406\u7ed3\u679c
         */
        public static class Ret {

            private String code;
            private String msg;

            public String getCode() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93493);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93494);return code;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public void setCode(String code) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93495);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93496);this.code = code;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public String getMsg() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93497);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93498);return msg;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public void setMsg(String msg) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93499);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93500);this.msg = msg;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}
        }

        public String getAppid() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93501);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93502);return appid;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setAppid(String appid) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93503);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93504);this.appid = appid;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public String getTranscode() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93505);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93506);return transcode;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setTranscode(String transcode) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93507);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93508);this.transcode = transcode;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public String getSeqno() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93509);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93510);return seqno;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setSeqno(String seqno) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93511);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93512);this.seqno = seqno;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public User getUser() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93513);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93514);return user;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setUser(User user) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93515);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93516);this.user = user;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public Ret getRet() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93517);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93518);return ret;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setRet(Ret ret) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93519);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93520);this.ret = ret;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setRetCode(String code) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93521);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93522);this.ret.code = code;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setRetMsg(String msg) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93523);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93524);this.ret.msg = msg;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}
    }

    /**
     * Body
     */
    public static class Body {

        private Param   param = new Param();

        private DataSet dataset;

        public Body(){try{__CLR4_5_2204w204wlusvnj0l.R.inc(93525);

        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        /**
         * \u53c2\u6570
         */
        public static class Param {

            private Limit               limit = new Limit();

            private Map<String, String> form  = new HashMap<String, String>();

            /**
             * \u5206\u9875\u4fe1\u606f
             */
            public static class Limit {

                private String start;
                private String size;
                private String total;
                private String orderBy;

                public String getStart() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93526);
                    __CLR4_5_2204w204wlusvnj0l.R.inc(93527);return start;
                }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

                public void setStart(String start) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93528);
                    __CLR4_5_2204w204wlusvnj0l.R.inc(93529);this.start = start;
                }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

                public String getSize() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93530);
                    __CLR4_5_2204w204wlusvnj0l.R.inc(93531);return size;
                }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

                public void setSize(String size) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93532);
                    __CLR4_5_2204w204wlusvnj0l.R.inc(93533);this.size = size;
                }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

                public String getTotal() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93534);
                    __CLR4_5_2204w204wlusvnj0l.R.inc(93535);return total;
                }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

                public void setTotal(String total) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93536);
                    __CLR4_5_2204w204wlusvnj0l.R.inc(93537);this.total = total;
                }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

                public String getOrderBy() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93538);
                    __CLR4_5_2204w204wlusvnj0l.R.inc(93539);return orderBy;
                }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

                public void setOrderBy(String orderBy) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93540);
                    __CLR4_5_2204w204wlusvnj0l.R.inc(93541);this.orderBy = orderBy;
                }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}
            }

            public Limit getLimit() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93542);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93543);return limit;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public void setLimit(Limit limit) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93544);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93545);this.limit = limit;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public Map<String, String> getForm() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93546);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93547);return form;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public void setForm(Map<String, String> form) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93548);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93549);this.form = form;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}
        }

        /**
         * \u6570\u636e\u96c6
         */
        public static class DataSet {

            private String total;

            private List   rows = new ArrayList();

            public String getTotal() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93550);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93551);return total;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public void setTotal(String total) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93552);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93553);this.total = total;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public List getRows() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93554);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93555);return rows;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

            public void setRows(List rows) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93556);
                __CLR4_5_2204w204wlusvnj0l.R.inc(93557);this.rows = rows;
            }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}
        }

        public Param getParam() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93558);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93559);return param;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setParam(Param param) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93560);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93561);this.param = param;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public DataSet getDataset() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93562);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93563);return dataset;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setDataset(DataSet dataset) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93564);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93565);this.dataset = dataset;
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

        public void setDataset(String total, List rows) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93566);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93567);DataSet ds = new DataSet();
            __CLR4_5_2204w204wlusvnj0l.R.inc(93568);ds.setTotal(total);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93569);ds.setRows(rows);
            __CLR4_5_2204w204wlusvnj0l.R.inc(93570);this.setDataset(ds);
        }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}
    }

    public Head getHead() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93571);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93572);return head;
    }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

    public Body getBody() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93573);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93574);return body;
    }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

    public void setRetMsgCode(String code, String msg) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93575);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93576);this.head.setRetCode(code);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93577);this.head.setRetMsg(msg);
    }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

    public void setRetMsgCode(String code) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93578);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93579);this.setRetMsgCode(code, null);
    }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

    public void setDataSet(String total, List rows) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93580);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93581);this.body.setDataset(total, rows);
    }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

    public static DataTransaction fromJSON(String jsonString) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93582);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93583);return JSON.parseObject(jsonString, DataTransaction.class);
    }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

    public String toJSON() {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93584);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93585);return JSON.toJSONString(this);
    }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}

    public static void main(String args[]) {try{__CLR4_5_2204w204wlusvnj0l.R.inc(93586);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93587);DataTransaction dt = new DataTransaction();

        __CLR4_5_2204w204wlusvnj0l.R.inc(93588);List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        __CLR4_5_2204w204wlusvnj0l.R.inc(93589);Map<String, Object> m = new HashMap<String, Object>();
        __CLR4_5_2204w204wlusvnj0l.R.inc(93590);m.put("name", "tom");
        __CLR4_5_2204w204wlusvnj0l.R.inc(93591);m.put("sex", "m");
        __CLR4_5_2204w204wlusvnj0l.R.inc(93592);list.add(m);

        __CLR4_5_2204w204wlusvnj0l.R.inc(93593);dt.setDataSet("1000", list);
        __CLR4_5_2204w204wlusvnj0l.R.inc(93594);dt.setRetMsgCode("1", "ok");
        __CLR4_5_2204w204wlusvnj0l.R.inc(93595);dt.getHead().setAppid("back");
        __CLR4_5_2204w204wlusvnj0l.R.inc(93596);dt.getHead().setSeqno("201010");
        __CLR4_5_2204w204wlusvnj0l.R.inc(93597);dt.getHead().getUser().setId("root");

        __CLR4_5_2204w204wlusvnj0l.R.inc(93598);Map<String, String> m2 = new HashMap<String, String>();
        __CLR4_5_2204w204wlusvnj0l.R.inc(93599);m2.put("name1", "tom");
        __CLR4_5_2204w204wlusvnj0l.R.inc(93600);m2.put("name2", "tom");
        __CLR4_5_2204w204wlusvnj0l.R.inc(93601);m2.put("name3", "tom");

        __CLR4_5_2204w204wlusvnj0l.R.inc(93602);dt.getBody().getParam().setForm(m2);

        __CLR4_5_2204w204wlusvnj0l.R.inc(93603);System.out.println(dt.toJSON());

        __CLR4_5_2204w204wlusvnj0l.R.inc(93604);DataTransaction dt2 = DataTransaction.fromJSON(dt.toJSON());
        __CLR4_5_2204w204wlusvnj0l.R.inc(93605);System.out.println(dt2.toJSON());
    }finally{__CLR4_5_2204w204wlusvnj0l.R.flushNeeded();}}
}
