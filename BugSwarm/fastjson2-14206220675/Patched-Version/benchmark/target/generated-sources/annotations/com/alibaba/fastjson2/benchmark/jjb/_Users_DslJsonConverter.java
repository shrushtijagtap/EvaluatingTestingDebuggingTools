package com.alibaba.fastjson2.benchmark.jjb;



@javax.annotation.Generated("dsl_json")
public class _Users_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.alibaba.fastjson2.benchmark.jjb.Users.class, objectConverter);
		__dsljson.registerReader(com.alibaba.fastjson2.benchmark.jjb.Users.class, objectConverter);
		__dsljson.registerWriter(com.alibaba.fastjson2.benchmark.jjb.Users.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.alibaba.fastjson2.benchmark.jjb.Users>, com.dslplatform.json.JsonReader.BindObject<com.alibaba.fastjson2.benchmark.jjb.Users> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		private com.dslplatform.json.JsonReader.ReadObject<com.alibaba.fastjson2.benchmark.jjb.Users.User> reader_users;
		private com.dslplatform.json.JsonReader.ReadObject<com.alibaba.fastjson2.benchmark.jjb.Users.User> reader_users() {
			if (reader_users == null) {
				java.lang.reflect.Type manifest = com.alibaba.fastjson2.benchmark.jjb.Users.User.class;
				reader_users = __dsljson.tryFindReader(manifest);
				if (reader_users == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find reader for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return reader_users;
		}
		private com.dslplatform.json.JsonWriter.WriteObject<com.alibaba.fastjson2.benchmark.jjb.Users.User> writer_users;
		private com.dslplatform.json.JsonWriter.WriteObject<com.alibaba.fastjson2.benchmark.jjb.Users.User> writer_users() {
			if (writer_users == null) {
				java.lang.reflect.Type manifest = com.alibaba.fastjson2.benchmark.jjb.Users.User.class;
				writer_users = __dsljson.tryFindWriter(manifest);
				if (writer_users == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find writer for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return writer_users;
		}
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Users read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.alibaba.fastjson2.benchmark.jjb.Users());
		}
		private static final byte[] quoted_users = "\"users\":".getBytes(utf8);
		private static final byte[] name_users = "users".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Users instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Users instance) {
			writer.writeAscii(quoted_users);
			if (instance.getUsers() == null) writer.writeNull();
			else writer.serialize(instance.getUsers(), writer_users());
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Users instance) {
			boolean hasWritten = false;
			if (instance.getUsers() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_users); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				writer.serialize(instance.getUsers(), writer_users());
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Users bind(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Users instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Users readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.alibaba.fastjson2.benchmark.jjb.Users instance = new com.alibaba.fastjson2.benchmark.jjb.Users();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Users instance) throws java.io.IOException {
			if (reader.last() == '}') return;
			if (reader.fillNameWeakHash() != 562 || !reader.wasLastName(name_users)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			instance.setUsers(reader.readCollection(reader_users()));
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 1);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Users instance, int index) throws java.io.IOException {
			switch(reader.getLastHash()) {
				case 1585235219:
					reader.getNextToken();
					instance.setUsers(reader.readCollection(reader_users()));
					reader.getNextToken();
					break;
				default:
					reader.getNextToken();
					reader.skip();
			}
			while (reader.last() == ','){
				reader.getNextToken();
				switch(reader.fillName()) {
					case 1585235219:
						reader.getNextToken();
						instance.setUsers(reader.readCollection(reader_users()));
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
