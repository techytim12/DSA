package Advanced;

public class Minimum_Swaps {

    public static void main(String[] args) {

        int[] A = {2, 0, 1, 3};
        int N = A.length;
        int count = 0;
        for(int i=0; i<N; i++){

            while(A[i] != i){
                count+=1;
                int temp = A[i];
                A[i] = A[A[i]];
                A[temp] = temp;

            }
        }

        for (int j : A) {
            System.out.println(j);
        }

        System.out.println("count: "+count);
    }
}
