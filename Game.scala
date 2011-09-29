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
        
        while (prince.isAlive || !gameOver) {
            println("_" * 50)
            println("New game")
            println("_" * 50)
            // The player has one in five chance to fall during the first jump
            if (chance(1, 5)) {
                prince jump
                
                // The player has one in three chance to fall in the second hole
                if (chance(1, 3)) {
                    prince jump
                    
                    // The player has one in four chance to be killed by the first enemy
                    if (chance(1, 4)) {
                        prince beat swordman
                        
                        // The player has three in ten chance to enter the castle without alerting guardians
                        if (chance(3, 10) || chance (3, 10)) {
                            prince enterCastle
                            
                            // The player has one in two chance to beat the boss
                            if (chance(1, 2)) {
                                prince beat boss
                                
                                // The player has one in three chance to be slapped by the princess
                                if (chance(1, 3)) {
                                    prince kiss princess
                                    princess kiss prince
                                    gameOver = true
                                } else princess slap prince
                            } else boss beat prince
                        } else println(prince.name + " have been catched by the guards")
                    } else swordman beat prince
                } else {
                    println(prince.name + " fell in the second hole")
                    prince fall
                }
            } else {
                println(prince.name + " fell in the first hole")
                prince fall
            }
            
            // Wait one second before next try
            // Thread.sleep(1000)
        }
    }
}
