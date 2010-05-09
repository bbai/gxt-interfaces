package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.event.ComponentEvent;

/**
 * @author eugenp
 */
public interface ITriggerFieldView< D > extends ITextFieldView< D >{
	
	/**
	 * Returns the trigger style.
	 * @return the trigger style
	 */
	String getTriggerStyle();
	
	/**
	 * Returns true if the combo is editable.
	 * @return true if editable
	 */
	boolean isEditable();
	
	/**
	 * Returns true if the trigger is hidden.
	 * @return the hide trigger state
	 */
	boolean isHideTrigger();
	
	boolean isMonitorTab();
	
	void onComponentEvent( final ComponentEvent ce );
	
	/**
	 * Allow or prevent the user from directly editing the field text. If false is passed, the user will only be able to select from the items defined in the dropdown list.
	 * @param editable true to allow the user to directly edit the field text
	 */
	void setEditable( final boolean editable );
	
	/**
	 * True to hide the trigger (defaults to false, pre-render).
	 * @param hideTrigger true to hide the trigger
	 */
	void setHideTrigger( final boolean hideTrigger );
	
	void setMonitorTab( final boolean monitorTab );
	
	/**
	 * Sets the trigger style name.
	 * @param triggerStyle
	 */
	void setTriggerStyle( final String triggerStyle );
	
	void setReadOnly( final boolean readOnly );
	
}
