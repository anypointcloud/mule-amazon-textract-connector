package cloud.anypoint.amazon.textract.internal;

import cloud.anypoint.amazon.textract.internal.connection.AmazonTextractConnection;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;

import java.io.InputStream;


public class AmazonTextractOperations {

    @MediaType(value = "application/octet-stream", strict = false)
    public void example(@Connection AmazonTextractConnection connection,
                        @Content InputStream payload,
                        CompletionCallback<InputStream, Void> callback) {
      // do something with the Amazon SDK
      // on success, call callback.success with a Result
      // on failure, call callback.error
    }
}
