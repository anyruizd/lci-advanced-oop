public class CompanyAddress {
        public String streetNumber;
        public String streetName;

        public String city;
        public String postalCode;
        public CompanyAddress() {
            this("1975", "Maisonneuve Boulevard Ouest");
        }

        public CompanyAddress(String streetNumber, String streetName) {
            this(streetNumber, streetName, "811");
        }

        public CompanyAddress(String streetNumber, String streetName, String city) {
            this(streetNumber, streetName, city, "H3H1K4");
        }

        public CompanyAddress(String streetNumber, String streetName, String city, String postalCode) {
            this.streetNumber = streetNumber;
            this.streetName = streetName;
            this.city = city;
            this.postalCode = postalCode;
        }


       public void display () {

       }

}
