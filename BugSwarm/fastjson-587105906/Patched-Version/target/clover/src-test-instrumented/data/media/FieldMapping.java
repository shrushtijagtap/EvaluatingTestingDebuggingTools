/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media;

import java.util.HashMap;

public final class FieldMapping
{public static class __CLR4_5_228ey28eylusyjxbt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,104232,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public final static int FIELD_IX_MEDIA = 1;
	public final static String FULL_FIELD_NAME_MEDIA = "media";
	public final static int FIELD_IX_IMAGES = 2;
	public final static String FULL_FIELD_NAME_IMAGES = "images";
	public final static int FIELD_IX_PLAYER = 3;
	public final static String FULL_FIELD_NAME_PLAYER = "player";
	public final static int FIELD_IX_URI = 4;
	public final static String FULL_FIELD_NAME_URI = "uri";
	public final static int FIELD_IX_TITLE = 5;
	public final static String FULL_FIELD_NAME_TITLE = "title";
	public final static int FIELD_IX_WIDTH = 6;
	public final static String FULL_FIELD_NAME_WIDTH = "width";
	public final static int FIELD_IX_HEIGHT = 7;
	public final static String FULL_FIELD_NAME_HEIGHT = "height";
	public final static int FIELD_IX_FORMAT = 8;
	public final static String FULL_FIELD_NAME_FORMAT = "format";
	public final static int FIELD_IX_DURATION = 9;
	public final static String FULL_FIELD_NAME_DURATION = "duration";
	public final static int FIELD_IX_SIZE = 10;
	public final static String FULL_FIELD_NAME_SIZE = "size";
	public final static int FIELD_IX_BITRATE = 11;
	public final static String FULL_FIELD_NAME_BITRATE = "bitrate";
	public final static int FIELD_IX_PERSONS = 12;
	public final static String FULL_FIELD_NAME_PERSONS = "persons";
	public final static int FIELD_IX_COPYRIGHT = 13;
	public final static String FULL_FIELD_NAME_COPYRIGHT = "copyright";

        // 25-Jun-2011, tatu: Some earlier tests used minimal names; not in use any more
        /*
	
//      public final static String FIELD_NAME_MEDIA = "md";
//      public final static String FIELD_NAME_IMAGES = "im";
//      public final static String FIELD_NAME_PLAYER = "pl";
//      public final static String FIELD_NAME_URI = "ul";
//      public final static String FIELD_NAME_TITLE = "tl";
//      public final static String FIELD_NAME_WIDTH = "wd";
//      public final static String FIELD_NAME_HEIGHT = "hg";
//      public final static String FIELD_NAME_FORMAT = "fr";
//      public final static String FIELD_NAME_DURATION = "dr";
//      public final static String FIELD_NAME_SIZE = "sz";
//      public final static String FIELD_NAME_BITRATE = "br";
//      public final static String FIELD_NAME_PERSONS = "pr";
//      public final static String FIELD_NAME_COPYRIGHT = "cp";
	
	public static final HashMap<String,Integer> fieldToIndex = new HashMap<String,Integer>();
	static {
		fieldToIndex.put(FIELD_NAME_MEDIA, FIELD_IX_MEDIA);
		fieldToIndex.put(FIELD_NAME_IMAGES, FIELD_IX_IMAGES);
		fieldToIndex.put(FIELD_NAME_PLAYER, FIELD_IX_PLAYER);
		fieldToIndex.put(FIELD_NAME_URI, FIELD_IX_URI);
		fieldToIndex.put(FIELD_NAME_TITLE, FIELD_IX_TITLE);
		fieldToIndex.put(FIELD_NAME_WIDTH, FIELD_IX_WIDTH);
		fieldToIndex.put(FIELD_NAME_HEIGHT, FIELD_IX_HEIGHT);
		fieldToIndex.put(FIELD_NAME_FORMAT, FIELD_IX_FORMAT);
		fieldToIndex.put(FIELD_NAME_DURATION, FIELD_IX_DURATION);
		fieldToIndex.put(FIELD_NAME_SIZE, FIELD_IX_SIZE);
		fieldToIndex.put(FIELD_NAME_BITRATE, FIELD_IX_BITRATE);
		fieldToIndex.put(FIELD_NAME_PERSONS, FIELD_IX_PERSONS);
		fieldToIndex.put(FIELD_NAME_COPYRIGHT, FIELD_IX_COPYRIGHT);
	}
	*/

	public static final HashMap<String,Integer> fullFieldToIndex = new HashMap<String,Integer>();
	static {try{__CLR4_5_228ey28eylusyjxbt.R.inc(104218);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104219);fullFieldToIndex.put(FULL_FIELD_NAME_MEDIA, FIELD_IX_MEDIA);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104220);fullFieldToIndex.put(FULL_FIELD_NAME_IMAGES, FIELD_IX_IMAGES);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104221);fullFieldToIndex.put(FULL_FIELD_NAME_PLAYER, FIELD_IX_PLAYER);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104222);fullFieldToIndex.put(FULL_FIELD_NAME_URI, FIELD_IX_URI);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104223);fullFieldToIndex.put(FULL_FIELD_NAME_TITLE, FIELD_IX_TITLE);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104224);fullFieldToIndex.put(FULL_FIELD_NAME_WIDTH, FIELD_IX_WIDTH);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104225);fullFieldToIndex.put(FULL_FIELD_NAME_HEIGHT, FIELD_IX_HEIGHT);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104226);fullFieldToIndex.put(FULL_FIELD_NAME_FORMAT, FIELD_IX_FORMAT);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104227);fullFieldToIndex.put(FULL_FIELD_NAME_DURATION, FIELD_IX_DURATION);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104228);fullFieldToIndex.put(FULL_FIELD_NAME_SIZE, FIELD_IX_SIZE);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104229);fullFieldToIndex.put(FULL_FIELD_NAME_BITRATE, FIELD_IX_BITRATE);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104230);fullFieldToIndex.put(FULL_FIELD_NAME_PERSONS, FIELD_IX_PERSONS);
		__CLR4_5_228ey28eylusyjxbt.R.inc(104231);fullFieldToIndex.put(FULL_FIELD_NAME_COPYRIGHT, FIELD_IX_COPYRIGHT);
	}finally{__CLR4_5_228ey28eylusyjxbt.R.flushNeeded();}}
}
