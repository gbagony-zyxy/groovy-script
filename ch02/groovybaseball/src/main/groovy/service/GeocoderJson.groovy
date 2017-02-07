package service

import beans.Stadium
import groovy.json.JsonSlurper
/**
 *
 */
class GeocoderJson {
    String base = 'http://maps.google.com/maps/api/geocode/json?'
    void fillInLatLng(Stadium stadium) {
        String urlEncodedAddress =
                [stadium.street, stadium.city, stadium.state].collect {
                    URLEncoder.encode(it,'UTF-8')
                }.join(',+')
        String url = base + [sensor:false,
                             address: urlEncodedAddress].collect {k,v -> "$k=$v"}.join('&')
        println url
        def response = new JsonSlurper().parseText(url.toURL().text)
        stadium.latitude = response.results[0].geometry.location.lat.toDouble()
        stadium.longitude = response.results[0].geometry.location.lng.toDouble()
    }
}
