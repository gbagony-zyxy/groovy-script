/**
 * Created by gbagony on 2017/2/9.
 */
//获取网站的ip数
InetAddress.getAllByName("baidu.com").collect{
    println it.toString().split('/')[1]
}