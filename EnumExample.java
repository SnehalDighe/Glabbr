

class MobilesCompanies {
   enum Mobile{ SUMSUNG, LENOVO, REDMI }
   Mobile comapny;
}

public class EnumExample {

   public static void main(String args[]) {
      MobilesCompanies mobilecompanies = new MobilesCompanies();
      mobilecompanies.comapny = MobilesCompanies.Mobile.REDMI ;
      System.out.println("Mobile: " + mobilecompanies.comapny);
   }
}
