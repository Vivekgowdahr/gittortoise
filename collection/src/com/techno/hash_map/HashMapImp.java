package com.techno.hash_map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImp {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Sushmitha");
		hashMap.put(2, "Vivek");
		hashMap.put(3, "Harish");
		hashMap.put(2, "Sunitha");
		Set<Integer> keySet = hashMap.keySet();
		for (Integer family : keySet)
			System.out.println("key" + family + ", value" + hashMap.get(family));
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for (Entry<Integer, String> s : entrySet)
			System.out.println(s);

	}
}
