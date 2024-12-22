package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		String keyToSearch = "grape";
		
		if (dictionary.dictionaryMap.containsKey(keyToSearch)) {
			System.out.println(keyToSearch + "の意味は" + dictionary.getMeaning(keyToSearch));
		} else {
			System.out.println(keyToSearch + "は辞書に存在しません");
		}
	}
}