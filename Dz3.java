public class Dz3 {

    public static void main(String[] args){
//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//        и числа меньшие 6 умножить на 2;
        int[] demo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < demo.length; i++){
            if (demo[i] < 6){
                int q = demo[i] * 2;
                System.out.println(q);
            }
        }
    }
}
