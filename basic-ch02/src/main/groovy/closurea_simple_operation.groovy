/**
 * Created by gbagony on 2017/2/16.
 * 闭包以及流程控制语句
 */
['A','B','C'].each {s -> println s}

def totalClinks = 0;
def partyPeople = 100
//upto()方法会遍历从指定数到目标数,包括指定数
1.upto(partyPeople){ guestNumber ->
    clinkWithGuest = guestNumber -1
    totalClinks += clinkWithGuest
}

assert totalClinks == (partyPeople * (partyPeople - 1 )) / 2
println totalClinks

def total = 0;
1.upto(10){ s ->
    total += s
}
assert total == 11*10 / 2


//流程控制语句
if(false) assert false

if(null) assert false
else assert true

def i = 0
while (i < 10){
    i++
}
assert i == 10

def clinks = 0
for(remainingGuests in 0..9)
    clinks += remainingGuests
assert clinks == (10*9)/2

def list = [0,1,2,3]
for (j in list)
    assert j == list[j]

list.each() {item ->
    assert item == list[item]
}

switch (3){
    case 1: assert false;break
    case 3: assert true;break
    default: assert false
}