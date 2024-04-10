/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.china.bolt.biz.daili.merchants.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.alibaba.fastjson.JSON;


/**
 * \u5546\u5bb6\u57fa\u672c\u4fe1\u606f
 * @author hongwei.quhw
 *
 */
public class MerchantsVO implements Serializable {public static class __CLR4_5_2uk0uk0lusyjpgi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,39817,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /** -----------------\u5b9e\u4f53\u5546\u5bb6\u4fe1\u606f----------**/
	//\u5e97\u94fa\u7c7b\u578bcode
	private String type;
	//\u5e97\u94fa\u7c7b\u578bname
    private String typename;
	//\u62db\u5546\u533a\u57dfcode
	private String[] region;
	//\u62db\u5546\u533a\u57dfname
	private String[] regionname;
	//\u6700\u5c0f\u9762\u79ef
	private Integer minarea = -1;
	//\u6700\u5927\u9762\u79ef
	private Integer maxarea;
	//\u542f\u52a8\u8d44\u91d1
	private Long initialcapital;
	//\u52a0\u76df\u4fdd\u8bc1\u91d1
	private Long cashdeposit;
	/** -----------------\u7f51\u7edc\u5546\u5bb6\u4fe1\u606f----------**/
	//\u62db\u5546\u6e20\u9053\u641c\u7d22\u7d22\u5f15\u540d
	private String[] shoptype;
	//\u62db\u5546\u6e20\u9053\u641c\u7d22\u540d\u79f0
    private String[] shoptypename;
	//\u4e3b\u8425\u7c7b\u76ee
	private String[] categoryids;
	//\u4e3b\u8425\u7c7b\u76ee\u540d\u79f0
	private String[] categoryidsname;
	
	/** -----------------\u5546\u5bb6\u5171\u6709\u4fe1\u606f----------**/
	//MemberId
	private String memberid;
	//\u5546\u5bb6\u7c7b\u578b
	private int merchantstype;
	//\u662f\u5426\u5df2\u5220\u9664
	private boolean isdelete;
	//\u62db\u5546\u622a\u6b62\u65e5\u671f
	private Date expirationdate;
	//\u65fa\u65fa
	private String wangwang;
	//\u8054\u7cfb\u7535\u8bdd
	private String tel;
	//\u662f\u5426\u54c1\u724c 
	private boolean hasbrand;
	//\uff0830\u5929\uff09\u52a0\u76df\u4eba\u6570 
	private int joincount;
	//\u516c\u53f8\u65fa\u94fa\u5730\u5740
    private String winportdomain;
	/** ----------------\u4e0b\u9762\u662f\u54c1\u724c\u5e93\u4fe1\u606f----------------  **/
	//logo/\u5546\u6807 \u56fe\u7247URL
	private String brandlogourl;
	//\u54c1\u724c\u540d\u79f0
	private String brandname;
	//\u521b\u7acb\u65f6\u95f4
	private Date brandfoundtime;
	//\u8be6\u60c5
	private String brandintroduction;
	//\u8bc1\u4e66  \u56fe\u7247URL 
	private String brandcertificateurl; 
	
	/** ----------------\u4e0b\u9762\u662f\u516c\u53f8\u5e93\u4fe1\u606f----------------  **/
	//\u516c\u53f8\u540d
	private String companyname;
	//\u6210\u7acb\u5e74\u4efd
	private String companyestablishedyear;
	//\u6ce8\u518c\u8d44\u672c
	private Double companyregcapital;
	//\u6ce8\u518c\u5730
	private String companyfoundedplace;
	//\u7b80\u4ecb
    private String companyintroduction;
    
