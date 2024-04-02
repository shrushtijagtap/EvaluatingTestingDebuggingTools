package org.apache.commons.collections4.trie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test501");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap6 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap6.mapIterator();
        int int8 = serializableMap6.modCount;
        serializableMap6.clear();
        java.io.Serializable serializable10 = serializableMap0.replace("", (java.io.Serializable) serializableMap6);
        java.lang.String str12 = serializableMap6.selectKey("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.lang.Object obj13 = null;
        java.io.Serializable serializable14 = serializableMap6.get(obj13);
        java.lang.Object obj15 = null;
        java.io.Serializable serializable16 = serializableMap6.get(obj15);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap17.mapIterator();
        java.util.Set set20 = serializableMap17.keySet();
        serializableMap17.clear();
        java.lang.String str23 = serializableMap17.selectKey("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap24 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap25 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap25.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor27 = serializableMap25.mapIterator();
        serializableMap24.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap25);
        java.lang.String str30 = serializableMap24.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap32 = serializableMap24.prefixMap("hi!");
        serializableMap17.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap24);
        boolean boolean34 = serializableMap6.equals((java.lang.Object) serializableMap17);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap35 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor36 = serializableMap35.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor37 = serializableMap35.mapIterator();
        java.util.Set set38 = serializableMap35.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap40 = serializableMap35.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor41 = serializableMap35.mapIterator();
        int int42 = serializableMap35.size();
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry44 = serializableMap35.select("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set set45 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry47 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap35, set45, 0);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap48 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap49 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor50 = serializableMap49.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor51 = serializableMap49.mapIterator();
        serializableMap48.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap49);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry55 = serializableMap48.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry56 = serializableMap35.previousEntry(strTrieEntry55);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry57 = serializableMap6.followRight(strTrieEntry55);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(strEntry44);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNotNull(strItor51);
        org.junit.Assert.assertNotNull(strTrieEntry55);
        org.junit.Assert.assertNull(strTrieEntry56);
        org.junit.Assert.assertNull(strTrieEntry57);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.prefixMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strItor6);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean4 = stringKeyAnalyzer0.isBitSet("hi!", (int) (short) 1, 10);
        int int7 = stringKeyAnalyzer0.compare("", "hi!");
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        boolean boolean14 = serializableMap9.containsKey((java.lang.Object) "hi!");
        java.util.Set set15 = serializableMap9.keySet();
        java.util.Set set16 = strMapTrieEntry6.setValue(set15);
        boolean boolean17 = strMapTrieEntry6.isExternalNode();
        boolean boolean18 = strMapTrieEntry6.isInternalNode();
        boolean boolean19 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        int int22 = serializableMap20.modCount;
        serializableMap20.clear();
        org.apache.commons.collections4.trie.KeyAnalyzer<? super java.lang.String> wildcardKeyAnalyzer24 = serializableMap20.getKeyAnalyzer();
        strMapTrieEntry6.key = serializableMap20;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardKeyAnalyzer24);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        java.util.Set<java.lang.String> strSet16 = serializableMap1.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap17 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap18.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap18.mapIterator();
        java.util.Set set21 = serializableMap18.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry23 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap17, set21, (int) ' ');
        java.lang.String str24 = strMapTrieEntry23.toString();
        strMapTrieEntry23.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap27 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap27.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap27.mapIterator();
        java.util.Set set30 = serializableMap27.keySet();
        boolean boolean32 = serializableMap27.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor33 = serializableMap27.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap34 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor35 = serializableMap34.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection36 = serializableMap34.values();
        java.util.Set<java.lang.String> strSet37 = serializableMap34.keySet();
        java.util.Set set38 = strMapTrieEntry23.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap27, (java.util.Set) strSet37);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>> strMapTrieEntry40 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>>((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1, (java.util.Map<java.lang.String, java.io.Serializable>) serializableMap27, (int) '4');
        java.util.Set set41 = serializableMap27.keySet();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap42 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor43 = serializableMap42.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor44 = serializableMap42.mapIterator();
        java.util.Set set45 = serializableMap42.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap47 = serializableMap42.tailMap("hi!");
        java.util.Set<java.lang.String> strSet48 = serializableMap42.keySet();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap49 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor50 = serializableMap49.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor51 = serializableMap49.mapIterator();
        java.util.Set set52 = serializableMap49.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap54 = serializableMap49.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor55 = serializableMap49.mapIterator();
        int int56 = serializableMap49.size();
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry58 = serializableMap49.select("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set set59 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry61 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap49, set59, 0);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap63 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor64 = serializableMap63.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor65 = serializableMap63.mapIterator();
        java.util.Set set66 = serializableMap63.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap68 = serializableMap63.tailMap("hi!");
        java.util.Comparator<? super java.lang.String> wildcardComparator69 = serializableMap63.comparator();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry72 = serializableMap63.getNearestEntryForKey("Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])", 1);
        java.io.Serializable serializable73 = serializableMap49.putIfAbsent("hi!", (java.io.Serializable) strTrieEntry72);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry74 = serializableMap42.previousEntry(strTrieEntry72);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry75 = serializableMap27.previousEntry(strTrieEntry72);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str24, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNotNull(serializableCollection36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNotNull(strItor51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strItor55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(strEntry58);
        org.junit.Assert.assertNotNull(strItor64);
        org.junit.Assert.assertNotNull(strItor65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNotNull(wildcardComparator69);
        org.junit.Assert.assertNotNull(strTrieEntry72);
        org.junit.Assert.assertNull(serializable73);
        org.junit.Assert.assertNull(strTrieEntry74);
        org.junit.Assert.assertNull(strTrieEntry75);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        serializableMap0.clear();
        java.lang.String str6 = serializableMap0.selectKey("");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet7 = serializableMap0.entrySet();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap0);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap10 = serializableMap8.headMap("Entry(key={} [100], value=null, parent=null, left={} [100], right=null, predecessor={} [100])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strEntrySet7);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.Collection<java.io.Serializable> serializableCollection5 = serializableMap0.values();
        java.lang.String str7 = serializableMap0.previousKey("hi!");
        java.lang.Object obj8 = null;
        java.io.Serializable serializable9 = serializableMap0.remove(obj8);
        java.lang.String str11 = serializableMap0.previousKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap12 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor13 = serializableMap12.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap12.mapIterator();
        java.util.Set set15 = serializableMap12.keySet();
        boolean boolean17 = serializableMap12.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap12.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        serializableMap19.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry25 = serializableMap20.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap26 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap27 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap27.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap27.mapIterator();
        serializableMap26.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap27);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry33 = serializableMap26.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry34 = serializableMap20.nextEntry(strTrieEntry33);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap35 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap36 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor37 = serializableMap36.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor38 = serializableMap36.mapIterator();
        serializableMap35.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap36);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry41 = serializableMap36.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap42 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap43 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor44 = serializableMap43.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor45 = serializableMap43.mapIterator();
        serializableMap42.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap43);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry49 = serializableMap42.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry50 = serializableMap36.nextEntry(strTrieEntry49);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap51 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap52 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor53 = serializableMap52.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor54 = serializableMap52.mapIterator();
        serializableMap51.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap52);
        java.lang.String str57 = serializableMap51.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap58 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor59 = serializableMap58.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor60 = serializableMap58.mapIterator();
        java.util.Set set61 = serializableMap58.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap63 = serializableMap58.tailMap("hi!");
        java.io.Serializable serializable65 = serializableMap58.selectValue("");
        boolean boolean68 = serializableMap58.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable69 = serializableMap51.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap70 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap71 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor72 = serializableMap71.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor73 = serializableMap71.mapIterator();
        serializableMap70.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap71);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry77 = serializableMap70.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry78 = serializableMap51.nextEntry(strTrieEntry77);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry79 = serializableMap12.nextEntryImpl(strTrieEntry33, strTrieEntry50, strTrieEntry77);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry80 = serializableMap0.nextEntry(strTrieEntry50);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNull(strTrieEntry25);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(strTrieEntry33);
        org.junit.Assert.assertNull(strTrieEntry34);
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNull(strTrieEntry41);
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertNotNull(strTrieEntry49);
        org.junit.Assert.assertNull(strTrieEntry50);
        org.junit.Assert.assertNotNull(strItor53);
        org.junit.Assert.assertNotNull(strItor54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strItor59);
        org.junit.Assert.assertNotNull(strItor60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNull(serializable65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(serializable69);
        org.junit.Assert.assertNotNull(strItor72);
        org.junit.Assert.assertNotNull(strItor73);
        org.junit.Assert.assertNotNull(strTrieEntry77);
        org.junit.Assert.assertNull(strTrieEntry78);
        org.junit.Assert.assertNull(strTrieEntry79);
        org.junit.Assert.assertNull(strTrieEntry80);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test508");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean4 = stringKeyAnalyzer0.isBitSet("", (int) (short) 1, (-1));
        java.util.Comparator<java.lang.String> strComparator5 = stringKeyAnalyzer0.reversed();
        boolean boolean9 = stringKeyAnalyzer0.isBitSet("hi!", (int) ' ', (int) (short) 100);
        int int11 = stringKeyAnalyzer0.lengthInBits("");
        int int14 = stringKeyAnalyzer0.compare("Entry(key=Trie[0]={\n}\n [0], value=null, parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])", "Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])");
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-39) + "'", int14 == (-39));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test509");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        java.io.Serializable serializable7 = serializableMap0.selectValue("");
        boolean boolean8 = serializableMap0.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap11 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap11.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor13 = serializableMap11.mapIterator();
        serializableMap10.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap11);
        java.io.Serializable serializable15 = serializableMap0.put("", (java.io.Serializable) serializableMap10);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap18.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap18.mapIterator();
        serializableMap17.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap18);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry23 = serializableMap18.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap24 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap25 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap25.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor27 = serializableMap25.mapIterator();
        serializableMap24.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap25);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry31 = serializableMap24.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry32 = serializableMap18.nextEntry(strTrieEntry31);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry34 = serializableMap18.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry36 = serializableMap18.select("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet37 = serializableMap18.entrySet();
        java.io.Serializable serializable38 = serializableMap0.getOrDefault((java.lang.Object) "Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])", (java.io.Serializable) serializableMap18);
        java.lang.Object obj39 = null;
        java.io.Serializable serializable40 = serializableMap0.get(obj39);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap41 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap42 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor43 = serializableMap42.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor44 = serializableMap42.mapIterator();
        serializableMap41.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap42);
        java.lang.String str47 = serializableMap41.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap48 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor49 = serializableMap48.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor50 = serializableMap48.mapIterator();
        java.util.Set set51 = serializableMap48.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap53 = serializableMap48.tailMap("hi!");
        java.io.Serializable serializable55 = serializableMap48.selectValue("");
        boolean boolean58 = serializableMap48.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable59 = serializableMap41.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap60 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap61 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor62 = serializableMap61.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor63 = serializableMap61.mapIterator();
        serializableMap60.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap61);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry67 = serializableMap60.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry68 = serializableMap41.nextEntry(strTrieEntry67);
        java.util.Collection collection69 = serializableMap41.values();
        boolean boolean70 = serializableMap0.equals((java.lang.Object) serializableMap41);
        int int71 = serializableMap41.size();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNull(strTrieEntry23);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(strTrieEntry31);
        org.junit.Assert.assertNull(strTrieEntry32);
        org.junit.Assert.assertNull(strTrieEntry34);
        org.junit.Assert.assertNull(strEntry36);
        org.junit.Assert.assertNotNull(strEntrySet37);
        org.junit.Assert.assertNotNull(serializable38);
        org.junit.Assert.assertNull(serializable40);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strItor49);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(serializable55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(serializable59);
        org.junit.Assert.assertNotNull(strItor62);
        org.junit.Assert.assertNotNull(strItor63);
        org.junit.Assert.assertNotNull(strTrieEntry67);
        org.junit.Assert.assertNull(strTrieEntry68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test510");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = serializableMap0.getNearestEntryForKey("", (int) ' ');
        java.lang.String str9 = serializableMap0.previousKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap15 = serializableMap10.tailMap("hi!");
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) strMap15);
        serializableMap0.modCount = (-1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strTrieEntry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test511");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        java.util.Set<java.lang.String> strSet3 = serializableMap0.keySet();
        boolean boolean4 = serializableMap0.isEmpty();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test512");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        serializableMap0.clear();
        org.apache.commons.collections4.trie.KeyAnalyzer<? super java.lang.String> wildcardKeyAnalyzer4 = serializableMap0.getKeyAnalyzer();
        java.util.Collection<java.io.Serializable> serializableCollection5 = serializableMap0.values();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardKeyAnalyzer4);
        org.junit.Assert.assertNotNull(serializableCollection5);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test513");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.lang.String str3 = serializableMap0.nextKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap4 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap5 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap5.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap5.mapIterator();
        java.util.Set set8 = serializableMap5.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap4, set8, (int) ' ');
        java.lang.String str11 = strMapTrieEntry10.toString();
        strMapTrieEntry10.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap14 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap14.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap14.mapIterator();
        java.util.Set set17 = serializableMap14.keySet();
        boolean boolean19 = serializableMap14.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap14.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap21 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap21.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection23 = serializableMap21.values();
        java.util.Set<java.lang.String> strSet24 = serializableMap21.keySet();
        java.util.Set set25 = strMapTrieEntry10.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap14, (java.util.Set) strSet24);
        boolean boolean26 = serializableMap0.containsValue((java.lang.Object) strSet24);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap27 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap27.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap27.mapIterator();
        java.util.Set set30 = serializableMap27.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap32 = serializableMap27.tailMap("hi!");
        java.io.Serializable serializable34 = serializableMap27.selectValue("");
        boolean boolean35 = serializableMap27.isEmpty();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap27);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap38 = serializableMap0.headMap("Entry(key=Trie[0]={\n}\n [0], value=null, parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap39 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor40 = serializableMap39.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor41 = serializableMap39.mapIterator();
        java.util.Set set42 = serializableMap39.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap44 = serializableMap39.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor45 = serializableMap39.mapIterator();
        int int46 = serializableMap39.size();
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry48 = serializableMap39.select("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set set49 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry51 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap39, set49, 0);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap53 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor54 = serializableMap53.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor55 = serializableMap53.mapIterator();
        java.util.Set set56 = serializableMap53.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap58 = serializableMap53.tailMap("hi!");
        java.util.Comparator<? super java.lang.String> wildcardComparator59 = serializableMap53.comparator();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry62 = serializableMap53.getNearestEntryForKey("Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])", 1);
        java.io.Serializable serializable63 = serializableMap39.putIfAbsent("hi!", (java.io.Serializable) strTrieEntry62);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry64 = serializableMap0.followRight(strTrieEntry62);
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str11, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(serializableCollection23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(serializable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(strEntry48);
        org.junit.Assert.assertNotNull(strItor54);
        org.junit.Assert.assertNotNull(strItor55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(wildcardComparator59);
        org.junit.Assert.assertNotNull(strTrieEntry62);
        org.junit.Assert.assertNull(serializable63);
        org.junit.Assert.assertNull(strTrieEntry64);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test514");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap0.prefixMap("hi!");
        java.util.Set set9 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap8, set9, (int) (short) 100);
        strMapTrieEntry11.bitIndex = 0;
        java.lang.String str14 = strMapTrieEntry11.toString();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry15 = strMapTrieEntry11.left;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])" + "'", str14, "Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])");
        org.junit.Assert.assertNotNull(strMapTrieEntry15);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test515");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        java.io.Serializable serializable7 = serializableMap0.selectValue("");
        boolean boolean8 = serializableMap0.isEmpty();
        java.lang.String str10 = serializableMap0.nextKey("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap11 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap11.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor13 = serializableMap11.mapIterator();
        int int14 = serializableMap11.modCount;
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet15 = serializableMap11.entrySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap16 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap17.mapIterator();
        java.util.Set set20 = serializableMap17.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry22 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap16, set20, (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry24 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap11, set20, (-3));
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap11.getNearestEntryForKey("", (int) (byte) 100);
        boolean boolean28 = serializableMap0.equals((java.lang.Object) serializableMap11);
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strEntrySet15);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(strTrieEntry27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test516");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        boolean boolean14 = serializableMap9.containsKey((java.lang.Object) "hi!");
        java.util.Set set15 = serializableMap9.keySet();
        java.util.Set set16 = strMapTrieEntry6.setValue(set15);
        boolean boolean17 = strMapTrieEntry6.isExternalNode();
        java.util.Set set18 = strMapTrieEntry6.getValue();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap19.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap19.mapIterator();
        int int22 = serializableMap19.modCount;
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet23 = serializableMap19.entrySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap24 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap25 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap25.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor27 = serializableMap25.mapIterator();
        java.util.Set set28 = serializableMap25.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry30 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap24, set28, (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry32 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap19, set28, (-3));
        java.util.Set set33 = strMapTrieEntry6.setValue(set28);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strEntrySet23);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test517");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        boolean boolean15 = serializableMap10.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap10.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection19 = serializableMap17.values();
        java.util.Set<java.lang.String> strSet20 = serializableMap17.keySet();
        java.util.Set set21 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap10, (java.util.Set) strSet20);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap22 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor23 = serializableMap22.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor24 = serializableMap22.mapIterator();
        java.util.Set set25 = serializableMap22.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap27 = serializableMap22.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap22.mapIterator();
        int int29 = serializableMap22.size();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap32 = serializableMap22.subMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable33 = serializableMap10.remove((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet34 = serializableMap10.entrySet();
        java.lang.Class<?> wildcardClass35 = serializableMap10.getClass();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNotNull(strEntrySet34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test518");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap4 = serializableMap0.prefixMap("");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap0.higherEntry("");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = serializableMap0.firstEntry();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNull(strTrieEntry7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test519");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap3 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor4 = serializableMap3.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor5 = serializableMap3.mapIterator();
        java.util.Set set6 = serializableMap3.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap3.tailMap("hi!");
        boolean boolean9 = serializableMap0.containsValue((java.lang.Object) strMap8);
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator10 = serializableMap0.mapIterator();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry12 = serializableMap0.ceilingEntry("Entry(key=null [0], value=[], parent=null, left=null [0], right=null [32], predecessor=null [0])");
        java.util.Collection<java.io.Serializable> serializableCollection13 = serializableMap0.values();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet14 = serializableMap0.entrySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator10);
        org.junit.Assert.assertNull(strTrieEntry12);
        org.junit.Assert.assertNotNull(serializableCollection13);
        org.junit.Assert.assertNotNull(strEntrySet14);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test520");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = new org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer();
        int int2 = stringKeyAnalyzer0.lengthInBits("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test521");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        java.io.Serializable serializable7 = serializableMap0.selectValue("");
        boolean boolean8 = serializableMap0.isEmpty();
        serializableMap0.clear();
        java.lang.String str11 = serializableMap0.nextKey("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap12 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor13 = serializableMap12.mapIterator();
        int int14 = serializableMap12.modCount;
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap12);
        java.util.Collection<java.io.Serializable> serializableCollection16 = serializableMap12.values();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap17.mapIterator();
        java.util.Set set20 = serializableMap17.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap22 = serializableMap17.tailMap("hi!");
        java.util.Comparator<? super java.lang.String> wildcardComparator23 = serializableMap17.comparator();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap17.getNearestEntryForKey("Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])", 1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap12.nextEntry(strTrieEntry26);
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(wildcardComparator23);
        org.junit.Assert.assertNotNull(strTrieEntry26);
        org.junit.Assert.assertNull(strTrieEntry27);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test522");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap16 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor17 = serializableMap16.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap16.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable19 = serializableMap1.remove((java.lang.Object) strItor18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test523");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry2 = serializableMap0.floorEntry("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry4 = serializableMap0.higherEntry("Entry(key=Trie[0]={\n}\n [0], value=null, parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap7 = serializableMap0.subMap("Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])", "Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])");
        org.junit.Assert.assertNull(strTrieEntry2);
        org.junit.Assert.assertNull(strTrieEntry4);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test524");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap0.prefixMap("hi!");
        java.util.Set set9 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap8, set9, (int) (short) 100);
        java.util.Set set12 = strMapTrieEntry11.value;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry13 = strMapTrieEntry11.predecessor;
        strMapTrieEntry11.bitIndex = (-1);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap16 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor17 = serializableMap16.mapIterator();
        int int18 = serializableMap16.modCount;
        serializableMap16.clear();
        org.apache.commons.collections4.trie.KeyAnalyzer<? super java.lang.String> wildcardKeyAnalyzer20 = serializableMap16.getKeyAnalyzer();
        java.util.Set set21 = null;
        java.util.Set set22 = strMapTrieEntry11.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap16, set21);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(set12);
        org.junit.Assert.assertNotNull(strMapTrieEntry13);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardKeyAnalyzer20);
        org.junit.Assert.assertNull(set22);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test525");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean4 = stringKeyAnalyzer0.isBitSet("", (int) (short) 1, (-1));
        java.util.Comparator<java.lang.String> strComparator5 = stringKeyAnalyzer0.reversed();
        boolean boolean9 = stringKeyAnalyzer0.isBitSet("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = stringKeyAnalyzer0.isBitSet("Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])", (int) (short) 10, 0);
        int int16 = stringKeyAnalyzer0.compare("Trie[0]={\n}\n", "");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = stringKeyAnalyzer0.bitIndex("", 32, 1, "Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The offsets and lengths must be at Character boundaries");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test526");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.io.Serializable serializable4 = serializableMap0.selectValue("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNull(serializable4);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test527");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        int int3 = serializableMap0.modCount;
        java.util.Set<java.lang.String> strSet4 = serializableMap0.keySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test528");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.Collection<java.io.Serializable> serializableCollection5 = serializableMap0.values();
        java.lang.String str7 = serializableMap0.previousKey("hi!");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet8 = serializableMap0.entrySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry10 = serializableMap0.lowerEntry("Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])");
        java.util.Comparator<? super java.lang.String> wildcardComparator11 = serializableMap0.comparator();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntrySet8);
        org.junit.Assert.assertNull(strTrieEntry10);
        org.junit.Assert.assertNotNull(wildcardComparator11);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test529");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.Collection<java.io.Serializable> serializableCollection5 = serializableMap0.values();
        boolean boolean9 = serializableMap0.isBitSet("hi!", (-1), (int) (short) 100);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet10 = serializableMap0.entrySet();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(serializableCollection5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strEntrySet10);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test530");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap0.prefixMap("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        boolean boolean14 = serializableMap9.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap9.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap16 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap17.mapIterator();
        serializableMap16.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap17);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry22 = serializableMap17.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap23 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap24 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor25 = serializableMap24.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap24.mapIterator();
        serializableMap23.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap24);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry30 = serializableMap23.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry31 = serializableMap17.nextEntry(strTrieEntry30);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap32 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap33 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor34 = serializableMap33.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor35 = serializableMap33.mapIterator();
        serializableMap32.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap33);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry38 = serializableMap33.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap39 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap40 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor41 = serializableMap40.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor42 = serializableMap40.mapIterator();
        serializableMap39.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap40);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry46 = serializableMap39.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry47 = serializableMap33.nextEntry(strTrieEntry46);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap48 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap49 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor50 = serializableMap49.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor51 = serializableMap49.mapIterator();
        serializableMap48.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap49);
        java.lang.String str54 = serializableMap48.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap55 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor56 = serializableMap55.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor57 = serializableMap55.mapIterator();
        java.util.Set set58 = serializableMap55.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap60 = serializableMap55.tailMap("hi!");
        java.io.Serializable serializable62 = serializableMap55.selectValue("");
        boolean boolean65 = serializableMap55.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable66 = serializableMap48.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap67 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap68 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor69 = serializableMap68.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor70 = serializableMap68.mapIterator();
        serializableMap67.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap68);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry74 = serializableMap67.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry75 = serializableMap48.nextEntry(strTrieEntry74);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry76 = serializableMap9.nextEntryImpl(strTrieEntry30, strTrieEntry47, strTrieEntry74);
        java.lang.String str77 = serializableMap0.castKey((java.lang.Object) strTrieEntry76);
        java.lang.String str79 = serializableMap0.selectKey("Entry(key=null [0], value=[], parent=null, left=null [0], right=null [32], predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap80 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor81 = serializableMap80.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection82 = serializableMap80.values();
        int int83 = serializableMap80.modCount;
        boolean boolean84 = serializableMap80.isEmpty();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor85 = serializableMap80.mapIterator();
        java.util.Comparator comparator86 = serializableMap80.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = serializableMap0.remove((java.lang.Object) comparator86);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNull(strTrieEntry22);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strTrieEntry30);
        org.junit.Assert.assertNull(strTrieEntry31);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNull(strTrieEntry38);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertNotNull(strTrieEntry46);
        org.junit.Assert.assertNull(strTrieEntry47);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNotNull(strItor51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strItor56);
        org.junit.Assert.assertNotNull(strItor57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(serializable62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(serializable66);
        org.junit.Assert.assertNotNull(strItor69);
        org.junit.Assert.assertNotNull(strItor70);
        org.junit.Assert.assertNotNull(strTrieEntry74);
        org.junit.Assert.assertNull(strTrieEntry75);
        org.junit.Assert.assertNull(strTrieEntry76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(strItor81);
        org.junit.Assert.assertNotNull(serializableCollection82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strItor85);
        org.junit.Assert.assertNotNull(comparator86);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test531");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        boolean boolean15 = serializableMap10.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap10.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection19 = serializableMap17.values();
        java.util.Set<java.lang.String> strSet20 = serializableMap17.keySet();
        java.util.Set set21 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap10, (java.util.Set) strSet20);
        java.io.Serializable serializable24 = serializableMap10.put("hi!", (java.io.Serializable) "");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap25 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap26 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor27 = serializableMap26.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap26.mapIterator();
        java.util.Set set29 = serializableMap26.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry31 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap25, set29, (int) ' ');
        boolean boolean32 = strMapTrieEntry31.isEmpty();
        boolean boolean33 = serializableMap10.equals((java.lang.Object) strMapTrieEntry31);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry34 = null;
        strMapTrieEntry31.parent = strMapTrieEntry34;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test532");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        java.util.Set<java.lang.String> strSet3 = serializableMap0.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet4 = serializableMap0.entrySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap7 = serializableMap0.subMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", "hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap9 = serializableMap0.tailMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strEntrySet4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test533");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        serializableMap0.clear();
        org.apache.commons.collections4.trie.KeyAnalyzer<? super java.lang.String> wildcardKeyAnalyzer4 = serializableMap0.getKeyAnalyzer();
        java.util.Set<java.lang.String> strSet5 = serializableMap0.keySet();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardKeyAnalyzer4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strItor6);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test534");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        boolean boolean14 = serializableMap9.containsKey((java.lang.Object) "hi!");
        java.util.Set set15 = serializableMap9.keySet();
        java.util.Set set16 = strMapTrieEntry6.setValue(set15);
        boolean boolean17 = strMapTrieEntry6.isExternalNode();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap19.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap19.mapIterator();
        serializableMap18.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap19);
        java.lang.String str24 = serializableMap18.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap25 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap25.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection27 = serializableMap25.values();
        java.util.Set<java.lang.String> strSet28 = serializableMap25.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet29 = serializableMap25.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet30 = serializableMap25.entrySet();
        java.util.Set set31 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap18, (java.util.Set) strEntrySet30);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry32 = strMapTrieEntry6.left;
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap33 = strMapTrieEntry32.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = strMap33.firstKey();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(serializableCollection27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strEntrySet29);
        org.junit.Assert.assertNotNull(strEntrySet30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(strMapTrieEntry32);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test535");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        java.util.Set<java.lang.String> strSet3 = serializableMap0.keySet();
        int int4 = serializableMap0.size();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap6 = serializableMap0.prefixMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test536");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry8 = serializableMap0.higherEntry("Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])");
        java.util.Set set9 = serializableMap0.keySet();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection12 = serializableMap10.values();
        java.util.Set<java.lang.String> strSet13 = serializableMap10.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet14 = serializableMap10.entrySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap17 = serializableMap10.subMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", "hi!");
        boolean boolean18 = serializableMap0.containsValue((java.lang.Object) "hi!");
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap0.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strItor19.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strTrieEntry8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(serializableCollection12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strEntrySet14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test537");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        int int12 = serializableMap7.bitsPerElement();
        serializableMap7.modCount = 10;
        boolean boolean15 = serializableMap7.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap16 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap7);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable17 = serializableMap0.get((java.lang.Object) serializableMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test538");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry9 = strMapTrieEntry6.predecessor;
        strMapTrieEntry9.bitIndex = (byte) 0;
        boolean boolean12 = strMapTrieEntry9.isInternalNode();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap13 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap14 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap14.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap14.mapIterator();
        serializableMap13.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap14);
        java.lang.String str19 = serializableMap13.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap21 = serializableMap13.prefixMap("hi!");
        java.util.Set set22 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry24 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap21, set22, (int) (short) 100);
        java.util.Set set25 = strMapTrieEntry24.value;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry26 = strMapTrieEntry24.predecessor;
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap27 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap28.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap28.mapIterator();
        java.util.Set set31 = serializableMap28.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry33 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap27, set31, (int) ' ');
        java.lang.String str34 = strMapTrieEntry33.toString();
        strMapTrieEntry33.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap37 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor38 = serializableMap37.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor39 = serializableMap37.mapIterator();
        java.util.Set set40 = serializableMap37.keySet();
        boolean boolean42 = serializableMap37.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor43 = serializableMap37.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap44 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor45 = serializableMap44.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection46 = serializableMap44.values();
        java.util.Set<java.lang.String> strSet47 = serializableMap44.keySet();
        java.util.Set set48 = strMapTrieEntry33.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap37, (java.util.Set) strSet47);
        boolean boolean49 = strMapTrieEntry33.isInternalNode();
        strMapTrieEntry26.predecessor = strMapTrieEntry33;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap51 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor52 = serializableMap51.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor53 = serializableMap51.mapIterator();
        java.util.Set set54 = serializableMap51.keySet();
        boolean boolean55 = serializableMap51.isEmpty();
        java.util.Set set56 = null;
        java.util.Set set57 = strMapTrieEntry33.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap51, set56);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap58 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor59 = serializableMap58.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection60 = serializableMap58.values();
        int int61 = serializableMap58.modCount;
        boolean boolean62 = serializableMap58.isEmpty();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor63 = serializableMap58.mapIterator();
        java.util.Comparator comparator64 = serializableMap58.comparator();
        java.util.Set<java.lang.String> strSet65 = serializableMap58.keySet();
        boolean boolean66 = strMapTrieEntry33.equals((java.lang.Object) serializableMap58);
        strMapTrieEntry9.right = strMapTrieEntry33;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMapTrieEntry9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(set25);
        org.junit.Assert.assertNotNull(strMapTrieEntry26);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str34, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strItor39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertNotNull(serializableCollection46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strItor52);
        org.junit.Assert.assertNotNull(strItor53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(strItor59);
        org.junit.Assert.assertNotNull(serializableCollection60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strItor63);
        org.junit.Assert.assertNotNull(comparator64);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test539");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap6 = serializableMap1.headMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator7 = serializableMap1.mapIterator();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = serializableMap1.remove(obj8);
        serializableMap1.clear();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry11 = serializableMap1.lastEntry();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(orderedMapIterator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strTrieEntry11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test540");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap6 = serializableMap1.headMap("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor8 = serializableMap7.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap7.mapIterator();
        java.util.Set set10 = serializableMap7.keySet();
        boolean boolean12 = serializableMap7.containsKey((java.lang.Object) "hi!");
        int int13 = serializableMap7.size();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap15 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap15.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection17 = serializableMap15.values();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap19 = serializableMap15.prefixMap("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap21 = serializableMap15.headMap("hi!");
        java.io.Serializable serializable22 = serializableMap7.put("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])", (java.io.Serializable) "hi!");
        boolean boolean23 = serializableMap7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = serializableMap1.castKey((java.lang.Object) serializableMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.apache.commons.collections4.trie.PatriciaTrie to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(serializable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test541");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        java.lang.String str8 = serializableMap1.selectKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.lang.Object obj9 = null;
        boolean boolean10 = serializableMap1.containsValue(obj9);
        java.lang.String str12 = serializableMap1.nextKey("Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor={} [0])");
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test542");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        strMapTrieEntry6.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        java.util.Set set13 = serializableMap10.keySet();
        boolean boolean15 = serializableMap10.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap10.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection19 = serializableMap17.values();
        java.util.Set<java.lang.String> strSet20 = serializableMap17.keySet();
        java.util.Set set21 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap10, (java.util.Set) strSet20);
        java.io.Serializable serializable24 = serializableMap10.put("hi!", (java.io.Serializable) "");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap25 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap25.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection27 = serializableMap25.values();
        int int28 = serializableMap25.modCount;
        boolean boolean29 = serializableMap25.isEmpty();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap25.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap31 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap32 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor33 = serializableMap32.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor34 = serializableMap32.mapIterator();
        serializableMap31.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap32);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap36 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap37 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor38 = serializableMap37.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor39 = serializableMap37.mapIterator();
        serializableMap36.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap37);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry43 = serializableMap36.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry44 = serializableMap32.followRight(strTrieEntry43);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry46 = serializableMap25.addEntry(strTrieEntry43, 0);
        java.io.Serializable serializable47 = serializableMap10.removeEntry(strTrieEntry46);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(serializableCollection19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(serializableCollection27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strItor39);
        org.junit.Assert.assertNotNull(strTrieEntry43);
        org.junit.Assert.assertNull(strTrieEntry44);
        org.junit.Assert.assertNotNull(strTrieEntry46);
        org.junit.Assert.assertNull(serializable47);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test543");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        java.util.Set<java.lang.String> strSet3 = serializableMap0.keySet();
        serializableMap0.modCount = (short) 10;
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strItor6);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test544");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        java.util.Set<java.lang.String> strSet16 = serializableMap1.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap17 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap18.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap18.mapIterator();
        java.util.Set set21 = serializableMap18.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry23 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap17, set21, (int) ' ');
        java.lang.String str24 = strMapTrieEntry23.toString();
        strMapTrieEntry23.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap27 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap27.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap27.mapIterator();
        java.util.Set set30 = serializableMap27.keySet();
        boolean boolean32 = serializableMap27.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor33 = serializableMap27.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap34 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor35 = serializableMap34.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection36 = serializableMap34.values();
        java.util.Set<java.lang.String> strSet37 = serializableMap34.keySet();
        java.util.Set set38 = strMapTrieEntry23.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap27, (java.util.Set) strSet37);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>> strMapTrieEntry40 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>>((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1, (java.util.Map<java.lang.String, java.io.Serializable>) serializableMap27, (int) '4');
        java.lang.String str42 = serializableMap1.nextKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap43 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap44 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor45 = serializableMap44.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor46 = serializableMap44.mapIterator();
        serializableMap43.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap44);
        int int48 = serializableMap43.bitsPerElement();
        java.io.Serializable serializable51 = serializableMap43.replace("hi!", (java.io.Serializable) (-1.0d));
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap52 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap53 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor54 = serializableMap53.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor55 = serializableMap53.mapIterator();
        java.util.Set set56 = serializableMap53.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry58 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap52, set56, (int) ' ');
        java.lang.String str59 = strMapTrieEntry58.toString();
        strMapTrieEntry58.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap62 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor63 = serializableMap62.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor64 = serializableMap62.mapIterator();
        java.util.Set set65 = serializableMap62.keySet();
        boolean boolean67 = serializableMap62.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor68 = serializableMap62.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap69 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor70 = serializableMap69.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection71 = serializableMap69.values();
        java.util.Set<java.lang.String> strSet72 = serializableMap69.keySet();
        java.util.Set set73 = strMapTrieEntry58.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap62, (java.util.Set) strSet72);
        boolean boolean74 = strMapTrieEntry58.isInternalNode();
        int int75 = strMapTrieEntry58.bitIndex;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap76 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor77 = serializableMap76.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection78 = serializableMap76.values();
        java.util.Set<java.lang.String> strSet79 = serializableMap76.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet80 = serializableMap76.entrySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap83 = serializableMap76.subMap("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", "hi!");
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry85 = serializableMap76.select("");
        java.util.Set set86 = null;
        java.util.Set set87 = strMapTrieEntry58.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap76, set86);
        boolean boolean88 = serializableMap1.remove((java.lang.Object) serializable51, (java.lang.Object) strMapTrieEntry58);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap89 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor90 = serializableMap89.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection91 = serializableMap89.values();
        java.util.Set<java.lang.String> strSet92 = serializableMap89.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet93 = serializableMap89.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet94 = serializableMap89.entrySet();
        strMapTrieEntry58.value = strEntrySet94;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str24, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNotNull(serializableCollection36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertNotNull(strItor46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertNull(serializable51);
        org.junit.Assert.assertNotNull(strItor54);
        org.junit.Assert.assertNotNull(strItor55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str59, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor63);
        org.junit.Assert.assertNotNull(strItor64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strItor68);
        org.junit.Assert.assertNotNull(strItor70);
        org.junit.Assert.assertNotNull(serializableCollection71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(strItor77);
        org.junit.Assert.assertNotNull(serializableCollection78);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strEntrySet80);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertNull(strEntry85);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strItor90);
        org.junit.Assert.assertNotNull(serializableCollection91);
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertNotNull(strEntrySet93);
        org.junit.Assert.assertNotNull(strEntrySet94);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test545");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap4 = serializableMap0.prefixMap("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap7 = serializableMap0.subMap("Entry(key=Trie[0]={\n}\n [0], value=null, parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test546");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        java.util.Set<java.lang.String> strSet7 = serializableMap0.keySet();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        java.io.Serializable serializable12 = serializableMap8.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap13 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap13.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap13.mapIterator();
        java.util.Set set16 = serializableMap13.keySet();
        boolean boolean18 = serializableMap13.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap13.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap21 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap21.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor23 = serializableMap21.mapIterator();
        serializableMap20.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap21);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap21.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap27 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap28.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap28.mapIterator();
        serializableMap27.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap28);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry34 = serializableMap27.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry35 = serializableMap21.nextEntry(strTrieEntry34);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap36 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap37 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor38 = serializableMap37.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor39 = serializableMap37.mapIterator();
        serializableMap36.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap37);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry42 = serializableMap37.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap43 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap44 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor45 = serializableMap44.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor46 = serializableMap44.mapIterator();
        serializableMap43.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap44);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry50 = serializableMap43.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry51 = serializableMap37.nextEntry(strTrieEntry50);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap52 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap53 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor54 = serializableMap53.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor55 = serializableMap53.mapIterator();
        serializableMap52.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap53);
        java.lang.String str58 = serializableMap52.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap59 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor60 = serializableMap59.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor61 = serializableMap59.mapIterator();
        java.util.Set set62 = serializableMap59.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap64 = serializableMap59.tailMap("hi!");
        java.io.Serializable serializable66 = serializableMap59.selectValue("");
        boolean boolean69 = serializableMap59.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable70 = serializableMap52.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap71 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap72 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor73 = serializableMap72.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor74 = serializableMap72.mapIterator();
        serializableMap71.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap72);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry78 = serializableMap71.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry79 = serializableMap52.nextEntry(strTrieEntry78);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry80 = serializableMap13.nextEntryImpl(strTrieEntry34, strTrieEntry51, strTrieEntry78);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry81 = serializableMap8.followRight(strTrieEntry78);
        java.io.Serializable serializable82 = serializableMap0.get((java.lang.Object) strTrieEntry81);
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNull(strTrieEntry26);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(strTrieEntry34);
        org.junit.Assert.assertNull(strTrieEntry35);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strItor39);
        org.junit.Assert.assertNull(strTrieEntry42);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertNotNull(strItor46);
        org.junit.Assert.assertNotNull(strTrieEntry50);
        org.junit.Assert.assertNull(strTrieEntry51);
        org.junit.Assert.assertNotNull(strItor54);
        org.junit.Assert.assertNotNull(strItor55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(strItor60);
        org.junit.Assert.assertNotNull(strItor61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNull(serializable66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(serializable70);
        org.junit.Assert.assertNotNull(strItor73);
        org.junit.Assert.assertNotNull(strItor74);
        org.junit.Assert.assertNotNull(strTrieEntry78);
        org.junit.Assert.assertNull(strTrieEntry79);
        org.junit.Assert.assertNull(strTrieEntry80);
        org.junit.Assert.assertNull(strTrieEntry81);
        org.junit.Assert.assertNull(serializable82);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test547");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean4 = stringKeyAnalyzer0.isBitSet("hi!", (int) (short) 1, 10);
        java.util.Comparator<java.lang.String> strComparator5 = stringKeyAnalyzer0.reversed();
        boolean boolean9 = stringKeyAnalyzer0.isBitSet("Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])", 0, 12);
        int int10 = stringKeyAnalyzer0.bitsPerElement();
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test548");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        java.io.Serializable serializable7 = serializableMap0.selectValue("");
        boolean boolean8 = serializableMap0.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap11 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap11.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor13 = serializableMap11.mapIterator();
        serializableMap10.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap11);
        java.io.Serializable serializable15 = serializableMap0.put("", (java.io.Serializable) serializableMap10);
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer17 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean21 = stringKeyAnalyzer17.isBitSet("hi!", (int) (short) 1, 10);
        java.util.Comparator<java.lang.String> strComparator22 = stringKeyAnalyzer17.reversed();
        int int24 = stringKeyAnalyzer17.lengthInBits("hi!");
        java.io.Serializable serializable25 = serializableMap0.putIfAbsent("Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])", (java.io.Serializable) "hi!");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(stringKeyAnalyzer17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strComparator22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 48 + "'", int24 == 48);
        org.junit.Assert.assertNull(serializable25);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test549");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean4 = stringKeyAnalyzer0.isBitSet("", (int) (short) 1, (-1));
        java.util.Comparator<java.lang.String> strComparator5 = stringKeyAnalyzer0.reversed();
        int int8 = stringKeyAnalyzer0.compare("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=Trie[0]={\n}\n [0])", "");
        int int9 = stringKeyAnalyzer0.bitsPerElement();
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test550");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.lang.String str3 = serializableMap0.nextKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap4 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap5 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap5.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap5.mapIterator();
        java.util.Set set8 = serializableMap5.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap4, set8, (int) ' ');
        java.lang.String str11 = strMapTrieEntry10.toString();
        strMapTrieEntry10.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap14 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap14.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap14.mapIterator();
        java.util.Set set17 = serializableMap14.keySet();
        boolean boolean19 = serializableMap14.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap14.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap21 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap21.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection23 = serializableMap21.values();
        java.util.Set<java.lang.String> strSet24 = serializableMap21.keySet();
        java.util.Set set25 = strMapTrieEntry10.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap14, (java.util.Set) strSet24);
        boolean boolean26 = serializableMap0.containsValue((java.lang.Object) strSet24);
        int int29 = serializableMap0.bitIndex("hi!", "hi!");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry30 = serializableMap0.firstEntry();
        java.util.Set<java.lang.String> strSet31 = serializableMap0.keySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str11, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(serializableCollection23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNull(strTrieEntry30);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test551");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        int int3 = serializableMap0.modCount;
        boolean boolean4 = serializableMap0.isEmpty();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor5 = serializableMap0.mapIterator();
        java.util.Comparator comparator6 = serializableMap0.comparator();
        boolean boolean9 = serializableMap0.compareKeys("Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])", "");
        serializableMap0.clear();
        java.util.Comparator comparator11 = serializableMap0.comparator();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test552");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        int int7 = serializableMap0.size();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap10.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap10.mapIterator();
        serializableMap9.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap10);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap15 = serializableMap10.headMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator16 = serializableMap10.mapIterator();
        java.io.Serializable serializable17 = serializableMap0.replace("", (java.io.Serializable) serializableMap10);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        serializableMap18.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable20 = serializableMap0.remove((java.lang.Object) serializableMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(orderedMapIterator16);
        org.junit.Assert.assertNull(serializable17);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test553");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap6 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap6.mapIterator();
        int int8 = serializableMap6.modCount;
        serializableMap6.clear();
        java.io.Serializable serializable10 = serializableMap0.replace("", (java.io.Serializable) serializableMap6);
        java.lang.String str12 = serializableMap6.selectKey("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap13 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap13.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap13.mapIterator();
        java.util.Set set16 = serializableMap13.keySet();
        serializableMap13.clear();
        java.lang.String str19 = serializableMap13.selectKey("");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet20 = serializableMap13.entrySet();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap21 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = serializableMap6.containsKey((java.lang.Object) serializableMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strEntrySet20);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test554");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        int int3 = serializableMap0.modCount;
        int int4 = serializableMap0.modCount;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry8 = serializableMap0.subtree("Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor={} [0])", (-26), (-1));
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry9 = serializableMap0.lastEntry();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strTrieEntry8);
        org.junit.Assert.assertNull(strTrieEntry9);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test555");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        boolean boolean14 = serializableMap9.containsKey((java.lang.Object) "hi!");
        java.util.Set set15 = serializableMap9.keySet();
        java.util.Set set16 = strMapTrieEntry6.setValue(set15);
        int int17 = strMapTrieEntry6.bitIndex;
        strMapTrieEntry6.bitIndex = 0;
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap20 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap21 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap21.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor23 = serializableMap21.mapIterator();
        java.util.Set set24 = serializableMap21.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry26 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap20, set24, (int) ' ');
        java.lang.String str27 = strMapTrieEntry26.toString();
        strMapTrieEntry26.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap30 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor31 = serializableMap30.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor32 = serializableMap30.mapIterator();
        java.util.Set set33 = serializableMap30.keySet();
        boolean boolean35 = serializableMap30.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor36 = serializableMap30.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap37 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor38 = serializableMap37.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection39 = serializableMap37.values();
        java.util.Set<java.lang.String> strSet40 = serializableMap37.keySet();
        java.util.Set set41 = strMapTrieEntry26.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap30, (java.util.Set) strSet40);
        boolean boolean42 = strMapTrieEntry26.isInternalNode();
        int int43 = strMapTrieEntry26.bitIndex;
        java.lang.String str44 = strMapTrieEntry26.toString();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap45 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap46 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor47 = serializableMap46.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor48 = serializableMap46.mapIterator();
        serializableMap45.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap46);
        java.lang.String str51 = serializableMap45.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap53 = serializableMap45.prefixMap("hi!");
        java.util.Set set54 = null;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry56 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap53, set54, (int) (short) 100);
        java.util.Set set57 = strMapTrieEntry56.value;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry58 = strMapTrieEntry56.predecessor;
        strMapTrieEntry56.bitIndex = (-1);
        strMapTrieEntry26.predecessor = strMapTrieEntry56;
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap62 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap63 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor64 = serializableMap63.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor65 = serializableMap63.mapIterator();
        java.util.Set set66 = serializableMap63.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry68 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap62, set66, (int) ' ');
        java.lang.String str69 = strMapTrieEntry68.toString();
        boolean boolean70 = strMapTrieEntry68.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap71 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor72 = serializableMap71.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor73 = serializableMap71.mapIterator();
        java.util.Set set74 = serializableMap71.keySet();
        boolean boolean76 = serializableMap71.containsKey((java.lang.Object) "hi!");
        java.util.Set set77 = serializableMap71.keySet();
        java.util.Set set78 = strMapTrieEntry68.setValue(set77);
        int int79 = strMapTrieEntry68.bitIndex;
        strMapTrieEntry68.bitIndex = 0;
        strMapTrieEntry26.predecessor = strMapTrieEntry68;
        java.util.Set set83 = strMapTrieEntry68.getValue();
        java.util.Set set84 = strMapTrieEntry6.setValue(set83);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str27, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNotNull(strItor32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(serializableCollection39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])" + "'", str44, "Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])");
        org.junit.Assert.assertNotNull(strItor47);
        org.junit.Assert.assertNotNull(strItor48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(set57);
        org.junit.Assert.assertNotNull(strMapTrieEntry58);
        org.junit.Assert.assertNotNull(strItor64);
        org.junit.Assert.assertNotNull(strItor65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str69, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strItor72);
        org.junit.Assert.assertNotNull(strItor73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 32 + "'", int79 == 32);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(set84);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test556");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        java.io.Serializable serializable7 = serializableMap0.selectValue("");
        boolean boolean8 = serializableMap0.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap10 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap11 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor12 = serializableMap11.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor13 = serializableMap11.mapIterator();
        serializableMap10.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap11);
        java.io.Serializable serializable15 = serializableMap0.put("", (java.io.Serializable) serializableMap10);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap18.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap18.mapIterator();
        serializableMap17.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap18);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry23 = serializableMap18.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap24 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap25 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap25.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor27 = serializableMap25.mapIterator();
        serializableMap24.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap25);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry31 = serializableMap24.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry32 = serializableMap18.nextEntry(strTrieEntry31);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry34 = serializableMap18.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry36 = serializableMap18.select("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet37 = serializableMap18.entrySet();
        java.io.Serializable serializable38 = serializableMap0.getOrDefault((java.lang.Object) "Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])", (java.io.Serializable) serializableMap18);
        java.lang.Object obj39 = null;
        java.io.Serializable serializable40 = serializableMap0.get(obj39);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap41 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap42 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor43 = serializableMap42.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor44 = serializableMap42.mapIterator();
        serializableMap41.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap42);
        java.lang.String str47 = serializableMap41.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap48 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor49 = serializableMap48.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor50 = serializableMap48.mapIterator();
        java.util.Set set51 = serializableMap48.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap53 = serializableMap48.tailMap("hi!");
        java.io.Serializable serializable55 = serializableMap48.selectValue("");
        boolean boolean58 = serializableMap48.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable59 = serializableMap41.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap60 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap61 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor62 = serializableMap61.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor63 = serializableMap61.mapIterator();
        serializableMap60.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap61);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry67 = serializableMap60.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry68 = serializableMap41.nextEntry(strTrieEntry67);
        java.util.Collection collection69 = serializableMap41.values();
        boolean boolean70 = serializableMap0.equals((java.lang.Object) serializableMap41);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap73 = serializableMap41.subMap("", "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        boolean boolean74 = serializableMap41.isEmpty();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNull(strTrieEntry23);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(strTrieEntry31);
        org.junit.Assert.assertNull(strTrieEntry32);
        org.junit.Assert.assertNull(strTrieEntry34);
        org.junit.Assert.assertNull(strEntry36);
        org.junit.Assert.assertNotNull(strEntrySet37);
        org.junit.Assert.assertNotNull(serializable38);
        org.junit.Assert.assertNull(serializable40);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strItor49);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(serializable55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(serializable59);
        org.junit.Assert.assertNotNull(strItor62);
        org.junit.Assert.assertNotNull(strItor63);
        org.junit.Assert.assertNotNull(strTrieEntry67);
        org.junit.Assert.assertNull(strTrieEntry68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test557");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap3 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor4 = serializableMap3.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor5 = serializableMap3.mapIterator();
        java.util.Set set6 = serializableMap3.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap3.tailMap("hi!");
        boolean boolean9 = serializableMap0.containsValue((java.lang.Object) strMap8);
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator10 = serializableMap0.mapIterator();
        java.lang.String str11 = serializableMap0.toString();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Trie[0]={\n}\n" + "'", str11, "Trie[0]={\n}\n");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test558");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        serializableMap0.clear();
        int int4 = serializableMap0.size();
        boolean boolean5 = serializableMap0.isEmpty();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test559");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        boolean boolean14 = serializableMap9.containsKey((java.lang.Object) "hi!");
        java.util.Set set15 = serializableMap9.keySet();
        java.util.Set set16 = strMapTrieEntry6.setValue(set15);
        int int17 = strMapTrieEntry6.bitIndex;
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap18 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap19.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap19.mapIterator();
        java.util.Set set22 = serializableMap19.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry24 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap18, set22, (int) ' ');
        java.lang.String str25 = strMapTrieEntry24.toString();
        strMapTrieEntry24.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap28.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap28.mapIterator();
        java.util.Set set31 = serializableMap28.keySet();
        boolean boolean33 = serializableMap28.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor34 = serializableMap28.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap35 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor36 = serializableMap35.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection37 = serializableMap35.values();
        java.util.Set<java.lang.String> strSet38 = serializableMap35.keySet();
        java.util.Set set39 = strMapTrieEntry24.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap28, (java.util.Set) strSet38);
        boolean boolean40 = strMapTrieEntry24.isInternalNode();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap41 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor42 = serializableMap41.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection43 = serializableMap41.values();
        int int44 = serializableMap41.modCount;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry48 = serializableMap41.subtree("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", (int) (byte) 1, (int) (byte) -1);
        strMapTrieEntry24.key = serializableMap41;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry50 = strMapTrieEntry24.predecessor;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap51 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor52 = serializableMap51.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor53 = serializableMap51.mapIterator();
        java.util.Set set54 = serializableMap51.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap56 = serializableMap51.prefixMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        int int58 = serializableMap51.lengthInBits("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap59 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap60 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor61 = serializableMap60.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor62 = serializableMap60.mapIterator();
        serializableMap59.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap60);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry65 = serializableMap60.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap66 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap67 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor68 = serializableMap67.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor69 = serializableMap67.mapIterator();
        serializableMap66.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap67);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry73 = serializableMap66.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry74 = serializableMap60.nextEntry(strTrieEntry73);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry76 = serializableMap60.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        int int78 = serializableMap60.lengthInBits("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set<java.lang.String> strSet79 = serializableMap60.keySet();
        java.util.Set set80 = strMapTrieEntry50.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap51, (java.util.Set) strSet79);
        strMapTrieEntry6.value = set80;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str25, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertNotNull(serializableCollection37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(strTrieEntry48);
        org.junit.Assert.assertNotNull(strMapTrieEntry50);
        org.junit.Assert.assertNotNull(strItor52);
        org.junit.Assert.assertNotNull(strItor53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 48 + "'", int58 == 48);
        org.junit.Assert.assertNotNull(strItor61);
        org.junit.Assert.assertNotNull(strItor62);
        org.junit.Assert.assertNull(strTrieEntry65);
        org.junit.Assert.assertNotNull(strItor68);
        org.junit.Assert.assertNotNull(strItor69);
        org.junit.Assert.assertNotNull(strTrieEntry73);
        org.junit.Assert.assertNull(strTrieEntry74);
        org.junit.Assert.assertNull(strTrieEntry76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1456 + "'", int78 == 1456);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(set80);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test560");
        boolean boolean1 = org.apache.commons.collections4.trie.KeyAnalyzer.isOutOfBoundsIndex(39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test561");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.lang.String str3 = serializableMap0.nextKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap4 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap5 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap5.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap5.mapIterator();
        java.util.Set set8 = serializableMap5.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap4, set8, (int) ' ');
        java.lang.String str11 = strMapTrieEntry10.toString();
        strMapTrieEntry10.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap14 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap14.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap14.mapIterator();
        java.util.Set set17 = serializableMap14.keySet();
        boolean boolean19 = serializableMap14.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap14.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap21 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap21.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection23 = serializableMap21.values();
        java.util.Set<java.lang.String> strSet24 = serializableMap21.keySet();
        java.util.Set set25 = strMapTrieEntry10.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap14, (java.util.Set) strSet24);
        boolean boolean26 = serializableMap0.containsValue((java.lang.Object) strSet24);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap27 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap27.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap27.mapIterator();
        java.util.Set set30 = serializableMap27.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap32 = serializableMap27.tailMap("hi!");
        java.io.Serializable serializable34 = serializableMap27.selectValue("");
        boolean boolean35 = serializableMap27.isEmpty();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap27);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap38 = serializableMap0.headMap("Entry(key=Trie[0]={\n}\n [0], value=null, parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap40 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor41 = serializableMap40.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor42 = serializableMap40.mapIterator();
        java.io.Serializable serializable44 = serializableMap40.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        int int46 = serializableMap40.lengthInBits("");
        java.io.Serializable serializable47 = serializableMap0.replace("Entry(key=Trie[0]={\n}\n [0], value=null, parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])", (java.io.Serializable) serializableMap40);
        boolean boolean48 = serializableMap0.isEmpty();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str11, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(serializableCollection23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(serializable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertNull(serializable44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(serializable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test562");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        java.lang.String str9 = strMapTrieEntry6.toString();
        java.lang.String str10 = strMapTrieEntry6.toString();
        boolean boolean11 = strMapTrieEntry6.isEmpty();
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str9, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str10, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test563");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.io.Serializable serializable4 = serializableMap0.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap5 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap5.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap5.mapIterator();
        java.util.Set set8 = serializableMap5.keySet();
        boolean boolean10 = serializableMap5.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap5.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap12 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap13 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap13.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap13.mapIterator();
        serializableMap12.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap13);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry18 = serializableMap13.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        serializableMap19.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap19.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap13.nextEntry(strTrieEntry26);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap29 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap29.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor31 = serializableMap29.mapIterator();
        serializableMap28.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap29);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry34 = serializableMap29.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap35 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap36 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor37 = serializableMap36.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor38 = serializableMap36.mapIterator();
        serializableMap35.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap36);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry42 = serializableMap35.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry43 = serializableMap29.nextEntry(strTrieEntry42);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap44 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap45 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor46 = serializableMap45.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor47 = serializableMap45.mapIterator();
        serializableMap44.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap45);
        java.lang.String str50 = serializableMap44.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap51 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor52 = serializableMap51.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor53 = serializableMap51.mapIterator();
        java.util.Set set54 = serializableMap51.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap56 = serializableMap51.tailMap("hi!");
        java.io.Serializable serializable58 = serializableMap51.selectValue("");
        boolean boolean61 = serializableMap51.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable62 = serializableMap44.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap63 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap64 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor65 = serializableMap64.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor66 = serializableMap64.mapIterator();
        serializableMap63.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap64);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry70 = serializableMap63.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry71 = serializableMap44.nextEntry(strTrieEntry70);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry72 = serializableMap5.nextEntryImpl(strTrieEntry26, strTrieEntry43, strTrieEntry70);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry73 = serializableMap0.followRight(strTrieEntry70);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry74 = serializableMap0.lastEntry();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNull(strTrieEntry18);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strTrieEntry26);
        org.junit.Assert.assertNull(strTrieEntry27);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNull(strTrieEntry34);
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strTrieEntry42);
        org.junit.Assert.assertNull(strTrieEntry43);
        org.junit.Assert.assertNotNull(strItor46);
        org.junit.Assert.assertNotNull(strItor47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strItor52);
        org.junit.Assert.assertNotNull(strItor53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(serializable62);
        org.junit.Assert.assertNotNull(strItor65);
        org.junit.Assert.assertNotNull(strItor66);
        org.junit.Assert.assertNotNull(strTrieEntry70);
        org.junit.Assert.assertNull(strTrieEntry71);
        org.junit.Assert.assertNull(strTrieEntry72);
        org.junit.Assert.assertNull(strTrieEntry73);
        org.junit.Assert.assertNull(strTrieEntry74);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test564");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        int int3 = serializableMap0.modCount;
        boolean boolean4 = serializableMap0.isEmpty();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor5 = serializableMap0.mapIterator();
        java.util.Comparator comparator6 = serializableMap0.comparator();
        java.util.Comparator<java.lang.String> strComparator7 = comparator6.reversed();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertNotNull(strComparator7);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test565");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = serializableMap0.prefixMap("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        boolean boolean14 = serializableMap9.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap9.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap16 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap17 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap17.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap17.mapIterator();
        serializableMap16.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap17);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry22 = serializableMap17.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap23 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap24 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor25 = serializableMap24.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap24.mapIterator();
        serializableMap23.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap24);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry30 = serializableMap23.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry31 = serializableMap17.nextEntry(strTrieEntry30);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap32 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap33 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor34 = serializableMap33.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor35 = serializableMap33.mapIterator();
        serializableMap32.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap33);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry38 = serializableMap33.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap39 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap40 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor41 = serializableMap40.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor42 = serializableMap40.mapIterator();
        serializableMap39.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap40);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry46 = serializableMap39.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry47 = serializableMap33.nextEntry(strTrieEntry46);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap48 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap49 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor50 = serializableMap49.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor51 = serializableMap49.mapIterator();
        serializableMap48.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap49);
        java.lang.String str54 = serializableMap48.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap55 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor56 = serializableMap55.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor57 = serializableMap55.mapIterator();
        java.util.Set set58 = serializableMap55.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap60 = serializableMap55.tailMap("hi!");
        java.io.Serializable serializable62 = serializableMap55.selectValue("");
        boolean boolean65 = serializableMap55.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable66 = serializableMap48.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap67 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap68 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor69 = serializableMap68.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor70 = serializableMap68.mapIterator();
        serializableMap67.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap68);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry74 = serializableMap67.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry75 = serializableMap48.nextEntry(strTrieEntry74);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry76 = serializableMap9.nextEntryImpl(strTrieEntry30, strTrieEntry47, strTrieEntry74);
        java.lang.String str77 = serializableMap0.castKey((java.lang.Object) strTrieEntry76);
        java.lang.String str79 = serializableMap0.selectKey("Entry(key=null [0], value=[], parent=null, left=null [0], right=null [32], predecessor=null [0])");
        java.lang.String str80 = serializableMap0.toString();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap82 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap83 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor84 = serializableMap83.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor85 = serializableMap83.mapIterator();
        serializableMap82.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap83);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap88 = serializableMap83.headMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator89 = serializableMap83.mapIterator();
        int int92 = serializableMap83.bitIndex("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])", "Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])");
        java.io.Serializable serializable93 = serializableMap0.put("Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor={} [0])", (java.io.Serializable) serializableMap83);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap94 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor95 = serializableMap94.mapIterator();
        int int96 = serializableMap94.modCount;
        java.util.Set set97 = serializableMap94.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = serializableMap0.containsKey((java.lang.Object) set97);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNull(strTrieEntry22);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strTrieEntry30);
        org.junit.Assert.assertNull(strTrieEntry31);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNull(strTrieEntry38);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertNotNull(strTrieEntry46);
        org.junit.Assert.assertNull(strTrieEntry47);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNotNull(strItor51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strItor56);
        org.junit.Assert.assertNotNull(strItor57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(serializable62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(serializable66);
        org.junit.Assert.assertNotNull(strItor69);
        org.junit.Assert.assertNotNull(strItor70);
        org.junit.Assert.assertNotNull(strTrieEntry74);
        org.junit.Assert.assertNull(strTrieEntry75);
        org.junit.Assert.assertNull(strTrieEntry76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Trie[0]={\n}\n" + "'", str80, "Trie[0]={\n}\n");
        org.junit.Assert.assertNotNull(strItor84);
        org.junit.Assert.assertNotNull(strItor85);
        org.junit.Assert.assertNotNull(strMap88);
        org.junit.Assert.assertNotNull(orderedMapIterator89);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 171 + "'", int92 == 171);
        org.junit.Assert.assertNull(serializable93);
        org.junit.Assert.assertNotNull(strItor95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(set97);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test566");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        int int3 = serializableMap0.modCount;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry5 = serializableMap0.ceilingEntry("");
        java.util.Set set6 = serializableMap0.entrySet();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap0.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        serializableMap8.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap9);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap14 = serializableMap9.headMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator15 = serializableMap9.mapIterator();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap17 = serializableMap9.tailMap("");
        java.lang.String str18 = serializableMap0.castKey((java.lang.Object) "");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap19 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        java.util.Set set23 = serializableMap20.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry25 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap19, set23, (int) ' ');
        java.lang.String str26 = strMapTrieEntry25.toString();
        boolean boolean27 = strMapTrieEntry25.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap28.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap28.mapIterator();
        java.util.Set set31 = serializableMap28.keySet();
        boolean boolean33 = serializableMap28.containsKey((java.lang.Object) "hi!");
        java.util.Set set34 = serializableMap28.keySet();
        java.util.Set set35 = strMapTrieEntry25.setValue(set34);
        boolean boolean36 = strMapTrieEntry25.isExternalNode();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap37 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap38 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor39 = serializableMap38.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor40 = serializableMap38.mapIterator();
        serializableMap37.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap38);
        java.lang.String str43 = serializableMap37.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap44 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor45 = serializableMap44.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection46 = serializableMap44.values();
        java.util.Set<java.lang.String> strSet47 = serializableMap44.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet48 = serializableMap44.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet49 = serializableMap44.entrySet();
        java.util.Set set50 = strMapTrieEntry25.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap37, (java.util.Set) strEntrySet49);
        boolean boolean53 = serializableMap37.compareKeys("hi!", "");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor54 = serializableMap37.mapIterator();
        java.lang.String str56 = serializableMap37.nextKey("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set<java.lang.String> strSet57 = serializableMap37.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = serializableMap0.remove((java.lang.Object) strSet57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strTrieEntry5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(orderedMapIterator15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str26, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strItor39);
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertNotNull(serializableCollection46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strEntrySet48);
        org.junit.Assert.assertNotNull(strEntrySet49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strItor54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(strSet57);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test567");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap1.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        serializableMap7.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap8);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap7.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry15 = serializableMap1.nextEntry(strTrieEntry14);
        java.util.Set<java.lang.String> strSet16 = serializableMap1.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap17 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap18.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap18.mapIterator();
        java.util.Set set21 = serializableMap18.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry23 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap17, set21, (int) ' ');
        java.lang.String str24 = strMapTrieEntry23.toString();
        strMapTrieEntry23.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap27 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor28 = serializableMap27.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap27.mapIterator();
        java.util.Set set30 = serializableMap27.keySet();
        boolean boolean32 = serializableMap27.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor33 = serializableMap27.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap34 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor35 = serializableMap34.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection36 = serializableMap34.values();
        java.util.Set<java.lang.String> strSet37 = serializableMap34.keySet();
        java.util.Set set38 = strMapTrieEntry23.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap27, (java.util.Set) strSet37);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>> strMapTrieEntry40 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.Map<java.lang.String, java.io.Serializable>, java.util.Map<java.lang.String, java.io.Serializable>>((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1, (java.util.Map<java.lang.String, java.io.Serializable>) serializableMap27, (int) '4');
        java.util.Set set41 = serializableMap27.keySet();
        int int43 = serializableMap27.lengthInBits("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap44 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor45 = serializableMap44.mapIterator();
        int int46 = serializableMap44.modCount;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap47 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor48 = serializableMap47.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor49 = serializableMap47.mapIterator();
        java.util.Set set50 = serializableMap47.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap52 = serializableMap47.tailMap("hi!");
        boolean boolean53 = serializableMap44.containsValue((java.lang.Object) strMap52);
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator54 = serializableMap44.mapIterator();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry56 = serializableMap44.ceilingEntry("Entry(key=null [0], value=[], parent=null, left=null [0], right=null [32], predecessor=null [0])");
        java.util.Collection<java.io.Serializable> serializableCollection57 = serializableMap44.values();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator58 = serializableMap44.mapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable59 = serializableMap27.get((java.lang.Object) serializableMap44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str24, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNotNull(serializableCollection36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(strItor48);
        org.junit.Assert.assertNotNull(strItor49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator54);
        org.junit.Assert.assertNull(strTrieEntry56);
        org.junit.Assert.assertNotNull(serializableCollection57);
        org.junit.Assert.assertNotNull(orderedMapIterator58);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test568");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.io.Serializable serializable4 = serializableMap0.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap5 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap5.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor7 = serializableMap5.mapIterator();
        java.util.Set set8 = serializableMap5.keySet();
        boolean boolean10 = serializableMap5.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap5.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap12 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap13 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap13.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap13.mapIterator();
        serializableMap12.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap13);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry18 = serializableMap13.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        serializableMap19.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap19.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap13.nextEntry(strTrieEntry26);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap29 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap29.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor31 = serializableMap29.mapIterator();
        serializableMap28.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap29);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry34 = serializableMap29.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap35 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap36 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor37 = serializableMap36.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor38 = serializableMap36.mapIterator();
        serializableMap35.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap36);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry42 = serializableMap35.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry43 = serializableMap29.nextEntry(strTrieEntry42);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap44 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap45 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor46 = serializableMap45.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor47 = serializableMap45.mapIterator();
        serializableMap44.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap45);
        java.lang.String str50 = serializableMap44.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap51 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor52 = serializableMap51.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor53 = serializableMap51.mapIterator();
        java.util.Set set54 = serializableMap51.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap56 = serializableMap51.tailMap("hi!");
        java.io.Serializable serializable58 = serializableMap51.selectValue("");
        boolean boolean61 = serializableMap51.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable62 = serializableMap44.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap63 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap64 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor65 = serializableMap64.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor66 = serializableMap64.mapIterator();
        serializableMap63.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap64);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry70 = serializableMap63.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry71 = serializableMap44.nextEntry(strTrieEntry70);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry72 = serializableMap5.nextEntryImpl(strTrieEntry26, strTrieEntry43, strTrieEntry70);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry73 = serializableMap0.followRight(strTrieEntry70);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet74 = serializableMap0.entrySet();
        java.util.Collection<java.io.Serializable> serializableCollection75 = serializableMap0.values();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap76 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap77 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor78 = serializableMap77.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor79 = serializableMap77.mapIterator();
        serializableMap76.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap77);
        int int81 = serializableMap76.bitsPerElement();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap76);
        java.lang.String str84 = serializableMap76.nextKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNull(strTrieEntry18);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strTrieEntry26);
        org.junit.Assert.assertNull(strTrieEntry27);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNull(strTrieEntry34);
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strTrieEntry42);
        org.junit.Assert.assertNull(strTrieEntry43);
        org.junit.Assert.assertNotNull(strItor46);
        org.junit.Assert.assertNotNull(strItor47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strItor52);
        org.junit.Assert.assertNotNull(strItor53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(serializable62);
        org.junit.Assert.assertNotNull(strItor65);
        org.junit.Assert.assertNotNull(strItor66);
        org.junit.Assert.assertNotNull(strTrieEntry70);
        org.junit.Assert.assertNull(strTrieEntry71);
        org.junit.Assert.assertNull(strTrieEntry72);
        org.junit.Assert.assertNull(strTrieEntry73);
        org.junit.Assert.assertNotNull(strEntrySet74);
        org.junit.Assert.assertNotNull(serializableCollection75);
        org.junit.Assert.assertNotNull(strItor78);
        org.junit.Assert.assertNotNull(strItor79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 16 + "'", int81 == 16);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test569");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        java.lang.String str12 = serializableMap9.nextKey("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap13 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap14 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap14.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor16 = serializableMap14.mapIterator();
        java.util.Set set17 = serializableMap14.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry19 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap13, set17, (int) ' ');
        java.lang.String str20 = strMapTrieEntry19.toString();
        strMapTrieEntry19.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap23 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor24 = serializableMap23.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor25 = serializableMap23.mapIterator();
        java.util.Set set26 = serializableMap23.keySet();
        boolean boolean28 = serializableMap23.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor29 = serializableMap23.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap30 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor31 = serializableMap30.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection32 = serializableMap30.values();
        java.util.Set<java.lang.String> strSet33 = serializableMap30.keySet();
        java.util.Set set34 = strMapTrieEntry19.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap23, (java.util.Set) strSet33);
        boolean boolean35 = serializableMap9.containsValue((java.lang.Object) strSet33);
        strMapTrieEntry6.value = strSet33;
        int int37 = strMapTrieEntry6.bitIndex;
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap38 = strMapTrieEntry6.key;
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap39 = strMapTrieEntry6.key;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str20, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNotNull(serializableCollection32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertNull(strMap38);
        org.junit.Assert.assertNull(strMap39);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test570");
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap0 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        java.util.Set set4 = serializableMap1.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap0, set4, (int) ' ');
        java.lang.String str7 = strMapTrieEntry6.toString();
        boolean boolean8 = strMapTrieEntry6.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        boolean boolean14 = serializableMap9.containsKey((java.lang.Object) "hi!");
        java.util.Set set15 = serializableMap9.keySet();
        java.util.Set set16 = strMapTrieEntry6.setValue(set15);
        boolean boolean17 = strMapTrieEntry6.isExternalNode();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap19.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap19.mapIterator();
        serializableMap18.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap19);
        java.lang.String str24 = serializableMap18.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap25 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap25.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection27 = serializableMap25.values();
        java.util.Set<java.lang.String> strSet28 = serializableMap25.keySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet29 = serializableMap25.entrySet();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet30 = serializableMap25.entrySet();
        java.util.Set set31 = strMapTrieEntry6.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap18, (java.util.Set) strEntrySet30);
        boolean boolean34 = serializableMap18.compareKeys("hi!", "");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor35 = serializableMap18.mapIterator();
        boolean boolean36 = strItor35.hasNext();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap37 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap38 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor39 = serializableMap38.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor40 = serializableMap38.mapIterator();
        serializableMap37.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap38);
        int int42 = serializableMap37.bitsPerElement();
        serializableMap37.clear();
        boolean boolean44 = serializableMap37.isEmpty();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet45 = serializableMap37.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable46 = strItor35.setValue((java.io.Serializable) serializableMap37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str7, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(serializableCollection27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strEntrySet29);
        org.junit.Assert.assertNotNull(strEntrySet30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strItor39);
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strEntrySet45);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test571");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry6 = serializableMap0.ceilingEntry("hi!");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry9 = serializableMap0.getNearestEntryForKey("hi!", (int) (short) 10);
        java.lang.String str11 = serializableMap0.nextKey("Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])");
        serializableMap0.clear();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap13 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap13.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap13.mapIterator();
        java.util.Set set16 = serializableMap13.keySet();
        boolean boolean18 = serializableMap13.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap13.mapIterator();
        java.util.Set<java.lang.String> strSet20 = serializableMap13.keySet();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap21 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap22 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor23 = serializableMap22.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor24 = serializableMap22.mapIterator();
        serializableMap21.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap22);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap22.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap29 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap29.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor31 = serializableMap29.mapIterator();
        serializableMap28.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap29);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry35 = serializableMap28.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry36 = serializableMap22.nextEntry(strTrieEntry35);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry37 = serializableMap13.previousEntry(strTrieEntry35);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap38 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap39 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor40 = serializableMap39.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor41 = serializableMap39.mapIterator();
        java.util.Set set42 = serializableMap39.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry44 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap38, set42, (int) ' ');
        java.lang.String str45 = strMapTrieEntry44.toString();
        strMapTrieEntry44.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap48 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor49 = serializableMap48.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor50 = serializableMap48.mapIterator();
        java.util.Set set51 = serializableMap48.keySet();
        boolean boolean53 = serializableMap48.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor54 = serializableMap48.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap55 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor56 = serializableMap55.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection57 = serializableMap55.values();
        java.util.Set<java.lang.String> strSet58 = serializableMap55.keySet();
        java.util.Set set59 = strMapTrieEntry44.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap48, (java.util.Set) strSet58);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap60 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor61 = serializableMap60.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor62 = serializableMap60.mapIterator();
        java.util.Set set63 = serializableMap60.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap65 = serializableMap60.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor66 = serializableMap60.mapIterator();
        int int67 = serializableMap60.size();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap70 = serializableMap60.subMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable71 = serializableMap48.remove((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        serializableMap48.clear();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap73 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap74 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor75 = serializableMap74.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor76 = serializableMap74.mapIterator();
        serializableMap73.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap74);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap78 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap79 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor80 = serializableMap79.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor81 = serializableMap79.mapIterator();
        serializableMap78.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap79);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry85 = serializableMap78.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry86 = serializableMap74.followRight(strTrieEntry85);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry88 = serializableMap48.addEntry(strTrieEntry85, (-94));
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry89 = serializableMap0.nextEntryInSubtree(strTrieEntry37, strTrieEntry85);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strTrieEntry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNull(strTrieEntry27);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNotNull(strTrieEntry35);
        org.junit.Assert.assertNull(strTrieEntry36);
        org.junit.Assert.assertNull(strTrieEntry37);
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str45, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor49);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strItor54);
        org.junit.Assert.assertNotNull(strItor56);
        org.junit.Assert.assertNotNull(serializableCollection57);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(strItor61);
        org.junit.Assert.assertNotNull(strItor62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strItor66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNull(serializable71);
        org.junit.Assert.assertNotNull(strItor75);
        org.junit.Assert.assertNotNull(strItor76);
        org.junit.Assert.assertNotNull(strItor80);
        org.junit.Assert.assertNotNull(strItor81);
        org.junit.Assert.assertNotNull(strTrieEntry85);
        org.junit.Assert.assertNull(strTrieEntry86);
        org.junit.Assert.assertNotNull(strTrieEntry88);
        org.junit.Assert.assertNull(strTrieEntry89);
    }
}

