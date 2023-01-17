
public class ClientsAccount {

        final String firstName;
        private String lastName;
        final String eMail;
        final String mobTel;
        final int dayBirthday;
        final int monthBirthday;
        final int yearBirthday;
        private int weight;
        private int pressureSystolic;
        private int pressureDiastolic;
        private int stepsByDay;
        final int age;



        public ClientsAccount(String firstName, String lastName, String eMail, String mobTel, int dayBirthday,
                              int monthBirthday, int yearBirthday, int weight, int pressureSystolic,
                              int pressureDiastolic, int stepsByDay) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.eMail = eMail;
                this.mobTel = mobTel;
                this.dayBirthday = dayBirthday;
                this.monthBirthday = monthBirthday;
                this.yearBirthday = yearBirthday;
                this.weight = weight;
                this.pressureSystolic = pressureSystolic;
                this.pressureDiastolic = pressureDiastolic;
                this.stepsByDay = stepsByDay;
                this.age = 2020-yearBirthday;
        }


        public String getFirstName() {
                return firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public String geteMail() {
                return eMail;
        }

        public String getMobTel() {
                return mobTel;
        }

        public int getDayBirthday() {
                return dayBirthday;
        }

        public int getMonthBirthday() {
                return monthBirthday;
        }

        public int getYearBirthday() {
                return yearBirthday;
        }

        public int getWeight() {
                return weight;
        }

        public int getPressureSystolic() {
                return pressureSystolic;
        }

        public int getPressureDiastolic() {
                return pressureDiastolic;
        }

        public int getStepsByDay() {
                return stepsByDay;
        }

        public int getAge() {
                return age;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public void setWeight(int weight) {
                this.weight = weight;
        }

        public void setPressureSystolic(int pressureSystolic) {
                this.pressureSystolic = pressureSystolic;
        }

        public void setPressureDiastolic(int pressureDiastolic) {
                this.pressureDiastolic = pressureDiastolic;
        }

        public void setStepsByDay(int stepsByDay) {
                this.stepsByDay = stepsByDay;
        }

        public void printAccountInfo() {
                System.out.println(toString());
        }

        @Override
        public String toString () {
                return "Client:{" +
                                "firstName:'" + firstName + '\'' +
                                ", lastName:'" + lastName + '\'' +
                                ", eMail:'" + eMail + '\'' +
                                ", mobTel:'" + mobTel + '\'' +
                                ", dayBirthday:" + dayBirthday +
                                ", monthBirthday:" + monthBirthday +
                                ", yearBirthday:" + yearBirthday +
                                ", weight:" + weight +
                                ", pressure:" + pressureSystolic + " x " +
                                pressureDiastolic +
                                ", stepsByDay:" + stepsByDay +
                                ", age:" + age +
                                '}';
                }

}
