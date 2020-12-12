public class Dz4 {


    public static void main(String[] args){

//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] demo = new int[5][5];
        for (int i = 0; i < demo.length; i++){
            for (int q = 0, w = demo[i].length; q < demo[i].length; q++, w--){
                if (i == q || i == (w - 1)) demo[i][q] = 1;
                System.out.print(demo[i][q]);
            }
        }
    }
}
