import org.frice.Game;
import org.frice.anim.move.ApproachingMove;
import org.frice.obj.sub.ImageObject;
import org.frice.resource.image.ImageResource;

import static org.frice.Initializer.launch;

public class Test1 extends Game {
    @Override
    public void onLastInit() {
        ImageObject object = new ImageObject(ImageResource.fromPath("C:\\Users\\ThinkPad\\Desktop\\huaji.png"));
        object.addAnim(new ApproachingMove(object,mouse,2.0));
        addObject(object);
    }

    @Override
    public void onExit() {
        System.exit(0);
    }

    public static void main(String... args) {
        launch(Test1.class);
    }
}
