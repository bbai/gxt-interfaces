package gxt.visual.ui.client.interfaces.view;

/**
 * @author eugenp
 */
public interface ICheckMenuItemView extends IMenuItemView{
	
	/**
	 * Returns the group name.
	 * @return the name
	 */
	String getGroup();
	
	/**
	 * Returns the group style.
	 * @return the group style
	 */
	String getGroupStyle();
	
	/**
	 * Returns true if the item is checked.
	 * @return the checked state
	 */
	boolean isChecked();
	
	/**
	 * Set the checked state of this item.
	 * @param checked the new checked state
	 */
	void setChecked( boolean checked );
	
	/**
	 * Set the checked state of this item.
	 * @param state the new checked state
	 * @param supressEvent true to prevent the CheckChange event from firing
	 */
	void setChecked( boolean state, boolean supressEvent );
	
	/**
	 * All check items with the same group name will automatically be grouped into a single-select radio button group (defaults to null).
	 * @param group the group
	 */
	void setGroup( String group );
	
	/**
	 * The default CSS class to use for radio group check items (defaults to "x-menu-group-item").
	 * @param groupStyle the group style
	 */
	void setGroupStyle( String groupStyle );
	
}
