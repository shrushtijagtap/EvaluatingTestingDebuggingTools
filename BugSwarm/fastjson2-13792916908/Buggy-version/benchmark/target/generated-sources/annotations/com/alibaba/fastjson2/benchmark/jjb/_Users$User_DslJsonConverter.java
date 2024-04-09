package com.alibaba.fastjson2.benchmark.jjb;



@javax.annotation.Generated("dsl_json")
public class _Users$User_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.alibaba.fastjson2.benchmark.jjb.Users.User.class, objectConverter);
		__dsljson.registerReader(com.alibaba.fastjson2.benchmark.jjb.Users.User.class, objectConverter);
		__dsljson.registerWriter(com.alibaba.fastjson2.benchmark.jjb.Users.User.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.alibaba.fastjson2.benchmark.jjb.Users.User>, com.dslplatform.json.JsonReader.BindObject<com.alibaba.fastjson2.benchmark.jjb.Users.User> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		private com.dslplatform.json.JsonReader.ReadObject<com.alibaba.fastjson2.benchmark.jjb.Users.Friend> reader_friends;
		private com.dslplatform.json.JsonReader.ReadObject<com.alibaba.fastjson2.benchmark.jjb.Users.Friend> reader_friends() {
			if (reader_friends == null) {
				java.lang.reflect.Type manifest = com.alibaba.fastjson2.benchmark.jjb.Users.Friend.class;
				reader_friends = __dsljson.tryFindReader(manifest);
				if (reader_friends == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find reader for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return reader_friends;
		}
		private com.dslplatform.json.JsonWriter.WriteObject<com.alibaba.fastjson2.benchmark.jjb.Users.Friend> writer_friends;
		private com.dslplatform.json.JsonWriter.WriteObject<com.alibaba.fastjson2.benchmark.jjb.Users.Friend> writer_friends() {
			if (writer_friends == null) {
				java.lang.reflect.Type manifest = com.alibaba.fastjson2.benchmark.jjb.Users.Friend.class;
				writer_friends = __dsljson.tryFindWriter(manifest);
				if (writer_friends == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find writer for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return writer_friends;
		}
		private final com.dslplatform.json.JsonReader.ReadObject<java.lang.String> reader_tags;
		private final com.dslplatform.json.JsonWriter.WriteObject<java.lang.String> writer_tags;
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
			this.reader_tags = com.dslplatform.json.StringConverter.READER;
			this.writer_tags = com.dslplatform.json.StringConverter.WRITER;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Users.User read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.alibaba.fastjson2.benchmark.jjb.Users.User());
		}
		private static final byte[] quoted_longitude = "\"longitude\":".getBytes(utf8);
		private static final byte[] name_longitude = "longitude".getBytes(utf8);
		private static final byte[] quoted_email = ",\"email\":".getBytes(utf8);
		private static final byte[] name_email = "email".getBytes(utf8);
		private static final byte[] quoted_age = ",\"age\":".getBytes(utf8);
		private static final byte[] name_age = "age".getBytes(utf8);
		private static final byte[] quoted_id = ",\"id\":".getBytes(utf8);
		private static final byte[] name_id = "id".getBytes(utf8);
		private static final byte[] quoted_company = ",\"company\":".getBytes(utf8);
		private static final byte[] name_company = "company".getBytes(utf8);
		private static final byte[] quoted_guid = ",\"guid\":".getBytes(utf8);
		private static final byte[] name_guid = "guid".getBytes(utf8);
		private static final byte[] quoted_name = ",\"name\":".getBytes(utf8);
		private static final byte[] name_name = "name".getBytes(utf8);
		private static final byte[] quoted_phone = ",\"phone\":".getBytes(utf8);
		private static final byte[] name_phone = "phone".getBytes(utf8);
		private static final byte[] quoted_eyeColor = ",\"eyeColor\":".getBytes(utf8);
		private static final byte[] name_eyeColor = "eyeColor".getBytes(utf8);
		private static final byte[] quoted_balance = ",\"balance\":".getBytes(utf8);
		private static final byte[] name_balance = "balance".getBytes(utf8);
		private static final byte[] quoted_favoriteFruit = ",\"favoriteFruit\":".getBytes(utf8);
		private static final byte[] name_favoriteFruit = "favoriteFruit".getBytes(utf8);
		private static final byte[] quoted_tags = ",\"tags\":".getBytes(utf8);
		private static final byte[] name_tags = "tags".getBytes(utf8);
		private static final byte[] quoted_friends = ",\"friends\":".getBytes(utf8);
		private static final byte[] name_friends = "friends".getBytes(utf8);
		private static final byte[] quoted_picture = ",\"picture\":".getBytes(utf8);
		private static final byte[] name_picture = "picture".getBytes(utf8);
		private static final byte[] quoted_registered = ",\"registered\":".getBytes(utf8);
		private static final byte[] name_registered = "registered".getBytes(utf8);
		private static final byte[] quoted_active = ",\"active\":".getBytes(utf8);
		private static final byte[] name_active = "active".getBytes(utf8);
		private static final byte[] quoted_index = ",\"index\":".getBytes(utf8);
		private static final byte[] name_index = "index".getBytes(utf8);
		private static final byte[] quoted_about = ",\"about\":".getBytes(utf8);
		private static final byte[] name_about = "about".getBytes(utf8);
		private static final byte[] quoted_greeting = ",\"greeting\":".getBytes(utf8);
		private static final byte[] name_greeting = "greeting".getBytes(utf8);
		private static final byte[] quoted_latitude = ",\"latitude\":".getBytes(utf8);
		private static final byte[] name_latitude = "latitude".getBytes(utf8);
		private static final byte[] quoted_gender = ",\"gender\":".getBytes(utf8);
		private static final byte[] name_gender = "gender".getBytes(utf8);
		private static final byte[] quoted_address = ",\"address\":".getBytes(utf8);
		private static final byte[] name_address = "address".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Users.User instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Users.User instance) {
			writer.writeAscii(quoted_longitude);
			com.dslplatform.json.NumberConverter.serialize(instance.getLongitude(), writer);
			writer.writeAscii(quoted_email);
			if (instance.getEmail() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getEmail(), writer);
			writer.writeAscii(quoted_age);
			com.dslplatform.json.NumberConverter.serialize(instance.getAge(), writer);
			writer.writeAscii(quoted_id);
			if (instance.getId() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getId(), writer);
			writer.writeAscii(quoted_company);
			if (instance.getCompany() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getCompany(), writer);
			writer.writeAscii(quoted_guid);
			if (instance.getGuid() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getGuid(), writer);
			writer.writeAscii(quoted_name);
			if (instance.getName() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
			writer.writeAscii(quoted_phone);
			if (instance.getPhone() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getPhone(), writer);
			writer.writeAscii(quoted_eyeColor);
			if (instance.getEyeColor() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getEyeColor(), writer);
			writer.writeAscii(quoted_balance);
			if (instance.getBalance() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getBalance(), writer);
			writer.writeAscii(quoted_favoriteFruit);
			if (instance.getFavoriteFruit() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getFavoriteFruit(), writer);
			writer.writeAscii(quoted_tags);
			if (instance.getTags() == null) throw new com.dslplatform.json.ConfigurationException("Property 'tags' is not allowed to be null");
			writer.serialize(instance.getTags(), writer_tags);
			writer.writeAscii(quoted_friends);
			if (instance.getFriends() == null) throw new com.dslplatform.json.ConfigurationException("Property 'friends' is not allowed to be null");
			writer.serialize(instance.getFriends(), writer_friends());
			writer.writeAscii(quoted_picture);
			if (instance.getPicture() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getPicture(), writer);
			writer.writeAscii(quoted_registered);
			if (instance.getRegistered() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getRegistered(), writer);
			writer.writeAscii(quoted_active);
			com.dslplatform.json.BoolConverter.serialize(instance.isActive(), writer);
			writer.writeAscii(quoted_index);
			com.dslplatform.json.NumberConverter.serialize(instance.getIndex(), writer);
			writer.writeAscii(quoted_about);
			if (instance.getAbout() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getAbout(), writer);
			writer.writeAscii(quoted_greeting);
			if (instance.getGreeting() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getGreeting(), writer);
			writer.writeAscii(quoted_latitude);
			com.dslplatform.json.NumberConverter.serialize(instance.getLatitude(), writer);
			writer.writeAscii(quoted_gender);
			if (instance.getGender() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getGender(), writer);
			writer.writeAscii(quoted_address);
			if (instance.getAddress() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getAddress(), writer);
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.alibaba.fastjson2.benchmark.jjb.Users.User instance) {
			boolean hasWritten = false;
			if (instance.getLongitude() != 0.0) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_longitude); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.NumberConverter.serialize(instance.getLongitude(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getEmail() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_email); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getEmail(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getAge() != 0) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_age); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.NumberConverter.serialize(instance.getAge(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getId() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_id); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getId(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getCompany() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_company); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getCompany(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getGuid() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_guid); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getGuid(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getName() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_name); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getPhone() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_phone); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getPhone(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getEyeColor() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_eyeColor); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getEyeColor(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getBalance() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_balance); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getBalance(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getFavoriteFruit() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_favoriteFruit); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getFavoriteFruit(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getTags() != null && !instance.getTags().isEmpty()) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_tags); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				writer.serialize(instance.getTags(), writer_tags);
				writer.writeByte((byte)','); hasWritten = true;
			} else if (instance.getTags() == null) throw new com.dslplatform.json.ConfigurationException("Property 'tags' is not allowed to be null");
			if (instance.getFriends() != null && !instance.getFriends().isEmpty()) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_friends); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				writer.serialize(instance.getFriends(), writer_friends());
				writer.writeByte((byte)','); hasWritten = true;
			} else if (instance.getFriends() == null) throw new com.dslplatform.json.ConfigurationException("Property 'friends' is not allowed to be null");
			if (instance.getPicture() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_picture); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getPicture(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getRegistered() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_registered); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getRegistered(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.isActive() != false) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_active); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.BoolConverter.serialize(instance.isActive(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getIndex() != 0) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_index); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.NumberConverter.serialize(instance.getIndex(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getAbout() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_about); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getAbout(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getGreeting() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_greeting); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getGreeting(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getLatitude() != 0.0) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_latitude); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.NumberConverter.serialize(instance.getLatitude(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getGender() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_gender); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getGender(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getAddress() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_address); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getAddress(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Users.User bind(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Users.User instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.alibaba.fastjson2.benchmark.jjb.Users.User readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.alibaba.fastjson2.benchmark.jjb.Users.User instance = new com.alibaba.fastjson2.benchmark.jjb.Users.User();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Users.User instance) throws java.io.IOException {
			if (reader.last() == '}') {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.fillNameWeakHash() != 971 || !reader.wasLastName(name_longitude)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			instance.setLongitude(com.dslplatform.json.NumberConverter.deserializeDouble(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 520 || !reader.wasLastName(name_email)) { bindSlow(reader, instance, 1); return; }
			reader.getNextToken();
			instance.setEmail(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 301 || !reader.wasLastName(name_age)) { bindSlow(reader, instance, 2); return; }
			reader.getNextToken();
			instance.setAge(com.dslplatform.json.NumberConverter.deserializeInt(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 205 || !reader.wasLastName(name_id)) { bindSlow(reader, instance, 3); return; }
			reader.getNextToken();
			instance.setId(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 759 || !reader.wasLastName(name_company)) { bindSlow(reader, instance, 4); return; }
			reader.getNextToken();
			instance.setCompany(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 425 || !reader.wasLastName(name_guid)) { bindSlow(reader, instance, 5); return; }
			reader.getNextToken();
			instance.setGuid(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 417 || !reader.wasLastName(name_name)) { bindSlow(reader, instance, 6); return; }
			reader.getNextToken();
			instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 538 || !reader.wasLastName(name_phone)) { bindSlow(reader, instance, 7); return; }
			reader.getNextToken();
			instance.setPhone(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 834 || !reader.wasLastName(name_eyeColor)) { bindSlow(reader, instance, 8); return; }
			reader.getNextToken();
			instance.setEyeColor(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 710 || !reader.wasLastName(name_balance)) { bindSlow(reader, instance, 9); return; }
			reader.getNextToken();
			instance.setBalance(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 1386 || !reader.wasLastName(name_favoriteFruit)) { bindSlow(reader, instance, 10); return; }
			reader.getNextToken();
			instance.setFavoriteFruit(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getTags() == null) instance.setTags(java.util.Collections.emptyList());
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 431 || !reader.wasLastName(name_tags)) { bindSlow(reader, instance, 11); return; }
			reader.getNextToken();
			if (reader.wasNull()) throw reader.newParseErrorAt("Property 'tags' is not allowed to be null", 0);
			instance.setTags(reader.readCollection(reader_tags));
			if (reader.getNextToken() == '}')  {
				if (instance.getFriends() == null) instance.setFriends(java.util.Collections.emptyList());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 747 || !reader.wasLastName(name_friends)) { bindSlow(reader, instance, 12); return; }
			reader.getNextToken();
			if (reader.wasNull()) throw reader.newParseErrorAt("Property 'friends' is not allowed to be null", 0);
			instance.setFriends(reader.readCollection(reader_friends()));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 764 || !reader.wasLastName(name_picture)) { bindSlow(reader, instance, 13); return; }
			reader.getNextToken();
			instance.setPicture(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 1070 || !reader.wasLastName(name_registered)) { bindSlow(reader, instance, 14); return; }
			reader.getNextToken();
			instance.setRegistered(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 636 || !reader.wasLastName(name_active)) { bindSlow(reader, instance, 15); return; }
			reader.getNextToken();
			instance.setActive(com.dslplatform.json.BoolConverter.deserialize(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 536 || !reader.wasLastName(name_index)) { bindSlow(reader, instance, 16); return; }
			reader.getNextToken();
			instance.setIndex(com.dslplatform.json.NumberConverter.deserializeInt(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 539 || !reader.wasLastName(name_about)) { bindSlow(reader, instance, 17); return; }
			reader.getNextToken();
			instance.setAbout(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 853 || !reader.wasLastName(name_greeting)) { bindSlow(reader, instance, 18); return; }
			reader.getNextToken();
			instance.setGreeting(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 860 || !reader.wasLastName(name_latitude)) { bindSlow(reader, instance, 19); return; }
			reader.getNextToken();
			instance.setLatitude(com.dslplatform.json.NumberConverter.deserializeDouble(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 629 || !reader.wasLastName(name_gender)) { bindSlow(reader, instance, 20); return; }
			reader.getNextToken();
			instance.setGender(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 742 || !reader.wasLastName(name_address)) { bindSlow(reader, instance, 21); return; }
			reader.getNextToken();
			instance.setAddress(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 22);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.alibaba.fastjson2.benchmark.jjb.Users.User instance, int index) throws java.io.IOException {
			boolean __detected_tags__ = index > 11;
			boolean __detected_friends__ = index > 12;
			switch(reader.getLastHash()) {
				case 745154899:
					reader.getNextToken();
					instance.setAddress(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 1587320192:
					reader.getNextToken();
					instance.setGender(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -1971374779:
					reader.getNextToken();
					instance.setLatitude(com.dslplatform.json.NumberConverter.deserializeDouble(reader));
					reader.getNextToken();
					break;
				case -722616394:
					reader.getNextToken();
					instance.setGreeting(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -1289514434:
					reader.getNextToken();
					instance.setAbout(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 151693739:
					reader.getNextToken();
					instance.setIndex(com.dslplatform.json.NumberConverter.deserializeInt(reader));
					reader.getNextToken();
					break;
				case -646604497:
					reader.getNextToken();
					instance.setActive(com.dslplatform.json.BoolConverter.deserialize(reader));
					reader.getNextToken();
					break;
				case -481727807:
					reader.getNextToken();
					instance.setRegistered(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 825217929:
					reader.getNextToken();
					instance.setPicture(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -1948525350:
					__detected_friends__ = true;
					reader.getNextToken();
					if (reader.wasNull()) throw reader.newParseErrorAt("Property 'friends' is not allowed to be null", 0);
					instance.setFriends(reader.readCollection(reader_friends()));
					reader.getNextToken();
					break;
				case -199824480:
					__detected_tags__ = true;
					reader.getNextToken();
					if (reader.wasNull()) throw reader.newParseErrorAt("Property 'tags' is not allowed to be null", 0);
					instance.setTags(reader.readCollection(reader_tags));
					reader.getNextToken();
					break;
				case -2077241639:
					reader.getNextToken();
					instance.setFavoriteFruit(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -1734700309:
					reader.getNextToken();
					instance.setBalance(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -1787139827:
					reader.getNextToken();
					instance.setEyeColor(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 2000032175:
					reader.getNextToken();
					instance.setPhone(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -1925595674:
					reader.getNextToken();
					instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 748388108:
					reader.getNextToken();
					instance.setGuid(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -1436358468:
					reader.getNextToken();
					instance.setCompany(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 926444256:
					reader.getNextToken();
					instance.setId(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 742476188:
					reader.getNextToken();
					instance.setAge(com.dslplatform.json.NumberConverter.deserializeInt(reader));
					reader.getNextToken();
					break;
				case -1970842681:
					reader.getNextToken();
					instance.setEmail(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -357258418:
					reader.getNextToken();
					instance.setLongitude(com.dslplatform.json.NumberConverter.deserializeDouble(reader));
					reader.getNextToken();
					break;
				default:
					reader.getNextToken();
					reader.skip();
			}
			while (reader.last() == ','){
				reader.getNextToken();
				switch(reader.fillName()) {
					case 745154899:
						reader.getNextToken();
						instance.setAddress(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 1587320192:
						reader.getNextToken();
						instance.setGender(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -1971374779:
						reader.getNextToken();
						instance.setLatitude(com.dslplatform.json.NumberConverter.deserializeDouble(reader));
						reader.getNextToken();
						break;
					case -722616394:
						reader.getNextToken();
						instance.setGreeting(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -1289514434:
						reader.getNextToken();
						instance.setAbout(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 151693739:
						reader.getNextToken();
						instance.setIndex(com.dslplatform.json.NumberConverter.deserializeInt(reader));
						reader.getNextToken();
						break;
					case -646604497:
						reader.getNextToken();
						instance.setActive(com.dslplatform.json.BoolConverter.deserialize(reader));
						reader.getNextToken();
						break;
					case -481727807:
						reader.getNextToken();
						instance.setRegistered(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 825217929:
						reader.getNextToken();
						instance.setPicture(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -1948525350:
						__detected_friends__ = true;
						reader.getNextToken();
						if (reader.wasNull()) throw reader.newParseErrorAt("Property 'friends' is not allowed to be null", 0);
						instance.setFriends(reader.readCollection(reader_friends()));
						reader.getNextToken();
						break;
					case -199824480:
						__detected_tags__ = true;
						reader.getNextToken();
						if (reader.wasNull()) throw reader.newParseErrorAt("Property 'tags' is not allowed to be null", 0);
						instance.setTags(reader.readCollection(reader_tags));
						reader.getNextToken();
						break;
					case -2077241639:
						reader.getNextToken();
						instance.setFavoriteFruit(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -1734700309:
						reader.getNextToken();
						instance.setBalance(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -1787139827:
						reader.getNextToken();
						instance.setEyeColor(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 2000032175:
						reader.getNextToken();
						instance.setPhone(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -1925595674:
						reader.getNextToken();
						instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 748388108:
						reader.getNextToken();
						instance.setGuid(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -1436358468:
						reader.getNextToken();
						instance.setCompany(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 926444256:
						reader.getNextToken();
						instance.setId(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 742476188:
						reader.getNextToken();
						instance.setAge(com.dslplatform.json.NumberConverter.deserializeInt(reader));
						reader.getNextToken();
						break;
					case -1970842681:
						reader.getNextToken();
						instance.setEmail(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -357258418:
						reader.getNextToken();
						instance.setLongitude(com.dslplatform.json.NumberConverter.deserializeDouble(reader));
						reader.getNextToken();
						break;
					default:
						reader.getNextToken();
						reader.skip();
				}
			}
			if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			if (!__detected_tags__ && instance.getTags() == null) {
				instance.setTags(java.util.Collections.emptyList());
			}
			if (!__detected_friends__ && instance.getFriends() == null) {
				instance.setFriends(java.util.Collections.emptyList());
			}
		}
	}
}
