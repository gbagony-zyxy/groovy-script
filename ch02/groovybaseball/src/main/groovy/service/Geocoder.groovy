package service

import beans.Stadium

/**
 * Created by gbagony on 2017/2/7.
 */
class Geocoder {
    String base = 'http://maps.google.com/maps/api/geocode/xml?'

    void fillInLatLng(Stadium stadium) {
        String urlEncodedAddress =
                [stadium.street, stadium.city, stadium.state].collect {
                    URLEncoder.encode(it,'UTF-8')
                }.join(',')
        String url = base + [sensor:false,
                             address: urlEncodedAddress].collect {k,v -> "$k=$v"}.join('&')
        println url
        def response = new XmlSlurper().parse(url)
        stadium.latitude = response.result[0].geometry.location.lat.toDouble()
        stadium.longitude = response.result[0].geometry.location.lng.toDouble()
    }
}
