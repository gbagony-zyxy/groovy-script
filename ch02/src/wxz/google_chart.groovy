package wxz

import groovy.swing.SwingBuilder

import javax.swing.ImageIcon
import javax.swing.WindowConstants
import java.awt.BorderLayout

String base = 'http://chart.googleapis.com/chart?'
def params = [cht:'p3',chs:'250x100',chd:'t:60,40',chl:'Hello|World']
String qs = params.collect {k,v -> "$k=$v"}.join('&')
println "$base$qs"

new SwingBuilder().edt {
    frame(title:'Hello,Chart!',visible:true,pack:true,
        defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE){
        label(icon:new ImageIcon("$base$qs".toURL()),constraints:BorderLayout.CENTER)
    }
}