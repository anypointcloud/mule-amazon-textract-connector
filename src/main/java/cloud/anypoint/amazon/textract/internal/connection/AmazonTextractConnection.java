package cloud.anypoint.amazon.textract.internal.connection;

import software.amazon.awssdk.services.textract.TextractAsyncClient;

public final class AmazonTextractConnection {

  private final String id;

  public AmazonTextractConnection(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public TextractAsyncClient getTextractClient() {
    return null; // TODO: build one
  }

  public void invalidate() {
    // do something to invalidate this connection!
  }
}
