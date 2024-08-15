package Introduction_To_Arrays;


// Search the given elemnet x in array. If present then return the index else return -1.
class search{
    void find(){
        // Learner Search

        int [] arr = {6,9,4,0,2,9,90};
        int x = 9;
        int index = -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==x){
                index=i;
                break; // agar multiple time hota to , kya karte hain , poora loop thode traverse karenge.
            }
        }
        if(index==-1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("matched at "+ index);

        }

    }
}
public class Search_x_element_in_array {
    public static void main(String[] args) {
        search obj = new search();
        obj.find();

    }
}
