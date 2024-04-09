/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media;

import static data.ReprUtil.repr;

public class Image implements java.io.Serializable {public static class __CLR4_5_229dk29dklusvnlun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,105549,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1L;

    public enum Size {
        SMALL, LARGE
    }

    public int    height;
    public Size   size;
    public String title; // Can be null
    public String uri;
    public int    width;
    
    public Image(){try{__CLR4_5_229dk29dklusvnlun.R.inc(105464);
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public Image(String uri, String title, int width, int height, Size size){try{__CLR4_5_229dk29dklusvnlun.R.inc(105465);
        __CLR4_5_229dk29dklusvnlun.R.inc(105466);this.height = height;
        __CLR4_5_229dk29dklusvnlun.R.inc(105467);this.title = title;
        __CLR4_5_229dk29dklusvnlun.R.inc(105468);this.uri = uri;
        __CLR4_5_229dk29dklusvnlun.R.inc(105469);this.width = width;
        __CLR4_5_229dk29dklusvnlun.R.inc(105470);this.size = size;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_229dk29dklusvnlun.R.inc(105471);
        __CLR4_5_229dk29dklusvnlun.R.inc(105472);if ((((this == o)&&(__CLR4_5_229dk29dklusvnlun.R.iget(105473)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105474)==0&false))) {__CLR4_5_229dk29dklusvnlun.R.inc(105475);return true;
        }__CLR4_5_229dk29dklusvnlun.R.inc(105476);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_229dk29dklusvnlun.R.iget(105477)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105478)==0&false))) {__CLR4_5_229dk29dklusvnlun.R.inc(105479);return false;

        }__CLR4_5_229dk29dklusvnlun.R.inc(105480);Image image = (Image) o;

        __CLR4_5_229dk29dklusvnlun.R.inc(105481);if ((((height != image.height)&&(__CLR4_5_229dk29dklusvnlun.R.iget(105482)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105483)==0&false))) {__CLR4_5_229dk29dklusvnlun.R.inc(105484);return false;
        }__CLR4_5_229dk29dklusvnlun.R.inc(105485);if ((((width != image.width)&&(__CLR4_5_229dk29dklusvnlun.R.iget(105486)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105487)==0&false))) {__CLR4_5_229dk29dklusvnlun.R.inc(105488);return false;
        }__CLR4_5_229dk29dklusvnlun.R.inc(105489);if ((((size != image.size)&&(__CLR4_5_229dk29dklusvnlun.R.iget(105490)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105491)==0&false))) {__CLR4_5_229dk29dklusvnlun.R.inc(105492);return false;
        }__CLR4_5_229dk29dklusvnlun.R.inc(105493);if (((((((title != null )&&(__CLR4_5_229dk29dklusvnlun.R.iget(105494)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105495)==0&false))? !title.equals(image.title) : image.title != null)&&(__CLR4_5_229dk29dklusvnlun.R.iget(105496)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105497)==0&false))) {__CLR4_5_229dk29dklusvnlun.R.inc(105498);return false;
        }__CLR4_5_229dk29dklusvnlun.R.inc(105499);if (((((((uri != null )&&(__CLR4_5_229dk29dklusvnlun.R.iget(105500)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105501)==0&false))? !uri.equals(image.uri) : image.uri != null)&&(__CLR4_5_229dk29dklusvnlun.R.iget(105502)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105503)==0&false))) {__CLR4_5_229dk29dklusvnlun.R.inc(105504);return false;

        }__CLR4_5_229dk29dklusvnlun.R.inc(105505);return true;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_229dk29dklusvnlun.R.inc(105506);
        __CLR4_5_229dk29dklusvnlun.R.inc(105507);int result = (((uri != null )&&(__CLR4_5_229dk29dklusvnlun.R.iget(105508)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105509)==0&false))? uri.hashCode() : 0;
        __CLR4_5_229dk29dklusvnlun.R.inc(105510);result = 31 * result + ((((title != null )&&(__CLR4_5_229dk29dklusvnlun.R.iget(105511)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105512)==0&false))? title.hashCode() : 0);
        __CLR4_5_229dk29dklusvnlun.R.inc(105513);result = 31 * result + width;
        __CLR4_5_229dk29dklusvnlun.R.inc(105514);result = 31 * result + height;
        __CLR4_5_229dk29dklusvnlun.R.inc(105515);result = 31 * result + ((((size != null )&&(__CLR4_5_229dk29dklusvnlun.R.iget(105516)!=0|true))||(__CLR4_5_229dk29dklusvnlun.R.iget(105517)==0&false))? size.hashCode() : 0);
        __CLR4_5_229dk29dklusvnlun.R.inc(105518);return result;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_229dk29dklusvnlun.R.inc(105519);
        __CLR4_5_229dk29dklusvnlun.R.inc(105520);StringBuilder sb = new StringBuilder();
        __CLR4_5_229dk29dklusvnlun.R.inc(105521);sb.append("[Image ");
        __CLR4_5_229dk29dklusvnlun.R.inc(105522);sb.append("uri=").append(repr(uri));
        __CLR4_5_229dk29dklusvnlun.R.inc(105523);sb.append(", title=").append(repr(title));
        __CLR4_5_229dk29dklusvnlun.R.inc(105524);sb.append(", width=").append(width);
        __CLR4_5_229dk29dklusvnlun.R.inc(105525);sb.append(", height=").append(height);
        __CLR4_5_229dk29dklusvnlun.R.inc(105526);sb.append(", size=").append(size);
        __CLR4_5_229dk29dklusvnlun.R.inc(105527);sb.append("]");
        __CLR4_5_229dk29dklusvnlun.R.inc(105528);return sb.toString();
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public void setUri(String uri) {try{__CLR4_5_229dk29dklusvnlun.R.inc(105529);
        __CLR4_5_229dk29dklusvnlun.R.inc(105530);this.uri = uri;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public void setTitle(String title) {try{__CLR4_5_229dk29dklusvnlun.R.inc(105531);
        __CLR4_5_229dk29dklusvnlun.R.inc(105532);this.title = title;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public void setWidth(int width) {try{__CLR4_5_229dk29dklusvnlun.R.inc(105533);
        __CLR4_5_229dk29dklusvnlun.R.inc(105534);this.width = width;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public void setHeight(int height) {try{__CLR4_5_229dk29dklusvnlun.R.inc(105535);
        __CLR4_5_229dk29dklusvnlun.R.inc(105536);this.height = height;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public void setSize(Size size) {try{__CLR4_5_229dk29dklusvnlun.R.inc(105537);
        __CLR4_5_229dk29dklusvnlun.R.inc(105538);this.size = size;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public String getUri() {try{__CLR4_5_229dk29dklusvnlun.R.inc(105539);
        __CLR4_5_229dk29dklusvnlun.R.inc(105540);return uri;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public String getTitle() {try{__CLR4_5_229dk29dklusvnlun.R.inc(105541);
        __CLR4_5_229dk29dklusvnlun.R.inc(105542);return title;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public int getWidth() {try{__CLR4_5_229dk29dklusvnlun.R.inc(105543);
        __CLR4_5_229dk29dklusvnlun.R.inc(105544);return width;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_5_229dk29dklusvnlun.R.inc(105545);
        __CLR4_5_229dk29dklusvnlun.R.inc(105546);return height;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}

    public Size getSize() {try{__CLR4_5_229dk29dklusvnlun.R.inc(105547);
        __CLR4_5_229dk29dklusvnlun.R.inc(105548);return size;
    }finally{__CLR4_5_229dk29dklusvnlun.R.flushNeeded();}}
}
