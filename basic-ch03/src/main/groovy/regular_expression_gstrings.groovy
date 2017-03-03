/**
 * Created by ruyin on 2017/2/27.
 */

//we have the choice to declare patterns in either kind of string:
//literal string with single quotes,GString with double quotes,or slasht strings.
assert "abc" == /abc/
assert "\\d" == /\d/

//Sometimes the slashy syntax interferes with other valid Groovy expressions such as
//line comments or numerical expressions with multiple slashes for division.When in doubt,
//put parentheses around your pattern like (/pattern/).Parentheses force the parser to interpret
//the content as an expression.
def reference = "hello"
assert reference == /$reference/