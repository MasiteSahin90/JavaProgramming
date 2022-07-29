package day36_Inheritance.phone;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone i1 = new Iphone();
        i1.setInfo("Iphone", "13proMax","max","white",999);
        System.out.println(i1);
        i1.faceTime(34567890);

        Samsung s1 =new Samsung();
        s1.setInfo("Samsung","kdmkd","mke","ele",1234);
        System.out.println(s1);
        s1.freeze();

        Nokia n1= new Nokia();
        n1.setInfo("Nokia","dmdk","ekdke","eeo",234);
        System.out.println(n1);
        n1.selfDefence();
    }


}
