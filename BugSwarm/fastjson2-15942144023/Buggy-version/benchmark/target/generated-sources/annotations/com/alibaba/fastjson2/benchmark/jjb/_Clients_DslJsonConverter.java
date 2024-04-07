package com.alibaba.fastjson2.benchmark.jjb;



@javax.annotation.Generated("dsl_json")
public class _Clients_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.alibaba.fastjson2.benchmark.jjb.Clients.class, objectConverter);
		__dsljson.registerReader(com.alibaba.fastjson2.benchmark.jjb.Clients.class, objectConverter);
		__dsljson.registerWriter(com.alibaba.fastjson2.benchmark.jjb.Clients.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.alibaba.fastjson2.benchmark.jjb.Clients>, com.dslplatform.json.JsonReader.BindObject<com.alibaba.fastjson2.benchmark.jjb.Clients> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		private com.dslplatform.json.JsonReader.ReadObject<java.util.List<com.alibaba.fastjson2.benchmark.jjb.Clients.Client>> reader_clients;
		private com.dslplatform.json.JsonReader.ReadObject<java.util.List<com.alibaba.fastjson2.benchmark.jjb.Clients.Client>> reader_clients() {
			if (reader_clients == null) {
				java.lang.reflect.Type manifest = com.dslplatform.json.runtime.Generics.makeParameterizedType(java.util.List.class, com.alibaba.fastjson2.benchmark.jjb.Clients.Client.class);
				reader_clients = __dsljson.tryFindReader(manifest);
				if (reader_clients == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find reader for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return reader_clients;
		}
		private com.dslplatform.json.JsonWriter.WriteObject<java.util.List<com.alibaba.fastjson2.benchmark.jjb.Clients.Client>> writer_clients;
		private com.dslplatform.json.JsonWriter.WriteObject<java.util.List<com.alibaba.fastjson2.benchmark.jjb.Clients.Client>> writer_clients() {
			if (writer_clients == null) {
				java.lang.reflect.Type manifest = com.dslplatform.json.runtime.Generics.makeParameterizedType(java.util.List.class, com.alibaba.fastjson2.benchmark.jjb.Clients.Client.class);
				writer_clients = __dsljson.tryFindWriter(manifest);
				if (writer_clients == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find writer for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return writer_clients;
		}
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Clients read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.alibaba.fastjson2.benchmark.jjb.Clients());
		}
		private static final byte[] quoted_clients = "\"clients\":".getBytes(utf8);
		private static final byte[] name_clients = "clients".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Clients instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Clients instance) {
			writer.writeAscii(quoted_clients);
			if (instance.getClients() == null) writer.writeNull();
			else writer_clients().write(writer, instance.getClients());
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Clients instance) {
			boolean hasWritten = false;
			if (instance.getClients() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_clients); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				writer_clients().write(writer, instance.getClients());
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Clients bind(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Clients instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Clients readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.alibaba.fastjson2.benchmark.jjb.Clients instance = new com.alibaba.fastjson2.benchmark.jjb.Clients();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Clients instance) throws java.io.IOException {
			if (reader.last() == '}') return;
			if (reader.fillNameWeakHash() != 754 || !reader.wasLastName(name_clients)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			instance.setClients(reader_clients().read(reader));
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 1);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Clients instance, int index) throws java.io.IOException {
			switch(reader.getLastHash()) {
				case 1892433815:
					reader.getNextToken();
					instance.setClients(reader_clients().read(reader));
					reader.getNextToken();
					break;
				default:
					reader.getNextToken();
					reader.skip();
			}
			while (reader.last() == ','){
				reader.getNextToken();
				switch(reader.fillName()) {
					case 1892433815:
						reader.getNextToken();
						instance.setClients(reader_clients().read(reader));
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
