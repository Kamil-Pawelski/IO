package Suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeTags;

@Suite
@SelectPackages("Testy")
@IncludeTags("Control")
public class WypozyczalniaTestSuiteControl { }
