import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class Music extends AnAction {

    public void update(AnActionEvent e){

    }
    public void actionPerformed(@NotNull AnActionEvent e) {
        BrowserUtil.browse("https://www.youtube.com/watch?v=bmVKaAV_7-A");
    }

}
