package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {
    public static void main(String[] args) {
        Offer o1 = new Offer();
        o1.setInfo("UK","GOOGLE","SDET",
                60000,true,true,true,
                true);
        System.out.println(o1);

        Offer o2 = new Offer();
        o2.setInfo("USA","AMAZON","QA",
                60000,true,true,
                false,false);
        System.out.println(o2);

        Offer o3 = new Offer();
        o3.setInfo("UK","BARCLAYS","ACOOUNTER",
                30000, false,true,
                false,true);
        System.out.println(o3);

        Offer o4 = new Offer();
        o4.setInfo("TURKEY","ARKAS","SAILER",
                40000,true,true,
                true,true);
        System.out.println(o4);

        Offer o5 = new Offer();
        o5.setInfo("SWEDEN","H&M","CASHIER",
                20000,true,true,
                true,true);
        System.out.println(o5);

        Offer[] myOffers = {o1,o2,o3,o4,o5};

        ArrayList<Offer> fullTimeOffer= new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffer.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeOffer.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("UK"));
        System.out.println(localOffers.size());

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + ":" + localOffer.salary);
        }







    }

}
