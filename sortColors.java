public class sortColors {

    public static void main(String[] args) {
        int[] colors = new int[]{1,0,2,0,1,2,2,1,0,1};

        sortColors(colors);

        for(int i=0;i<colors.length;i++){
            System.out.print(colors[i]+" ");
        }

    }

    private static void sortColors(int[] colors) {
        int n = colors.length;

        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){

            if(colors[mid]==0){

                swap(colors,mid, low);
                low++;
                mid++;
            }

            else if(colors[mid] == 1) {
                mid++;
            }
            else{
                swap(colors,mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] colors, int mid, int low) {
        int temp = colors[mid];
        colors[mid] = colors[low];
        colors[low] = temp;

    }
}
