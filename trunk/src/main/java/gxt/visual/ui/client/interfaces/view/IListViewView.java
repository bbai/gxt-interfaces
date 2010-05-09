package gxt.visual.ui.client.interfaces.view;

import java.util.List;

import com.extjs.gxt.ui.client.core.XTemplate;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.ModelProcessor;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ListViewSelectionModel;
import com.google.gwt.user.client.Element;

/**
 * @author eugenp
 */
public interface IListViewView< M extends ModelData > extends IBoxComponentView{
	
	/**
	 * Returns the matching element.
	 * @param element the element or any child element
	 * @return the parent element
	 */
	Element findElement( Element element );
	
	/**
	 * Returns the element's index.
	 * @param element the element or any child element
	 * @return the element index or -1 if no match
	 */
	int findElementIndex( Element element );
	
	/**
	 * Returns the display property.
	 * @return the display property
	 */
	String getDisplayProperty();
	
	/**
	 * Returns the element at the given index.
	 * @param index the index
	 * @return the element
	 */
	Element getElement( int index );
	
	/**
	 * Returns all of the child elements.
	 * @return the elements
	 */
	List< Element > getElements();
	
	/**
	 * Returns the number of models in the view.
	 * @return the count
	 */
	int getItemCount();
	
	/**
	 * Returns the item selector.
	 * @return the selector
	 */
	String getItemSelector();
	
	/**
	 * Returns the view's loading text.
	 * @return the loading text
	 */
	String getLoadingText();
	
	/**
	 * Returns the model processor.
	 * @return the model processor
	 */
	ModelProcessor< M > getModelProcessor();
	
	/**
	 * Returns the over style.
	 * @return the over style
	 */
	String getOverStyle();
	
	/**
	 * Returns the view's selection model.
	 * @return the selection model
	 */
	ListViewSelectionModel< M > getSelectionModel();
	
	/**
	 * Returns true if select on hover is enabled.
	 * @return the select on hover state
	 */
	boolean getSelectOnOver();
	
	/**
	 * Returns the select style.
	 * @return the select style
	 */
	String getSelectStyle();
	
	/**
	 * Returns the combo's store.
	 * @return the store
	 */
	ListStore< M > getStore();
	
	/**
	 * Returns the list's template.
	 * @return the template
	 */
	XTemplate getTemplate();
	
	/**
	 * Returns the index of the element.
	 * @param element the element
	 * @return the index
	 */
	int indexOf( Element element );
	
	/**
	 * Moves the current selections down one level.
	 */
	void moveSelectedDown();
	
	/**
	 * Moves the current selections up one level.
	 */
	void moveSelectedUp();
	
	@SuppressWarnings( "unchecked" )
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Refreshes the view by reloading the data from the store and re-rendering the template.
	 */
	void refresh();
	
	/**
	 * Refreshes an individual node's data from the store.
	 * @param index the items data index in the store
	 */
	void refreshNode( int index );
	
	/**
	 * Sets the display property. Applies when using the default template for each item's text.
	 * @param displayProperty the display property
	 */
	void setDisplayProperty( String displayProperty );
	
	/**
	 * This is a required setting. A simple CSS selector (e.g. div.some-class or span:first-child) that will be used to determine what nodes this DataView will be working with (defaults to 'x-view-item').
	 * @param itemSelector the item selector
	 */
	void setItemSelector( String itemSelector );
	
	/**
	 * Sets the text loading text to be displayed during a load request.
	 * @param loadingText the loading text
	 */
	void setLoadingText( String loadingText );
	
	/**
	 * Sets the view's model processor. The model processor can be used to provide "formatted" properties to the XTemplate used to render the view.
	 * @see ModelProcessor
	 * @param modelProcessor
	 */
	void setModelProcessor( ModelProcessor< M > modelProcessor );
	
	/**
	 * Sets the style name to apply on mouse over.
	 * @param overStyle the over style
	 */
	void setOverStyle( String overStyle );
	
	/**
	 * Sets the selection model.
	 * @param sm the selection model
	 */
	void setSelectionModel( ListViewSelectionModel< M > sm );
	
	/**
	 * True to select the item when mousing over a element (defaults to false).
	 * @param selectOnHover true to select on mouse over
	 */
	void setSelectOnOver( boolean selectOnHover );
	
	/**
	 * The style to be applied to each selected item (defaults to 'x-view-item-sel').
	 * @param selectStyle the select style
	 */
	void setSelectStyle( String selectStyle );
	
	/**
	 * Sets the template fragment to be used for the text of each listview item.
	 * 
	 * <pre>
	 * &lt;code&gt;
	 * listview.setSimpleTemplate(&quot;{abbr} {name}&quot;);
	 * &lt;/code&gt;
	 * </pre>
	 * @param html the html used only for the text of each item in the list
	 */
	void setSimpleTemplate( String html );
	
	/**
	 * Changes the data store bound to this view and refreshes it.
	 * @param store the store to bind this view
	 */
	void setStore( ListStore< M > store );
	
	/**
	 * Sets the view's template.
	 * @param html the HTML fragment
	 */
	void setTemplate( String html );
	
	/**
	 * Sets the view's template.
	 * @param template the template
	 */
	void setTemplate( XTemplate template );

}
