package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface IHeaderView extends IComponentView{
	
	/**
	 * Adds a tool.
	 * @param tool the tool to be inserted
	 */
	void addTool( Component tool );
	
	/**
	 * Returns the header's text.
	 * @return the text
	 */
	String getText();
	
	/**
	 * Returns the item's text style.
	 * @return the textStyle the text style
	 */
	String getTextStyle();
	
	/**
	 * Returns the tool at the given index.
	 * @param index the index
	 * @return the tool
	 */
	Component getTool( int index );
	
	/**
	 * Returns the number of tool items.
	 * @return the count
	 */
	int getToolCount();
	
	/**
	 * Inserts a tool.
	 * @param tool the tool to insert
	 * @param index the insert location
	 */
	void insertTool( Component tool, int index );
	
	/**
	 * Removes a tool.
	 * @param tool the tool to remove
	 */
	void removeTool( Component tool );
	
	/**
	 * Sets the header's text.
	 * @param text the new text
	 */
	void setText( String text );
	
	/**
	 * Sets the style name added to the header's text element.
	 * @param textStyle the text style
	 */
	void setTextStyle( String textStyle );
	
}
