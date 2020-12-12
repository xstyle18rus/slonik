

public class Dz1 {

    public static void main(String[] args) {
        demoDe();

    }
    static void demoDe() {
        int[] demo_de = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < demo_de.length; i++) {
            demo_de[i] = demo_de[i] == 1 ? 0 : 1;
            System.out.println(demo_de[i]);
//          demo_de[i] = (int) (Math.random() * 2);
        }



    }




}