	/** ----------------\u4e0b\u9762\u662fDW\u4ea4\u6613\u4fe1\u606f----------------  **/
	//\u6700\u8fd130\u5929\u4ee3\u7406\u5546\u652f\u4ed8\u8ba2\u5355\u91d1\u989d\uff08\u5355\u4f4d\u4e3a\u5206\uff09
	private Double payordamt30;
	//\u6700\u8fd130\u5929\u4ee3\u7406\u5546\u652f\u4ed8\u8ba2\u5355\u6570
	private long payordcnt30;
	//\u6700\u8fd130\u5929\u652f\u4ed8\u8ba2\u5355\u4ee3\u7406\u5546\u4e70\u5bb6\u6570
	private long payordbuyercnt30;
	//\u6700\u8fd190\u5929\u65fa\u94fa\u56de\u5934\u7387
	private Double returnordrate90;
	//\u622a\u81f3\u5f53\u65e5\u6210\u529f\u7533\u8bf7\u4ee3\u7406\u5546\u4eba\u6570
	private int membercnttd;
	//\u4e3b\u8425\u4e00\u7ea7\u7c7b\u76eeID\uff08\u4e3b\u8425top1\u3001top2\u3001top3\u4e00\u7ea7\u7c7b\u76ee\u4ee5char(6)\u62fc\u88c5\u6210\u4e00\u4e32\uff0c\u9700\u8981\u89e3\u6790\u51fatop1\u4e00\u7ea7\u7c7b\u76ee\u5373\u53ef\uff09example:"7"
	private String stdcategoryid1;
	//\u4e3b\u8425\u4e8c\u7ea7\u7c7b\u76eeID\uff08\u4e3b\u8425top1\u3001top2\u3001top3\u4e8c\u7ea7\u7c7b\u76ee\u4ee5char(6)\u62fc\u88c5\u6210\u4e00\u4e32\uff0c\u9700\u8981\u89e3\u6790\u51fatop1\u4e8c\u7ea7\u7c7b\u76ee\u5373\u53ef\uff09example:"7"
	private String stdcategoryid2;
	//\u4e3b\u8425\u4e00\u7ea7\u7c7b\u76eeID\u540d\u79f0 example:"\u670d\u88c5"
    private String stdcategoryname1;
    //\u4e3b\u8425\u4e8c\u7ea7\u7c7b\u76eeID\u540d\u79f0 example:"\u7537\u88c5"
    private String stdcategoryname2;
    
    /** ----------------\u4e0b\u9762\u662foffer\u4fe1\u606f----------------  **/
    //offer\u7f29\u7565\u56feurl\u5730\u5740
    private String[]  summimageurilist;
    //offer\u94fe\u63a5url\u5730\u5740
    private String[] detailurl;
	
