public class Department {


    private class GeneralDepartment {
        private int id;
        private String name;
        private int numOfEmployees;

        public GeneralDepartment(){}

        public GeneralDepartment(int id, String name, int numOfEmployees) {
            this.id = id;
            this.name = name;
            this.numOfEmployees = numOfEmployees;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getNumOfEmployees() {
            return numOfEmployees;
        }

        public void setNumOfEmployees(int numOfEmployees) {
            this.numOfEmployees = numOfEmployees;
        }
    }

    public class Dermatology extends GeneralDepartment {
        private String nameOfSpeciality;
        // private final String nameOfSpeciality = "Dermatology";
        public Dermatology(int id, String name, int numOfEmployees) {
            super(id, name, numOfEmployees);
            setNameOfSpeciality();
        }

        public String getNameOfSpeciality() {
            return nameOfSpeciality;
        }

        public void setNameOfSpeciality() {
            this.nameOfSpeciality = "Dermatology";
        }
    }

    public class Orthopedics extends GeneralDepartment {
        private String nameOfSpeciality;
        // private final String nameOfSpeciality = "Dermatology";
        public Orthopedics(int id, String name, int numOfEmployees) {
            super(id, name, numOfEmployees);
            setNameOfSpeciality();
        }

        public String getNameOfSpeciality() {
            return nameOfSpeciality;
        }

        public void setNameOfSpeciality() {
            this.nameOfSpeciality = "Orthopedics";
        }
    }

    public class Pediatrics extends GeneralDepartment {
        private String nameOfSpeciality;
        // private final String nameOfSpeciality = "Dermatology";
        public Pediatrics(int id, String name, int numOfEmployees) {
            super(id, name, numOfEmployees);
            setNameOfSpeciality();
        }

        public String getNameOfSpeciality() {
            return nameOfSpeciality;
        }

        public void setNameOfSpeciality() {
            this.nameOfSpeciality = "Pediatrics";
        }
    }

    public class Endocrinology extends GeneralDepartment {
        private String nameOfSpeciality;
        // private final String nameOfSpeciality = "Dermatology";
        public Endocrinology(int id, String name, int numOfEmployees) {
            super(id, name, numOfEmployees);
            setNameOfSpeciality();
        }

        public String getNameOfSpeciality() {
            return nameOfSpeciality;
        }

        public void setNameOfSpeciality() {
            this.nameOfSpeciality = "Endocrinology";
        }
    }

}
