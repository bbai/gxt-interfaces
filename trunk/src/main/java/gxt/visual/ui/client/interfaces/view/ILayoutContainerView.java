package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Html;
import com.extjs.gxt.ui.client.widget.Layout;
import com.extjs.gxt.ui.client.widget.WidgetComponent;
import com.extjs.gxt.ui.client.widget.layout.LayoutData;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface ILayoutContainerView extends IScrollContainerView< Component >{
	
	/**
	 * Adds a widget to this Container. Fires the <i>BeforeAdd</i> event before adding, then fires the <i>Add</i> event after the component has been added.
	 * @param widget the widget to add. If the widget is not a Component instance it will be wrapped in a WidgetComponent
	 */
	boolean add( Widget widget );
	
	/**
	 * Adds a widget to this Container. Fires the <i>BeforeAdd</i> event before adding, then fires the <i>Add</i> event after the component has been added.
	 * @param widget the widget to add. If the widget is not a Component instance it will be wrapped in a WidgetComponent
	 * @param layoutData the layout data
	 */
	boolean add( Widget widget, LayoutData layoutData );
	
	/**
	 * Creates a new HTML instance and adds it to the container. Fires the <i>BeforeAdd</i> event before adding, then fires the <i>Add</i> event after the component has been added.
	 * @param text the html text
	 * @return the new HTML instance
	 */
	Html addText( String text );
	
	/**
	 * Returns the widget component that wraps the given widget.
	 * @param widget the wrapped widget
	 * @return the component or null
	 */
	WidgetComponent findComponent( Widget widget );
	
	/**
	 * Returns the layout which is associated with the container, or <code>null</code> if one has not been set.
	 * @return the container's layout or <code>null</code>
	 */
	Layout getLayout();
	
	/**
	 * Override this method to specify the element to be used by the layout as the container. Allows the container to be decorated.
	 * @return the element to be used as the panel's container
	 */
	El getLayoutTarget();
	
	int getWindowResizeDelay();
	
	/**
	 * Inserts a widget into this Container at a specified index. Fires the <i>BeforeAdd</i> event before inserting, then fires the <i>Add</i> event after the component has been inserted.
	 * @param widget the widget to insert. If the widget is not a Component instance it will be wrapped in a WidgetComponent
	 * @param index the index at which the component will be inserted in
	 */
	boolean insert( Widget widget, int index );
	
	/**
	 * Inserts a widget into this Container at a specified index. Fires the <i>BeforeAdd</i> event before inserting, then fires the <i>Add</i> event after the component has been inserted.
	 * @param widget the widget to insert. If the widget is not a Component instance it will be wrapped in a WidgetComponent
	 * @param index the index at which the component will be inserted in
	 * @param layoutData the component's layout data
	 */
	boolean insert( Widget widget, int index, LayoutData layoutData );
	
	/**
	 * Returns <code>true</code> if the layout will be executed when widgets are added or removed.
	 * @return the layout on change state
	 */
	boolean isLayoutOnChange();
	
	boolean isMonitorWindowResize();
	
	boolean layout();
	
	boolean layout( boolean force );
	
	/**
	 * Removes a component from this container. Fires the 'BeforeRemove' event before removing, then fires the 'Remove' event after the component has been removed.
	 * @param widget the widget to remove
	 */
	boolean remove( Widget widget );
	
	/**
	 * Removes all of children from this container.
	 */
	boolean removeAll();
	
	/**
	 * Sets the container's layout.
	 * @param layout the new layout
	 */
	void setLayout( Layout layout );
	
	/**
	 * Sets the component's layout data.
	 * @param component the component
	 * @param layoutData the layout data
	 */
	void setLayoutData( Component component, LayoutData layoutData );
	
	/**
	 * Specifies if the container's layout should be called when widgets are added or removed. Default value is <code>false</code>.
	 * @param layoutOnChange <code>true</code> to enable
	 */
	void setLayoutOnChange( boolean layoutOnChange );
	
	void setMonitorWindowResize( boolean monitorWindowResize );
	
	void setWindowResizeDelay( int delay );
	
	void onComponentEvent( ComponentEvent ce );

}
