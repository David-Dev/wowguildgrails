package com.chriswk.afj

class CategoryGroup {
    String title

    Date dateCreated
    Date lastUpdated
    static hasMany = [forums: Forum]
    static constraints = {
        title unique:true
    }
}
