package org.glop.scalagame

class Game {
    // Do we get chance?
    // Returns the odd of a successful try for n chance out of m
    // Returns a boolean if it was a success
    def chance(odds:Int, max:Int) = {
        val rand = new scala.util.Random
        rand.nextInt(max) >= odds
    }

    var gameOver = false
    
    def launch = {
        val p = new Player
        p.name = "Prince"
        p.jump
    }
}
