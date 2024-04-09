/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media;

import static data.ReprUtil.repr;

import java.util.List;

@SuppressWarnings("serial")
public class Media implements java.io.Serializable {public static class __CLR4_5_229ka29kalusvnlwe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,105878,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public enum Player {
                        JAVA, FLASH
    }

    private int          bitrate;   // Can be unset.
    private boolean      hasBitrate;

    private long         duration;
    private String       format;
    private int          height;
    private List<String> persons;
    private Player       player;
    private long         size;
    private String       title;     // Can be unset.
    private String       uri;
    private int          width;

    // msgpack requires this
    public String        copyright; // Can be unset.

    public Media(){try{__CLR4_5_229ka29kalusvnlwe.R.inc(105706);
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public Media(String uri, String title, int width, int height, String format, long duration, long size, int bitrate,
                 boolean hasBitrate, List<String> persons, Player player, String copyright){try{__CLR4_5_229ka29kalusvnlwe.R.inc(105707);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105708);this.uri = uri;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105709);this.title = title;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105710);this.width = width;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105711);this.height = height;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105712);this.format = format;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105713);this.duration = duration;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105714);this.size = size;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105715);this.bitrate = bitrate;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105716);this.hasBitrate = hasBitrate;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105717);this.persons = persons;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105718);this.player = player;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105719);this.copyright = copyright;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105720);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105721);if ((((this == o)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105722)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105723)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105724);return true;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105725);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105726)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105727)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105728);return false;

        }__CLR4_5_229ka29kalusvnlwe.R.inc(105729);Media media = (Media) o;

        __CLR4_5_229ka29kalusvnlwe.R.inc(105730);if ((((bitrate != media.bitrate)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105731)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105732)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105733);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105734);if ((((duration != media.duration)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105735)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105736)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105737);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105738);if ((((hasBitrate != media.hasBitrate)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105739)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105740)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105741);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105742);if ((((height != media.height)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105743)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105744)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105745);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105746);if ((((size != media.size)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105747)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105748)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105749);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105750);if ((((width != media.width)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105751)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105752)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105753);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105754);if (((((((copyright != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105755)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105756)==0&false))? !copyright.equals(media.copyright) : media.copyright != null)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105757)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105758)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105759);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105760);if (((((((format != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105761)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105762)==0&false))? !format.equals(media.format) : media.format != null)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105763)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105764)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105765);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105766);if (((((((persons != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105767)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105768)==0&false))? !persons.equals(media.persons) : media.persons != null)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105769)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105770)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105771);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105772);if ((((player != media.player)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105773)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105774)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105775);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105776);if (((((((title != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105777)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105778)==0&false))? !title.equals(media.title) : media.title != null)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105779)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105780)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105781);return false;
        }__CLR4_5_229ka29kalusvnlwe.R.inc(105782);if (((((((uri != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105783)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105784)==0&false))? !uri.equals(media.uri) : media.uri != null)&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105785)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105786)==0&false))) {__CLR4_5_229ka29kalusvnlwe.R.inc(105787);return false;

        }__CLR4_5_229ka29kalusvnlwe.R.inc(105788);return true;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105789);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105790);int result = (((uri != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105791)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105792)==0&false))? uri.hashCode() : 0;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105793);result = 31 * result + ((((title != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105794)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105795)==0&false))? title.hashCode() : 0);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105796);result = 31 * result + width;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105797);result = 31 * result + height;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105798);result = 31 * result + ((((format != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105799)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105800)==0&false))? format.hashCode() : 0);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105801);result = 31 * result + (int) (duration ^ (duration >>> 32));
        __CLR4_5_229ka29kalusvnlwe.R.inc(105802);result = 31 * result + (int) (size ^ (size >>> 32));
        __CLR4_5_229ka29kalusvnlwe.R.inc(105803);result = 31 * result + bitrate;
        __CLR4_5_229ka29kalusvnlwe.R.inc(105804);result = 31 * result + ((((hasBitrate )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105805)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105806)==0&false))? 1 : 0);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105807);result = 31 * result + ((((persons != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105808)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105809)==0&false))? persons.hashCode() : 0);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105810);result = 31 * result + ((((player != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105811)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105812)==0&false))? player.hashCode() : 0);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105813);result = 31 * result + ((((copyright != null )&&(__CLR4_5_229ka29kalusvnlwe.R.iget(105814)!=0|true))||(__CLR4_5_229ka29kalusvnlwe.R.iget(105815)==0&false))? copyright.hashCode() : 0);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105816);return result;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105817);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105818);StringBuilder sb = new StringBuilder();
        __CLR4_5_229ka29kalusvnlwe.R.inc(105819);sb.append("[Media ");
        __CLR4_5_229ka29kalusvnlwe.R.inc(105820);sb.append("uri=").append(repr(uri));
        __CLR4_5_229ka29kalusvnlwe.R.inc(105821);sb.append(", title=").append(repr(title));
        __CLR4_5_229ka29kalusvnlwe.R.inc(105822);sb.append(", width=").append(width);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105823);sb.append(", height=").append(height);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105824);sb.append(", format=").append(repr(format));
        __CLR4_5_229ka29kalusvnlwe.R.inc(105825);sb.append(", duration=").append(duration);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105826);sb.append(", size=").append(size);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105827);sb.append(", hasBitrate=").append(hasBitrate);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105828);sb.append(", bitrate=").append(String.valueOf(bitrate));
        __CLR4_5_229ka29kalusvnlwe.R.inc(105829);sb.append(", persons=").append(repr(persons));
        __CLR4_5_229ka29kalusvnlwe.R.inc(105830);sb.append(", player=").append(player);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105831);sb.append(", copyright=").append(copyright);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105832);sb.append("]");
        __CLR4_5_229ka29kalusvnlwe.R.inc(105833);return sb.toString();
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public String getUri() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105834);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105835);return uri;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setUri(String uri) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105836);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105837);this.uri = uri;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public String getTitle() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105838);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105839);return title;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setTitle(String title) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105840);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105841);this.title = title;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public int getWidth() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105842);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105843);return width;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setWidth(int width) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105844);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105845);this.width = width;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105846);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105847);return height;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setHeight(int height) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105848);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105849);this.height = height;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public String getFormat() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105850);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105851);return format;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setFormat(String format) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105852);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105853);this.format = format;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105854);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105855);return duration;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105856);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105857);this.duration = duration;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public long getSize() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105858);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105859);return size;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setSize(long size) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105860);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105861);this.size = size;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public int getBitrate() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105862);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105863);return bitrate;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setBitrate(int bitrate) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105864);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105865);this.bitrate = bitrate;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public List<String> getPersons() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105866);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105867);return persons;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setPersons(List<String> persons) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105868);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105869);this.persons = persons;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public Player getPlayer() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105870);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105871);return player;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setPlayer(Player player) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105872);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105873);this.player = player;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public String getCopyright() {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105874);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105875);return copyright;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

    public void setCopyright(String copyright) {try{__CLR4_5_229ka29kalusvnlwe.R.inc(105876);
        __CLR4_5_229ka29kalusvnlwe.R.inc(105877);this.copyright = copyright;
    }finally{__CLR4_5_229ka29kalusvnlwe.R.flushNeeded();}}

}
