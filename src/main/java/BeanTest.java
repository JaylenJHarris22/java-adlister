import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args){
        Album album = new Album("Lil Uzi Vert", "Eternal Atake", 2020, 19.6, "Rap");
        Author author = new Author("James", "Patterson");
        Quote quote = new Quote(author, "Something wild");
        Quote quote2 = new Quote(author, "Something wilder");
        Quote quote3 = new Quote(author, "Something wilderer");

        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote);
        quotes.add(quote2);
        quotes.add(quote3);

        for (Quote x :  quotes){
            System.out.println(x.getContent());
            System.out.println(x.getAuthor().getFirst_name() + " " + x.getAuthor().getLast_name());
        }
    }

}
