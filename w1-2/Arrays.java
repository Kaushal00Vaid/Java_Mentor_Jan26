import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // // initalise integer array of size 10
        // // l = []
        
        // int[] arr = new int[10];

        // // String array of size 20
        // String[] strArray = new String[20];

        // // double array
        // double[] dubArray = new double[10];


        // // how to store elements inside array
        // // arr[idx] = value;
        // // l[3] = 789

        // arr[2] = 3;

        // // 1) old / very widely used
        // // 2) new way / recently added in java

        // // 1)
        
        // // python --> for i in range(len(l))
        // // len(l) --> arr.length
        // for(int i = 0; i < arr.length; i++) {
        //     int d = arr[i];
        //     System.out.println(d);
        // }

        // // 2) for i in l --> for each loop
        // for(int i : arr) {
        //     System.out.print(i);
        // }

        // for(String i : strArray) {
        //     System.out.print(i);
        // }

        // for(double i : dubArray) {
        //     System.out.print(i);
        // }


        // accept size of array from the user
        // make the user enter those many numbers
        // print all the even numbers from the array

        // input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();

        // initialise array
        int[] arr = new int[n]; // n sized integer array

        // user enters elements in array
        // arr[0] = in.nextInt();
        // arr[1] = in.nextInt();
        // arr[2] = in.nextInt();
        // arr[3] = in.nextInt();
        // arr[4] = in.nextInt();
        // arr[5] = in.nextInt();
        // ...

        System.out.println("Enter" + n + "Elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // print only the even numbers from the array
        System.out.println("All even numbers");
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
