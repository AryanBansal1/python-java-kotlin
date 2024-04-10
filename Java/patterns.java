public class patterns {

    //HOllow Rectangle Pattern 
    public static void hollowrectangle(int totalrow,int totalcol){
        //outer loop for row
        for (int line = 1;line<=totalrow;line++){
            //inner loop for column
            for (int col =1 ;col<=totalcol;col++){
                if(line ==1 || line ==totalrow||col ==1 || col ==totalcol){System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }
    
    //Inverse Pyramid Pattern
    public static void inversepyramid(int rows){
        for(int i = 1;i<=rows;i++){
            for(int j =1;j<=rows;j++){
                if(j<=(rows-i)){System.out.print(" ");}
                else{System.out.print("*");}
            }
            System.out.println();  
        }


    }

    //Inverted Half Number Pyramid Pattern
    public static void invertedhalfpyramid(int row){
        for(int line=1;line <=row;line++){
            for(int num =1;num<=(row-line+1);num++){       
                System.out.print(num);
            }
            System.out.println();
        }
    }
    // Floyd Triangle
    public static void floydTriangle(int row){
        int number = 1;
        for(int i =1;i<=row;i++){
            for(int j =1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
        System.out.println();    
        }
    }


    // 01 TRIANGLE
    public static void O1triangle(int lines){
        for(int line = 1;line<=lines;line++){
            for(int zero=1;zero <=line;zero++){
               if((line+zero)%2==0){System.out.print("1");}
               else {System.out.print("0");}
            }
        System.out.println();    
        }
    }


    // Butterfly Pattern
    public static void butterfly(int lines){
        for(int i=1; i<=lines;i++){
            for (int stars= 1;stars<=i;stars++){
                System.out.print("*");
            }
            for (int space = 1;space<=(2*(lines-i));space++){
                System.out.print(" ");
            }
            for (int stars = 1;stars<=i;stars++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=lines; i>0;i--){
            for (int stars= 1;stars<=i;stars++){
                System.out.print("*");
            }
            for (int space = 1;space<=(2*(lines-i));space++){
                System.out.print(" ");
            }
            for (int stars = 1;stars<=i;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // SOLID RHOMBUS
    public static void solidrohmbus(int line){
        for(int i =1;i<=line;i++){
            for (int j = 1;j<=(line-i);j++){
                System.out.print(" ");
            }
            for (int j =1;j<=line;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

// HOLLOW RHOMBUS
    public static void hollow_rhombus(int line){
        for (int i=1;i<=line;i++){
            
            //for space            
            for(int j=1;j<=line-i;j++){
                System.out.print(" ");
            }
            //for hollow star
            for(int j=1;j<=line;j++){
                if(i==1 || i==line ||j==1 || j==line) {
                    System.out.print("*");}
                else {System.out.print(" ");}
            }

            System.out.println();
        }
    }



    // DAIMOND PATTERN
    public static void daimond(int n){
        for(int i =1;i<=n;i++){
            //for space
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for star
            for(int j = 1;j<=(2*i)-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //FOR 2nd Half
        for(int i =n;i>0;i--){
            //for space
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for star
            for(int j = 1;j<=(2*i)-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }







    public static void main (String args[]){
        
        //hollowrectangle(5,12);}
        //inversepyramid(7);
        //invertedhalfpyramid(7);
        //floydTriangle(7);
        //O1triangle(5);
        //butterfly(5);
        //solidrohmbus(6);
        //hollow_rhombus(5);
        daimond(5);
    }   
}
 