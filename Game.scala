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
    
    // Characters
    val prince = new Player
    val swordman = new Enemy
    val boss = new Boss
    val princess = new Princess
    
    def setup = {
        prince.name = "Prince"
        swordman.name = "Swordman"
        boss.name = "Jaffar"
        princess.name = "Farah"
    }
    
    def launch = {
        setup
        prince.jump
    }
}
