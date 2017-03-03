/**
 * Created by ruyin on 2017/2/27.
 */

def me = 'ruyin'
def you = 'marry'
//abbreviated dollar syntax
def line = "me $me - you $you"
assert line == 'me ruyin - you marry'
//Gstring behave like java.lang.String objects for all operations that a programmer is
// usually concerned with,they are implemented differently to caoture the fixed and
// dynamic parts separately.
assert line instanceof GString
assert line.strings[0] == 'me '
assert line.strings[1] == ' - you '
assert line.values[0] == 'ruyin'
assert line.values[1] == 'marry'


TimeZone.default = TimeZone.getTimeZone('GMT')
def date = new Date(0)
//extended dot syntax
//named args
def dateMap = [y:date[Calendar.YEAR]-1900,m:date[Calendar.MONTH],d:date[Calendar.DAY_OF_MONTH]]
def out = "Year $dateMap.y Month $dateMap.m Day $dateMap.d"
assert out == 'Year 70 Month 0 Day 1'

def tz = TimeZone.getTimeZone('GMT')
def format = 'd MMM YYYY HH:mm:SS z'
//full syntax with braces
//expression differences when the local var different
out = "Date is ${date.format(format,tz)} !"
assert out == 'Date is 1 一月 1970 00:00:00 GMT !'


//multiline GStrings
def sql = """
SELECT * FROM tbl_vw_user WHERE user_id = $me AND year = $dateMap.y
"""
assert sql == """
SELECT * FROM tbl_vw_user WHERE user_id = ruyin AND year = 70
"""

//escaped dollar sign
out = "my 0.02\$"
//literal dollar sign
assert out == 'my 0.02$'
