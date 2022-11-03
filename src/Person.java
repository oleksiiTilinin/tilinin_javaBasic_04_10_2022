public class Person {

    private String personInfo(String name, String surname, String city, int phoneNumber) {
        return "Call to the " + name + " " + surname + " from the city " + city + " you can by this phone number: " + "'" + phoneNumber + "'";
    }

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.personInfo("Alex", "Tilinin", "Kremenchug", 9379992));
        System.out.println(person.personInfo("Vasyl", "Pupkin", "Kharkiv", 2314678));
        System.out.println(person.personInfo("Jora", "Golovkin", "Kyiv", 123465));

    }
}
