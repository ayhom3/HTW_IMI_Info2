public class Sorting {



        public static int findMinIndex(int[] a) {
            int min = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[min] > a[i]) {
                    min = i;
                }
            }
            return min;
        }


    }



