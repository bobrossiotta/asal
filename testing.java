import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        int i,j;
        boolean n;

        for (i=2;i<=100;i++) {
            n = true;
            for (j=2;j<i;j++) {
                if (i % j == 0) {
                    n = false;
                    break;
                }
            }
            if (n) {
                System.out.print(i + " ");
            }
        }


                }
            }
        }
    }
}