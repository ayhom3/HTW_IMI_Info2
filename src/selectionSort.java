public class selectionSort {
     public static int findMinIndex(int[] a) {
            if (a == null || a.length == 0) {
                return -1;
            }

            int min = 0;
            for(int i = 1; i < a.length; i++) {
                if(a[min] > a[i]) {
                    min = i;
                }
            }
            return min;
        }

     public static int findMinIndexInRange(int[] a, int i) {
         int jack = i;
         for (int queen = i + 1; queen < a.length; queen++) {
             if(a[jack] > a[queen]) {
                 jack = queen;
             }
         }
         return jack;
     }

     public static int selectionSort1(int[] a) {
         for(int king = 0; king < a.length; king++) {
             int m = findMinIndexInRange(a, king);
             swap(a, king, m);
         }
         return 0;
     }

    static void swap(int[] a, int i, int j) {
         int temp = a[i];
         a[i] = a[j];
         a[i] = temp;
    }


    // inline findMinIndexInRange and swap
    public static void selectionSort(int[] a){
         for(int king = 0; king < a.length - 1; king++) {
             int jack = king;
             for(int queen = king + 1; queen < a.length; queen++) {
                 if(a [ jack ] > a [ queen] ) {
                     jack = queen;
                 }
             }
             int temp = a [ king ];
              a [ king ] = a [ jack ];
              a [ jack ] = temp;
         }
    }
}



