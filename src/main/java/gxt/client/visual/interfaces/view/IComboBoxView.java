package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.core.XTemplate;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ListView;
import com.extjs.gxt.ui.client.widget.form.ListModelPropertyEditor;
import com.extjs.gxt.ui.client.widget.form.PropertyEditor;
import com.extjs.gxt.ui.client.widget.form.ComboBox.ComboBoxMessages;
import com.extjs.gxt.ui.client.widget.form.ComboBox.TriggerAction;
import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;

/**
 * @author eugenp
 */
public interface IComboBoxView< D extends ModelData > extends ITriggerFieldView< D >{
	
	void clear();
	
	/**
	 * Clears any text/value currently set in the field.
	 */
	void clearSelections();
	
	/**
	 * Hides the dropdown list if it is currently expanded. Fires the <i>Collapse</i> event on completion.
	 */
	void collapse();
	
	/**
	 * Execute a query to filter the dropdown list. Fires the BeforeQuery event prior to performing the query allowing the query action to be canceled if needed.
	 * @param q the query
	 * @param forceAll true to force the query to execute even if there are currently fewer characters in the field than the minimum specified by the minChars config option. It also clears any filter previously saved in the current store
	 */
	void doQuery( String q, boolean forceAll );
	
	/**
	 * Expands the dropdown list if it is currently hidden. Fires the <i>expand</i> event on completion.
	 */
	void expand();
	
	/**
	 * Returns the all query.
	 * @return the all query
	 */
	String getAllQuery();
	
	/**
	 * Returns the display field.
	 * @return the display field
	 */
	String getDisplayField();
	
	/**
	 * Returns true if the field's value is forced to one of the value in the list.
	 * @return the force selection state
	 */
	boolean getForceSelection();
	
	/**
	 * Returns the item selector.
	 * @return the item selector
	 */
	String getItemSelector();
	
	/**
	 * Returns the list's list align value.
	 * @return the list align value
	 */
	String getListAlign();
	
	/**
	 * Returns the list style.
	 * @return the list style
	 */
	String getListStyle();
	
	/**
	 * Returns the combo's list view.
	 * @return the view
	 */
	ListView< D > getListView();
	
	/**
	 * Returns the loading text.
	 * @return the loading text
	 */
	String getLoadingText();
	
	/**
	 * Returns the dropdown list's max height.
	 * @return the max height
	 */
	int getMaxHeight();
	
	ComboBoxMessages getMessages();
	
	/**
	 * Returns the min characters used for autocompete and typeahead.
	 * @return the minimum number of characters
	 */
	int getMinChars();
	
	/**
	 * Returns the dropdown list's min width.
	 * @return the min width
	 */
	int getMinListWidth();
	
	/**
	 * Returns the page size.
	 * @return the page size
	 */
	int getPageSize();
	
	/**
	 * Returns the combo's paging tool bar.
	 * @return the tool bar
	 */
	PagingToolBar getPagingToolBar();
	
	ListModelPropertyEditor< D > getPropertyEditor();
	
	/**
	 * Returns the query delay.
	 * @return the query delay
	 */
	int getQueryDelay();
	
	/**
	 * Returns the selected style.
	 * @return the selected style
	 */
	String getSelectedStyle();
	
	/**
	 * Returns the combo's store.
	 * @return the store
	 */
	ListStore< D > getStore();
	
	/**
	 * Returns the custom template.
	 * @return the template
	 */
	XTemplate getTemplate();
	
	/**
	 * Returns the trigger action.
	 * @return the trigger action
	 */
	TriggerAction getTriggerAction();
	
	/**
	 * Returns the type ahead delay in milliseconds.
	 * @return the type ahead delay
	 */
	int getTypeAheadDelay();
	
	D getValue();
	
	/**
	 * Returns the value field name.
	 * @return the value field name
	 */
	String getValueField();
	
	/**
	 * Returns the combo's list view.
	 * @return the view
	 */
	ListView< D > getView();
	
	/**
	 * Returns <code>true</code> if the panel is expanded.
	 * @return the expand state
	 */
	boolean isExpanded();
	
	/**
	 * Returns true if lazy rendering is enabled.
	 * @return true of lazy rendering
	 */
	boolean isLazyRender();
	
	/**
	 * Returns true if type ahead is enabled.
	 * @return the type ahead state
	 */
	boolean isTypeAhead();
	
	/**
	 * Returns the state if the query cache is used or not.
	 * @return the useQueryCache state
	 */
	boolean isUseQueryCache();
	
	void reset();
	
	void select( D sel );
	
	/**
	 * Select an item in the dropdown list by its numeric index in the list. This function does NOT cause the select event to fire. The list must expanded for this function to work, otherwise use #setValue.
	 * @param index the index of the item to select
	 */
	void select( int index );
	
	/**
	 * The text query to send to the server to return all records for the list with no filtering (defaults to '').
	 * @param allQuery the all query
	 */
	void setAllQuery( String allQuery );
	
	/**
	 * The underlying data field name to bind to this ComboBox (defaults to 'text').
	 * @param displayField the display field
	 */
	void setDisplayField( String displayField );
	
