public class linearSearchArray {

    // making a searching function
    public static int linearsearch(String a[],String key){
        for(int i =0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"Samosa","Fried rice","ChillyPotato","Prantha"};
        int answer = linearsearch(menu,"Prantha");
        if (answer==-1){
            System.out.print("Not found");
        }
        else {System.out.print(answer);}
    }
}
