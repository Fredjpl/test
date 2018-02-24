import org.frice.Game
import org.frice.anim.move.ApproachingMove
import org.frice.anim.move.ChasingMove
import org.frice.launch
import org.frice.obj.sub.ImageObject
import org.frice.resource.image.ImageResource
import java.awt.Dimension

class ChasingMoveTest : Game() {
    override fun onLastInit() {
        size = Dimension(600, 600)
        addObject(ImageObject(ImageResource.fromPath("C:\\Users\\ThinkPad\\Desktop\\huaji.png"))
                .apply { addAnim(ApproachingMove(this, mouse,0.8)) })
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(ChasingMoveTest::class.java)
        }
    }
}

