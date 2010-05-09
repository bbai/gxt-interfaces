package gxt.visual.interfaces.view;

import java.util.List;

import com.extjs.gxt.ui.client.data.ModelData;

/**
 * @author eugenp
 */
public interface ICheckBoxListViewView< M extends ModelData > extends IListViewView< M >{
	
	String getCheckBoxSelector();
	
	List< M > getChecked();
	
	void setCheckBoxSelector( String checkBoxSelector );
	
	/**
	 * Selects a specific item in the view
	 * @param m the modeldata that should be checked
	 * @param checked true to check
	 */
	void setChecked( M m, boolean checked );

}
