public class seventh {
    public static void main(String[] args) {
        int[] arr = { 12, 56, -5, 47, 5, 10, 1, 74 };
        int num = 5;
        int idx = -1;
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                idx = i;
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("element found at index "+idx);
        }
        else{
            System.out.println("element not found");
        }
    }
}
