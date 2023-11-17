//실행을 하면 out이라는 폴더가 생성됨 -> 실행하면 compile결과를 out 폴더에서 관리하는 것
public class Basic {
    //class 변수가 field인 것(C++에서는 멤버변수)
    boolean judge;

    public static void main(String[] args){
        int x, y = 10, z = 15; // <- 리터럴을 지정하지 않으면 0으로 초기화됨
        System.out.println("Hello");
        System.out. print("남우성"); //print함수는 값 출력 후 \n이 없음
        System.out. print("namws0023@gmail.com\n");

        int i = 1;
        while(i <= 5){
            System.out.println("****");
            i++;
        }



                /*
        byte: 1byte 크기
        short: 2byte 크기
        int: 4byte 크기
        long: 8byte 크기
        기본적으로 숫자는 int로 인식, 3L과 같이 뒤에 L을 붙이면 long으로 인식

        float: 4byte
        double: 8byte
        기본적인 실수는 double로 인식, 5.2f와 같이 f를 붙이면 float로 인식


        연산자
        / <- 몫 => int / int = 결과도 int 반환
        % <- 나머지
         */

        //기본형 type인 integer도 class -> class의 field와 method 사용가능
        //integer class의 field로 값을 가져옴
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println(maxInt + 1); // <- overflow, 최댓값을 넘어 값이 음수가 됨



        boolean flag1, flag2, flag3, flag4;
        flag1 = 10 < 5 && 5 < 20;
        flag2 = 10 < 5 & 5 < 20;
        //위 두 연산의 차이는 &&인 경우 앞의 수식이 거짓이면 뒤에 수식 시행을 안함
        // &인 경우 앞이 거짓이어도 뒤의 수식도 시행을 함
        // ||와 |도 동일한 차이




        //char은 ''로 묶인 문자 하나
        //2byte의 크기를 가지며 유니코드 값을 저장
        //유니코드는 0000부터 0FFF까지 표현됨
        // 0041은 A를 의미(65), 005F는 Z를 의미, 0061은 a를 의미(97)
        char c1 = 'a';
        System.out.println((int)c1);
        char c2 = (char)97;
        System.out.println(c2);
        //a부터 z까지 출력
        char c3 = 'a';
        while(c3 <= 'z'){
            System.out.println(c3);
            c3++;
        }




                /*
        1byte = 8bit
        1byte를 정수로 표현하면 0~254까지 표현가능(부호화 bit가 없다고 가정)
        1byte가 컴퓨터가 처리하는 최소 단위 -> boolean은 1bit만으로 충분하지만 1byte메모리를 할당받음

        1byte는 16진수로 표현하면 00 ~ FF까지 표현 가능
         */
        int a = 4;
        int b = a >> 2; //2^2으로 나누는 효과
        int c = a << 3; //2^3으로 곱하는 효과

        /*
        >> 연산자는 부호 bit는 남겨놓고 shift를 진행
        but >>>는 부호bit까지 모두 shift -> 결과가 무조건 양수가 됨
         */


        //삼항연산자 존재
        int a1 = 5;
        int value = (a1 > 4) ? 10: 20;


        //switch 문
        int a2 = 10;
        switch(a2){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println("30");
                break;
        }

        
        /*
        java는 문자열 + 다른 type이 가능, 결과는 문자열
         */
        System.out.println("Hello" + 1); //"Hello1"
        System.out.println("Hello" + true); //"Hellotrue"
        
        
        //java에는 label이라는 개념이 존재
        //이중 중첩문을 한번에 나오고 싶을 떄 활용 가능
        //break {label}을 하면 해당 label이 가르키는 반복문을 빠져나오게 됨
        //continue {label}도 가능
        outter:
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 3; k++){
                if(i == 0 && k == 2)
                    break outter;
                System.out.println(i + ", " + k);
            }
        }
    }
}
