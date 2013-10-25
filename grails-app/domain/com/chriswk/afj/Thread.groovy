package com.chriswk.afj

class Thread {
    String title
    Date dateCreated
    Date lastUpdated
    static hasMany = [ posts: Post ]
    static belongsTo = [ category: Forum ]
    static constraints = {

    }
}
