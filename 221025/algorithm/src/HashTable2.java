import java.util.ArrayList;
import java.util.List;

public class HashTable2 {

    //내부클래스 추가
    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }
    //arraylist 생성
    List<Node>[] table = new ArrayList[1000];


    public int hash(String str) {
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            ascii += str.charAt(i);
        }
        return ascii % 1000;
    }

    //해결방법1 사용(리스트를 만들어서 오브젝트를 넣기)
    public void insert(String key, int value) {
        // List
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) {  //테이블에 hashIdx의 값이 비어있으면 arraylist를 생성함
            this.table[hashIdx] = new ArrayList<>();
        }
        // Map, Object
        this.table[hashIdx].add(new Node(key, value));  //어레이리스트에 key와 value를 넣음
    }

    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];  //key값으로 해당 arraylist의 key와 value를 찾음
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {  //전체 루프를 돌면서 해당 key값에 맞는 value를 리턴함
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable2 ht = new HashTable2();
        ht.insert("Yoonseo", 1);
        ht.insert("Seoyoon", 2);

        int result = ht.get("Yoonseo");
        if (result == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

        result = ht.get("Seoyoon");
        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

    }
}