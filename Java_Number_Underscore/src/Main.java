public class Main {
    public static void main(String[] args) {
        float f1 = 1_.23456F;           // X; .의 앞에 위치(숫자와 숫자사이_ X)
        float f2 = 1._23456F;           // X; .의 뒤에 위치(숫자와 숫자사이_ X)
        long longNum = 999_99_9999_L;   // O; L의 앞에 위치

        int ex1 = _26;                  // X; 숫자 표현이 아님 (_로 시작하는 것은 변수명이 됨)
        int ex2 = 2_6;                  // O;
        int ex3 = 26_;                  // X; 숫자의 끝에 위치
        int ex4 = 2_______6;            // O

        int ex5 = 0_x26;                // X; 16진수를 나타내는 0x사이에는 불가능
        int ex6 = 0x_26;                // X; 숫자의 시작에 위치
        int ex7 = 0x2_6;                // O; (16진수)
        int ex8 = 0x26_;                // X; 숫자의 끝에 위치

        int ex9 = 0_26;                 // O; (8진수)
        int ex10 = 02_6;                // O; (8진수)
        int ex11 = 026_;                // X; 숫자의 끝에 위치

        int age = 26;
        long num = 8764827384923849L;
    }
}
