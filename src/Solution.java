public class Solution {
    public static int solution(int number) {
        int suma= 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma+= i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(solution(number));
    }
}