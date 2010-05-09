package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.widget.grid.Grid;

/**
 * @author eugenp
 */
public interface ILiveToolItemView extends ILabelToolItemView{
	
	/**
	 * Binds the tool item to the specified grid, must be called.
	 * @param grid the grid
	 */
	void bindGrid( Grid< ? > grid );
	
}
