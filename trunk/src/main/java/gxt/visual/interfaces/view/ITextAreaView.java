package gxt.visual.interfaces.view;

/**
 * @author eugenp
 */
public interface ITextAreaView extends ITextFieldView< String >{
	
	int getCursorPos();
	
	/**
	 * Returns true if scroll bars are disabled.
	 * @return the scroll bar state
	 */
	boolean isPreventScrollbars();
	
	/**
	 * True to prevent scrollbars from appearing regardless of how much text is in the field (equivalent to setting overflow: hidden, defaults to false, pre-render).
	 * @param preventScrollbars true to disable scroll bars
	 */
	void setPreventScrollbars( boolean preventScrollbars );
	
}
