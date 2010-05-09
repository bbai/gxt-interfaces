package gxt.visual.interfaces.view;

/**
 * @author eugenp
 */
public interface IStatusView extends IBoxComponentView{
	
	/**
	 * Clears the current status by removing the current icon and change the text.
	 * @param text the new text value
	 */
	void clearStatus( String text );
	
	/**
	 * Returns the icon style.
	 * @return the icon style
	 */
	String getIconStyle();
	
	/**
	 * Returns the text.
	 * @return the text
	 */
	String getText();
	
	/**
	 * Returns true if the box effect is enabled.
	 * @return the box state
	 */
	boolean isBox();
	
	/**
	 * True to enable a 3D insert border (defaults to false).
	 * @param box true for the box effect
	 */
	void setBox( boolean box );
	
	/**
	 * Enables a busy icon and displays the given text.
	 * @param text the text to display
	 */
	void setBusy( String text );
	
	/**
	 * Sets the icon style.
	 * @param iconStyle the CSS style name
	 */
	void setIconStyle( String iconStyle );
	
	/**
	 * Sets both the text and icon style.
	 * @param text the text to display
	 * @param iconStyle the icon style
	 */
	void setStatus( String text, String iconStyle );
	
	/**
	 * Sets the text.
	 * @param text the text
	 */
	void setText( String text );
	
}
