package com.chriswk.afj

class ForumController {

    def index() {
        [groups: CategoryGroup.all]
    }
}
