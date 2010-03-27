package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.core.XTemplate;
import com.extjs.gxt.ui.client.event.ComponentEvent;

public interface IColorPaletteView extends IComponentView{
	
	/**
	 * Returns the colors.
	 * @return the colors
	 */
	String[] getColors();
	
	/**
	 * Returns the xtemplate.
	 * @return the template
	 */
	XTemplate getTemplate();
	
	/**
	 * Returns the current selected color.
	 * @return the value
	 */
	String getValue();
	
	/**
	 * Returns true if re-selections are allowed.
	 * @return the true if re-selections are allowed.
	 */
	boolean isAllowReselect();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Selects the color.
	 * @param color the color
	 */
	void select( String color );
	
	/**
	 * True to fire a select event if the current selected value is selected again (default to false).
	 * @param allowReselect true to fire select events if re-selected
	 */
	void setAllowReselect( boolean allowReselect );
	
	/**
	 * Sets the colors for the palette.
	 * @param colors the colors to set
	 */
	void setColors( String[] colors );
	
	/**
	 * Optionally, sets the xtemplate to be used to render the component.
	 * @param template the xtemplate
	 */
	void setTemplate( XTemplate template );
	
	/**
	 * Sets the selected color.
	 * @param value the value to set
	 */
	void setValue( String value );
	
}
