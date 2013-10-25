package com.chriswk.afj

class WowGuild {
    String name
    WowRealm realm
    static hasMany = [members: WowCharacter]
    static constraints = {
    }
}
