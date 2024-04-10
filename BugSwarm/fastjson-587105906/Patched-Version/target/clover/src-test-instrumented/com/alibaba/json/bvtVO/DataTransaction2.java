/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

/**
 * \u4ea4\u6613\u6d88\u606f\u4f53
 * */
public class DataTransaction2 implements Serializable {public static class __CLR4_5_21z9y1z9ylusyjw6e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,92490,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1L;

    private Head head = new Head();

    private Body body = new Body();

    public DataTransaction2() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92374);

    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    /**
     * Head
     **/
    class Head {

        private String appid;

        private String transcode;

        private String seqno;

        private User user = new User();

        private Ret ret = new Ret();

        public Head() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92375);

        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        class User {
            private String id;

            public String getId() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92376);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92377);return id;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public void setId(String id) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92378);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92379);this.id = id;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}
        }

        /**
         * \u5904\u7406\u7ed3\u679c
         * */
        class Ret {
            private String code;
            private String msg;

            public String getCode() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92380);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92381);return code;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public void setCode(String code) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92382);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92383);this.code = code;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public String getMsg() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92384);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92385);return msg;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public void setMsg(String msg) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92386);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92387);this.msg = msg;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}
        }

        public String getAppid() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92388);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92389);return appid;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setAppid(String appid) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92390);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92391);this.appid = appid;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public String getTranscode() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92392);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92393);return transcode;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setTranscode(String transcode) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92394);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92395);this.transcode = transcode;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public String getSeqno() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92396);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92397);return seqno;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setSeqno(String seqno) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92398);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92399);this.seqno = seqno;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public User getUser() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92400);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92401);return user;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setUser(User user) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92402);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92403);this.user = user;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public Ret getRet() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92404);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92405);return ret;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setRet(Ret ret) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92406);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92407);this.ret = ret;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setRetCode(String code) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92408);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92409);this.ret.code = code;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setRetMsg(String msg) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92410);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92411);this.ret.msg = msg;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}
    }

    /**
     * Body
     * */
    @SuppressWarnings("rawtypes")
    class Body {

        private Param param = new Param();

        private DataSet dataset = new DataSet();

        public Body() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92412);

        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        /**
         * \u53c2\u6570
         * */
        class Param {
            private Limit limit = new Limit();

            private Map<String, String> form = new HashMap<String, String>();

            class Limit {
                private String start;
                private String size;
                private String total;

                public String getStart() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92413);
                    __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92414);return start;
                }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

                public void setStart(String start) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92415);
                    __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92416);this.start = start;
                }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

                public String getSize() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92417);
                    __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92418);return size;
                }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

                public void setSize(String size) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92419);
                    __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92420);this.size = size;
                }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

                public String getTotal() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92421);
                    __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92422);return total;
                }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

                public void setTotal(String total) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92423);
                    __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92424);this.total = total;
                }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}
            }

            public Limit getLimit() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92425);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92426);return limit;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public void setLimit(Limit limit) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92427);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92428);this.limit = limit;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public Map<String, String> getForm() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92429);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92430);return form;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public void setForm(Map<String, String> form) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92431);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92432);this.form = form;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}
        }

        /**
         * \u6570\u636e\u96c6
         * */
        class DataSet {
            private String total;

            private List rows = new ArrayList();

            public String getTotal() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92433);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92434);return total;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public void setTotal(String total) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92435);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92436);this.total = total;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public List getRows() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92437);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92438);return rows;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

            public void setRows(List rows) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92439);
                __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92440);this.rows = rows;
            }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}
        }

        public Param getParam() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92441);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92442);return param;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setParam(Param param) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92443);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92444);this.param = param;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public DataSet getDataset() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92445);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92446);return dataset;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setDataset(DataSet dataset) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92447);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92448);this.dataset = dataset;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

        public void setDataset(String total, List rows) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92449);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92450);DataSet ds = new DataSet();
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92451);ds.setTotal(total);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92452);ds.setRows(rows);
            __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92453);this.dataset = ds;
        }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}
    }

    public Head getHead() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92454);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92455);return head;
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    public Body getBody() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92456);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92457);return body;
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    public void setHead(Head head) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92458);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92459);this.head = head;
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    public void setBody(Body body) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92460);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92461);this.body = body;
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    /**
     * \u8bbe\u7f6e\u8fd4\u56de\u7684\u6d88\u606f\u4fe1\u606f
     * */
    public void setRetMsgCode(String code, String msg) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92462);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92463);this.head.setRetCode(code);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92464);this.head.setRetMsg(msg);
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    public void setRetMsgCode(String code) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92465);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92466);this.setRetMsgCode(code, null);
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    /**
     * \u8bbe\u7f6e\u8fd4\u56de\u7684\u7ed3\u679c\u96c6
     **/
    @SuppressWarnings("rawtypes")
    public void setDataSet(String total, List rows) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92467);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92468);this.body.setDataset(total, rows);
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    public static DataTransaction2 fromJSON(String jsonString) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92469);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92470);return JSON.parseObject(jsonString, DataTransaction2.class);
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    public String toJSON() {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92471);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92472);return JSON.toJSONString(this);
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}

    public static void main(String args[]) {try{__CLR4_5_21z9y1z9ylusyjw6e.R.inc(92473);

        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92474);String jsonString = "{'head' : {'appid':'epas','transcode' : '000000','seqno' : '111111111',        'user' : {          'id' : '00000'},        'ret' : {           'code' : '1',           'msg' : 'txt'}  },  'body' : {      param : {           form:{              name : '111',               sex : '1',              address : 'street1',                array : [ {                 id : '1',                   name : 'tom1'               }, {                    id : '2',                   name : 'tom2'               } ]},           limit : {               start : 1,              size : 25,              total : 100}        },      dataset : {         total : 1000,           rows : [ {              id : 'id',              name : 'name'           }, {                id : 'id',              name : 'name'           } ]     }   }}";
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92475);DataTransaction2 dt = DataTransaction2.fromJSON(jsonString);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92476);System.out.println(dt.toJSON());
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92477);DataTransaction2 dt1 = JSON.parseObject(dt.toJSON(), DataTransaction2.class);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92478);System.out.println(dt1.toJSON());
        
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92479);Assert.assertEquals(dt.toJSON(), dt1.toJSON());
        
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92480);System.out.println("=================");
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92481);System.out.println(dt.toJSON());
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92482);dt.setRetMsgCode("-1", "\u9519\u8bef");
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92483);dt.setDataSet("1000", new ArrayList<Map<String, Object>>());
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92484);System.out.println(dt.toJSON());
        
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92485);String text = dt.toJSON();
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92486);System.out.println(text);
        
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92487);DataTransaction2 dt2 = JSON.parseObject(text, DataTransaction2.class);
        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92488);System.out.println(JSON.toJSONString(dt2));

        __CLR4_5_21z9y1z9ylusyjw6e.R.inc(92489);Assert.assertEquals(dt.toJSON(), dt2.toJSON());
    }finally{__CLR4_5_21z9y1z9ylusyjw6e.R.flushNeeded();}}
}
