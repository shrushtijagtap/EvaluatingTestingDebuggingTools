package org.apache.commons.collections4.trie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
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
        boolean boolean22 = strMapTrieEntry6.isInternalNode();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap23 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor24 = serializableMap23.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection25 = serializableMap23.values();
        int int26 = serializableMap23.modCount;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry30 = serializableMap23.subtree("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", (int) (byte) 1, (int) (byte) -1);
        strMapTrieEntry6.key = serializableMap23;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry32 = strMapTrieEntry6.predecessor;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap33 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor34 = serializableMap33.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor35 = serializableMap33.mapIterator();
        java.util.Set set36 = serializableMap33.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap38 = serializableMap33.prefixMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        int int40 = serializableMap33.lengthInBits("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap41 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap42 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor43 = serializableMap42.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor44 = serializableMap42.mapIterator();
        serializableMap41.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap42);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry47 = serializableMap42.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap48 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap49 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor50 = serializableMap49.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor51 = serializableMap49.mapIterator();
        serializableMap48.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap49);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry55 = serializableMap48.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry56 = serializableMap42.nextEntry(strTrieEntry55);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry58 = serializableMap42.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        int int60 = serializableMap42.lengthInBits("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set<java.lang.String> strSet61 = serializableMap42.keySet();
        java.util.Set set62 = strMapTrieEntry32.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap33, (java.util.Set) strSet61);
        java.lang.String str64 = serializableMap33.selectKey("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(serializableCollection25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(strTrieEntry30);
        org.junit.Assert.assertNotNull(strMapTrieEntry32);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 48 + "'", int40 == 48);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNull(strTrieEntry47);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNotNull(strItor51);
        org.junit.Assert.assertNotNull(strTrieEntry55);
        org.junit.Assert.assertNull(strTrieEntry56);
        org.junit.Assert.assertNull(strTrieEntry58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1456 + "'", int60 == 1456);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        java.util.Set<java.lang.String> strSet3 = serializableMap0.keySet();
        java.util.Set<java.lang.String> strSet4 = serializableMap0.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<java.lang.String, java.io.Serializable> strMap7 = serializableMap0.subMap("Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])", "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=Trie[0]={\n}\n [0])");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        boolean boolean91 = serializableMap1.compareKeys("Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])", "Trie[0]={\n}\n");
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        boolean boolean7 = strItor6.hasNext();
        boolean boolean8 = strItor6.hasNext();
        boolean boolean9 = strItor6.hasPrevious();
        boolean boolean10 = strItor6.hasNext();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean4 = stringKeyAnalyzer0.isBitSet("hi!", (int) (short) 1, 10);
        java.util.Comparator<java.lang.String> strComparator5 = stringKeyAnalyzer0.reversed();
        boolean boolean9 = stringKeyAnalyzer0.isBitSet("Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])", 0, 12);
        int int12 = stringKeyAnalyzer0.compare("Entry(key=null [0], value=[], parent=null, left=null [0], right=null [32], predecessor=null [0])", "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=Trie[0]={\n}\n [0])");
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        java.util.Comparator<? super java.lang.String> wildcardComparator22 = serializableMap10.comparator();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = serializableMap10.remove(obj23);
        java.util.Set set25 = serializableMap10.entrySet();
        java.util.Comparator<? super java.lang.String> wildcardComparator26 = serializableMap10.comparator();
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
        org.junit.Assert.assertNotNull(wildcardComparator22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(wildcardComparator26);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet19 = serializableMap0.entrySet();
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
        org.junit.Assert.assertNotNull(strEntrySet19);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor8 = serializableMap7.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap7.mapIterator();
        java.util.Set set10 = serializableMap7.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap12 = serializableMap7.tailMap("hi!");
        java.io.Serializable serializable14 = serializableMap7.selectValue("");
        boolean boolean17 = serializableMap7.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable18 = serializableMap0.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        serializableMap19.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap19.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap0.nextEntry(strTrieEntry26);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry29 = serializableMap0.ceilingEntry("Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])");
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strTrieEntry26);
        org.junit.Assert.assertNull(strTrieEntry27);
        org.junit.Assert.assertNull(strTrieEntry29);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        java.util.Set set3 = serializableMap0.entrySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry5 = serializableMap0.floorEntry("hi!");
        boolean boolean6 = serializableMap0.isEmpty();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(strTrieEntry5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        boolean boolean7 = strItor6.hasNext();
        boolean boolean8 = strItor6.hasPrevious();
        boolean boolean9 = strItor6.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        java.util.Set<java.lang.String> strSet7 = serializableMap0.keySet();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        serializableMap8.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap9);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry14 = serializableMap9.floorEntry("");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap15 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap16 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor17 = serializableMap16.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor18 = serializableMap16.mapIterator();
        serializableMap15.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap16);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry22 = serializableMap15.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry23 = serializableMap9.nextEntry(strTrieEntry22);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry24 = serializableMap0.previousEntry(strTrieEntry22);
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor25 = serializableMap0.mapIterator();
        java.util.Set set26 = serializableMap0.entrySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNull(strTrieEntry14);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strTrieEntry22);
        org.junit.Assert.assertNull(strTrieEntry23);
        org.junit.Assert.assertNull(strTrieEntry24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean4 = stringKeyAnalyzer0.isBitSet("hi!", (int) (short) 1, 10);
        boolean boolean8 = stringKeyAnalyzer0.isBitSet("", (-1), (-3));
        int int11 = stringKeyAnalyzer0.compare("Entry(key={} [0], value=null, parent=null, left={} [0], right=null, predecessor={} [0])", "Entry(key=Trie[0]={\n}\n [0], value=null, parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])");
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry17 = serializableMap1.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        boolean boolean20 = serializableMap1.compareKeys("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap21 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap21.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor23 = serializableMap21.mapIterator();
        java.util.Set set24 = serializableMap21.keySet();
        boolean boolean26 = serializableMap21.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry30 = serializableMap21.subtree("hi!", 16, 0);
        java.io.Serializable serializable31 = serializableMap1.remove((java.lang.Object) strTrieEntry30);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap32 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor33 = serializableMap32.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor34 = serializableMap32.mapIterator();
        int int35 = serializableMap32.modCount;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry37 = serializableMap32.higherEntry("Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])");
        java.lang.Object obj38 = serializableMap1.remove((java.lang.Object) strTrieEntry37);
        int int39 = serializableMap1.modCount;
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(strTrieEntry6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strTrieEntry14);
        org.junit.Assert.assertNull(strTrieEntry15);
        org.junit.Assert.assertNull(strTrieEntry17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(strTrieEntry30);
        org.junit.Assert.assertNull(serializable31);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(strTrieEntry37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.prefixMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializableMap0.firstKey();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.lang.String str6 = serializableMap0.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap7 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor8 = serializableMap7.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap7.mapIterator();
        java.util.Set set10 = serializableMap7.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap12 = serializableMap7.tailMap("hi!");
        java.io.Serializable serializable14 = serializableMap7.selectValue("");
        boolean boolean17 = serializableMap7.compareKeys("hi!", "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.io.Serializable serializable18 = serializableMap0.get((java.lang.Object) "Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap19 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap20 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor21 = serializableMap20.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor22 = serializableMap20.mapIterator();
        serializableMap19.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap20);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry26 = serializableMap19.getNearestEntryForKey("", (int) ' ');
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry27 = serializableMap0.nextEntry(strTrieEntry26);
        java.io.Serializable serializable30 = serializableMap0.put("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", (java.io.Serializable) 10.0f);
        java.lang.Object obj31 = null;
        boolean boolean32 = serializableMap0.containsKey(obj31);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strTrieEntry26);
        org.junit.Assert.assertNull(strTrieEntry27);
        org.junit.Assert.assertNull(serializable30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        int int2 = serializableMap0.modCount;
        serializableMap0.clear();
        int int4 = serializableMap0.size();
        java.lang.String str6 = serializableMap0.nextKey("Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor={} [0])");
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        java.util.Set set76 = serializableMap0.keySet();
        java.util.Set set77 = serializableMap0.entrySet();
        java.util.Comparator<? super java.lang.String> wildcardComparator78 = serializableMap0.comparator();
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
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(wildcardComparator78);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = stringKeyAnalyzer0.bitIndex("Entry(key=Trie[0]={\n}\n [0], value=[], parent=null, left=Trie[0]={\n}\n [0], right=null, predecessor=Trie[0]={\n}\n [0])", 15, 2, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])", (-94), 192);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The offsets and lengths must be at Character boundaries");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        boolean boolean7 = strItor6.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection2 = serializableMap0.values();
        int int3 = serializableMap0.modCount;
        boolean boolean4 = serializableMap0.isEmpty();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor5 = serializableMap0.mapIterator();
        java.util.Comparator comparator6 = serializableMap0.comparator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap8 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor9 = serializableMap8.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap8.mapIterator();
        java.io.Serializable serializable11 = serializableMap0.put("Entry(key=null [0], value=[], parent=null, left=null [0], right=null [32], predecessor=null [0])", (java.io.Serializable) serializableMap8);
        boolean boolean14 = serializableMap0.compareKeys("Entry(key=null [0], value=[], parent=null, left=null [0], right=null [32], predecessor=null [0])", "Trie[0]={\n}\n");
        java.lang.String str16 = serializableMap0.previousKey("hi!");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap18.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap18.mapIterator();
        java.util.Set set21 = serializableMap18.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap23 = serializableMap18.tailMap("hi!");
        java.io.Serializable serializable25 = serializableMap18.selectValue("");
        boolean boolean26 = serializableMap18.isEmpty();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap28 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap29 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor30 = serializableMap29.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor31 = serializableMap29.mapIterator();
        serializableMap28.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap29);
        java.io.Serializable serializable33 = serializableMap18.put("", (java.io.Serializable) serializableMap28);
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
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry52 = serializableMap36.lowerEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        java.util.Map.Entry<java.lang.String, java.io.Serializable> strEntry54 = serializableMap36.select("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.io.Serializable>> strEntrySet55 = serializableMap36.entrySet();
        java.io.Serializable serializable56 = serializableMap18.getOrDefault((java.lang.Object) "Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])", (java.io.Serializable) serializableMap36);
        java.io.Serializable serializable57 = serializableMap0.putIfAbsent("Entry(key={} [100], value=null, parent=null, left={} [100], right=null, predecessor={} [100])", (java.io.Serializable) "Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap58 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor59 = serializableMap58.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor60 = serializableMap58.mapIterator();
        java.util.Set set61 = serializableMap58.keySet();
        boolean boolean63 = serializableMap58.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor64 = serializableMap58.mapIterator();
        boolean boolean65 = strItor64.hasNext();
        boolean boolean66 = serializableMap0.containsValue((java.lang.Object) boolean65);
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(serializable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNull(strTrieEntry41);
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertNotNull(strTrieEntry49);
        org.junit.Assert.assertNull(strTrieEntry50);
        org.junit.Assert.assertNull(strTrieEntry52);
        org.junit.Assert.assertNull(strEntry54);
        org.junit.Assert.assertNotNull(strEntrySet55);
        org.junit.Assert.assertNotNull(serializable56);
        org.junit.Assert.assertNull(serializable57);
        org.junit.Assert.assertNotNull(strItor59);
        org.junit.Assert.assertNotNull(strItor60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strItor64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        boolean boolean5 = serializableMap0.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        boolean boolean7 = strItor6.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor6.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor6 = serializableMap0.mapIterator();
        int int7 = serializableMap0.size();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap8 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap9 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor10 = serializableMap9.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor11 = serializableMap9.mapIterator();
        java.util.Set set12 = serializableMap9.keySet();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set> strMapTrieEntry14 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.util.SortedMap<java.lang.String, java.io.Serializable>, java.util.Set>(strMap8, set12, (int) ' ');
        java.lang.String str15 = strMapTrieEntry14.toString();
        strMapTrieEntry14.bitIndex = 0;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap18 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor19 = serializableMap18.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor20 = serializableMap18.mapIterator();
        java.util.Set set21 = serializableMap18.keySet();
        boolean boolean23 = serializableMap18.containsKey((java.lang.Object) "hi!");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, java.io.Serializable> strItor24 = serializableMap18.mapIterator();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap25 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor26 = serializableMap25.mapIterator();
        java.util.Collection<java.io.Serializable> serializableCollection27 = serializableMap25.values();
        java.util.Set<java.lang.String> strSet28 = serializableMap25.keySet();
        java.util.Set set29 = strMapTrieEntry14.setKeyValue((java.util.SortedMap<java.lang.String, java.io.Serializable>) serializableMap18, (java.util.Set) strSet28);
        java.lang.Object obj30 = null;
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap31 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor32 = serializableMap31.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor33 = serializableMap31.mapIterator();
        java.util.Set set34 = serializableMap31.keySet();
        serializableMap31.clear();
        java.lang.String str37 = serializableMap31.selectKey("");
        java.io.Serializable serializable39 = serializableMap31.selectValue("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        boolean boolean40 = serializableMap18.remove(obj30, (java.lang.Object) serializableMap31);
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap18);
        java.util.Set set42 = serializableMap0.keySet();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])" + "'", str15, "Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(serializableCollection27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(strItor32);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(serializable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer stringKeyAnalyzer0 = org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.INSTANCE;
        boolean boolean4 = stringKeyAnalyzer0.isBitSet("hi!", (int) (short) 1, 10);
        int int7 = stringKeyAnalyzer0.compare("", "hi!");
        org.junit.Assert.assertNotNull(stringKeyAnalyzer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
}

