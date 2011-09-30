package org.glop.scalagame

class Boss (val name:String) {
    def beat(e:Enemy) = {
        println(name + " beat " + e.name)
    }

    def beat(p:Player) = {
        println(name + " beat " + p.name)
        p.looseLife()
    }
}