	@Override
	public String toString() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39600);
		__CLR4_5_2uk0uk0lusyjpgi.R.inc(39601);return ToStringBuilder.reflectionToString(this);
	}finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getType() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39602);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39603);return type;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setType(String type) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39604);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39605);this.type = type;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getTypename() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39606);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39607);return typename;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setTypename(String typename) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39608);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39609);this.typename = typename;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String[] getRegion() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39610);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39611);return region;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setRegionArray(String[] region) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39612);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39613);this.region = region;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String[] getRegionname() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39614);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39615);return regionname;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setRegionnameArray(String[] regionname) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39616);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39617);this.regionname = regionname;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public Integer getMinarea() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39618);
		__CLR4_5_2uk0uk0lusyjpgi.R.inc(39619);return minarea;
	}finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

	public void setMinarea(Integer minarea) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39620);
		__CLR4_5_2uk0uk0lusyjpgi.R.inc(39621);if ((((null == minarea)&&(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39622)!=0|true))||(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39623)==0&false))) {{
			__CLR4_5_2uk0uk0lusyjpgi.R.inc(39624);minarea = -1; //opensearch \u641c\u7d22\u7a7a\u95ee\u9898 \uff0c\u8bbe\u7f6e\u9ed8\u8ba4\u503c
		}
		}__CLR4_5_2uk0uk0lusyjpgi.R.inc(39625);this.minarea = minarea;
	}finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

	public Integer getMaxarea() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39626);
		__CLR4_5_2uk0uk0lusyjpgi.R.inc(39627);return maxarea;
	}finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

	public void setMaxarea(Integer maxarea) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39628);
		__CLR4_5_2uk0uk0lusyjpgi.R.inc(39629);this.maxarea = maxarea;
	}finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

	public Long getInitialcapital() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39630);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39631);return initialcapital;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setInitialcapital(Long initialcapital) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39632);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39633);this.initialcapital = initialcapital;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public Long getCashdeposit() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39634);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39635);return cashdeposit;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCashdeposit(Long cashdeposit) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39636);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39637);this.cashdeposit = cashdeposit;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String[] getShoptype() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39638);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39639);return shoptype;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setShoptypeArray(String[] shoptype) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39640);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39641);this.shoptype = shoptype;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String[] getShoptypename() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39642);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39643);return shoptypename;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setShoptypenameArray(String[] shoptypename) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39644);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39645);this.shoptypename = shoptypename;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String[] getCategoryids() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39646);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39647);return categoryids;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCategoryidsArray(String[] categoryids) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39648);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39649);this.categoryids = categoryids;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String[] getCategoryidsname() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39650);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39651);return categoryidsname;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCategoryidsnameArray(String[] categoryidsname) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39652);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39653);this.categoryidsname = categoryidsname;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getMemberid() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39654);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39655);return memberid;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setMemberid(String memberid) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39656);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39657);this.memberid = memberid;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public int getMerchantstype() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39658);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39659);return merchantstype;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setMerchantstype(int merchantstype) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39660);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39661);this.merchantstype = merchantstype;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public boolean isIsdelete() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39662);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39663);return isdelete;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setIsdelete(boolean isdelete) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39664);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39665);this.isdelete = isdelete;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public Date getExpirationdate() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39666);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39667);return expirationdate;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setExpirationdate(Date expirationdate) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39668);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39669);this.expirationdate = expirationdate;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getWangwang() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39670);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39671);return wangwang;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setWangwang(String wangwang) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39672);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39673);this.wangwang = wangwang;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getTel() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39674);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39675);return tel;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setTel(String tel) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39676);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39677);this.tel = tel;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public boolean isHasbrand() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39678);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39679);return hasbrand;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setHasbrand(boolean hasbrand) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39680);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39681);this.hasbrand = hasbrand;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public int getJoincount() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39682);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39683);return joincount;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setJoincount(int joincount) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39684);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39685);this.joincount = joincount;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getWinportdomain() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39686);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39687);return winportdomain;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setWinportdomain(String winportdomain) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39688);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39689);this.winportdomain = winportdomain;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getBrandlogourl() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39690);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39691);return brandlogourl;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setBrandlogourl(String brandlogourl) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39692);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39693);this.brandlogourl = brandlogourl;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getBrandname() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39694);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39695);return brandname;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setBrandname(String brandname) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39696);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39697);this.brandname = brandname;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public Date getBrandfoundtime() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39698);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39699);return brandfoundtime;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setBrandfoundtime(Date brandfoundtime) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39700);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39701);this.brandfoundtime = brandfoundtime;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getBrandintroduction() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39702);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39703);return brandintroduction;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setBrandintroduction(String brandintroduction) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39704);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39705);this.brandintroduction = brandintroduction;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getBrandcertificateurl() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39706);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39707);return brandcertificateurl;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setBrandcertificateurl(String brandcertificateurl) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39708);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39709);this.brandcertificateurl = brandcertificateurl;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getCompanyname() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39710);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39711);return companyname;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCompanyname(String companyname) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39712);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39713);this.companyname = companyname;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getCompanyestablishedyear() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39714);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39715);return companyestablishedyear;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCompanyestablishedyear(String companyestablishedyear) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39716);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39717);this.companyestablishedyear = companyestablishedyear;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public Double getCompanyregcapital() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39718);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39719);return companyregcapital;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCompanyregcapital(Double companyregcapital) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39720);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39721);this.companyregcapital = companyregcapital;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getCompanyfoundedplace() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39722);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39723);return companyfoundedplace;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCompanyfoundedplace(String companyfoundedplace) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39724);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39725);this.companyfoundedplace = companyfoundedplace;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getCompanyintroduction() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39726);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39727);return companyintroduction;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCompanyintroduction(String companyintroduction) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39728);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39729);this.companyintroduction = companyintroduction;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String[] getSummimageurilist() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39730);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39731);return summimageurilist;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setSummimageurilistArray(String[] summimageuriList) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39732);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39733);this.summimageurilist = summimageuriList;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String[] getDetailurl() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39734);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39735);return detailurl;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}
    
    public void setDetailurlArray(String[] detailurl) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39736);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39737);this.detailurl = detailurl;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}
    
    public String getExpirationdateForString(){try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39738);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39739);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy\u5e74MM\u6708dd\u65e5", JSON.defaultLocale);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39740);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39741);return dateFormat.format(this.expirationdate);
     }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * \u4e3aopensearch\u7279\u4f9b
     * @param region
     */
    public void setRegion(String region) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39742);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39743);this.region = (((region== null )&&(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39744)!=0|true))||(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39745)==0&false))?new String[0]:region.split("\\t");
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setRegionname(String regionname) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39746);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39747);this.regionname = (((regionname== null )&&(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39748)!=0|true))||(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39749)==0&false))?new String[0]:regionname.split("\\t");__CLR4_5_2uk0uk0lusyjpgi.R.inc(39750);;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setShoptype(String shoptype) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39751);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39752);this.shoptype = (((shoptype== null )&&(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39753)!=0|true))||(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39754)==0&false))?new String[0]:shoptype.split("\\t");__CLR4_5_2uk0uk0lusyjpgi.R.inc(39755);;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setShoptypename(String shoptypename) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39756);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39757);this.shoptypename = (((shoptypename== null )&&(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39758)!=0|true))||(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39759)==0&false))?new String[0]:shoptypename.split("\\t");__CLR4_5_2uk0uk0lusyjpgi.R.inc(39760);;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCategoryids(String categoryids) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39761);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39762);this.categoryids = (((categoryids== null )&&(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39763)!=0|true))||(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39764)==0&false))?new String[0]:categoryids.split("\\t");__CLR4_5_2uk0uk0lusyjpgi.R.inc(39765);;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setCategoryidsname(String categoryidsname) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39766);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39767);this.categoryidsname = (((categoryidsname== null )&&(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39768)!=0|true))||(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39769)==0&false))?new String[0]:categoryidsname.split("\\t");__CLR4_5_2uk0uk0lusyjpgi.R.inc(39770);;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setSummimageurilist(String summimageuriList) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39771);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39772);this.summimageurilist = (((summimageuriList== null )&&(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39773)!=0|true))||(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39774)==0&false))?new String[0]:summimageuriList.split("\\t");__CLR4_5_2uk0uk0lusyjpgi.R.inc(39775);;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setDetailurl(String detailurl) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39776);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39777);this.detailurl = (((detailurl== null )&&(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39778)!=0|true))||(__CLR4_5_2uk0uk0lusyjpgi.R.iget(39779)==0&false))?new String[0]:detailurl.split("\\t");__CLR4_5_2uk0uk0lusyjpgi.R.inc(39780);;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @return the payordamt30
     */
    public Double getPayordamt30() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39781);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39782);return payordamt30;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @param payordamt30 the payordamt30 to set
     */
    public void setPayordamt30(Double payordamt30) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39783);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39784);this.payordamt30 = payordamt30;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @return the payordcnt30
     */
    public long getPayordcnt30() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39785);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39786);return payordcnt30;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @param payordcnt30 the payordcnt30 to set
     */
    public void setPayordcnt30(long payordcnt30) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39787);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39788);this.payordcnt30 = payordcnt30;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @return the payordbuyercnt30
     */
    public long getPayordbuyercnt30() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39789);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39790);return payordbuyercnt30;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @param payordbuyercnt30 the payordbuyercnt30 to set
     */
    public void setPayordbuyercnt30(long payordbuyercnt30) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39791);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39792);this.payordbuyercnt30 = payordbuyercnt30;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @return the returnordrate90
     */
    public Double getReturnordrate90() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39793);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39794);return returnordrate90;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @param returnordrate90 the returnordrate90 to set
     */
    public void setReturnordrate90(Double returnordrate90) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39795);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39796);this.returnordrate90 = returnordrate90;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @return the membercnttd
     */
    public int getMembercnttd() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39797);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39798);return membercnttd;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    /**
     * @param membercnttd the membercnttd to set
     */
    public void setMembercnttd(int membercnttd) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39799);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39800);this.membercnttd = membercnttd;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getStdcategoryid1() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39801);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39802);return stdcategoryid1;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setStdcategoryid1(String stdcategoryid1) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39803);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39804);this.stdcategoryid1 = stdcategoryid1;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getStdcategoryid2() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39805);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39806);return stdcategoryid2;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setStdcategoryid2(String stdcategoryid2) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39807);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39808);this.stdcategoryid2 = stdcategoryid2;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getStdcategoryname1() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39809);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39810);return stdcategoryname1;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setStdcategoryname1(String stdcategoryname1) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39811);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39812);this.stdcategoryname1 = stdcategoryname1;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public String getStdcategoryname2() {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39813);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39814);return stdcategoryname2;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

    public void setStdcategoryname2(String stdcategoryname2) {try{__CLR4_5_2uk0uk0lusyjpgi.R.inc(39815);
        __CLR4_5_2uk0uk0lusyjpgi.R.inc(39816);this.stdcategoryname2 = stdcategoryname2;
    }finally{__CLR4_5_2uk0uk0lusyjpgi.R.flushNeeded();}}

  
	
}