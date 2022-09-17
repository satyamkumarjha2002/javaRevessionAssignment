import java.util.ArrayList;
import java.util.List;

public class Library {
    
    List<Publication> publications ;

    public Library(){
        publications=new ArrayList<Publication>();
    }

    public List<Publication> getPublications() {
        
        return publications;
    }

}
