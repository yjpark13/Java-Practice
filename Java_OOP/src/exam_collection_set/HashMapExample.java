package exam_collection_set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<>();

        dic.put("고진감래", "고생 끝에 즐거움이 옴");
        dic.put("분골쇄신", "몸이 부서질 정도로 노력을 다함");
        dic.put("권토중래", "실패를 발판삼아 재기함");
        dic.put("교학사장", "가르치고 배우면서 서로 성장함");

        System.out.println(dic.get("고진감래"));
        System.out.println();

        System.out.println("총 Entry 수: " + dic.size());

        dic.remove("교학상자");
        System.out.println("총 Entry 수: " + dic.size());

        System.out.println(dic.toString());
        System.out.println();

        //방법 1

        Set<String> keySet = dic.keySet();
        Iterator<String> keys = keySet.iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("%s : %s", key, dic.get(key)));
        }
        System.out.println();

        //방법 2

        for (String key : dic.keySet()) {
            System.out.println(String.format("%s : %s", key, dic.get(key)));
        }
        System.out.println();

        //방법 3

        Set<Map.Entry<String, String>> entrySet = dic.entrySet();
        Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();

        //방법 4

        for (Map.Entry<String, String> elem : dic.entrySet()) {
            System.out.printf("%s : %s \n", elem.getKey(), elem.getValue());
        }

    }
}
