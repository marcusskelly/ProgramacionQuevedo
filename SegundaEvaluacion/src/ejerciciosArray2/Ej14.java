package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio14 {
    public static void main(String[] args) {
        /* 14. Leer dos series de 10 enteros, que estarán ordenados crecientemente.
        */
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 1000);
            B[i] = (int) (Math.random() * 1000);
        }

        Arrays.sort(A);
        Arrays.sort(B);

        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));

        /* Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados. */
        int[] C = new int[20];
        System.out.println(Arrays.toString(C));

        int posA = 0; // 0-9
        int posB = 0; // 0-9
        int posC = 0; // 0-19
        while (posA < A.length && posB < B.length) {
            if (A[posA] <= B[posB]) {
                C[posC] = A[posA];
                posA++;
            } else {
                C[posC] = B[posB];
                posB++;
            }
            posC++;
        }
        System.out.println("Al salir de while: ");
        System.out.println("posA: " + posA);
        System.out.println("posB: " + posB);
        System.out.println("posC: " + posC);
        System.out.println(Arrays.toString(C));

        if (posA == A.length) {
            for (int i = posC; i < C.length; i++) {
                C[i] = B[posB];
                posB++;
            }
        } else {
            for (int i = posC; i < C.length; i++) {
                C[i] = A[posA];
                posA++;
            }
        }

        System.out.println("Al finalizar: " + Arrays.toString(C));
         }
    }

