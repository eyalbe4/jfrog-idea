import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import dependencies.maven.MavenArtifactsManager;
import org.jetbrains.annotations.NotNull;
import xray.XrayScanManager;

/**
 * Created by romang on 3/2/17.
 */
public class XrayStartupActivity implements StartupActivity {
    @Override
    public void runActivity(@NotNull Project project) {
        MavenArtifactsManager.asyncUpdate(project);
    }
}
