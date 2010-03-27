package gxt.client.visual.interfaces.view;

import java.util.List;
import java.util.Map;

import com.extjs.gxt.ui.client.Style.HideMode;
import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.WidgetListener;
import com.extjs.gxt.ui.client.util.SwallowEvent;
import com.extjs.gxt.ui.client.widget.ComponentPlugin;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.extjs.gxt.ui.client.widget.tips.ToolTip;
import com.extjs.gxt.ui.client.widget.tips.ToolTipConfig;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;

/**
 * @author eugenp
 */
public interface IComponentView{
	
	/**
	 * Appends an event handler to this component.
	 * @param eventType the eventType
	 * @param listener the listener to be added
	 */
	void addListener( EventType eventType, Listener< ? extends BaseEvent > listener );
	
	/**
	 * Adds a component plugin.
	 * @param plugin the component plugin
	 */
	void addPlugin( ComponentPlugin plugin );
	
	/**
	 * Adds a CSS style name to the component's underlying element.
	 * @param style the CSS style name to add
	 */
	void addStyleName( String style );
	
	/**
	 * Adds a listener to receive widget events.
	 * @param listener the listener to be added
	 */
	void addWidgetListener( WidgetListener listener );
	
	/**
	 * Clears the component's state.
	 */
	void clearState();
	
	/**
	 * Disable this component. Fires the <i>Disable</i> event.
	 */
	void disable();
	
	/**
	 * True to disable event processing.
	 * @param disable true to disable
	 */
	void disableEvents( boolean disable );
	
	/**
	 * Enables and disables text selection for the component.
	 * @param disable <code>true</code> to disable text selection
	 */
	void disableTextSelection( boolean disable );
	
	/**
	 * Returns the component's el instance.
	 * @return the el instance
	 */
	El el();
	
	/**
	 * Enable this component. Fires the <i>Enable</i> event.
	 */
	void enable();
	
	/**
	 * Enables or disables event processing.
	 * @param enable the enable state
	 */
	void enableEvents( boolean enable );
	
	/**
	 * Fires an event with the given event type.
	 * @param type the event type
	 * @return <code>false</code> if any listeners return <code>false</code>
	 */
	boolean fireEvent( EventType type );
	
	boolean fireEvent( EventType eventType, BaseEvent be );
	
	/**
	 * Fires the specified event with the given event type.
	 * @param type the event type
	 * @param ce the base event
	 * @return <code>false</code> if any listeners return <code>false</code>
	 */
	boolean fireEvent( EventType type, ComponentEvent ce );
	
	/**
	 * Returns the global flyweight instance.
	 * @param elem the new wrapped dom element
	 * @return the global flyweight instance
	 */
	El fly( Element elem );
	
	/**
	 * Try to focus this component. Fires the <i>Focus</i> event.
	 */
	void focus();
	
	/**
	 * Returns the ARIA labelled by id.
	 * @return the ARIA labelled by id.
	 */
	String getAriaLabelledBy();
	
	/**
	 * Returns the component's base style.
	 * @return the base style
	 */
	String getBaseStyle();
	
	/**
	 * Returns the component's border state.
	 * @return true if borders are visible
	 */
	boolean getBorders();
	
	/**
	 * Returns the component's context menu.
	 * @return the context menu
	 */
	Menu getContextMenu();
	
	/**
	 * Returns the application defined property for the given name, or <code>null</code> if it has not been set.
	 * @param key the name of the property
	 * @return the value or <code>null</code> if it has not been set
	 */
	@SuppressWarnings( "unchecked" )
	< X >X getData( String key );
	
	Element getElement();
	
	/**
	 * Returns the component's hide mode.
	 * @return the hide mode
	 */
	HideMode getHideMode();
	
	/**
	 * Returns the id of this component. A new id is generated if an id has not been set.
	 * @return the component's id
	 */
	String getId();
	
	/**
	 * Returns the item id of this component. Unlike the component's id, the item id does not have to be unique.
	 * @return the component's item id
	 */
	String getItemId();
	
	List< Listener< ? extends BaseEvent >> getListeners( EventType eventType );
	
	/**
	 * Returns the component's model.
	 * @return the model
	 */
	@SuppressWarnings( "unchecked" )
	< X >X getModel();
	
