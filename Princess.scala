package org.glop.scalagame

class Princess extends Character {
    var name = "Unknown"
    
    def kiss(p:Player) = {
        println(name + " gave a kiss to " + p.name)
    }

    def slap(p:Player) = {
        println(name + " slapped " + p.name)
        p.looseLife()
    }
}
