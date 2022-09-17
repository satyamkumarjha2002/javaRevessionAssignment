import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    // utility methods

    public Boolean addNewContact(Contact contact) {
        int res = this.findContact(contact);
        
        if (res==-1) {
            this.myContacts.add(contact);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean updateContacts(Contact oldDontact, Contact newContact){
        if(this.findContact(oldDontact)==-1)return false;

        this.myContacts.remove(oldDontact);
        this.myContacts.add(newContact);
         
        return true;

    }

    public boolean removeContact(Contact contact){
        if(this.findContact(contact)==-1)return false;

        this.myContacts.remove(contact);

        return true;
    }

    private int findContact(Contact contact){
        
        return this.myContacts.indexOf(contact);
    }

    public Contact queryContact(String name){
        Contact contact = null;

        for(Contact c:this.myContacts){
            if(c.getName().equals(name)){
                contact=c;
                break;
            }
        }

        return contact;
    }

    public void printContact(){
        int index=0;
        for(Contact c:this.myContacts){
            System.out.println((index++)+". "+c.getName()+" -> "+c.getPhoneNumber());
        }
    }
}
