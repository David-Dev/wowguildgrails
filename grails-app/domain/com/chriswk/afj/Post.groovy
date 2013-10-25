package com.chriswk.afj

class Post {
    String heading
    String body
    Date dateCreated
    Date lastUpdated
    static constraints = {

    }

    static belongsTo = [user: User, thread: Thread]
}
