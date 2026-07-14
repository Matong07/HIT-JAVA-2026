public class App {
    public static void main(String[] args) throws Exception {
        int[] bang = {1,2,3,4,5,6,7,8,9};
        int[] lan ={1,2,3,4,5,6,7,8,9};
        for(int i: bang){
            System.out.println("Bang cuu chuong "+i);
            for(int y: lan){
                System.out.println(i+" * "+y +" = "+i*y);
            }
            System.out.println();
        }
        int[] dong = {1, 2, 3, 4, 5};
        for (int i : dong) {
            String sao = "";
            for (int j : dong) {
                if (j <= i) {
                    sao += "* ";
                }
            }
            System.out.println(sao);
        }
    }
}
