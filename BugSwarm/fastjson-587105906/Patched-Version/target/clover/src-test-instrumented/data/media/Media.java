/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data.media;

import static data.ReprUtil.repr;

import java.util.List;

@SuppressWarnings("serial")
public class Media implements java.io.Serializable {public static class __CLR4_5_228m228m2lusyjxc7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,104646,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public Media(){try{__CLR4_5_228m228m2lusyjxc7.R.inc(104474);
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public Media(String uri, String title, int width, int height, String format, long duration, long size, int bitrate,
                 boolean hasBitrate, List<String> persons, Player player, String copyright){try{__CLR4_5_228m228m2lusyjxc7.R.inc(104475);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104476);this.uri = uri;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104477);this.title = title;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104478);this.width = width;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104479);this.height = height;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104480);this.format = format;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104481);this.duration = duration;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104482);this.size = size;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104483);this.bitrate = bitrate;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104484);this.hasBitrate = hasBitrate;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104485);this.persons = persons;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104486);this.player = player;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104487);this.copyright = copyright;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104488);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104489);if ((((this == o)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104490)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104491)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104492);return true;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104493);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104494)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104495)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104496);return false;

        }__CLR4_5_228m228m2lusyjxc7.R.inc(104497);Media media = (Media) o;

        __CLR4_5_228m228m2lusyjxc7.R.inc(104498);if ((((bitrate != media.bitrate)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104499)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104500)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104501);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104502);if ((((duration != media.duration)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104503)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104504)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104505);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104506);if ((((hasBitrate != media.hasBitrate)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104507)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104508)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104509);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104510);if ((((height != media.height)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104511)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104512)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104513);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104514);if ((((size != media.size)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104515)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104516)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104517);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104518);if ((((width != media.width)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104519)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104520)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104521);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104522);if (((((((copyright != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104523)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104524)==0&false))? !copyright.equals(media.copyright) : media.copyright != null)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104525)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104526)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104527);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104528);if (((((((format != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104529)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104530)==0&false))? !format.equals(media.format) : media.format != null)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104531)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104532)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104533);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104534);if (((((((persons != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104535)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104536)==0&false))? !persons.equals(media.persons) : media.persons != null)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104537)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104538)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104539);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104540);if ((((player != media.player)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104541)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104542)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104543);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104544);if (((((((title != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104545)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104546)==0&false))? !title.equals(media.title) : media.title != null)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104547)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104548)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104549);return false;
        }__CLR4_5_228m228m2lusyjxc7.R.inc(104550);if (((((((uri != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104551)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104552)==0&false))? !uri.equals(media.uri) : media.uri != null)&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104553)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104554)==0&false))) {__CLR4_5_228m228m2lusyjxc7.R.inc(104555);return false;

        }__CLR4_5_228m228m2lusyjxc7.R.inc(104556);return true;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104557);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104558);int result = (((uri != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104559)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104560)==0&false))? uri.hashCode() : 0;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104561);result = 31 * result + ((((title != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104562)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104563)==0&false))? title.hashCode() : 0);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104564);result = 31 * result + width;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104565);result = 31 * result + height;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104566);result = 31 * result + ((((format != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104567)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104568)==0&false))? format.hashCode() : 0);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104569);result = 31 * result + (int) (duration ^ (duration >>> 32));
        __CLR4_5_228m228m2lusyjxc7.R.inc(104570);result = 31 * result + (int) (size ^ (size >>> 32));
        __CLR4_5_228m228m2lusyjxc7.R.inc(104571);result = 31 * result + bitrate;
        __CLR4_5_228m228m2lusyjxc7.R.inc(104572);result = 31 * result + ((((hasBitrate )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104573)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104574)==0&false))? 1 : 0);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104575);result = 31 * result + ((((persons != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104576)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104577)==0&false))? persons.hashCode() : 0);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104578);result = 31 * result + ((((player != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104579)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104580)==0&false))? player.hashCode() : 0);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104581);result = 31 * result + ((((copyright != null )&&(__CLR4_5_228m228m2lusyjxc7.R.iget(104582)!=0|true))||(__CLR4_5_228m228m2lusyjxc7.R.iget(104583)==0&false))? copyright.hashCode() : 0);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104584);return result;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104585);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104586);StringBuilder sb = new StringBuilder();
        __CLR4_5_228m228m2lusyjxc7.R.inc(104587);sb.append("[Media ");
        __CLR4_5_228m228m2lusyjxc7.R.inc(104588);sb.append("uri=").append(repr(uri));
        __CLR4_5_228m228m2lusyjxc7.R.inc(104589);sb.append(", title=").append(repr(title));
        __CLR4_5_228m228m2lusyjxc7.R.inc(104590);sb.append(", width=").append(width);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104591);sb.append(", height=").append(height);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104592);sb.append(", format=").append(repr(format));
        __CLR4_5_228m228m2lusyjxc7.R.inc(104593);sb.append(", duration=").append(duration);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104594);sb.append(", size=").append(size);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104595);sb.append(", hasBitrate=").append(hasBitrate);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104596);sb.append(", bitrate=").append(String.valueOf(bitrate));
        __CLR4_5_228m228m2lusyjxc7.R.inc(104597);sb.append(", persons=").append(repr(persons));
        __CLR4_5_228m228m2lusyjxc7.R.inc(104598);sb.append(", player=").append(player);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104599);sb.append(", copyright=").append(copyright);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104600);sb.append("]");
        __CLR4_5_228m228m2lusyjxc7.R.inc(104601);return sb.toString();
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public String getUri() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104602);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104603);return uri;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setUri(String uri) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104604);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104605);this.uri = uri;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public String getTitle() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104606);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104607);return title;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setTitle(String title) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104608);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104609);this.title = title;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public int getWidth() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104610);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104611);return width;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setWidth(int width) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104612);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104613);this.width = width;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104614);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104615);return height;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setHeight(int height) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104616);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104617);this.height = height;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public String getFormat() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104618);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104619);return format;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setFormat(String format) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104620);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104621);this.format = format;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104622);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104623);return duration;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setDuration(long duration) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104624);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104625);this.duration = duration;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public long getSize() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104626);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104627);return size;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setSize(long size) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104628);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104629);this.size = size;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public int getBitrate() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104630);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104631);return bitrate;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setBitrate(int bitrate) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104632);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104633);this.bitrate = bitrate;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public List<String> getPersons() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104634);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104635);return persons;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setPersons(List<String> persons) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104636);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104637);this.persons = persons;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public Player getPlayer() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104638);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104639);return player;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setPlayer(Player player) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104640);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104641);this.player = player;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public String getCopyright() {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104642);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104643);return copyright;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

    public void setCopyright(String copyright) {try{__CLR4_5_228m228m2lusyjxc7.R.inc(104644);
        __CLR4_5_228m228m2lusyjxc7.R.inc(104645);this.copyright = copyright;
    }finally{__CLR4_5_228m228m2lusyjxc7.R.flushNeeded();}}

}
