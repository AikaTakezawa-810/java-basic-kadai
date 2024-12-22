package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> dictionaryMap = new HashMap<String, String>();

public Dictionary_Chapter21() {
	dictionaryMap.put("apple","りんご");
	dictionaryMap.put("peach", "桃");
	dictionaryMap.put("banana","ばなな");
	dictionaryMap.put("lemon","レモン");
	dictionaryMap.put("pear","梨");
	dictionaryMap.put("kiwi","キウィ");
	dictionaryMap.put("strawberry","いちご");
	dictionaryMap.put("grape","ぶどう");
	dictionaryMap.put("muscat","マスカット");
	dictionaryMap.put("cherry","さくらんぼ");
	}
	
	public String getMeaning(String key) {
		return dictionaryMap.getOrDefault(key, "その単語は辞書に存在しません");
	}
	
	public boolean addWord(String key, String value) {
		if (!dictionaryMap.containsKey(key)) {
			dictionaryMap.put(key, value);
			return true;
		}
		return false;
	}
}
