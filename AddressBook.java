package AddressBook;

public class AddressBook {
    ArrayList<AddressBook> people = new ArrayList<AddressBook>();
    Scanner sc = new Scanner(System.in);
    String firstName, lastName, address, city, state, zip, phoneNumber, email;
    AddressBook person = new AddressBook();

    public static void main(String args[]) {
    AddressBook ad= new AddressBook();
    ad.AddContact();

    }
        public void AddContact () {
            System.out.println("enter first name");
            person.firstName = sc.nextLine();
            System.out.println("enter last name");
            person.lastName = sc.nextLine();
            System.out.println("enter address");
            person.address = sc.nextLine();
            System.out.println("enter city name");
            person.city = sc.nextLine();
            System.out.println("enter state");
            person.state = sc.nextLine();
            System.out.println("enter zip code");
            person.zip = sc.nextLine();
            System.out.println("enter phone number");
            person.phoneNumber = sc.nextLine();
            System.out.println("enter email address");
            person.email = sc.nextLine();
            people.add(person);
        }
}
