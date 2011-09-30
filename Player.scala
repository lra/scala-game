package org.glop.scalagame

class Player (val name:String) {
    var lives = 10
    var gold = 0
    
    def isAlive = lives > 0
    
    def jump = {
        println(name + " jumped")
    }
    
    def winGold(n:Int = 1) = {
        if (n > 0)
            gold += n
    }

    def looseGold(n:Int = 1) = {
        if (n > 0)
            gold -= n
    }
    
    def looseLife(n:Int = 1) = {
        if (n > 0) {
            lives -= 1
            if (lives == 0) {
                die
            }
        }
    }
    
    def beat(e:Enemy) = {
        println(name + " beat " + e.name)
    }
    
    def beat(b:Boss) = {
        println(name + " beat " + b.name)
    }
    
    def kiss(p:Princess) = {
        println(name + " gave a kiss to " + p.name)
    }
    
    def enterCastle() = {
        println(name + " entered a castle")
    }
    
    def die = {
        println(name + " died!")
    }
    
    def fall = lives -= 1
}
