public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("7492004935");

        mobilePhone.addNewContact(new Contact().createContact("3434884", "name1"));
        mobilePhone.addNewContact(new Contact().createContact("3434884", "name2"));
        mobilePhone.addNewContact(new Contact().createContact("3434884", "name3"));
        mobilePhone.addNewContact(new Contact().createContact("3434884", "name4"));
       // mobilePhone.addNewContact(new Contact().createContact("3434884", "name1"));

        //System.out.println(mobilePhone.getMyContacts());
        mobilePhone.updateContacts(new Contact("3434884", "name1"), new Contact("3434884", "new Name"));
        mobilePhone.removeContact(new Contact("3434884", "new Name"));
        System.out.println(mobilePhone.queryContact("name2"));
        mobilePhone.printContact();
        //System.out.println(mobilePhone.getMyContacts().size());
    }
}
