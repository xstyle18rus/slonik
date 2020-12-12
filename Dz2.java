public class Dz2 {

    public static void main(String[] args){
        int[] demo_de = new int[8];
        for (int i = 0, q = -3; i < demo_de.length; i++) {
            demo_de[i] = q;
            demo_de[i] = q += 3;
            System.out.println(demo_de[i]);
        }
//            for (int q = 1; demo_de[i] = q += 3);



//        System.out.println(demo_de[3]);
    }
}
