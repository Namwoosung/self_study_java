package com.example;

/* 필요 기능
1. 1~45까지 써 있는 공을 기계에 넣는다.
2. 공들을 섞는다.
3. 섞인 공 중에서 6개를 꺼낸다.
 */
public interface LottoMachine {
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;
    public void setBalls(Ball[] balls);
    public void mix();
    public Ball[] getBalls();
}
