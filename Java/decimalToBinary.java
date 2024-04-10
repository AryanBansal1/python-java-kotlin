public class decimalToBinary {
    public static void DToB(int dec){
        int binary = 0;
        int k =0;
        while(dec>0){
            int lastdigit = dec%2;
            binary = binary+lastdigit* ((int)Math.pow(10,k));
            k++;
            dec/=2;
        }
        System.out.println(binary);
    }



    public static void main(String args[]){
        DToB(15);
    }
}
