/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package data.media;

import static data.ReprUtil.repr;

import java.util.List;

@SuppressWarnings("serial")
public class Media implements java.io.Serializable {public static class __CLR4_1_1028md28mdlusqkxxy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,104657,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public Media(){try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104485);
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public Media(String uri, String title, int width, int height, String format, long duration, long size, int bitrate,
                 boolean hasBitrate, List<String> persons, Player player, String copyright){try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104486);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104487);this.uri = uri;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104488);this.title = title;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104489);this.width = width;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104490);this.height = height;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104491);this.format = format;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104492);this.duration = duration;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104493);this.size = size;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104494);this.bitrate = bitrate;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104495);this.hasBitrate = hasBitrate;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104496);this.persons = persons;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104497);this.player = player;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104498);this.copyright = copyright;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104499);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104500);if ((((this == o)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104501)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104502)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104503);return true;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104504);if ((((o == null || getClass() != o.getClass())&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104505)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104506)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104507);return false;

        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104508);Media media = (Media) o;

        __CLR4_1_1028md28mdlusqkxxy.R.inc(104509);if ((((bitrate != media.bitrate)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104510)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104511)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104512);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104513);if ((((duration != media.duration)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104514)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104515)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104516);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104517);if ((((hasBitrate != media.hasBitrate)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104518)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104519)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104520);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104521);if ((((height != media.height)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104522)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104523)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104524);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104525);if ((((size != media.size)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104526)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104527)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104528);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104529);if ((((width != media.width)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104530)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104531)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104532);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104533);if (((((((copyright != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104534)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104535)==0&false))? !copyright.equals(media.copyright) : media.copyright != null)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104536)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104537)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104538);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104539);if (((((((format != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104540)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104541)==0&false))? !format.equals(media.format) : media.format != null)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104542)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104543)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104544);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104545);if (((((((persons != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104546)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104547)==0&false))? !persons.equals(media.persons) : media.persons != null)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104548)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104549)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104550);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104551);if ((((player != media.player)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104552)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104553)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104554);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104555);if (((((((title != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104556)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104557)==0&false))? !title.equals(media.title) : media.title != null)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104558)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104559)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104560);return false;
        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104561);if (((((((uri != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104562)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104563)==0&false))? !uri.equals(media.uri) : media.uri != null)&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104564)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104565)==0&false))) {__CLR4_1_1028md28mdlusqkxxy.R.inc(104566);return false;

        }__CLR4_1_1028md28mdlusqkxxy.R.inc(104567);return true;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104568);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104569);int result = (((uri != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104570)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104571)==0&false))? uri.hashCode() : 0;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104572);result = 31 * result + ((((title != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104573)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104574)==0&false))? title.hashCode() : 0);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104575);result = 31 * result + width;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104576);result = 31 * result + height;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104577);result = 31 * result + ((((format != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104578)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104579)==0&false))? format.hashCode() : 0);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104580);result = 31 * result + (int) (duration ^ (duration >>> 32));
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104581);result = 31 * result + (int) (size ^ (size >>> 32));
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104582);result = 31 * result + bitrate;
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104583);result = 31 * result + ((((hasBitrate )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104584)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104585)==0&false))? 1 : 0);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104586);result = 31 * result + ((((persons != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104587)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104588)==0&false))? persons.hashCode() : 0);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104589);result = 31 * result + ((((player != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104590)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104591)==0&false))? player.hashCode() : 0);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104592);result = 31 * result + ((((copyright != null )&&(__CLR4_1_1028md28mdlusqkxxy.R.iget(104593)!=0|true))||(__CLR4_1_1028md28mdlusqkxxy.R.iget(104594)==0&false))? copyright.hashCode() : 0);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104595);return result;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public String toString() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104596);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104597);StringBuilder sb = new StringBuilder();
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104598);sb.append("[Media ");
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104599);sb.append("uri=").append(repr(uri));
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104600);sb.append(", title=").append(repr(title));
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104601);sb.append(", width=").append(width);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104602);sb.append(", height=").append(height);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104603);sb.append(", format=").append(repr(format));
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104604);sb.append(", duration=").append(duration);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104605);sb.append(", size=").append(size);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104606);sb.append(", hasBitrate=").append(hasBitrate);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104607);sb.append(", bitrate=").append(String.valueOf(bitrate));
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104608);sb.append(", persons=").append(repr(persons));
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104609);sb.append(", player=").append(player);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104610);sb.append(", copyright=").append(copyright);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104611);sb.append("]");
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104612);return sb.toString();
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public String getUri() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104613);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104614);return uri;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setUri(String uri) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104615);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104616);this.uri = uri;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public String getTitle() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104617);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104618);return title;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setTitle(String title) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104619);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104620);this.title = title;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public int getWidth() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104621);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104622);return width;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setWidth(int width) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104623);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104624);this.width = width;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104625);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104626);return height;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setHeight(int height) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104627);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104628);this.height = height;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public String getFormat() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104629);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104630);return format;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setFormat(String format) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104631);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104632);this.format = format;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104633);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104634);return duration;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104635);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104636);this.duration = duration;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public long getSize() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104637);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104638);return size;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setSize(long size) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104639);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104640);this.size = size;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public int getBitrate() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104641);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104642);return bitrate;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setBitrate(int bitrate) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104643);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104644);this.bitrate = bitrate;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public List<String> getPersons() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104645);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104646);return persons;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setPersons(List<String> persons) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104647);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104648);this.persons = persons;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public Player getPlayer() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104649);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104650);return player;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setPlayer(Player player) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104651);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104652);this.player = player;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public String getCopyright() {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104653);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104654);return copyright;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

    public void setCopyright(String copyright) {try{__CLR4_1_1028md28mdlusqkxxy.R.inc(104655);
        __CLR4_1_1028md28mdlusqkxxy.R.inc(104656);this.copyright = copyright;
    }finally{__CLR4_1_1028md28mdlusqkxxy.R.flushNeeded();}}

}
