package cloud.anypoint.amazon.textract.internal;

import cloud.anypoint.amazon.textract.internal.connection.AmazonTextractConnectionProvider;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(AmazonTextractOperations.class)
@ConnectionProviders(AmazonTextractConnectionProvider.class)
public class AmazonTextractConfiguration {


}
