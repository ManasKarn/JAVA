
import java.util.Scanner;

class Pattern1 {

    static int i;
    static int j;
    static int no;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number from 1 to 13");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Pat1();
                break;
            case 2:
                Pat2();
                break;
            case 3:
                Pat3();
                break;
            case 4:
                Pat4();
                break;
            case 5:
                Pat5();
                break;
            case 6:
                for (i = 1; i <= 4; ++i) {
                    for (j = 1; j <= i; ++j) {
                        System.out.print(j);
                    }

                    System.out.println();
                }
                break;
            case 7:
                for (i = 1; i <= 4; ++i) {
                    for (j = 1; j <= i; ++j) {
                        if (i % 2 == 0 && j % 2 == 0) {
                            System.out.print("1 ");
                        }

                        if (i % 2 == 0 && j % 2 != 0) {
                            System.out.print("0 ");
                        }

                        if (i % 2 != 0 && j % 2 == 0) {
                            System.out.print("0 ");
                        }

                        if (i % 2 != 0 && j % 2 != 0) {
                            System.out.print("1 ");
                        }
                    }

                    System.out.println();
                }
                break;
            case 8:
                System.out.println("Enter size");
                int k = sc.nextInt();

                for (i = 1; i <= k; ++i) {
                    for (j = 1; j <= i; ++j) {
                        System.out.print("*");
                    }

                    int space = 2 * (k - i);

                    for (j = 1; j <= space; ++j) {
                        System.out.print(" ");
                    }

                    for (j = 1; j <= i; ++j) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                for (i = k; i >= 1; --i) {
                    for (j = 1; j <= i; ++j) {
                        System.out.print("*");
                    }

                    int space = 2 * (k - i);

                    for (j = 1; j <= space; ++j) {
                        System.out.print(" ");
                    }

                    for (j = 1; j <= i; ++j) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
                break;
            case 9:
                System.out.println("Enter size");
                int N = sc.nextInt();

                for (i = 1; i <= N; ++i) {
                    int space = N - i;

                    for (j = 1; j <= space; ++j) {
                        System.out.print(" ");
                    }

                    for (j = N; j >= 1; --j) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
                break;
            case 10:
                System.out.println("enter size");
                int m = sc.nextInt();

                for (i = 1; i <= m; ++i) {
                    for (j = 1; j <= m - i; ++j) {
                        System.out.print(" ");
                    }

                    for (j = 1; j <= i; ++j) {
                        System.out.print(i + " ");
                    }

                    System.out.println();
                }
                break;
            case 11:
                System.out.println("Enter size");
                no = sc.nextInt();

                for (i = 1; i <= no; ++i) {
                    for (j = 1; j <= no - i; ++j) {
                        System.out.print(" ");
                    }

                    int f = i;

                    for (j = 1; j <= i + i - 1; ++j) {
                        if (f > 1 && j < i) {
                            System.out.print(f);
                            --f;
                        } else {
                            System.out.print(f);
                            ++f;
                        }
                    }

                    System.out.println();
                }
                break;
            case 12:
                System.out.println("Enter size");
                no = sc.nextInt();

                for (i = 1; i <= no; ++i) {
                    for (j = 1; j <= no - i; ++j) {
                        System.out.print(" ");
                    }

                    for (j = 1; j <= i + i - 1; ++j) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                for (i = no; i >= 1; --i) {
                    for (j = 1; j <= no - i; ++j) {
                        System.out.print(" ");
                    }

                    for (j = 1; j <= i + i - 1; ++j) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
                break;
            case 13:
                no = sc.nextInt();
//                for(int i=1;i<=no*2-1;i++){
//                    int c=no;
//                    int j=1;
//                    int s=1;
//                    while (j<=no*2-1){
//                        boolean m1=false;
//                        System.out.print(c);
//                        int k1=s;
//                        while(k1>1){
//                            c--;
//                            k1--;
//                            System.out.print(c);
//                            j++;
//                            m1=true;
//                        }
//                        while(i!=1 && i!=n*2-1 && j>n*2-1-i && j<=no*2-1){
//                            System.out.print(c);
//                            c++;
//                            j++;
//                            m1=true;
//                        }
//                        if (m1==false)
//                        j++;
//                        s++;
//                        if (s==no)
//                            s=1;
//                    }
//                    System.out.println();
//                }
//                for (int z=1;z<=5;z++) {
//                    for (int q = 1; q <= 5; q++) {
//                        if (q >= z)
//                            System.out.print(z);
//                        else System.out.print(q);
//                    }
//                    System.out.println();
//                }
                int f;
                for (int i = 1; i <= no * 2 - 1; i++) {
                    for (int j = 1; j <= no * 2 - 1; j++) {
                        int a = i;
                        if (i > n) {
                            a = n * 2 - i;
                        }
                        int b = j;
                        if (j > n) {
                            b = n * 2 - j;
                        }
                        if (a < b) {
                            f = a; 
                        }else {
                            f = b;
                        }
                        System.out.print(no + 1 - f);
                    }
                    System.out.println();
                }
        }

    }

    static void Pat1() {
        for (i = 1; i <= 4; ++i) {
            for (j = 1; j <= 5; ++j) {
                if (i != 1 && j != 1 && i != 4 && j != 5) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

    static void Pat2() {
        for (i = 1; i < 6; ++i) {
            for (j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static void Pat3() {
        for (i = 5; i > 0; --i) {
            for (j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static void Pat4() {
        for (i = 5; i > 0; --i) {
            for (j = 1; j < 6; ++j) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    static void Pat5() {
        for (i = 5; i > 0; --i) {
            for (j = 1; j < 6; ++j) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
