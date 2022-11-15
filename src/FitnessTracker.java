class AccountInfo {
    //Неизменяемые
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;


    private String secondName;
    private int weight;
    private int pressure;
    private int dailyStepsCount;


    private int age;


    AccountInfo(String name, int dayOfBirth, int monthOfBirth,
                int yearOfBirth, String email, String phone,
                String secondName, int weight, int pressure, int dailyStepsCount) {

        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.secondName = secondName;
        this.weight = weight;
        this.pressure = pressure;
        this.dailyStepsCount = dailyStepsCount;
        this.age = 2022 - yearOfBirth;
    }


    public String getName() {

        return this.name;
    }

    public int getDayOfBirth() {

        return this.dayOfBirth;
    }

    public int getMonthOfBirth() {

        return this.monthOfBirth;
    }

    public int getYearOfBirth() {

        return this.yearOfBirth;
    }

    public String getEmail() {

        return this.email;
    }

    public String getPhone() {

        return this.phone;
    }

    public String getSecondName() {

        return this.secondName;
    }

    public int getWeight() {

        return this.weight;
    }

    public int getPressure() {

        return this.pressure;
    }

    public int getDailyStepsCount() {

        return this.dailyStepsCount;
    }

    public int getAge() {

        return this.age;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setDailyStepsCount(int dailyStepsCount) {
        this.dailyStepsCount = dailyStepsCount;
    }


    public void printAccountInfo() {
        System.out.println("AccountInfo: ");
        System.out.println("name " + name);
        System.out.println("dayOfBirth " + dayOfBirth);
        System.out.println("monthOfBirth " + monthOfBirth);
        System.out.println("yearOfBirth " + yearOfBirth);
        System.out.println("email " + email);
        System.out.println("phone " + phone);
        System.out.println("second name " + secondName);
        System.out.println("weight " + weight);
        System.out.println("pressure " + pressure);
        System.out.println("daily steps count " + dailyStepsCount);
        System.out.println("age " + age);
        System.out.println(" ");
    }
}

class FitnessTracker {


    public static void main(String args[]) {
        AccountInfo first = new AccountInfo("Ivan", 1, 01, 1980, "ivan@email.com", "+1111111111", "Ivanov", 80, 90, 10000);
        first.printAccountInfo();

        AccountInfo second = new AccountInfo("Petr", 2, 02, 1990, "petr@email.com", "+2222222222", "Petrov", 85, 91, 11000);
        second.printAccountInfo();


        second.setSecondName("Bond");
        second.setWeight(86);
        System.out.println("**Changed AccountInfo**");
        second.printAccountInfo();

        AccountInfo third = new AccountInfo("Nikolay", 3, 03, 2000, "koliyan@email.com", "+3333333333", "Sidorov", 90, 92, 12000);
        third.printAccountInfo();

        third.setPressure(100);
        third.setDailyStepsCount(4000);
        System.out.println("**Changed AccountInfo**");
        third.printAccountInfo();
    }
}
