package my.test.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OnceInAnArray {
	public static void main(String[] args) {
		int arr[] = { 12, 1, 12, 3, 12, 1, 1, 2, 3, 3 };
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			Integer count = map.get(arr[i]);
			if(null == count)
			{
				count = new Integer(1);
			}
			else
			{
				count++;
			}
			map.put(arr[i], count);
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if(entry.getValue() == 1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}
		System.out.println(map);
	}
}