	/**
	 * Returns the component's state. To save changes made to the state map returned by this method, call {@link #saveState()}.
	 * @return the component's state
	 */
	Map< String, Object > getState();
	
	/**
	 * Returns the component's state id. If a state id is specified, it is used as the key when saving and retrieving the component's state.
	 * @return the state id
	 */
	String getStateId();
	
	String getTitle();
	
	/**
	 * Returns the component's tool tip.
	 * @return the tool tip
	 */
	ToolTip getToolTip();
	
	boolean hasListeners();
	
	boolean hasListeners( EventType eventType );
	
	/**
	 * Hide this component. Fires the <i>BeforeHide</i> event before the component is hidden, the fires the <i>Hide</i> event after the component is hidden.
	 */
	void hide();
	
	/**
	 * Hides the component's tool tip (if one exists).
	 */
	void hideToolTip();
	
	/**
	 * Returns true if the component will be ignored by the ARIA and FocusManager API.
	 * @return
	 */
	// boolean isAriaIgnore(); // new
	
	/**
	 * Returns true if events are disabled.
	 * @return true if events disabled
	 */
	boolean isDisabledEvents();
	
	/**
	 * Returns <code>true</code> if the component is enabled.
	 * @return the enabled state
	 */
	boolean isEnabled();
	
	boolean isMasked();
	
	/**
	 * Returns <code>true</code> if the component is rendered.
	 * @return the rendered state
	 */
	boolean isRendered();
	
	/**
	 * Returns true if the component is saving and restore it's state.
	 * @return true if stateful
	 */
	boolean isStateful();
	
	/**
	 * Returns <code>true</code> if the component is visible.
	 */
	boolean isVisible();
	
	/**
	 * Returns <code>true</code> if the component is visible.
	 */
	boolean isVisible( boolean deep );
	
	/**
	 * Puts a mask over this component to disable user interaction.
	 * @return the mask element
	 */
	El mask();
	
	/**
	 * Puts a mask over this component to disable user interaction.
	 * @param message a message to display in the mask
	 * @return the mask element
	 */
	El mask( String message );
	
	/**
	 * Puts a mask over this component to disable user interaction.
	 * @param message a message to display in the mask
	 * @param messageStyleName a CSS style name to be applied to the message text
	 * @return the mask element
	 */
	El mask( String message, String messageStyleName );
	
	/**
	 * Components delegate event handling to {@link #onComponentEvent(ComponentEvent)}. Subclasses should not override.
	 * @param event the dom event
	 */
	void onBrowserEvent( Event event );
	
	/**
	 * Any events a component receives will be forwarded to this method. Subclasses should override as needed. The {@link #onBrowserEvent} method should not be overridden or modified.
	 * @param ce the base event
	 */
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Called when the component is in a LayoutContainer and the container's layout executes. This method will not be called on container instances. Default implementation does nothing.
	 */
	void recalculate();
	
	/**
	 * Removes all listeners.
	 */
	void removeAllListeners();
	
	@SuppressWarnings( "unchecked" )
	void removeFromParent();
	
	/**
	 * Removes a listener.
	 * @param eventType the event type
	 * @param listener the listener to be removed
	 */
	void removeListener( EventType eventType, Listener< ? extends BaseEvent > listener );
	
	/**
	 * Removes a CSS style name from the component's underlying element.
	 * @param style the CSS style name to remove
	 */
	void removeStyleName( String style );
	
	/**
	 * Removes a swallow event.
	 * @param e the swallow event to be removed
	 */
	void removeSwallow( SwallowEvent e );
	
	void removeToolTip();
	
	/**
	 * Removes a listener.
	 * @param listener the listener to be removed
	 */
	void removeWidgetListener( WidgetListener listener );
	
	/**
	 * Renders the element. Typically, this method does not need to be called directly. A component will rendered by its parent if it is a container, or rendered when attached if added to a gwt panel.
	 * @param target the element this component should be rendered into
	 */
	void render( Element target );
	
	/**
	 * Renders the element. Typically, this method does not need to be called directly. A component will rendered by its parent if it is a container, or rendered when attached if added to a gwt panel.
	 * @param target the element this component should be rendered into
	 * @param index the index within the container <b>before</b> which this component will be inserted (defaults to appending to the end of the container if value is -1)
	 */
	void render( Element target, int index );
	
	/**
	 * Repaints the component if rendered.
	 */
	void repaint();
	
