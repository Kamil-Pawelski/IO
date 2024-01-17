/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5Suite.java to edit this template
 */
package Suite;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("Testy")
@IncludeTags("Entity")
@ExcludeTags("Control")

public class WypozyczalniaTestSuiteEntity {
    
}
