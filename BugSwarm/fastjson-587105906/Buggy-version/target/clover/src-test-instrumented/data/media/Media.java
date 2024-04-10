/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package data.media;

import static data.ReprUtil.repr;

import java.util.List;

@SuppressWarnings("serial")
public class Media implements java.io.Serializable {public static class __CLR4_1_1029kl29klluszwj1d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,105889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public Media(){try{__CLR4_1_1029kl29klluszwj1d.R.inc(105717);
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public Media(String uri, String title, int width, int height, String format, long duration, long size, int bitrate,
                 boolean hasBitrate, List<String> persons, Player player, String copyright){try{__CLR4_1_1029kl29klluszwj1d.R.inc(105718);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105719);this.uri = uri;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105720);this.title = title;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105721);this.width = width;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105722);this.height = height;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105723);this.format = format;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105724);this.duration = duration;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105725);this.size = size;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105726);this.bitrate = bitrate;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105727);this.hasBitrate = hasBitrate;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105728);this.persons = persons;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105729);this.player = player;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105730);this.copyright = copyright;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105731);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105732);if ((((this == o)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105733)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105734)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105735);return true;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105736);if ((((o == null || getClass() != o.getClass())&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105737)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105738)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105739);return false;

        }__CLR4_1_1029kl29klluszwj1d.R.inc(105740);Media media = (Media) o;

        __CLR4_1_1029kl29klluszwj1d.R.inc(105741);if ((((bitrate != media.bitrate)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105742)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105743)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105744);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105745);if ((((duration != media.duration)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105746)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105747)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105748);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105749);if ((((hasBitrate != media.hasBitrate)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105750)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105751)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105752);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105753);if ((((height != media.height)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105754)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105755)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105756);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105757);if ((((size != media.size)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105758)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105759)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105760);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105761);if ((((width != media.width)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105762)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105763)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105764);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105765);if (((((((copyright != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105766)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105767)==0&false))? !copyright.equals(media.copyright) : media.copyright != null)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105768)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105769)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105770);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105771);if (((((((format != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105772)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105773)==0&false))? !format.equals(media.format) : media.format != null)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105774)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105775)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105776);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105777);if (((((((persons != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105778)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105779)==0&false))? !persons.equals(media.persons) : media.persons != null)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105780)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105781)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105782);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105783);if ((((player != media.player)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105784)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105785)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105786);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105787);if (((((((title != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105788)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105789)==0&false))? !title.equals(media.title) : media.title != null)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105790)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105791)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105792);return false;
        }__CLR4_1_1029kl29klluszwj1d.R.inc(105793);if (((((((uri != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105794)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105795)==0&false))? !uri.equals(media.uri) : media.uri != null)&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105796)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105797)==0&false))) {__CLR4_1_1029kl29klluszwj1d.R.inc(105798);return false;

        }__CLR4_1_1029kl29klluszwj1d.R.inc(105799);return true;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105800);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105801);int result = (((uri != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105802)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105803)==0&false))? uri.hashCode() : 0;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105804);result = 31 * result + ((((title != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105805)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105806)==0&false))? title.hashCode() : 0);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105807);result = 31 * result + width;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105808);result = 31 * result + height;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105809);result = 31 * result + ((((format != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105810)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105811)==0&false))? format.hashCode() : 0);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105812);result = 31 * result + (int) (duration ^ (duration >>> 32));
        __CLR4_1_1029kl29klluszwj1d.R.inc(105813);result = 31 * result + (int) (size ^ (size >>> 32));
        __CLR4_1_1029kl29klluszwj1d.R.inc(105814);result = 31 * result + bitrate;
        __CLR4_1_1029kl29klluszwj1d.R.inc(105815);result = 31 * result + ((((hasBitrate )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105816)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105817)==0&false))? 1 : 0);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105818);result = 31 * result + ((((persons != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105819)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105820)==0&false))? persons.hashCode() : 0);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105821);result = 31 * result + ((((player != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105822)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105823)==0&false))? player.hashCode() : 0);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105824);result = 31 * result + ((((copyright != null )&&(__CLR4_1_1029kl29klluszwj1d.R.iget(105825)!=0|true))||(__CLR4_1_1029kl29klluszwj1d.R.iget(105826)==0&false))? copyright.hashCode() : 0);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105827);return result;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public String toString() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105828);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105829);StringBuilder sb = new StringBuilder();
        __CLR4_1_1029kl29klluszwj1d.R.inc(105830);sb.append("[Media ");
        __CLR4_1_1029kl29klluszwj1d.R.inc(105831);sb.append("uri=").append(repr(uri));
        __CLR4_1_1029kl29klluszwj1d.R.inc(105832);sb.append(", title=").append(repr(title));
        __CLR4_1_1029kl29klluszwj1d.R.inc(105833);sb.append(", width=").append(width);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105834);sb.append(", height=").append(height);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105835);sb.append(", format=").append(repr(format));
        __CLR4_1_1029kl29klluszwj1d.R.inc(105836);sb.append(", duration=").append(duration);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105837);sb.append(", size=").append(size);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105838);sb.append(", hasBitrate=").append(hasBitrate);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105839);sb.append(", bitrate=").append(String.valueOf(bitrate));
        __CLR4_1_1029kl29klluszwj1d.R.inc(105840);sb.append(", persons=").append(repr(persons));
        __CLR4_1_1029kl29klluszwj1d.R.inc(105841);sb.append(", player=").append(player);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105842);sb.append(", copyright=").append(copyright);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105843);sb.append("]");
        __CLR4_1_1029kl29klluszwj1d.R.inc(105844);return sb.toString();
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public String getUri() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105845);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105846);return uri;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setUri(String uri) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105847);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105848);this.uri = uri;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public String getTitle() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105849);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105850);return title;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setTitle(String title) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105851);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105852);this.title = title;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public int getWidth() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105853);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105854);return width;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setWidth(int width) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105855);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105856);this.width = width;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105857);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105858);return height;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setHeight(int height) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105859);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105860);this.height = height;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public String getFormat() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105861);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105862);return format;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setFormat(String format) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105863);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105864);this.format = format;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105865);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105866);return duration;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105867);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105868);this.duration = duration;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public long getSize() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105869);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105870);return size;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setSize(long size) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105871);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105872);this.size = size;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public int getBitrate() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105873);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105874);return bitrate;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setBitrate(int bitrate) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105875);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105876);this.bitrate = bitrate;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public List<String> getPersons() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105877);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105878);return persons;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setPersons(List<String> persons) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105879);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105880);this.persons = persons;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public Player getPlayer() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105881);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105882);return player;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setPlayer(Player player) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105883);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105884);this.player = player;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public String getCopyright() {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105885);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105886);return copyright;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

    public void setCopyright(String copyright) {try{__CLR4_1_1029kl29klluszwj1d.R.inc(105887);
        __CLR4_1_1029kl29klluszwj1d.R.inc(105888);this.copyright = copyright;
    }finally{__CLR4_1_1029kl29klluszwj1d.R.flushNeeded();}}

}
