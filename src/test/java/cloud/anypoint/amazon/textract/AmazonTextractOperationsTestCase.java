package cloud.anypoint.amazon.textract;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.junit.Test;

public class AmazonTextractOperationsTestCase extends MuleArtifactFunctionalTestCase {

  @Override
  protected String getConfigFile() {
    return "test-mule-config.xml";
  }

  @Test
  public void executePlaceholderOperation() throws Exception {
    String payloadValue = ((String) flowRunner("emptyFlow").run()
                                      .getMessage()
                                      .getPayload()
                                      .getValue());
  }
}
