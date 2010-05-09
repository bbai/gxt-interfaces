package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.VerticalAlignment;

/**
 * @author eugenp
 */
public interface IVerticalPanelView extends ILayoutContainerView{
	
	/**
	 * Returns the horizontal alignment.
	 * @return the horizontalAlign
	 */
	HorizontalAlignment getHorizontalAlign();
	
	/**
	 * Returns the panel's spacing.
	 * @return the spacing
	 */
	int getSpacing();
	
	/**
	 * Returns the table's height.
	 * @return the table height
	 */
	String getTableHeight();
	
	/**
	 * @return the tableWidth
	 */
	String getTableWidth();
	
	/**
	 * Returns the vertical alignment.
	 * @return the vertical alignment
	 */
	VerticalAlignment getVerticalAlign();
	
	/**
	 * Sets the horizontal cell alignment (defaults to LEFT).
	 * @param horizontalAlign the horizontal alignment
	 */
	void setHorizontalAlign( HorizontalAlignment horizontalAlign );
	
	/**
	 * Sets the panel's spacing.
	 * @param spacing the spacing
	 */
	void setSpacing( int spacing );
	
	/**
	 * Sets the table's height.
	 * @param tableHeight the table height
	 */
	void setTableHeight( String tableHeight );
	
	/**
	 * Sets the width of the internal table.
	 * @param tableWidth the table width
	 */
	void setTableWidth( String tableWidth );
	
	/**
	 * Sets the vertical cell alignment (defaults to TOP).
	 */
	void setVerticalAlign( VerticalAlignment verticalAlign );

}
