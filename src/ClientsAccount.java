
public class ClientsAccount {

        private String firstName;
        public String lastName;
        private String eMail;
        private String mobTel;
        private int dayBirthday;
        private int monthBirthday;
        private int yearBirthday;
        public int weight;
        public int pressureSystolic;
        public int pressureDiastolic;
        public int stepsByDay;
        private int age;



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

        public String geteMail() {
                return eMail;
        }

        public String getMobTel() {
                return mobTel;
        }

        public int getAge() {
                return age;
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

        public void checkYourLife(int weight, int pressureSystolic,
                                  int pressureDiastolic, int stepsByDay) {
                this.weight = weight;
                this.pressureSystolic = pressureSystolic;
                this.pressureDiastolic = pressureDiastolic;
                this.stepsByDay = stepsByDay;
        }

        private void seteMail(String eMail) {
                this.eMail = eMail;
        }

        private void setMobTel(String mobTel) {
                this.mobTel = mobTel;
        }

        public void yourNewTeleMail(String lastNameCheck,String mobTel, String eMail){
                if (lastNameCheck.equals(lastName) == true) {
                setMobTel(mobTel); seteMail(eMail);
                }
                else System.out.println("Error");

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
