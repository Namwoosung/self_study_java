package com.example;

public class LottoMachineMain {
    public static void main(String[] args){
        //45개의 공 배열을 생성
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];

        //배열 element에 인스턴스 생성
        for(int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++){
            balls[i] = new Ball(i + 1);
        }

        //interface type으로 실제 구현한 class 참조 가능
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for(int i = 0; i < LottoMachine.RETURN_BALL_COUNT; i++){
            System.out.println(result[i].getNumber());
        }

    }
}
