/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvtVO.vip_com;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class QueryLoanOrderRsp {public static class __CLR4_1_1020xi20xiluszwh4i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,94561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private String loan_card_no;
  private String loan_prod_code;
  private String last_row_type;//\u6700\u540e\u4e00\u6761\u8bb0\u5f55\u7c7b\u578b
  private String last_row_key;//\u6700\u540e\u4e00\u6761\u8bb0\u5f55\u952e\u503c
  private String nextpage_flag;//\u662f\u5426\u6709\u4e0b\u4e00\u9875\u6807\u5fd7
  private List<TxnListItsm> txn_list;

  

  public QueryLoanOrderRsp() {
    super();__CLR4_1_1020xi20xiluszwh4i.R.inc(94519);try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94518);
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public String getLoan_card_no() {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94520);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94521);return loan_card_no;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public void setLoan_card_no(String loan_card_no) {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94522);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94523);this.loan_card_no = loan_card_no;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public String getLoan_prod_code() {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94524);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94525);return loan_prod_code;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public void setLoan_prod_code(String loan_prod_code) {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94526);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94527);this.loan_prod_code = loan_prod_code;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public String getLast_row_type() {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94528);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94529);return last_row_type;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public void setLast_row_type(String last_row_type) {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94530);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94531);this.last_row_type = last_row_type;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public String getLast_row_key() {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94532);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94533);return last_row_key;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public void setLast_row_key(String last_row_key) {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94534);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94535);this.last_row_key = last_row_key;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public String getNextpage_flag() {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94536);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94537);return nextpage_flag;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public void setNextpage_flag(String nextpage_flag) {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94538);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94539);this.nextpage_flag = nextpage_flag;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public List<TxnListItsm> getTxn_list() {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94540);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94541);return txn_list;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}

  public void setTxn_list(List<TxnListItsm> txn_list) {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94542);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94543);this.txn_list = txn_list;
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}
  
  public static void main(String[] args) {try{__CLR4_1_1020xi20xiluszwh4i.R.inc(94544);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94545);QueryLoanOrderRsp rsp = new QueryLoanOrderRsp();
    
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94546);rsp.setLast_row_key("A");
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94547);List<TxnListItsm> txn_list = new ArrayList<TxnListItsm>();
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94548);TxnListItsm itsm = new TxnListItsm();
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94549);itsm.setAssets_no("B");
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94550);itsm.setCover_vol(new BigDecimal("300"));
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94551);txn_list.add(itsm);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94552);rsp.setTxn_list(txn_list);
    
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94553);String txt = JSON.toJSONString(rsp);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94554);System.out.println(txt);
    
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94555);String txt2 = JSON.toJSONString(txn_list);
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94556);System.out.println(txt2);
    
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94557);List<TxnListItsm> itsms = JSON.parseObject(txt2, 
        new TypeReference<List<TxnListItsm>>(){});
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94558);System.out.println(itsms);

    __CLR4_1_1020xi20xiluszwh4i.R.inc(94559);rsp = JSON.parseObject(txt, 
        new TypeReference<QueryLoanOrderRsp>(){});
    
    __CLR4_1_1020xi20xiluszwh4i.R.inc(94560);System.out.println(rsp);
  }finally{__CLR4_1_1020xi20xiluszwh4i.R.flushNeeded();}}
}
