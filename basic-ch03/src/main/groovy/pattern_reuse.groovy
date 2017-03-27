/**
 * Created by ruyin on 2017/3/6.
 */

def twister = 'she sells sea shells at the sea shore of seychelles'

def regex = /\b(\w)\w*\1/
def many = 100 * 1000

start = System.nanoTime()
many.times {
    //find operator with implicit pattern construction
    twister =~ regex
}


