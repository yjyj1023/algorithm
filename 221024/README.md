# 221024-algorithm

# 1. 알고리즘
## 1.1 문제
- [프로그래머스-k번째수](https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java)
![](https://velog.velcdn.com/images/lyj1023/post/263f825e-bfc2-4767-9c34-9a8daf2a4f86/image.png)

## 1.2 배열로 풀기
### 1.2.1 배열로 풀기전 알아야할 사항
- 위 문제를 배열로 풀기전 다음 세가지 사항을 알고있어야 풀 수 있다.

1) 배열을 자르는 방법을 아는가?
    - 0을 기준으로 `Arrays.copyOfRange(원본 배열, 자를 배열의 시작인덱스, 자를 배열의 끝인덱스+1)`를 사용한다.
    - ex) `arr = {1,5,2,6,3,7,4}`라는 배열이 있을때 `Arrays.copyOfRange(arr, 2, 5);`를 하면 `{2,6,3}`이 된다.

2) 정렬을 할 줄 아는가?  
    - `Arrays.sort(정렬할 배열)`을 사용한다.
  
3) 특정 인덱스의 값을 뽑을 수 있는가?  
    - `배열의 이름[i]`를 사용한다.
    
4) 이차원 배열의 행과 열을 구할 수 있는가?  
    - 행: `배열의 이름.length`  
    - 열: `배열의 이름[행 인덱스].length`
    
### 1.2.2 코드
```java
public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    for(int i = 0; i<commands.length; i++){
        int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        Arrays.sort(temp);
        answer[i] = temp[commands[i][2]-1];
    }
    return answer;
}
```
1) `solution`메소드는 프로그래머스의 답메소드를 그대로 가져왔다.
2) `answer` 배열은 `commands`의 행의 개수만큼 선언한다.
3) `for`문도 `commands`의 행의 개수만큼 돌아가게 한다.
4) `temp` 배열은 문제에서 배열의 i~j번째 숫자까지 잘랐을때 저장하는 배열이다.
5) 잘린 배열을 `temp`에 저장한 후 `Arrays.sort`를 통해 정렬한다.
6) 그 후 `answer`에 `temp`의 k번째 수를 구한다.


## 1.3 우선순위큐(Priority Queue)로 풀기
### 1.3.1 우선순위 큐란?
- 일반적인 큐의 구조 __FIFO(First In First Out)__를 가지면서, 데이터가 들어온 순서대로 나가는 것이 아닌 __우선순위를 먼저 결정__하고 그 __우선순위가 높은 데이터가 먼저 나가는 자료구조__이다.

- __우선순위 큐의 특징__

  0) 우선순위 큐에 넣으면 정렬이 된다.
  1) 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조이다.
	&nbsp;&nbsp;&nbsp;- 우선순위 큐에 들어가는 원소는 비교가 가능한 기준이 있어야한다.
  2) 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있다.
  3) 내부구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NLogN)이다.
  4) 우선순위를 중요시해야 하는 상황에서 주로 쓰인다.
  
- __우선순위 큐 사용 방법__
```java
import java.util.PriorityQueue;
import java.util.Collections;

//낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

//높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

// 첫번째 값을 반환하고 제거 비어있다면 null
priorityQueueLowest.poll();

// 첫번째 값 제거 비어있다면 예외 발생
priorityQueueLowest.remove(); 

// 첫번째 값을 반환만 하고 제거 하지는 않는다.
// 큐가 비어있다면 null을 반환
priorityQueueLowest.peek();

// 첫번째 값을 반환만 하고 제거 하지는 않는다.
// 큐가 비어있다면 예외 발생
priorityQueueLowest.element();

// 초기화
priorityQueueLowest.clear();      
```

### 1.3.2 사용이유
- 배열을 잘라서 새로 만들면 메모리를 추가로 쓰게 되는데 배열 만드는 것을 최소화 하면 메모리를 덜쓰지 않을까라는 생각으로 우선순위 큐를 사용

### 1.3.3 코드
```java
public int[] solution2(int[] arr, int[][] commands) {
    int[] answer = new int[commands.length];
    for (int i = 0; i < commands.length; i++) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 우선순위 큐에 from, to까지 넣기
        for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
            pq.add(arr[j]);
        }
        // 정렬이 되었기 때문에 뽑기만 한다.
        for (int j = 0; j < commands[i][2]; j++) {
            answer[i] = pq.poll(); //stack의 pop과 비슷
        }
    }
    return answer;
}
```
1) `answer` 선언과 `for`문 사용은 `1.2 배열로 풀기` 사용과 똑같다.
2) `pq`라는 우선순위 큐를 선언한다.
3) 우선순위 큐에 문제의 i~j번째까지 원소를 넣는다. 원소가 들어가면서 자동으로 정렬되어 따로 정렬할 필요가 없어진다.
4) 그 후 `answer`에 `pq`의 k번째 원소를 뽑아 넣는다.