	/**
	 * Saves the component's current state by passing it to the <code>StateManager</code> and saving it using the state id or component id as the key.
	 */
	void saveState();
	
	/**
	 * True to mark this component to be ignored by the ARIA and FocusManager API. Typically set to true for any containers that should not be navigable to.
	 * @param ignore true to ignore
	 */
	// void setAriaIngore( boolean ignore ); // new
	
	/**
	 * Sets the ARIA labelled by attribute on the component.
	 * @param id the id of the element with the label.
	 */
	void setAriaLabelledBy( String id );
	
	/**
	 * Adds or removes a border. The style name 'x-border' is added to the widget to display a border.
	 * @param show <code>true</code> to display a border
	 */
	void setBorders( boolean show );
	
	/**
	 * Sets the component's context menu.
	 * @param menu the context menu
	 */
	void setContextMenu( Menu menu );
	
	/**
	 * Sets the application defined property with the given name.
	 * @param key the name of the property
	 * @param data the new value for the property
	 */
	void setData( String key, Object data );
	
	// make public
	void setElement( Element elem );
	
	/**
	 * Convenience function for setting disabled/enabled by boolean.
	 * @param enabled the enabled state
	 */
	void setEnabled( boolean enabled );
	
	/**
	 * Overrides UIObject and does nothing.
	 */
	void setHeight( String height );
	
	/**
	 * Sets the components hide mode (default to HideMode.DISPLAY).
	 * @param hideMode the hide mode.
	 */
	void setHideMode( HideMode hideMode );
	
	/**
	 * Sets the component's id.
	 * @param id the new id
	 */
	void setId( String id );
	
	/**
	 * Sets a style attribute.
	 * @param attr the attribute
	 * @param value the attribute value
	 */
	void setIntStyleAttribute( String attr, int value );
	
	/**
	 * Sets the component's item id.
	 * @param id the item id
	 */
	void setItemId( String id );
	
	/**
	 * Overrides UIObject and does nothing.
	 */
	void setPixelSize( int width, int height );
	
	/**
	 * Overrides UIObject and does nothing.
	 */
	void setSize( String width, String height );
	
	/**
	 * A flag which causes the Component to attempt to restore the state of internal properties from a saved state on startup (defaults to false). The component must have either a {@link #stateId} or {@link #id} assigned for state to be managed.
	 * Auto-generated ids are not guaranteed to be stable across page loads and cannot be relied upon to save and restore the same state for a component.
	 * @param stateful true to enable state
	 */
	void setStateful( boolean stateful );
	
	/**
	 * Sets the component's state id which is a unique id for this component to use for state management purposes (defaults to the component id if one was set, otherwise null if the component is using a generated id).
	 * @param stateId the state id
	 */
	void setStateId( String stateId );
	
	/**
	 * Sets a style attribute.
	 * @param attr the attribute
	 * @param value the attribute value
	 */
	void setStyleAttribute( String attr, String value );
	
	void setStyleName( String style );
	
	void setTitle( String title );
	
	/**
	 * Sets the component's tool tip.
	 * @param text the text
	 */
	void setToolTip( String text );
	
	/**
	 * Sets the component's tool tip with the given config.
	 * @param config the tool tip config
	 */
	void setToolTip( ToolTipConfig config );
	
	/**
	 * Convenience function to hide or show this component by boolean.
	 * @param visible the visible state
	 */
	void setVisible( boolean visible );
	
	/**
	 * Overrides UIObject and does nothing.
	 */
	void setWidth( String width );
	
	void setZIndex( int zIndex );
	
	/**
	 * Show this component. Fires the <i>BeforeShow</i> event before the component is made visible, then fires the <i>Show</i> event after the component is visible.
	 */
	void show();
	
	void sinkEvents( int eventBitsToAdd );
	
	/**
	 * Adds a swallow event. When enabled, any events of the given type whose target is or is a child of the given element are swallowed.
	 * @param eventType the event type
	 * @param element the target element
	 * @param preventDefault true to prevent the default action
	 * @return the swallow event config that can be used when removing a swallowing event
	 */
	SwallowEvent swallowEvent( EventType eventType, Element element, boolean preventDefault );
	
	SwallowEvent swallowEvent( SwallowEvent e );
	
	String toString();
	
	/**
	 * Unmasks the component.
	 */
	void unmask();

}
