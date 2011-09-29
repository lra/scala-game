package org.glop.scalagame

class Enemy extends Character {
    var name = "Unknown"
    
    def beat(p:Player) = {
        println(name + " beat " + p.name)
        p.looseLife()
    }
}

