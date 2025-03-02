package Array;

public class SortingAges {
    public static void main(String[] args) {
        Integer [] age = {20, 2 ,20, 21, 21, 80};
        for(int i=0; i< age.length; i++){
            for (int j=i+1; j<age.length; j++){
                if(age[i]==age[j]){
                    System.out.println(age[i]);
                }
            }
        }
    }
}
