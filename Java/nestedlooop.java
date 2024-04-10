public class nestedlooop {
    public static void main(String args []){
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=i;j++){System.out.print("*");}
            System.out.println();
        }
    }
}
// Reverse pattern

/*public class nestedlooop {
    public static void main(String args []){
        for(int i = 1;i<=10;i++){
            for(int j = 10;j>=i;j--){System.out.print("*");}
            System.out.println();
        }
    }
}*/
//  HALF PYRAMID

/* public class nestedlooop {
    public static void main(String args []){
        for(int line = 1;line<=10;line++){
            for(int n=1;n<=line;n++){
                System.out.print(n);
            }
        System.out.println();
        }
        
    }
}*/

// ALPHABET PYRAMID

/*public class nestedlooop {
    public static void main(String args []){
        char alphabet = 'A';
        for(int line = 1;line<=5;line++){
            for(int n=1;n<=line;n++){
                System.out.print(alphabet);
                alphabet++;
            }
        System.out.println();
        }
        
    }
} */