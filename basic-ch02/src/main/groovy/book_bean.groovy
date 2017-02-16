/**
 * Created by gbagony on 2017/2/16.
 */

def groovyBean = new Book();

groovyBean.setTitle("Groovy in Action")
groovyBean.setPrice(169)

assert groovyBean.getTitle() == 'Groovy in Action'
assert getTitleBackwards(groovyBean) == 'noitcA ni yvoorG'


String getTitleBackwards(book){
    String title = book.getTitle()
    return title.reverse()
}