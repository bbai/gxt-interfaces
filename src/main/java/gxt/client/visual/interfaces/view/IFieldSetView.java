package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface IFieldSetView extends ILayoutContainerView{
	
	/**
	 * Collapses the fieldset.
	 */
	void collapse();
	
	/**
	 * Expands the fieldset.
	 */
	void expand();
	
	/**
	 * Returns the checkbox name.
	 * @return the checkbox name
	 */
	String getCheckboxName();
	
	El getLayoutTarget();
	
	boolean insert( Component item, int index );
	
	/**
	 * Returns true if checkbox toggle is enabled.
	 * @return the checkbox toggle state
	 */
	boolean isCheckboxToggle();
	
	/**
	 * Returns true if the fieldset is collapsible.
	 * @return true if callapsible
	 */
	boolean isCollapsible();
	
	/**
	 * Returns <code>true</code> if the panel is expanded.
	 * @return the expand state
	 */
	boolean isExpanded();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * The name to assign to the fieldset's checkbox if {@link #setCheckboxToggle(boolean)} = true.
	 * @param checkboxName the name
	 */
	void setCheckboxName( String checkboxName );
	
	/**
	 * True to render a checkbox into the fieldset frame just in front of the legend (defaults to false, pre-render). The fieldset will be expanded or collapsed when the checkbox is toggled.
	 * @param checkboxToggle true for checkbox toggle
	 */
	void setCheckboxToggle( boolean checkboxToggle );
	
	/**
	 * Sets whether the fieldset is collapsible (defaults to false, pre-render).
	 * @param collapsible true for collapse
	 */
	void setCollapsible( boolean collapsible );
	
	/**
	 * Sets the panel's expand state.
	 * @param expand <code>true<code> true to expand
	 */
	void setExpanded( boolean expand );
	
	/**
	 * Sets the panel heading.
	 * @param text the heading text
	 */
	void setHeading( String text );
	
}
