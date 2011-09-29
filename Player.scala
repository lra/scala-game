package org.glop.scalagame

class Player extends Character {
    var name = "Unknown"
    var lives = 10
    var gold = 0
    
    def jump = {
        println(name + " jumped")
    }
}