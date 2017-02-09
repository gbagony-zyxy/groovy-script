/**
 * Created by gbagony on 2017/2/9.
 */
import static groovyx.gpars.GParsPool.withPool
//The Groovy and Java high-level concurrency library offering
// actors, dataflow, CSP, agents, parallel collections, fork/join and more

def urls = [
        'http://www.groovy-lang.org',
        //'http://gpars.codehaus.org',
        'http://gr8conf.org/'
]*.toURL()

println withPool{
    urls.collectParallel {
        it.text.findAll(~/[Gg]roovy/).size()
    }
}