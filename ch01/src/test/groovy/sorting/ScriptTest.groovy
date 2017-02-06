package sorting

import org.junit.Test

/**
 * Created by gbagony on 2017/2/6.
 */
class ScriptTest {
    @Test
    void testSortStrings(){
        GroovyShell shell = new GroovyShell()
        shell.evaluate(new File("src\\main\\groovy\\sorting\\sort_string.groovy"))
    }
}
