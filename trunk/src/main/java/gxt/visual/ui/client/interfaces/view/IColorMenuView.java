package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.widget.ColorPalette;

/**
 * @author eugenp
 */
public interface IColorMenuView extends IMenuView{
	
	/**
	 * Returns the selected color.
	 * @return the color
	 */
	
	String getColor();
	
	/**
	 * Returns the color palette.
	 * @return the color palette
	 */
	ColorPalette getColorPalette();
	
}
