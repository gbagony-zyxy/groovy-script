/**
 * Created by gbagony on 2017/2/16.
 */
class Book {
    String title
    int price

    @Override
    public String toString() {
        return "title:${title}, price:${price}"
    }
}
