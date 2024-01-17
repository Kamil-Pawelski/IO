/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5Suite.java to edit this template
 */
package Suite;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
@Suite
@SelectClasses({WypozyczalniaTestSuiteControl.class})
@IncludeTags("Control")
@ExcludeTags("FilmU")
public class WypozyczalniaTestSuiteControlClass {
    
}
