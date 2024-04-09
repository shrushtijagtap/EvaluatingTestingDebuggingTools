package com.alibaba.fastjson2.benchmark.jjb;



@javax.annotation.Generated("dsl_json")
public class _Clients$Partner_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.alibaba.fastjson2.benchmark.jjb.Clients.Partner.class, objectConverter);
		__dsljson.registerReader(com.alibaba.fastjson2.benchmark.jjb.Clients.Partner.class, objectConverter);
		__dsljson.registerWriter(com.alibaba.fastjson2.benchmark.jjb.Clients.Partner.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.alibaba.fastjson2.benchmark.jjb.Clients.Partner>, com.dslplatform.json.JsonReader.BindObject<com.alibaba.fastjson2.benchmark.jjb.Clients.Partner> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Clients.Partner read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.alibaba.fastjson2.benchmark.jjb.Clients.Partner());
		}
		private static final byte[] quoted_since = "\"since\":".getBytes(utf8);
		private static final byte[] name_since = "since".getBytes(utf8);
		private static final byte[] quoted_id = ",\"id\":".getBytes(utf8);
		private static final byte[] name_id = "id".getBytes(utf8);
		private static final byte[] quoted_name = ",\"name\":".getBytes(utf8);
		private static final byte[] name_name = "name".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Clients.Partner instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Clients.Partner instance) {
			writer.writeAscii(quoted_since);
			if (instance.getSince() == null) writer.writeNull();
			else com.dslplatform.json.JavaTimeConverter.serialize(instance.getSince(), writer);
			writer.writeAscii(quoted_id);
			com.dslplatform.json.NumberConverter.serialize(instance.getId(), writer);
			writer.writeAscii(quoted_name);
			if (instance.getName() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Clients.Partner instance) {
			boolean hasWritten = false;
			if (instance.getSince() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_since); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.JavaTimeConverter.serialize(instance.getSince(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getId() != 0L) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_id); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.NumberConverter.serialize(instance.getId(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getName() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_name); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Clients.Partner bind(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Clients.Partner instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Clients.Partner readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.alibaba.fastjson2.benchmark.jjb.Clients.Partner instance = new com.alibaba.fastjson2.benchmark.jjb.Clients.Partner();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Clients.Partner instance) throws java.io.IOException {
			if (reader.last() == '}') return;
			if (reader.fillNameWeakHash() != 530 || !reader.wasLastName(name_since)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			if (reader.wasNull()) instance.setSince(null);
			else instance.setSince(com.dslplatform.json.JavaTimeConverter.deserializeDateTime(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 205 || !reader.wasLastName(name_id)) { bindSlow(reader, instance, 1); return; }
			reader.getNextToken();
			instance.setId(com.dslplatform.json.NumberConverter.deserializeLong(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 417 || !reader.wasLastName(name_name)) { bindSlow(reader, instance, 2); return; }
			reader.getNextToken();
			instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 3);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Clients.Partner instance, int index) throws java.io.IOException {
			switch(reader.getLastHash()) {
				case -1925595674:
					reader.getNextToken();
					instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 926444256:
					reader.getNextToken();
					instance.setId(com.dslplatform.json.NumberConverter.deserializeLong(reader));
					reader.getNextToken();
					break;
				case -1254708835:
					reader.getNextToken();
					if (reader.wasNull()) instance.setSince(null);
					else instance.setSince(com.dslplatform.json.JavaTimeConverter.deserializeDateTime(reader));
					reader.getNextToken();
					break;
				default:
					reader.getNextToken();
					reader.skip();
			}
			while (reader.last() == ','){
				reader.getNextToken();
				switch(reader.fillName()) {
					case -1925595674:
						reader.getNextToken();
						instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 926444256:
						reader.getNextToken();
						instance.setId(com.dslplatform.json.NumberConverter.deserializeLong(reader));
						reader.getNextToken();
						break;
					case -1254708835:
						reader.getNextToken();
						if (reader.wasNull()) instance.setSince(null);
						else instance.setSince(com.dslplatform.json.JavaTimeConverter.deserializeDateTime(reader));
						reader.getNextToken();
						break;
					default:
						reader.getNextToken();
						reader.skip();
				}
			}
			if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
		}
	}
}
