
public class Hello {
    public static void main(String[] args) {
        MyTools mt = new MyTools();
        int[] arr = {10, 20, 30, 4, 12};
        mt.BubbleSort(arr);
        System.out.println("排序后的arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

//创建一个类 MyTools ,实现冒泡排序
class MyTools {
    public void BubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
