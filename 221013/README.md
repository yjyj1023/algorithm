# 221013-algorithm

# 1. 정렬알고리즘
## 0. 알아야할 사항
 1. Swap 자리바꾸기
 2. 중첩 for문 다루기
 3. 맨 앞에서부터 작은 수를 채워가는 알고리즘(버블정렬과 선택정렬의 중간)
 
## 1. 알고리즘 생각해보기
- `[7,2,3,9,28,11]`이라는 배열이 있다.
### 1) 첫번째 루프
![](https://velog.velcdn.com/images/lyj1023/post/1e478d35-51d0-4932-9482-7a10f0f16288/image.png)
- 첫번째 루프에서 배열의 0번자리 원소와 그 이후 원소들을 비교하면서 가장작은수가 0번자리에 오게된다.

### 2) 두번째 루프
![](https://velog.velcdn.com/images/lyj1023/post/63e1d2e4-aee5-4cfd-b303-506aef083065/image.png)
- 두번째 루프에서는 1번자리 원소와 그 이후 원소들을 비교하면서 두번째로 작은 숫자가 1번자리에 오게된다.

### 3) 그 후
- 위와 같은 과정을 반복하면 배열의길이-1 만큼 루프를 돌게 된다.

## 2. 코드 작성
### 1) 첫번째 루프돌기

- 정렬의 0번자리 원소와 그 이후 원소들을 비교하며 작은 원소가 0번자리로 가게한다.

### 2) 매개변수 추가

- sort메소드에 몇번자리부터 비교할지 num이라는 매개변수를 추가했다.


### 3) 이중 for문 적용

- 위 1~2번을 바탕으로 sort메소드에 이중 for문을 작성하여 num이라는 매개변수를 받지 않고도 알아서 루프를 돌수 있게했다.


### 4) Swap메소드 추가 -BubbleSort.java

- swap 메소드를 추가해서 swap 메소드에서 원소들을 바꿀수 있도록 했다.