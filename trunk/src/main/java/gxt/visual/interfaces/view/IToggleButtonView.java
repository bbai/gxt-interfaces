package gxt.visual.interfaces.view;

/**
 * @author eugenp
 */
public interface IToggleButtonView extends IButtonView{
	
	/**
	 * Returns the toggle group name.
	 * @return the toggle group name
	 */
	String getToggleGroup();
	
	boolean isAllowDepress();
	
	/**
	 * Returns true if the button is pressed.
	 * @return the pressed state
	 */
	boolean isPressed();
	
	/**
	 * Toggles the current state.
	 */
	void toggle();
	
	/**
	 * Sets the current pressed state.
	 * @param state true to set pressed state
	 */
	void toggle( boolean state );
	
	/**
	 * True to allow a toggle item to be depressed (default to true).
	 * @param allowDepress true to allow depressing
	 */
	void setAllowDepress( boolean allowDepress );
	
	/**
	 * Optionally, set the the button's toggle group name.
	 * @param toggleGroup the toggle group name
	 */
	void setToggleGroup( String toggleGroup );

}
