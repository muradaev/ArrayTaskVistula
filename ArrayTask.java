import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int tab[] = {1, 1, 2, -1,2, -1}; // here put any array you wanna test
        boolean flag = false;
        Arrays.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            if (flag) { // if we already found value no need to iterate through array anymore
                break;
            }
            if (tab[i] < 0) {
                for (int j = tab.length - 1; j >= 0; j--) {
                    if (tab[i] * -1 == tab[j]) { // comparing biggest number in array with all negative numbers, could as well use Math.abs()
                        System.out.printf("%d %d ", tab[j], tab[i]);
                        flag = true;
                        if (flag) {
                            break;
                        }
                    }
                }
            }
        }
        if (!flag) { // if there are no compatible values
            System.out.println("No compatible values");
        }
    }
}
