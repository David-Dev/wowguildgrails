package com.chriswk.afj

class Forum {
    String title

    Date dateCreated
    Date lastUpdated
    static belongsTo = [group: CategoryGroup]
    static hasMany = [
        threads: Thread
    ]
    static constraints = {
    }
}
