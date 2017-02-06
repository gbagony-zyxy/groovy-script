package wxz

import groovy.swing.SwingBuilder

import javax.swing.*
import java.awt.*

def url = 'http://chart.googleapis.com/chart?'

def data = ['Initial publication':10, 'Favorable mention in GroovyMag':15,
            'Jolt award nomination':25, 'Witty repartee on Letterman':40,
            'Product placement in Harry Potter movie':65, "Oprah's Book Club":100,
            'Drunken rant on Larry King Live':-15, 'Bug found in book source code':-30,
            'Informercial with ShamWow guy':-60, 'Scandalous YouTube video(s)':-90,
            'Tearful apology on The View':5, "Manning 'Behind the Text' Special":10]

def transformed = []
data.keySet().eachWithIndex{ String val, int i ->
    transformed << "t${URLEncoder.encode(val,'UTF-8')},000000,0,$i,12"
}

def colors = data.values().collect(){
    (it < 0 ? 'ffff00':'339900')
}.join('|')

def title = 'Anticipated Impact on "Making Java Groovy" Book Sales'

def map = [
        'cht' : 'bhs',
        'chs' : '800x360',
        'chd' : 't:'+ data.values().join(','),
        'chm' : transformed.join('|'),
        'chds': '-95,140',
        'chtt': URLEncoder.encode(title,'UTF-8'),
        'chco': colors
]

url += map.collect {k,v -> "$k=$v"}.join('&')
println url

new SwingBuilder().edt {
    frame(title:'Book Sales',visible:true,pack:true,
            defaultCloseOperation:WindowConstants.EXIT_ON_CLOSE){
        label(icon:new ImageIcon(url.toURL()),constraints:BorderLayout.CENTER)
    }
}