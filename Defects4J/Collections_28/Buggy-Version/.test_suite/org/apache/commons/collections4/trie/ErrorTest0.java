package org.apache.commons.collections4.trie;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.tailMap("hi!");
        java.io.Serializable serializable7 = serializableMap0.selectValue("");
        serializableMap0.incrementSize();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on set3 and set3", set3.equals(set3) ? set3.hashCode() == set3.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.Collection<java.io.Serializable> serializableCollection5 = serializableMap0.values();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry7 = serializableMap0.floorEntry("Entry(key=null [32], value=[], parent=null, left=null [32], right=null, predecessor=null [32])");
        boolean boolean11 = serializableMap0.isBitSet("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])", 0, 0);
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap12 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap13 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor14 = serializableMap13.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor15 = serializableMap13.mapIterator();
        serializableMap12.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap13);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.String, java.io.Serializable> strTrieEntry19 = serializableMap12.getNearestEntryForKey("", (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Serializable serializable20 = serializableMap0.removeEntry(strTrieEntry19);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor1 = serializableMap0.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap0.mapIterator();
        java.util.Set set3 = serializableMap0.keySet();
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap5 = serializableMap0.prefixMap("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])");
        int int7 = serializableMap0.lengthInBits("hi!");
        serializableMap0.decrementSize();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on set3 and set3", set3.equals(set3) ? set3.hashCode() == set3.hashCode() : true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap0 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable> serializableMap1 = new org.apache.commons.collections4.trie.PatriciaTrie<java.io.Serializable>();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor2 = serializableMap1.mapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.String, java.io.Serializable> strItor3 = serializableMap1.mapIterator();
        serializableMap0.putAll((java.util.Map<java.lang.String, java.io.Serializable>) serializableMap1);
        java.util.SortedMap<java.lang.String, java.io.Serializable> strMap6 = serializableMap1.headMap("hi!");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator7 = serializableMap1.mapIterator();
        int int10 = serializableMap1.bitIndex("Entry(key=null [0], value=[], parent=null, left=null [0], right=null, predecessor=null [0])", "Entry(key={} [1], value=null, parent=null, left={} [1], right=null, predecessor={} [1])");
        serializableMap1.decrementSize();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableMap0 and strMap6.", serializableMap0.equals(strMap6) == strMap6.equals(serializableMap0));
    }
}

