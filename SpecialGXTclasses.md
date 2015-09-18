# Reasons and justifications #
The reasons some classes from the GXT framework do not have corresponding interfaces and implementations in the gxt-interfaces library is their intrinsic design. These classes are not extendable, thus excluding them from being candidates for testing.

# Details #
The following is a quick list of just some of these classes (work in progress):

(Component)
  * DataListItem - deprecated
  * DataViewItem - deprecated
  * FramePanel - private constructor
  * HeaderItem - inner class
  * TreeItem - deprecated
  * Thumb - inner class

  * ColumnFooter - has reference to inner class 'ColumnFooter.FooterRow'
  * Foot - inner class
  * FooterRow - inner class
  * Document - private constructor
  * GridSplitBar - inner class
  * Group - inner class
  * Insert - package private constructor
  * TaskButton - not public
  * TaskBar - GXT problem - it returns a TaskButton which is not a public class