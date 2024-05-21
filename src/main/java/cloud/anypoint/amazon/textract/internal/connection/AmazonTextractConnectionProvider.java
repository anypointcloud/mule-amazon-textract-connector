package cloud.anypoint.amazon.textract.internal.connection;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.api.connection.PoolingConnectionProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AmazonTextractConnectionProvider implements PoolingConnectionProvider<AmazonTextractConnection> {

  private final Logger LOGGER = LoggerFactory.getLogger(AmazonTextractConnectionProvider.class);


  @Override
  public AmazonTextractConnection connect() throws ConnectionException {
    return new AmazonTextractConnection("tempId");
  }

  @Override
  public void disconnect(AmazonTextractConnection connection) {
    try {
      connection.invalidate();
    } catch (Exception e) {
      LOGGER.error("Error while disconnecting [" + connection.getId() + "]: " + e.getMessage(), e);
    }
  }

  @Override
  public ConnectionValidationResult validate(AmazonTextractConnection connection) {
    return ConnectionValidationResult.success();
  }
}
