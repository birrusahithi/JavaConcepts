abstract class Sahi{
    abstract public void print();
    public void print1(){
        System.out.println("print1");
    }
}
class Anki extends Sahi{
    public void print(){
        System.out.println("print");
    }

}
//
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        int count =1;
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            if(nums[i]==target){
                list.add(i);
                count++;
            }
        }
        if(list.size()==0){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        if(list.size()>0){
            arr[0]=list.get(0);
            arr[1]=list.get(list.size()-1);
        }
        return arr;
    }
}