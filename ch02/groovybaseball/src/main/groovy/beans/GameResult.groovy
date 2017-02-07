package beans

/**
 * Created by gbagony on 2017/2/7.
 */
class GameResult {
    String home
    String away
    String hScore
    String aScore
    Stadium stadium

    String toString() { "$home $hScore, $away $aScore" }
}
