import com.chriswk.afj.CategoryGroup
import com.chriswk.afj.Forum

class BootStrap {

    def init = { servletContext ->
        def generalGroup = CategoryGroup.findByTitle("General chat") ?: new CategoryGroup(title: "General chat").save(failOnError: true)
        def gossipCategory = Forum.findByTitleAndGroup("Gossip", generalGroup) ?: new Forum(title: "Gossip", group:generalGroup).save(failOnError: true)
    }
    def destroy = {
    }
}
