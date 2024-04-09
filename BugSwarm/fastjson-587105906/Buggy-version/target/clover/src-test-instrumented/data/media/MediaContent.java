/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package data.media;

import java.util.List;

@SuppressWarnings("serial")
public class MediaContent implements java.io.Serializable
{public static class __CLR4_1_1028r528r5lusqkxz8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,104707,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public Media media;
	public List<Image> images;

	public MediaContent() {try{__CLR4_1_1028r528r5lusqkxz8.R.inc(104657);}finally{__CLR4_1_1028r528r5lusqkxz8.R.flushNeeded();}}

	public MediaContent (Media media, List<Image> images) {try{__CLR4_1_1028r528r5lusqkxz8.R.inc(104658);
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104659);this.media = media;
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104660);this.images = images;
	}finally{__CLR4_1_1028r528r5lusqkxz8.R.flushNeeded();}}

	@Override
	public boolean equals(Object o)
	{try{__CLR4_1_1028r528r5lusqkxz8.R.inc(104661);
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104662);if ((((this == o)&&(__CLR4_1_1028r528r5lusqkxz8.R.iget(104663)!=0|true))||(__CLR4_1_1028r528r5lusqkxz8.R.iget(104664)==0&false))) {__CLR4_1_1028r528r5lusqkxz8.R.inc(104665);return true;
		}__CLR4_1_1028r528r5lusqkxz8.R.inc(104666);if ((((o == null || getClass() != o.getClass())&&(__CLR4_1_1028r528r5lusqkxz8.R.iget(104667)!=0|true))||(__CLR4_1_1028r528r5lusqkxz8.R.iget(104668)==0&false))) {__CLR4_1_1028r528r5lusqkxz8.R.inc(104669);return false;

		}__CLR4_1_1028r528r5lusqkxz8.R.inc(104670);MediaContent that = (MediaContent) o;

		__CLR4_1_1028r528r5lusqkxz8.R.inc(104671);if (((((((images != null )&&(__CLR4_1_1028r528r5lusqkxz8.R.iget(104672)!=0|true))||(__CLR4_1_1028r528r5lusqkxz8.R.iget(104673)==0&false))? !images.equals(that.images) : that.images != null)&&(__CLR4_1_1028r528r5lusqkxz8.R.iget(104674)!=0|true))||(__CLR4_1_1028r528r5lusqkxz8.R.iget(104675)==0&false))) {__CLR4_1_1028r528r5lusqkxz8.R.inc(104676);return false;
		}__CLR4_1_1028r528r5lusqkxz8.R.inc(104677);if (((((((media != null )&&(__CLR4_1_1028r528r5lusqkxz8.R.iget(104678)!=0|true))||(__CLR4_1_1028r528r5lusqkxz8.R.iget(104679)==0&false))? !media.equals(that.media) : that.media != null)&&(__CLR4_1_1028r528r5lusqkxz8.R.iget(104680)!=0|true))||(__CLR4_1_1028r528r5lusqkxz8.R.iget(104681)==0&false))) {__CLR4_1_1028r528r5lusqkxz8.R.inc(104682);return false;

		}__CLR4_1_1028r528r5lusqkxz8.R.inc(104683);return true;
	}finally{__CLR4_1_1028r528r5lusqkxz8.R.flushNeeded();}}

	@Override
	public int hashCode()
	{try{__CLR4_1_1028r528r5lusqkxz8.R.inc(104684);
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104685);int result = (((media != null )&&(__CLR4_1_1028r528r5lusqkxz8.R.iget(104686)!=0|true))||(__CLR4_1_1028r528r5lusqkxz8.R.iget(104687)==0&false))? media.hashCode() : 0;
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104688);result = 31 * result + ((((images != null )&&(__CLR4_1_1028r528r5lusqkxz8.R.iget(104689)!=0|true))||(__CLR4_1_1028r528r5lusqkxz8.R.iget(104690)==0&false))? images.hashCode() : 0);
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104691);return result;
	}finally{__CLR4_1_1028r528r5lusqkxz8.R.flushNeeded();}}

	public String toString() {try{__CLR4_1_1028r528r5lusqkxz8.R.inc(104692);
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104693);StringBuilder sb = new StringBuilder();
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104694);sb.append("[MediaContent: ");
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104695);sb.append("media=").append(media);
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104696);sb.append(", images=").append(images);
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104697);sb.append("]");
		__CLR4_1_1028r528r5lusqkxz8.R.inc(104698);return sb.toString();
	}finally{__CLR4_1_1028r528r5lusqkxz8.R.flushNeeded();}}

    public void setMedia(Media media) {try{__CLR4_1_1028r528r5lusqkxz8.R.inc(104699);
        __CLR4_1_1028r528r5lusqkxz8.R.inc(104700);this.media = media;
    }finally{__CLR4_1_1028r528r5lusqkxz8.R.flushNeeded();}}

    public void setImages(List<Image> images) {try{__CLR4_1_1028r528r5lusqkxz8.R.inc(104701);
        __CLR4_1_1028r528r5lusqkxz8.R.inc(104702);this.images = images;
    }finally{__CLR4_1_1028r528r5lusqkxz8.R.flushNeeded();}}

    public Media getMedia() {try{__CLR4_1_1028r528r5lusqkxz8.R.inc(104703);
        __CLR4_1_1028r528r5lusqkxz8.R.inc(104704);return media;
    }finally{__CLR4_1_1028r528r5lusqkxz8.R.flushNeeded();}}

    public List<Image> getImages() {try{__CLR4_1_1028r528r5lusqkxz8.R.inc(104705);
        __CLR4_1_1028r528r5lusqkxz8.R.inc(104706);return images;
    }finally{__CLR4_1_1028r528r5lusqkxz8.R.flushNeeded();}}
}