	/**
	 * Sets the panel's expand state.
	 * @param expand <code>true<code> true to expand
	 */
	void setExpanded( boolean expand );
	
	/**
	 * Sets whether the combo's value is restricted to one of the values in the list, false to allow the user to set arbitrary text into the field (defaults to false).
	 * @param forceSelection true to force selection
	 */
	void setForceSelection( boolean forceSelection );
	
	/**
	 * This setting is required if a custom XTemplate has been specified.
	 * @param itemSelector the item selector
	 */
	void setItemSelector( String itemSelector );
	
	/**
	 * True to lazily render the combo's drop down list (default to true, pre-render).
	 * @param lazyRender true to lazy render the drop down list
	 */
	void setLazyRender( boolean lazyRender );
	
	/**
	 * Sets a valid anchor position value. See {@link El#alignTo} for details on supported anchor positions (defaults to 'tl-bl?').
	 * @param listAlign the new list align value
	 */
	void setListAlign( String listAlign );
	
	/**
	 * Sets the style for the drop down list (defaults to 'x-combo-list');
	 * @param listStyle the list style
	 */
	void setListStyle( String listStyle );
	
	/**
	 * Sets the loading text.
	 * @param loadingText the loading text
	 */
	void setLoadingText( String loadingText );
	
	/**
	 * Sets the maximum height in pixels of the dropdown list before scrollbars are shown (defaults to 300).
	 * @param maxHeight the max hieght
	 */
	void setMaxHeight( int maxHeight );
	
	/**
	 * Sets the minimum number of characters the user must type before autocomplete and typeahead active (defaults to 4 if remote, or 0 if local).
	 * @param minChars
	 */
	void setMinChars( int minChars );
	
	/**
	 * Sets the minimum width of the dropdown list in pixels (defaults to 70, will be ignored if listWidth has a higher value).
	 * @param minListWidth the min width
	 */
	void setMinListWidth( int minListWidth );
	
	/**
	 * Sets the page size. Only applies when using a paging toolbar.
	 * @param pageSize the page size
	 */
	void setPageSize( int pageSize );
	
	void setPropertyEditor( PropertyEditor< D > propertyEditor );
	
	/**
	 * The length of time in milliseconds to delay between the start of typing and sending the query to filter the dropdown list.
	 * @param queryDelay the query delay
	 */
	void setQueryDelay( int queryDelay );
	
	void setRawValue( String text );
	
	/**
	 * Sets the CSS style name to apply to the selected item in the dropdown list (defaults to 'x-combo-selected').
	 * @param selectedStyle the selected style
	 */
	void setSelectedStyle( String selectedStyle );
	
	/**
	 * Sets the template fragment to be used for the text of each combo list item.
	 * 
	 * <pre>
	 * 
	 * &lt;code&gt; combo.setSimpleTemplate(&quot;{abbr} {name}&quot;); &lt;/code&gt;
	 * 
	 * </pre>
	 * @param html the html used only for the text of each item in the list
	 */
	void setSimpleTemplate( String html );
	
	/**
	 * Sets the combo's store.
	 * @param store the store
	 */
	void setStore( ListStore< D > store );
	
	/**
	 * Sets the custom template used to render the combo's drop down list.Use this to create custom UI layouts for items in the list.
	 * <p>
	 * If you wish to preserve the default visual look of list items, add the CSS class name 'x-combo-list-item' to the template's container element.
	 * @param html the html
	 */
	void setTemplate( String html );
	
	/**
	 * Sets the custom template used to render the combo's drop down list.
	 * @param template the template
	 */
	void setTemplate( XTemplate template );
	
	/**
	 * The action to execute when the trigger field is activated. Use {@link TriggerAction#ALL} to run the query specified by the allQuery config option (defaults to {@link TriggerAction#QUERY}).
	 * @param triggerAction the trigger action
	 */
	void setTriggerAction( TriggerAction triggerAction );
	
	/**
	 * True to populate and autoselect the remainder of the text being typed after a configurable delay ({@link #typeAheadDelay}) if it matches a known value (defaults to false)
	 * @param typeAhead
	 */
	void setTypeAhead( boolean typeAhead );
	
	/**
	 * The length of time in milliseconds to wait until the typeahead text is displayed if typeAhead = true (defaults to 250).
	 * @param typeAheadDelay the type ahead delay
	 */
	void setTypeAheadDelay( int typeAheadDelay );
	
	/**
	 * Set this to false to disable the last query cache (defaults to true). When set to false the store gets queried on each expand for the data that should get displayed in the list. If you use a loader, than each time the ComboBox gets expanded,
	 * the server gets asked for the data. You want to do this for example, if you filter the content of this ComboBox against some selection in another field.
	 * @param useQueryCache the useQueryCache to set
	 */
	void setUseQueryCache( boolean useQueryCache );
	
	void setValue( D value );
	
	/**
	 * Sets the model field used to retrieve the "value" from the model. If specified, a hidden form field will contain the value. The hidden form field name will be the combo's field name plus "-hidden".
	 * @param valueField the value field name
	 */
	void setValueField( String valueField );
	
	/**
	 * Sets the combo's view.
	 * @param view the view
	 */
	void setView( ListView< D > view );
	
}
