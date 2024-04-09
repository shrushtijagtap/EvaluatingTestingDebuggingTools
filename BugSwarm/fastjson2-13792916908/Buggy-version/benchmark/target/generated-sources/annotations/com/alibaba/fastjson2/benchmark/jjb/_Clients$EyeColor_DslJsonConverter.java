package com.alibaba.fastjson2.benchmark.jjb;



@javax.annotation.Generated("dsl_json")
public class _Clients$EyeColor_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		EnumConverter enumConverter = new EnumConverter();
		__dsljson.registerWriter(com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor.class, enumConverter);
		__dsljson.registerReader(com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor.class, enumConverter);
	}
	public final static class EnumConverter implements com.dslplatform.json.JsonWriter.WriteObject<com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor>, com.dslplatform.json.JsonReader.ReadObject<com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor> {
		public void write(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor value) {
			if (value == null) writer.writeNull();
			else {
				{ writer.writeByte((byte)'"'); writer.writeAscii(value.name()); writer.writeByte((byte)'"'); }
			}
		}
		public com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return readStatic(reader);
		}
		public static com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor readStatic(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			switch (reader.calcHash()) {
				case 690703:
					return com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor.BROWN;
				case 750204685:
					return com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor.BLUE;
				case -1419603108:
					return com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor.GREEN;
				default:
					return com.alibaba.fastjson2.benchmark.jjb.Clients.EyeColor.valueOf(reader.getLastName());
			}
		}
	}
}
