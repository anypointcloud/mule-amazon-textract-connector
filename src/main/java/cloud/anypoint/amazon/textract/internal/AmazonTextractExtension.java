package cloud.anypoint.amazon.textract.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.sdk.api.annotation.JavaVersionSupport;

import static org.mule.sdk.api.meta.JavaVersion.*;


@Xml(prefix = "mule-amazon-textract")
@Extension(name = "Amazon Textract", vendor = "Anypoint Cloud")
@JavaVersionSupport({JAVA_8, JAVA_11, JAVA_17})
@Configurations(AmazonTextractConfiguration.class)
public class AmazonTextractExtension {

}
