package strings;

public class substring {
    public static void main(String args[]){
        String address = "70EHemViharBaltana";
        String city="";
        for(int i=6;i<11;i++){
            city += address.charAt(i);
        }

        System.out.println(city);
        System.out.println(address.substring(6,11));
    }
}
