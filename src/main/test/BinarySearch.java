/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 12:08 下午 2020/7/26
 * @Modified By:
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {14,134,235,2345,43636,345435};
        boolean isNumExists = isNumExist(arr, 15);
        System.out.println(isNumExists);
    }

    public static boolean isNumExist(int[] arr,int num){
        int start = 0;
        int end = arr.length - 1;
        int half;
        while (start < end){
            half = start + (end - start) >> 1;
            if (arr[half] > num){
                end = half - 1;
            }else if(arr[half] < num){
                start = half + 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
