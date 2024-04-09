/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvtVO;

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
public class DataTransaction implements Serializable {public static class __CLR4_1_101z6z1z6zlusqkp4r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,92385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1L;

    private Head              head             = new Head();

    private Body              body             = new Body();

    public DataTransaction(){try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92267);

    }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

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

            public String getId() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92268);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92269);return id;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public void setId(String id) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92270);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92271);this.id = id;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}
        }

        /**
         * \u5904\u7406\u7ed3\u679c
         */
        public static class Ret {

            private String code;
            private String msg;

            public String getCode() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92272);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92273);return code;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public void setCode(String code) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92274);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92275);this.code = code;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public String getMsg() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92276);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92277);return msg;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public void setMsg(String msg) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92278);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92279);this.msg = msg;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}
        }

        public String getAppid() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92280);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92281);return appid;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setAppid(String appid) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92282);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92283);this.appid = appid;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public String getTranscode() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92284);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92285);return transcode;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setTranscode(String transcode) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92286);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92287);this.transcode = transcode;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public String getSeqno() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92288);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92289);return seqno;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setSeqno(String seqno) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92290);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92291);this.seqno = seqno;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public User getUser() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92292);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92293);return user;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setUser(User user) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92294);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92295);this.user = user;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public Ret getRet() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92296);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92297);return ret;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setRet(Ret ret) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92298);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92299);this.ret = ret;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setRetCode(String code) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92300);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92301);this.ret.code = code;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setRetMsg(String msg) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92302);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92303);this.ret.msg = msg;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}
    }

    /**
     * Body
     */
    public static class Body {

        private Param   param = new Param();

        private DataSet dataset;

        public Body(){try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92304);

        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

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

                public String getStart() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92305);
                    __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92306);return start;
                }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

                public void setStart(String start) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92307);
                    __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92308);this.start = start;
                }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

                public String getSize() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92309);
                    __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92310);return size;
                }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

                public void setSize(String size) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92311);
                    __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92312);this.size = size;
                }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

                public String getTotal() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92313);
                    __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92314);return total;
                }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

                public void setTotal(String total) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92315);
                    __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92316);this.total = total;
                }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

                public String getOrderBy() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92317);
                    __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92318);return orderBy;
                }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

                public void setOrderBy(String orderBy) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92319);
                    __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92320);this.orderBy = orderBy;
                }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}
            }

            public Limit getLimit() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92321);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92322);return limit;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public void setLimit(Limit limit) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92323);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92324);this.limit = limit;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public Map<String, String> getForm() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92325);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92326);return form;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public void setForm(Map<String, String> form) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92327);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92328);this.form = form;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}
        }

        /**
         * \u6570\u636e\u96c6
         */
        public static class DataSet {

            private String total;

            private List   rows = new ArrayList();

            public String getTotal() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92329);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92330);return total;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public void setTotal(String total) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92331);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92332);this.total = total;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public List getRows() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92333);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92334);return rows;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

            public void setRows(List rows) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92335);
                __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92336);this.rows = rows;
            }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}
        }

        public Param getParam() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92337);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92338);return param;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setParam(Param param) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92339);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92340);this.param = param;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public DataSet getDataset() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92341);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92342);return dataset;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setDataset(DataSet dataset) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92343);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92344);this.dataset = dataset;
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

        public void setDataset(String total, List rows) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92345);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92346);DataSet ds = new DataSet();
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92347);ds.setTotal(total);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92348);ds.setRows(rows);
            __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92349);this.setDataset(ds);
        }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}
    }

    public Head getHead() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92350);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92351);return head;
    }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

    public Body getBody() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92352);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92353);return body;
    }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

    public void setRetMsgCode(String code, String msg) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92354);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92355);this.head.setRetCode(code);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92356);this.head.setRetMsg(msg);
    }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

    public void setRetMsgCode(String code) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92357);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92358);this.setRetMsgCode(code, null);
    }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

    public void setDataSet(String total, List rows) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92359);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92360);this.body.setDataset(total, rows);
    }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

    public static DataTransaction fromJSON(String jsonString) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92361);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92362);return JSON.parseObject(jsonString, DataTransaction.class);
    }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

    public String toJSON() {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92363);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92364);return JSON.toJSONString(this);
    }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}

    public static void main(String args[]) {try{__CLR4_1_101z6z1z6zlusqkp4r.R.inc(92365);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92366);DataTransaction dt = new DataTransaction();

        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92367);List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92368);Map<String, Object> m = new HashMap<String, Object>();
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92369);m.put("name", "tom");
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92370);m.put("sex", "m");
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92371);list.add(m);

        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92372);dt.setDataSet("1000", list);
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92373);dt.setRetMsgCode("1", "ok");
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92374);dt.getHead().setAppid("back");
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92375);dt.getHead().setSeqno("201010");
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92376);dt.getHead().getUser().setId("root");

        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92377);Map<String, String> m2 = new HashMap<String, String>();
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92378);m2.put("name1", "tom");
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92379);m2.put("name2", "tom");
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92380);m2.put("name3", "tom");

        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92381);dt.getBody().getParam().setForm(m2);

        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92382);System.out.println(dt.toJSON());

        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92383);DataTransaction dt2 = DataTransaction.fromJSON(dt.toJSON());
        __CLR4_1_101z6z1z6zlusqkp4r.R.inc(92384);System.out.println(dt2.toJSON());
    }finally{__CLR4_1_101z6z1z6zlusqkp4r.R.flushNeeded();}}
}
