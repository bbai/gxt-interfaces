package gxt.visual.ui.client.interfaces.view;

import java.util.Iterator;
import java.util.List;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.widget.Component;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface IContainerView< T extends Component > extends IBoxComponentView{

	void disable();
	
	void enable();
	
	/**
	 * Returns the component whose element, or child element, matches the given element.
	 * @param elem the element
	 * @return the matching component or <code>null</code> if no match
	 */
	T findItem( Element elem );
	
	/**
	 * Returns the item at the given index or null if index out of bounds.
	 * @param index the index
	 * @return the item
	 */
	T getItem( int index );
	
	/**
	 * Returns the item with the specified item id.
	 * @param itemId the item id
	 * @return the button or <code>null</code> if no match
	 */
	T getItemByItemId( String itemId );
	
	/**
	 * Returns the number of children.
	 * @return the component count
	 */
	int getItemCount();
	
	/**
	 * Returns the child items.
	 * @return the children
	 */
	List< T > getItems();
	
	/**
	 * Returns the container's layout target. Only applies to container's with layouts.
	 * @return the layout target
	 */
	El getLayoutTarget();
	
	/**
	 * Returns the widget at the given index. If the child is a WidgetComponent, the wrapped widget is returned.
	 * @param index the index
	 * @return the widget
	 */
	Widget getWidget( int index );
	
	/**
	 * Returns the index of the item.
	 * @param item the item
	 * @return the index
	 */
	int indexOf( T item );
	
	/**
	 * Returns an iterator over the container's children.
	 * @return an iterator
	 */
	Iterator< T > iterator();
	
	/**
	 * Removes all the container's items.
	 * @return true if all items where removed
	 */
	boolean removeAll();
	
	/**
	 * Scrolls the item into view.
	 * @param item the item
	 */
	void scrollIntoView( T item );

}
